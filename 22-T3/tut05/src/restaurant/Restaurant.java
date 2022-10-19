package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class Restaurant {

    private String chargingStrategy = "standard";
    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();
    private ChargingStrategy strat = new StandardStrategy();
    
    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }

    public double cost(List<Meal> order, String payee) {
        return strat.cost(order, members.contains(payee));
    }

    public void displayMenu() {
        double modifier = strat.standardChargeModifier();
        
        // switch (chargingStrategy) {
        //     case "standard": modifier = 1; break;
        //     case "holiday": modifier = 1.15; break;
        //     case "happyHour": modifier = 0.7; break;
        //     case "discount": modifier = 1; break;
        // }
        
        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu();
    }

}