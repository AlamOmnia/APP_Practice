package ObserverPattern;

class MovieScriptWriter implements Observer{
	private GunSlinger shooter; 
	
	MovieScriptWriter(GunSlinger gs){
		shooter = gs;
        shooter.attach(this);
	}
  
  public void writeScriptLine(){
	  switch(shooter.getState()) {
	  case "Duel":
		  System.out.print(shooter.name + ": looks at " + shooter.target.name + ", tickly fingers\n");
		  break;		
	  case "Blinking": 
		  System.out.print(shooter.name + ": sweating, blinks\n");
		  break;
	  case "Dead":
		  System.out.print(shooter.name + ": knees bend, falls dead\n");
		  break;
	  case "Shooting":
		  System.out.print(shooter.name + ": lightning-fast shot\n");
		  break;
	  }
  }

@Override
public void update(Observable p_observable_state) {
    shooter=(GunSlinger)p_observable_state;
    writeScriptLine();
}
  

}; 