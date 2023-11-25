package ObserverPattern;

public class DuelDemo {
    private GunSlinger JohnWayne;
    private GunSlinger LeeVanCleef;
    private MovieScriptWriter  c1;
    private MovieScriptWriter  c2;
    private ScriptContorller scriptController;

    public DuelDemo(){
    this.JohnWayne = new GunSlinger("John Wayne");
	this.LeeVanCleef = new GunSlinger("Lee vanCleef");
	this.c1 = new MovieScriptWriter(JohnWayne);
	this.c2 = new MovieScriptWriter(LeeVanCleef);
    this.scriptController= new ScriptContorller(LeeVanCleef, JohnWayne, c1, c2);
    }

  public static void main(String args[]){

	DuelDemo duelDemo= new DuelDemo();
    duelDemo.demo();
	
  }
  public void demo(){
        
        scriptController.start();
        JohnWayne.detach(c1);
        LeeVanCleef.detach(c1);
  }
}

