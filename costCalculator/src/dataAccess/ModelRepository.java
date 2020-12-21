package dataAccess;

import models.Model;

import java.util.*;

public class ModelRepository {

//    private Model model = new Model();

    private ArrayList<Model> modelList ;

    public ModelRepository(){
        modelList = new ArrayList<Model>();
    };

    public ArrayList<Model> getModelList() {
        return modelList;
    }

    public void setModelList(ArrayList<Model> modelList) {
        this.modelList = modelList;
    }


}
