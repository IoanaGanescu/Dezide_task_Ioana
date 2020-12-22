package com.dezide;

import com.dezide.models.CustomCost;
import com.dezide.models.Model;
import com.dezide.models.MoneyValue;
import com.dezide.models.TimeValue;

//CostCalculator class
public class CostCalculator {

    public static CustomCost riskGlobalDefault = new CustomCost("risk", "low"); // 10%
    public static CustomCost inconvenienceGlobalDefault = new CustomCost("inconvenience", "high"); //100%

    //calculator function - uses the given parameters to calculate the correct timeFactor and then return the total cost
    public float calculate(TimeValue time, Model model, MoneyValue money) {

        float timeFactor = model.getTimeFactor();

        return time.getHours() * timeFactor + money.getCost();
    }

    //customer-specific cost calculator - uses the basic cost and a model;
    //the model is used to get info about its customer specific costs; if the model doesn't exist, it uses the global default values.
    public float customCostAdjustments(float basicCost, Model model){
        //the adjustedCost is initially the basicCost
        float adjustedCost = basicCost;

        //check the model exists
        if (!model.getModelId().equals("")){

            //get all the model's CustomCosts
            var modelCosts = model.getCosts();

            //iterate through the different types of costs and add them to the total adjusted cost
            for (int i = 0; i < modelCosts.size(); i++){
                adjustedCost += basicCost * modelCosts.get(i).getFinalCostRelativeAdjustment();
            }

            //if the model doesn't exist, use default values.
        } else{
            adjustedCost += basicCost * riskGlobalDefault.getFinalCostRelativeAdjustment() + basicCost * inconvenienceGlobalDefault.getFinalCostRelativeAdjustment();
        }

        return adjustedCost;
    }
}