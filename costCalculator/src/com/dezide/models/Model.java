package com.dezide.models;

// Model class - stores a model ID and a time factor;
// Global (default) time factor is 300
public class Model {

    private String modelId;
    private int timeFactor; //per hour

    //default constructor
    public Model(){
        this.modelId = "";
        this.timeFactor = 300; //global time factor
    }

    //specific constructor
    public Model(String modelId, int timeFactor){
        this.modelId = modelId;
        this.timeFactor = timeFactor;
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

}
