/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SayefReyadh
 */
public class PatientModel {
    
    private int id;
    private String nameString;
    private String genderString;
    private String ageString;
    private String contactString;
    private String addressString;

    public PatientModel() {
    }


    
    public PatientModel(int id, String nameString, String genderString, String ageString, String contactString, String addressString) {
        this.id = id;
        this.nameString = nameString;
        this.genderString = genderString;
        this.ageString = ageString;
        this.contactString = contactString;
        this.addressString = addressString;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getGenderString() {
        return genderString;
    }

    public void setGenderString(String genderString) {
        this.genderString = genderString;
    }

    public String getAgeString() {
        return ageString;
    }

    public void setAgeString(String ageString) {
        this.ageString = ageString;
    }

    public String getContactString() {
        return contactString;
    }

    public void setContactString(String contactString) {
        this.contactString = contactString;
    }

    public String getAddressString() {
        return addressString;
    }

    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }

    @Override
    public String toString() {
        return "PatientModel{" + "id=" + id + ", nameString=" + nameString + ", genderString=" + genderString + ", ageString=" + ageString + ", contactString=" + contactString + ", addressString=" + addressString + '}';
    }

    
    
    
    
}