package no.mathias.model;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="root")
@XmlAccessorType (XmlAccessType.FIELD)
public class Root {

    /* All businesscards */
    @XmlElement(name = "businesscard")
    private ArrayList<BusinessCard> cards = null;

    public Root(){}
    public Root(ArrayList<BusinessCard> cards) {
        this.cards = cards;
    }

    public ArrayList<BusinessCard> getCards() {
        return this.cards;
    }
    public void setCards(ArrayList<BusinessCard> cards) {
        this.cards = cards;
    }
}
