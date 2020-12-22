package com.dezide;

import com.dezide.dataAccess.ModelRepository;
import com.dezide.models.CustomCost;
import com.dezide.models.Model;
import com.dezide.models.MoneyValue;
import com.dezide.models.TimeValue;

import java.util.Hashtable;
import java.util.Locale;

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

        model1.setRiskCost(new CustomCost("risk", "high"));
        model1.setInconvenienceCost(new CustomCost("inconvenience", "medium"));

        //instantiate the models hashtable
        ModelRepository models = new ModelRepository();

        //add the "model1234" object in the hashtable
        models.addModel(model1);

        //declare time and money objects that will be instantiated with console values
        TimeValue time;
        MoneyValue money;

        //try-catch block to catch a possible parse error
        try {
            //instantiate a TimeValue object using the console value
            time = new TimeValue(Float.parseFloat(consoleTime));
        } catch(Exception e){
            System.out.println("The time value you inserted " + consoleTime + " is not a number! Please try again.");
            return;
        }

        //try-catch block to catch a possible parse error
        try {
            //instantiate a MoneyValue object using the console value
            money = new MoneyValue(Float.parseFloat(consoleMoney));
        } catch (Exception e){
            System.out.println("The money value you inserted " + consoleMoney + " is not a number! Please try again.");
            return;
        }

        //calculate the float result using the CostCalculator object previously instantiated
        float res = calculator.calculate(time, models.getModel(consoleModelId), money);

        //print the rounded to the nearest whole number result - Yay!
        System.out.println("Task #1");
        System.out.println(Math.round(res));


        // Task #2
        // If there's more than 3 arguments, then we're dealing with optional customer-specific costs
        if (args.length > 3){

            //So we iterate through them
            for (int i=3; i < args.length; i++){
                String optionalParameter = args[i];

                //And if they're in the correct <name>:<value> form we proceed with the calculation
                try {
                    String optionalCostType = optionalParameter.split(":")[0].toLowerCase(Locale.ROOT);
                    String optionalCostValue = optionalParameter.split(":")[1].toLowerCase(Locale.ROOT);

                    //We're looking in the model list, searching for the console-given model ID
                    if (models.getModel(consoleModelId) != null){

                        //If found, we check if the additional custom costs values within the model are different than what we got from the command line;
                        //If yes, we set them to be the new ones.
                        if (!models.getModel(consoleModelId).getCost(optionalCostType).getValue().equals(optionalCostValue)){
                            models.getModel(consoleModelId).getCost(optionalCostType).setValue(optionalCostValue);
                        }
                    }

                } catch (Exception e){
                    System.out.println("The optional customer cost " + optionalParameter + " is not in the correct <name>:<value> format. Please try again.");
                    return;
                }
            }
        }

        // Then here we call the customCostAdjustment function in CostCalculator; we give the model as a parameter to get the information about the additional costs
        float res1 = calculator.customCostAdjustments(res, models.getModel(consoleModelId));

        //print the rounded to the nearest whole number result - Yay again!
        System.out.println("Task #2");
        System.out.println(Math.round(res1));
    }
}