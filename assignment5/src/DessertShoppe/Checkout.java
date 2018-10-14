package DessertShoppe;

import java.util.Vector;

public class Checkout {
	private Vector <DessertItem> items;
	public Checkout(){
		items=new Vector <DessertItem>();
	}
	public void enterItem(DessertItem dessert){
		items.add(dessert);
	}
	public int numberOfItems(){
		return items.size();
	}
	public int totalCost(){
		int sum=0;
		for(DessertItem d:items){
			sum+=d.getCost();
		}
		return sum;
	}
	public int totalTax(){
		double tax=DessertShoppe.getTaxrate();
		double taxcost=tax*this.totalCost();
		return (int) taxcost;
	}
	public void clear(){
		items.clear();
	}
	@Override
	public String toString(){
		
		
		String shopName= "     "+DessertShoppe.getStorename();
		String line="   ----------------------";
		int costWithTax= this.totalCost()+this.totalTax();
		String totalTax= DessertShoppe.cents2dollarsAndCents(totalTax());
		String totalCost= DessertShoppe.cents2dollarsAndCents(costWithTax);
		String itemsPurchased = "";
		for (DessertItem eachItem:items){
			itemsPurchased += eachItem.toString();
		}
		String receipt= shopName + "\n"+ line + "\n"+ itemsPurchased + DessertShoppe.nameAndcost("Tax",totalTax) + "\n" +DessertShoppe.nameAndcost("Total Cost",totalCost)+"\n\n";
		return receipt;
	}
}
