package com.dezide.models;

//MoneyValue class - only has cost as attribute but built for safety purposes
public class MoneyValue {

    private float cost;

    //constructor
    public MoneyValue(float cost){
        this.cost = cost;
    }

    //get & set
    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
