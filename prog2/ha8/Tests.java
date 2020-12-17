package ha8;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void testOutprint() {
		
		Person p1 = new Person("max", "a", "5");
		Person p2 = new Person("max", "b", "2");
		Person p3 = new Person("max", "c", "666");
		Person p4 = new Person("max", "d", "666");
		Person p5 = new Person("max", "e", "666");
		Telefonbuch t = new Telefonbuch();
		
		BinNodeGen<Person> root = new BinNodeGen<Person>(p3);
		t.tree.root = root;
		boolean res1 = t.insertPerson(p1);
		boolean res2 = t.insertPerson(p2);
		boolean res3 = t.insertPerson(p4);
		boolean res4 = t.insertPerson(p5);
		
		
		t.print();
		t.countEntries();
		
	}
	
	
	@Test
	public void test2() {
		Buch b1 = new Buch("t", "t", 1990);
		Buch b2 = new Buch("t", "t", 2000);
		Buch b3 = new Buch("t", "t", 1998);
		Buch b1 = new Buch("t", "t", 2003);
		Buch b1 = new Buch("t", "t", 1995);
	}
	

}
