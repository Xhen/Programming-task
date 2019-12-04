package no.mathias.controllers;

import net.minidev.json.JSONObject;
import no.mathias.importer;
import no.mathias.model.BusinessCard;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    public List<BusinessCard> myCards = importer.init();

    @GetMapping("/")
    public Object getAll() {
        return myCards;
    }


    @GetMapping("/getById/{icd}/{enterprise}")
    public BusinessCard getById(@PathVariable("icd") String icd, @PathVariable("enterprise") String enterprise) {
        BusinessCard myCard = null;
        for (BusinessCard bc : myCards) {
            /*
            [0] = ICD
            [1] = Enterprise number
             */
            String[] id = bc.getParticipant().getValue().split(":");

            if(id[0].contains(icd) && id[1].contains(enterprise)) {
                myCard = bc;
            }
        }
        return myCard;
    }

    @GetMapping("/searchByName/{name}")
    public List<JSONObject> searchByName(@PathVariable("name") String name) {
        ArrayList<JSONObject> matchedCards = new ArrayList<JSONObject>();
        /*
        * If the name contains the text, it should add it to the list of returns
        * */
        String upperCaseSearch = name.toUpperCase();


        for (BusinessCard bc : myCards) {

            Boolean matches = bc.getEntity().getName().getName().toUpperCase().contains(upperCaseSearch);
            if(matches) {
                JSONObject returnObj = new JSONObject();
                returnObj.put("Name", bc.getEntity().getName().getName());
                returnObj.put("EnterpriseNumber", bc.getParticipant().getValue());
                returnObj.put("CountryCode", bc.getEntity().getCountrycode());
                matchedCards.add(returnObj);
            }
        }
        return matchedCards;
    }

    @GetMapping("/getByName/{name}")
    public BusinessCard getByName(@PathVariable("name") String name) {
        BusinessCard myCard = null;
        for (BusinessCard bc : myCards) {
            if(bc.getEntity().getName().getName().equalsIgnoreCase(name)) {
                myCard = bc;
            }
        }
        return myCard;
    }
}
