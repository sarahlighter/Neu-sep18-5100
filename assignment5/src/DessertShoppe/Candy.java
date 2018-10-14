package DessertShoppe;

public class Candy extends DessertItem{
	private double weight;
	private int pricePerPound;
	
	public Candy(String name, double weight, int price){
		super(name);
		this.weight=weight;
		this.pricePerPound=price;
	}
	
	public double getWeight() {
		return weight;
	}

	public int getPricePerPound() {
		return pricePerPound;
	}

	@Override
	public int getCost() {
		// TODO9 Auto-generated method stub
		return (int)Math.round(weight*pricePerPound);
	}
	@Override
	public String toString(){
	    return(this.weight+ " lbs @ " +DessertShoppe.cents2dollarsAndCents( this.pricePerPound)+"/lb."
	    		+DessertShoppe.nameAndcost(name,DessertShoppe.cents2dollarsAndCents( this.getCost()))
	    		+"\n");
	}

}
