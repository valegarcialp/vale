package com.globant;

public class Order
{
    private int Id;
    private int Items;

    public Order()
    {

    }

    public Order(int Id, int Items)
    {
        Id = Id;
        Items = Items;
    }

    public int getId()
    {
        return Id;
    }

    public void setId(int Id)
    {
        Id = Id;
    }

    public int getItems()
    {
        return Items;
    }

    public void setItems(int Items)
    {
        Items = Items;
    }
}
