package com.dezide.models;

public class CustomCost {

    private String name;
    private String value;

    public CustomCost(String name, String value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public float getFinalCostRelativeAdjustment(String value){
        if (value.equals("low")){
            return 0.1f;
        } else if (value.equals("medium")){
            return 0.3f;
        } else if (value.equals("high")){
            return 1f;
        } else
            return 0f;
    }
}
