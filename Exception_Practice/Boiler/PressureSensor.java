import java.util.Random;

public class PressureSensor {
    private Random randomGenerator;
    public Random getRandomGenerator() {
        return randomGenerator;
    }
    public void setRandomGenerator(Random randomGenerator) {
        this.randomGenerator = randomGenerator;
    }
    public PressureSensor(){
        this.randomGenerator= new Random();
    }
    public int getPressure()throws NegativePressureException,OverloadPressureException{
        int pressure= randomGenerator.nextInt(105)-1;
        if(pressure<0){
            throw new NegativePressureException(pressure);
        }
        if(pressure>100){
            throw new OverloadPressureException(pressure);
        }
        return pressure;
    }
}
