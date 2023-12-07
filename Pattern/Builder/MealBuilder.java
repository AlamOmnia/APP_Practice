package Builder;

public class MealBuilder {
    public Meal getVegMeal(){
     Meal meal = new Meal();
    meal.addItem( new VegBurger());
    meal.addItem(new Coke());
    return meal;
    }

    public Meal getNonVegMeal(){
       Meal meal = new Meal();
    meal.addItem( new ChickenBurger());
    meal.addItem(new Pepsi());
    return meal;  
    }
  
}
