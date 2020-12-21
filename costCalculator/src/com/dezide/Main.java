package com.dezide;

import com.dezide.dataAccess.ModelRepository;
import com.dezide.models.Model;
import com.dezide.models.MoneyValue;
import com.dezide.models.TimeValue;

public class Main {

    public static void main(String[] args) {

        //store the console given input
        String consoleTime = args[0];
        String consoleMoney = args[1];
        String consoleModelId = args[2];

        //instantiate a CostCalculator object for later use
        CostCalculator calculator = new CostCalculator();

        //instantiate the "model1234" ID model object
        Model model1 = new Model("model1234", 500);

        //instantiate the models hashtable
        ModelRepository models = new ModelRepository();

        //add the "model1234" object in the hashtable
        models.addModel(model1);

        //instantiate a TimeValue object using the console value
        TimeValue time = new TimeValue(Float.parseFloat(consoleTime));

        //instantiate a MoneyValue object using the console value
        MoneyValue money = new MoneyValue(Float.parseFloat(consoleMoney));

        //calculate the float result using the CostCalculator object previously instantiated
        float res = calculator.calculator(time, models.getModel(consoleModelId), money);

        //print the rounded to the nearest whole number result - Yay!
        System.out.println(Math.round(res));

    }
}
