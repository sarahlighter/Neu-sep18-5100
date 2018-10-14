package DessertShoppe;

public class Sundae extends IceCream {
	private int topperprice;
	private String toppername;
	public Sundae(String name, int IceCreamPrice,String toppername, int topperprice) {
		super(name,IceCreamPrice);
		this.topperprice = topperprice;
		this.toppername = toppername;
	}
	
	@Override
	protected int getCost() {
		// TODO Auto-generated method stub
		return topperprice+getPrice();
	}
	@Override
	public String toString(){
	    return(this.toppername+ " with\n" 
	    		+DessertShoppe.nameAndcost(name,DessertShoppe.cents2dollarsAndCents( this.getCost()))
	    		+"\n");
	}

	
}
