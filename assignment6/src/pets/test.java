package pets;

public class test {

	public static void main(String[] args) {
		Pet pet1 = new Pet("Spot", "Mary", "Black and White");
		pet1.setSex(pet1.male);
		System.out.println(pet1.toString()+"\n");

		Cat cat1 = new Cat("Tom", "Bob", "black", "short");//name, owner name, color, hair
		cat1.setSex(cat1.spayed);
		System.out.println(cat1.toString()); 
		
		cat1.setBoardStart(10, 21, 1980);
		cat1.setBoardEnd(10,21,1986);
		System.out.println("On board: "+cat1.boarding(10, 22, 1980)+"\n");
	
		Dog dog1 = new Dog("Spot", "Susan", "White", "medium");//name, owner name, color, size
		dog1.setSex(dog1.spayed);
		System.out.println(dog1.toString()); 
		
		dog1.setBoardStart(11,21,1980);
		dog1.setBoardEnd(10,21,1986);
		System.out.println("On board:"+dog1.boarding(10, 22, 1980)+"\n");
		
		

	}

}
