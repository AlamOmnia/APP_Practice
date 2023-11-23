 package MarioCarExampleEnum.Question;

public class CarAndDriverMain {
public static void main(String [] args){
   Car evilcar= new Car(new Driver("Wario"));
   Car goodcar = new Car(new Driver("Mario"));


   Driver wario = evilcar.getDriver();
   Driver mario = goodcar.getDriver();

   var hardStrategy = new HardDriverStrategy(evilcar);
   var gentleStrtegy = new GentleDriverStrategy(goodcar);
   
   wario.setStrategy(hardStrategy);
   mario.setStrategy(gentleStrtegy);


   wario.brake(); // waa
   mario.accelerate(); //lets go
   
   wario.accelerate();  // eat dust, skidding
   mario.steer();  // gently

   wario.accelerate(); //eat dust, skidding
   mario.brake(); //oopsi


   wario.accelerate(); //eat dust, skidding
   mario.brake(); //oopsi


   wario.steer();  // outof wway, crashed
}
    
}