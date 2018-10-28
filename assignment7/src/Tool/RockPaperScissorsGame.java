package Tool;
class Tool{
	protected int strength;
	protected char type;
	public void setStrength(int strength){
		this.strength=strength;
	}
	public boolean fight(Tool a){
		if(this.strength>a.strength) return true;
		else return false;
	}
}
class Rock extends Tool{
	public Rock(int s) {
		super();
		this.setStrength(s);
	}
	@Override
	public boolean fight(Tool a){
		int rockS= this.strength;
		int aStrength=a.strength;
		if(a.getClass().getName()=="Tool.Paper")
			aStrength*=2;
		if(a.getClass().getName()=="Tool.Scissors")
			rockS*=2;
		if(rockS>aStrength) return true;
		else return false;
	}
}
class Paper extends Tool{
	public Paper(int s){
		super();
		this.setStrength(s);
	}
	@Override
	public boolean fight(Tool a){
		int paperS= this.strength;
		int aStrength=a.strength;
		if(a.getClass().getName()=="Tool.Scissors")
			aStrength*=2;
		if(a.getClass().getName()=="Tool.Rock")
			paperS*=2;
		if(paperS>aStrength) return true;
		else return false;
	}
}
class Scissors extends Tool{
	public Scissors(int s){
		super();
		this.setStrength(s);
	}
	@Override
	public boolean fight(Tool a){
		int scissorS= this.strength;
		int aStrength=a.strength;
		if(a.getClass().getName()=="Tool.Rock")
			aStrength*=2;
		if(a.getClass().getName()=="Tool.Paper")
			scissorS=scissorS*2;
		if(scissorS>aStrength) return true;
		else return false;
	}
}
public class RockPaperScissorsGame {
	public static void main(String args[]){
        Scissors s = new Scissors(5);
        Paper p = new Paper(7);
        Rock r = new Rock(15);
        System.out.println(s.fight(p) + " , "+ p.fight(s));
        System.out.println(p.fight(r) + " , "+ r.fight(p));
        System.out.println(r.fight(s) + " , "+ s.fight(r));
    }
}
