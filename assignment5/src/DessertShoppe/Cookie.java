package DessertShoppe;

public class Cookie extends DessertItem {	
	private int number;
	private int pricePerDozen;
	public Cookie(String name, int number, int price){
		super(name);
		this.number=number;
		this.pricePerDozen=price;
	}
	public int getNumber() {
		return number;
	}
	public int getPricePerDozen() {
		return pricePerDozen;
	}
	@Override
	protected int getCost() {
		// TODO Auto-generated method stub
		return (int)Math.round(number*pricePerDozen/12.0);
	}
	@Override
	public String toString(){
	    return(this.number+ " @ " +DessertShoppe.cents2dollarsAndCents( this.pricePerDozen)+"/dz."
	    		+DessertShoppe.nameAndcost(name,DessertShoppe.cents2dollarsAndCents( this.getCost()))
	    		+ "\n" );
	}
}
