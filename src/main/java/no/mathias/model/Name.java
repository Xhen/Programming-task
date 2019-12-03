package no.mathias.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
@XmlAccessorType (XmlAccessType.FIELD)
public class Name
{
    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "language")
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString()
    {
        return "Name: [name = "+name+", language = "+language+"]";
    }
}
