package no.mathias;

import no.mathias.model.BusinessCard;
import no.mathias.model.Root;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class importer {
    public static ArrayList<Object> BusinessCards;

    /**
     * Gets the file, transforms XML to POJO and returns list of BusinessCards
     * */
    public static List<BusinessCard> init() {
        File cards = new File("src/main/resources/static/business-cards.xml");
        Root root = null;
        try {
            // Convert XML to POJO
            JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            root = (Root) jaxbUnmarshaller.unmarshal(cards);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return root.getCards();
    }
}