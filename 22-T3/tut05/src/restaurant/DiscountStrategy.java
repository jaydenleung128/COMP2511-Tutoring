package restaurant;

import java.util.List;

public class DiscountStrategy implements ChargingStrategy {

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        if (payeeIsMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.85).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost()).sum();
        }
    }

    @Override
    public double standardChargeModifier() {
        // TODO Auto-generated method stub
        return 1;
    }
    
}
