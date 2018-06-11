package com.globant;

public class Item
{
    private int Id;
    private String Name;

    public Item()
    {

    }

    public Item(int Id, String Name)
    {
        Id = Id;
        Name = Name;
    }

    public int getId()
    {
        return Id;
    }

    public void setId(int Id)
    {
        Id = Id;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        Name = Name;
    }
}
