package com.epam.jb.lesson0402;

import java.util.Date;

public class Student {
    private String surname;
    private String name;
    private String fName;
    private Date Birthdate=null;



    public void setStudentParam(String surname,String name,String fName,Date birthdate){
        this.surname=surname;
        this.name=name;
        this.fName=fName;
        this.Birthdate=birthdate;
    }

    public String getfName() {
        return fName;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthdate() {
        return Birthdate;
    }
    public String getName() {
        return name;
    }
}
