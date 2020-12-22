package com.dezide.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

// Model class - stores a model ID and a time factor;
// Global (default) time factor is 300
public class Model {

    private String modelId;
    private int timeFactor; //per hour

    private CustomCost riskCost;
    private CustomCost inconvenienceCost;

    //default constructor
    public Model(){
        this.modelId = "";
        this.timeFactor = 300; //global time factor
        this.riskCost = new CustomCost("risk", "low"); //global default risk factor
        this.inconvenienceCost = new CustomCost("inconvenience", "high"); //global default inconvenience factor
    }

    //specific constructor
    public Model(String modelId, int timeFactor){
        this.modelId = modelId;
        this.timeFactor = timeFactor;
    }

    //specific constructor with costs
    public Model(String modelId, int timeFactor, CustomCost risk, CustomCost inconvenience){
        this.modelId = modelId;
        this.timeFactor = timeFactor;
        this.riskCost = risk;
        this.inconvenienceCost = inconvenience;
    }

    //getters and setters for attributes
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId){
        this.modelId = modelId;
    }

    public int getTimeFactor(){
        return timeFactor;
    }

    public void setTimeFactor(int timeFactor) {
        this.timeFactor = timeFactor;
    }

    public CustomCost getRiskCost() {
        return riskCost;
    }

    public void setRiskCost(CustomCost riskCost) {
        this.riskCost = riskCost;
    }

    public CustomCost getInconvenienceCost() {
        return inconvenienceCost;
    }

    public void setInconvenienceCost(CustomCost inconvenienceCost) {
        this.inconvenienceCost = inconvenienceCost;
    }

    //get one CustomCost based on the name
    public CustomCost getCost(String costType){
        if (costType.equals(this.riskCost.getName())){
            return riskCost;
        } else
            return inconvenienceCost;
    }

    //get all CustomCosts of this model
    public ArrayList<CustomCost> getCosts(){
        ArrayList<CustomCost> costs = new ArrayList<>();
        costs.add(riskCost);
        costs.add(inconvenienceCost);
        return costs;
    }
}
