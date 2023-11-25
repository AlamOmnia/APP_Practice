package ObserverPattern;

import java.util.Scanner;

public class CalculatorModel extends Observable {
   
    private double y;
	private double solution=0;
	private double x;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
        
	}

	public void setSolution(double p_s) {
		solution = p_s; 
        notifyObservers(this);
	}
    public double getSolution() {
		return solution; 
	}
	
	public void addition(double x, double y) {
		setSolution(x + y);
        notifyObservers(this);
	}

	public void subtraction(double x, double y) {
		setSolution(x - y);
        notifyObservers(this);
	}

	public void multiplication(double x, double y) {
		setSolution(x * y);
        notifyObservers(this);
	}

	public void division(double x, double y) {
		setSolution(x / y);
        notifyObservers(this);
        
	}
}
	
