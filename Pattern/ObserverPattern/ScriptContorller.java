package ObserverPattern;

public class ScriptContorller {
    private GunSlinger JohnWayne;
    private GunSlinger LeeVanCleef;
    private MovieScriptWriter  c1;
    private MovieScriptWriter  c2;
    public ScriptContorller(GunSlinger LeeVanCleef,GunSlinger JohnWayne,MovieScriptWriter c1, MovieScriptWriter c2){
    this.JohnWayne=JohnWayne;
    this.LeeVanCleef=LeeVanCleef;
    this.c1=c1;
    this.c2=c2;
    }
    public void start(){
    LeeVanCleef.setTargetCommand(JohnWayne);
	c2.writeScriptLine();
	JohnWayne.setTargetCommand(LeeVanCleef);
	c1.writeScriptLine();
	LeeVanCleef.blinkCommand();
	c2.writeScriptLine();
	JohnWayne.shootCommand();
	c1.writeScriptLine();
	c2.writeScriptLine();
    }
}
