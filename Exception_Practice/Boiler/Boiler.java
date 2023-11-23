public class Boiler {
    FileWriterWrapper emergencyFile;
    private PressureReleaseValveConnector prv;
    BoilerState b_State;
    
    public FileWriterWrapper getEmergencyFile() {
        return emergencyFile;
    }
    public void setEmergencyFile(FileWriterWrapper emergencyFile) {
        this.emergencyFile = emergencyFile;
    }
    public PressureReleaseValveConnector getPrv() {
        return prv;
    }
    public void setPrv(PressureReleaseValveConnector prv) {
        this.prv = prv;
    }
    public Boiler(){
      this.emergencyFile= new FileWriterWrapper("/Users/air/Documents/GitHub/APP_Practive/Exception_Practice/test.txt");
    }
}
