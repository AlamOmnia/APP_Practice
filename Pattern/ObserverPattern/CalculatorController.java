package ObserverPattern;

import java.util.Scanner;

import Decorator.Shape.Shape;

public class CalculatorController {
    private static final Observable Observable = null;
    static Scanner keyboard;
    private CalculatorView calculatorView;
    private CalculatorModel calculatorModel;
    public CalculatorController(CalculatorModel calculatorModel,CalculatorView calculatorView){
        this.calculatorModel=calculatorModel;
        this.calculatorView= calculatorView;
    }
    private enum operation {
		add, sub, mult, div
	};
    public void getItems(){
        keyboard = new Scanner(System.in);
        char another = 'n';
		System.out.println("initial value: ");
		calculatorModel.setX(Integer.parseInt(keyboard.next()));
		do {
			System.out.println("What operation? ('add', 'sub', 'mult', 'div')");
			operation ttt = operation.valueOf(keyboard.next());
			System.out.println("operand: ");
			calculatorModel.setY(keyboard.nextDouble());
			switch (ttt) {
			case add:
				calculatorModel.addition(calculatorModel.getX(), calculatorModel.getY());
				break;
			case sub:
				calculatorModel.subtraction(calculatorModel.getX(), calculatorModel.getY());
				break;
			case mult:
				calculatorModel.multiplication(calculatorModel.getX(), calculatorModel.getY());
				break;
			case div:
				calculatorModel.division(calculatorModel.getX(), calculatorModel.getY());
				break;
			}
			
			System.out.print("continue (y/n)?");
			another = keyboard.next().charAt(0);
		} while (another == 'y');
	}
    }

