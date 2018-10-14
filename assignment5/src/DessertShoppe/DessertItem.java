package DessertShoppe;

public abstract class DessertItem extends java.lang.Object{
	protected String name;
	protected abstract int getCost();
	public DessertItem(){    // default Constructor
		this.name = "";
	}
	public DessertItem(String name){  // named Constructor
	    this.name = name;
	}
	public final String getName(){
		return name;
	}
}
