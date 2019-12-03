package no.mathias.model;

import lombok.Data;

import javax.xml.bind.annotation.*;
@XmlAccessorType (XmlAccessType.FIELD)
public class Participant
{
    @XmlAttribute(name = "schema")
    private String scheme;

    @XmlAttribute(name = "value")
    private String value;

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "Participant: [scheme = "+scheme+", value = "+value+"]";
    }
}