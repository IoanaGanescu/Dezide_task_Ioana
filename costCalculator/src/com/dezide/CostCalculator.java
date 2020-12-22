package com.dezide;

import com.dezide.models.CustomCost;
import com.dezide.models.Model;
import com.dezide.models.MoneyValue;
import com.dezide.models.TimeValue;

//CostCalculator class
public class CostCalculator {

    public static CustomCost riskGlobalDefault = new CustomCost("risk", "low");
    public static CustomCost inconvenienceGlobalDefault = new CustomCost("inconvenience", "high");

    //calculator function - uses the given parameters to calculate the correct timeFactor and then return the total cost
    public float calculate(TimeValue time, Model model, MoneyValue money) {

        float timeFactor = model.getTimeFactor();

        return time.getHours() * timeFactor + money.getCost();
    }

    public float customCostAdjustments(float basicCost){

        return 0f;
    }
}

