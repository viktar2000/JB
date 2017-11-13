package com.epam.jb.lesson0402;

public class Customer {
    private String surName;
    private String name;
    private String homeAdress;
    private int cardNumber;
    private int bankNumber;


    public void setCustomerParam(String _surname,String _name,String _homeAdress,int _cardNumber,int _bankNumber){
        surName=_surname;
        name = _name;
        homeAdress=_homeAdress;
        cardNumber = _cardNumber;
        bankNumber = _bankNumber;
    }


}
