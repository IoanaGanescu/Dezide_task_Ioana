package models;

public class Model {

    private String modelId;
    private int timeFactor; //per hour

    public Model(){
        this.timeFactor = 500;
    }

    public Model(String modelId, int timeFactor){
        this.modelId = modelId;
        this.timeFactor = timeFactor;
    }

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

    public int getModelTimeFactor(String modelId){
        if (this.modelId.equals(modelId)){
            return this.timeFactor;
        } else {
            return 300; //global time factor
        }
    }
}
