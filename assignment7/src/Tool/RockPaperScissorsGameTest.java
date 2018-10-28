package Tool;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockPaperScissorsGameTest {

	@Test
	public void test() {
		Scissors s = new Scissors(10);
        Paper p = new Paper(8);
        Rock r = new Rock(15);
		assertEquals(s.fight(p),true);
		assertEquals(p.fight(s),false);
		assertEquals(p.fight(r),true);
		assertEquals(r.fight(p),false);
		assertEquals(r.fight(s),true);
		assertEquals(s.fight(r),false);
		Scissors s1 = new Scissors(5);
	    Paper p1 = new Paper(7);
	    Rock r1 = new Rock(15);
	    assertEquals(s1.fight(p1),true);
		assertEquals(p1.fight(s1),false);
		assertEquals(p1.fight(r1),false);
		assertEquals(r1.fight(p1),true);
		assertEquals(r1.fight(s1),true);
		assertEquals(s1.fight(r1),false);
	}

}
