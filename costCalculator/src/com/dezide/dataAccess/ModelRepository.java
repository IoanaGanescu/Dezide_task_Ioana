package com.dezide.dataAccess;

import com.dezide.models.Model;

import java.util.*;

//Repository class for Models - is comprised of a hashtable that organizes the models based on their String ID
public class ModelRepository {

    private Hashtable<String, Model> models ;

    //constructor - initializes a hashtable of Models with String as key
    public ModelRepository(){
        models = new Hashtable<String, Model>();
    };

    //get a model based on its ID
    public Model getModel(String modelId) {
        if (models.get(modelId) != null){
            return models.get(modelId);
        } else {
            System.out.println("Could not find model ID " + modelId + ". Using global time factor.");
            return new Model();
        }
    }

    //add a model to the hashtable
    public void addModel(Model model) {
        this.models.put(model.getModelId(), model);
    }

}