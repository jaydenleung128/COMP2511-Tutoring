package restaurant;

import java.util.List;

public class StandardStrategy implements ChargingStrategy {

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double standardChargeModifier() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
