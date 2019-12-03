package no.mathias.model;

import lombok.Data;

import javax.xml.bind.annotation.*;
@XmlAccessorType (XmlAccessType.FIELD)
public class Entity
{
    @XmlAttribute(name = "countrycode")
    private String countrycode;
    @XmlElement(name = "name")
    private Name name;
    @XmlElement(name = "id")
    private Id id;

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Entity: [countrycode = "+countrycode+", name = "+name+", id = "+id+"]";
    }
}
