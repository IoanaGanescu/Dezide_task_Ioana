package dataAccess;

import models.Model;

import java.util.*;

public class ModelRepository {

    private Hashtable<String, Model> models ;

    public ModelRepository(){
        models = new Hashtable<String, Model>();
        this.addModel(new Model());
    };

    public Hashtable<String, Model> getModels(){
        return this.models;
    }

    public Model getModel(String modelId) {
        if (models.get(modelId) != null){
            return models.get(modelId);
        } else{
            return new Model();
        }
    }

    public void addModel(Model model) {
        this.models.put(model.getModelId(), model);
    }

}
