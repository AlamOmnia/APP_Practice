package ObserverPattern;

public class CalculatorView implements Observer{
    public CalculatorView(CalculatorModel calculatorModel){
        calculatorModel.attach(this);
    }

    @Override
    public void update(Observable p_observable_state) {
        var model = (CalculatorModel)p_observable_state;
        System.out.println("solution =" + model.getSolution());
		((CalculatorModel)p_observable_state).setX(((CalculatorModel)p_observable_state).getSolution());
    }
   
}
