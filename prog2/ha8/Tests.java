package ha8;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	//Telefonbuch
	@Test 
	public void testCountEntriesEmpty() {
		Telefonbuch t = new Telefonbuch();
		assertEquals(0, t.countEntries());
	}
	
	@Test
	public void testCountEntries() {
		Telefonbuch t = new Telefonbuch();
		Person p = new Person("Max", "Muster", "666");
		Person p1 = new Person("Max", "S", "666");
		Person p2 = new Person("Max", "K", "555");
		Person p3 = new Person("Max", "J", "333");
		BinNodeGen<Person> root = new BinNodeGen<Person>(p);
		t.tree.root = root;
		t.insertPerson(p1);
		t.insertPerson(p2);
		t.insertPerson(p3);
		assertEquals(4, t.countEntries());
	}

	@Test
	public void testInsertPersonNull() {
		Telefonbuch t = new Telefonbuch();
		assertEquals(false, t.insertPerson(null));
	}
	
	@Test
	public void testInsertPersonAlreadyExists() {
		Telefonbuch t = new Telefonbuch();
		Person p = new Person("Max", "Muster", "666");
		BinNodeGen<Person> root = new BinNodeGen<Person>(p);
		t.tree.root = root;
		assertEquals(false, t.insertPerson(p));
		
	}
	
	@Test
	public void testSearchPerson() {
		Telefonbuch t = new Telefonbuch();
		Person p = new Person("Max", "Muster", "666");
		BinNodeGen<Person> root = new BinNodeGen<Person>(p);
		t.tree.root = root;
		assertEquals(p, t.searchPerson("Muster"));
	}
	
	@Test(expected = NullPointerException.class)
	public void testSearchPersonNull() {
		Telefonbuch t = new Telefonbuch();
		Person p = new Person("Max", "Muster", "666");
		BinNodeGen<Person> root = new BinNodeGen<Person>(p);
		t.tree.root = root;
		t.searchPerson("SomeOtherName");
	}
	
	//Antiquariat
	@Test
	public void testCountBooksEmpty() {
		Antiquariat a = new Antiquariat();
		assertEquals(0, a.countBooks());
	}
	
	@Test
	public void testCountBooks() {
		Antiquariat a = new Antiquariat();
		Buch b1 = new Buch("title1", "author1", 1800);
		Buch b2 = new Buch("title2", "author2", 1700);
		Buch b3 = new Buch("title3", "author3", 1900);
		Buch b4 = new Buch("title4", "author4", 1950);
		Buch b5 = new Buch("title5", "author5", 1945);
		BinNodeGen<Buch> root = new BinNodeGen<Buch>(b1);
		a.tree.root = root;
		a.insertBook(b2);
		a.insertBook(b3);
		a.insertBook(b4);
		a.insertBook(b5);
		assertEquals(5, a.countBooks());
	}
	
	@Test
	public void testCountBooksUntil() {
		Antiquariat a = new Antiquariat();
		Buch b1 = new Buch("title1", "author1", 1800);
		Buch b2 = new Buch("title2", "author2", 1700);
		Buch b3 = new Buch("title3", "author3", 1900);
		Buch b4 = new Buch("title4", "author4", 1950);
		Buch b5 = new Buch("title5", "author5", 1945);
		BinNodeGen<Buch> root = new BinNodeGen<Buch>(b1);
		a.tree.root = root;
		a.insertBook(b2);
		a.insertBook(b3);
		a.insertBook(b4);
		a.insertBook(b5);
		assertEquals(2, a.countBooksUntil(1899));
	}
	
	@Test
	public void testGetBooksUntil() {
		Antiquariat a = new Antiquariat();
		Buch b1 = new Buch("title1", "author1", 1800);
		Buch b2 = new Buch("title2", "author2", 1700);
		Buch b3 = new Buch("title3", "author3", 1900);
		Buch b4 = new Buch("title4", "author4", 1950);
		Buch b5 = new Buch("title5", "author5", 1945);
		BinNodeGen<Buch> root = new BinNodeGen<Buch>(b1);
		a.tree.root = root;
		a.insertBook(b2);
		a.insertBook(b3);
		a.insertBook(b4);
		a.insertBook(b5);
		System.out.println(a.getAllUntil(1900));
	}
	
	
	
	
	

}
