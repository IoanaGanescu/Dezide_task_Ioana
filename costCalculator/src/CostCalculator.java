
import models.*;
import dataAccess.ModelRepository;

public class CostCalculator {

    public static float calculator(TimeValue time, float timeFactor, MoneyValue money) {
        return time.getHours() * timeFactor + money.getCost();
    }

    public static void main(String[] args) {

        Model model = new Model("model1234", 500);

        ModelRepository models = new ModelRepository();

        models.addModel(model);

        TimeValue time = new TimeValue(0.5f);

        MoneyValue money = new MoneyValue(275.5f);

        System.out.println(Math.round(calculator(time, models.getModel(model.getModelId()).getTimeFactor(), money)));

    }
}

