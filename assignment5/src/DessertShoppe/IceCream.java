package DessertShoppe;

public class IceCream extends DessertItem{
	private int price;
	
	public IceCream(String name,int price) {
		super(name);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	@Override
	protected int getCost() {
		// TODO Auto-generated method stub
		return this.getPrice();
	}

	@Override
	public String toString(){
		return DessertShoppe.nameAndcost(name,DessertShoppe.cents2dollarsAndCents( this.getCost()))
					+"\n";
	}
}
