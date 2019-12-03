package no.mathias.model;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.Map;

@XmlRootElement(name = "businesscard")
@XmlAccessorType (XmlAccessType.FIELD)
public class BusinessCard
{
    @XmlElement(name = "doctypeid")
    private Doctypeid[] doctypeid;
    @XmlElement(name = "participant")
    private Participant participant;
    @XmlElement(name = "entity")
    private Entity entity;

    public Doctypeid[] getDoctypeid() {
        return doctypeid;
    }

    public void setDoctypeid(Doctypeid[] doctypeid) {
        this.doctypeid = doctypeid;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    @Override
    public String toString()
    {
        return "BusinessCard: [doctypeid = "+doctypeid+", participant = "+participant+", entity = "+entity+"]";
    }
}