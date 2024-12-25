package org.example;

public class Coder {

    String language; //Nothing has been setted as a default value here Default Value is in Content.xml file


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;

    }

    public Coder()
    {
        System.out.println("Coder Class Object Is Created");


    }
}
