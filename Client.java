package com.globant;

public class Client {
    private int Id;
    private String Name;
    private String LastName;
    private String Description;
    private String Payments;

    public Client() {

    }

    public Client(int i, String nom, String lN, String Des, String Pay) {
        Id = i;
        Name = nom;
        LastName = lN;
        Description = Des;
        Payments = Pay;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String nom) {
        Name = nom;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String last) {
        LastName = last;
    }

    public String getDescription()
    {
        return Description;
    }

    public void setDescription(String des)
    {
        Description = des;
    }

    public String getPayments()
    {
        return Payments;
    }

    public void setPayments(String Pay)
    {
        Payments = Pay;
    }
}
