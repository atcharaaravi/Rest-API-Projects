package com.jersey.subjects.pojo;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Subject {
 
    private String subjectID;
    private String subName;
    private String placeToBuy;
 
    public Subject() {
 
    }
 
    public Subject(String subjectID, String subName, String placeToBuy) {
        this.subjectID = subjectID;
        this.subName = subName;
        this.placeToBuy = placeToBuy;
    }
 
    public String getSubjectID() {
        return subjectID;
    }
 
    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }
 
    public String getSubName() {
        return subName;
    }
 
    public void setSubName(String subName) {
        this.subName = subName;
    }
 
    public String getPlaceToBuy() {
        return placeToBuy;
    }
 
    public void setPlaceToBuy(String placeToBuy) {
        this.placeToBuy = placeToBuy;
    }
 
}