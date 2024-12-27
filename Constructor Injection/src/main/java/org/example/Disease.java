package org.example;

public class Disease {

    private String dname;
    private Patient p;
    private String surname;

    //Contructor Injection Which depends on datatype of argument fails if multiple arugement have same datatype, you need to provide the same sequese for same data type to work with multople same data type using type tag
    public Disease(String dname, Patient p,String Surname)
    {
        System.out.println("Disease Object Created");
        this.dname = dname;
        this.p = p;
        this.surname = Surname;
    }

    public String getDname() {
        return dname;
    }

    public String getPname() {
        return p.getName();
    }

    public String getSurname() {
        return surname;
    }
}
