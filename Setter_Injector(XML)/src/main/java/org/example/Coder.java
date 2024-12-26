package org.example;

public class Coder {

    String language; //Nothing has been setted as a default value here Default Value is in Content.xml file
    system sys;//doesnt by fault assign any pointer it is done in xml
    public system getSys() {
        return sys;
    }

    public void setSys(system sys) {
        this.sys = sys;
    }



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

    public void code()
    {
        System.out.println("Coding....");
        sys.compile();
    }
}
