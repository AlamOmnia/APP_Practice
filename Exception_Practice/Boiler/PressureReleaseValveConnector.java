
public class PressureReleaseValveConnector {
private PressureReleaseValve prv;
private Boiler boiler= new Boiler();

public PressureReleaseValve getPrv() {
    return prv;
}

public void setPrv(PressureReleaseValve prv) {
    this.prv = prv;
}

public Boiler getBoiler() {
    return boiler;
}

public void setBoiler(Boiler boiler) {
    this.boiler = boiler;
}

public PressureReleaseValveConnector(PressureReleaseValve new_prv, Boiler b){
this.prv= new_prv;
this.boiler= b;
}
public void close(){
    try {
        prv.close();
    } catch (StuckValveException e) {
        boiler.emergencyFile.write(e.toString());
    }
}

public void open(){
    try {
        prv.open();
    } catch (StuckValveException e) {
        boiler.b_State= BoilerState.critical;
       boiler.emergencyFile.write(e.toString()+"\n");
       boiler.emergencyFile.write("Evacuation!"+"\n");
    }
}

}
