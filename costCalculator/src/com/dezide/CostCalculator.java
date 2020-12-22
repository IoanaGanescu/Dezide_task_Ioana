package com.dezide;

import com.dezide.models.Model;
import com.dezide.models.MoneyValue;
import com.dezide.models.TimeValue;

//CostCalculator class
public class CostCalculator {

    //calculator function - uses the given parameters to calculate the correct timeFactor and then return the total cost
    public float calculate(TimeValue time, Model model, MoneyValue money) {

        float timeFactor = model.getTimeFactor();

        return time.getHours() * timeFactor + money.getCost();
    }
}

