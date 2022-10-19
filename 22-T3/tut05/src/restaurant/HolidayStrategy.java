package restaurant;

import java.util.List;

public class HolidayStrategy implements ChargingStrategy {

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * 1.15).sum();
    }

    @Override
    public double standardChargeModifier() {
        // TODO Auto-generated method stub
        return 1.15;
    }
    
}
