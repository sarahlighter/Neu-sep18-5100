package DessertShoppe;

import static org.junit.Assert.*;

import org.junit.Test;

public class unitTesting {
	private Candy c1=new Candy("Peanut Butter Fudge", 2.25, 399);
	private Candy c2=new Candy("Gummy Worms", 1.33, 89);
	private Candy c3=new Candy("Salt Water Taffy", 1.5, 209);
	private Candy c4=new Candy("Candy Corn", 3.0, 109);
	private Sundae s1=new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50);
	private Sundae s2=new Sundae("Vanilla Ice Cream", 105, "Caramel", 50);
	private IceCream i1=new IceCream("Vanilla Ice Cream", 105);
	private IceCream i2=new IceCream("Strawberry Ice Cream", 145);
	private Cookie co1=new Cookie("Oatmeal Raisin Cookies", 4, 399);
	private Cookie co2=new Cookie("Chocolate Chip Cookies", 4, 399);
	@Test
	public void testGetName() {
		assertEquals(c1.getName(),"Peanut Butter Fudge");
		assertEquals(c2.getName(),"Gummy Worms");
		assertEquals(c3.getName(),"Salt Water Taffy");
		assertEquals(s1.getName(),"Choc. Chip Ice Cream");
		assertEquals(s2.getName(),"Vanilla Ice Cream");
		assertEquals(i1.getName(),"Vanilla Ice Cream");
		assertEquals(i2.getName(),"Strawberry Ice Cream");
		assertEquals(co1.getName(),"Oatmeal Raisin Cookies");
		assertEquals(co2.getName(),"Chocolate Chip Cookies");
		
	}
	@Test
	public void testGetCost() {
		assertEquals(c1.getCost(),898);
		assertEquals(c2.getCost(),118);
		assertEquals(c3.getCost(),314);
		assertEquals(c4.getCost(),327);
	}

	@Test
	public void testGetWeight() {
		assertEquals(c1.getWeight(),2.25,0.01);
		assertEquals(c2.getWeight(),1.33,0.01);
		assertEquals(c3.getWeight(),1.5,0.01);
		assertEquals(c4.getWeight(),3.0,0.01);
	}

	@Test
	public void testGetPrice() {
		assertEquals(c1.getPricePerPound(),399);
		assertEquals(c2.getPricePerPound(),89);
		assertEquals(c3.getPricePerPound(),209);
		assertEquals(c4.getPricePerPound(),109);
		assertEquals(s1.getPrice(),145);
		assertEquals(s2.getPrice(),105);
		assertEquals(i1.getPrice(),105);
		assertEquals(i2.getPrice(),145);
		assertEquals(co1.getPricePerDozen(),399);
		assertEquals(co2.getPricePerDozen(),399);
		
	}
	

}
