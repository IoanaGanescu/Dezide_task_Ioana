
import models.*;
import dataAccess.ModelRepository;

public class CostCalculator {

    public static float calculator(TimeValue time, float timeFactor, MoneyValue money) {
        return time.getHours() * timeFactor + money.getCost();
    }

    public static void main(String[] args) {
        // write your code here

        Model model = new Model("model1234", 500);

        TimeValue time = new TimeValue(0.5f);

        MoneyValue money = new MoneyValue(275.5f);


        System.out.println(model.getTimeFactor());
        System.out.println(Math.round(calculator(time, model.getTimeFactor(), money)));


        //main input:
        //time - minutes
        //money - int
        //modelId - string

        //calculator elements:
        //time - hours
        //timeFactor - global/local_per_id per hour
        //money - int

        //calculator parameters:
        //time - minutes
        //money


    }
}

