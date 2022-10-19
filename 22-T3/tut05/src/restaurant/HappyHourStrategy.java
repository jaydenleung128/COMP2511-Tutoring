package restaurant;

import java.util.List;

public class HappyHourStrategy implements ChargingStrategy {

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        if (payeeIsMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.6).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.7).sum();
        }
    }

    @Override
    public double standardChargeModifier() {
        // TODO Auto-generated method stub
        return 0.7;
    }
    
}
