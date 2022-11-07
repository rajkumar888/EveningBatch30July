package collectionsList;

import java.util.LinkedList;
import java.util.List;

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class LinkedListExample {
	
	public static void main(String[] args) {
		// Creating list of Books
		List<Book> list = new LinkedList<Book>();
		
		list.add(new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8));
		list.add(new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4));
		list.add(new Book(103, "Operating System", "Galvin", "Wiley", 6));
		
		// Traversing list
		for (Book b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}