package com.dezide.models;

//CustomCost class that has a name and a value for the different types of costs.
public class CustomCost {

    private String name;
    private String value;

    public CustomCost(String name, String value){
        this.name = name;
        this.value = value;
    }

    //getters and setters
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

    //this function returns the relative adjustments of the final cost, depending on the value of the cost type.
    public float getFinalCostRelativeAdjustment(){
        if (this.value.equals("low")){
            return 0.1f; // +10%
        } else if (this.value.equals("medium")){
            return 0.3f; // +30%
        } else if (this.value.equals("high")){
            return 1f; // +100%
        }
        return 0f; // 0%
    }
}
