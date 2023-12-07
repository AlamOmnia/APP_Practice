package Builder;

public class BuilderDemo {
    public static void main(String [] args){
    MealBuilder mealBuilder= new MealBuilder();
    Meal meal= mealBuilder.getNonVegMeal();
    meal.showItems();
    System.out.println("total"+meal.getCost());
    }
   
}
