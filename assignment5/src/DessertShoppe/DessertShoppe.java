package DessertShoppe;

public class DessertShoppe {
	private static final double taxRate=0.09;
	private static final String storeName="Happy Dessert Shoppe";
	private static final int width=30;
	
	public static double getTaxrate() {
		return taxRate;
	}

	public static String getStorename() {
		return storeName;
	}

	public static int getWidth() {
		return width;
	}
	public static String cents2dollarsAndCents(int cost){
		int cents=cost%100;
		int dollars=cost/100;
		String result="";
		if(dollars>0)
			result+=dollars;
		if(cents<=9)
			result+=".0"+cents;
		else result+="."+cents;
		return result;
	}
	public static String nameAndcost(String name, String cost){
		int numberSpace = width - name.length() - cost.length();
		String space="\n"+name;
		for (int i=0; i< numberSpace; i++ ){
			space+=" ";
		}
		space+=cost;
		return space;		
	}
}
