package com.globant;

public class Payments {
    private int Id;
    private String Order;
    private int Amount;

    public Payments() {

    }

    public Payments(int i, String Or, int am) {
        setId(i);
        setOrder(Or);
        setAmount(am);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getOrder() {
        return Order;
    }

    public void setOrder(String order) {
        Order = order;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
}
