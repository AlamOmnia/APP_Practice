package ObserverPattern;

import java.util.Scanner;

public class CalculatorDriver {
	private CalculatorModel calculatorModel;
	private CalculatorView calculatorView;
	private CalculatorController calculatorController;
	public CalculatorDriver(){
		calculatorModel= new CalculatorModel();
		calculatorView= new CalculatorView(calculatorModel);
		calculatorController= new CalculatorController(calculatorModel,calculatorView);
	}

	public static void main(String[] args) {
		CalculatorDriver calculatorDriver= new CalculatorDriver();
		calculatorDriver.demo();
		
	}
	public void demo(){
		calculatorController.getItems();
		calculatorModel.detach(calculatorView);
	}
}