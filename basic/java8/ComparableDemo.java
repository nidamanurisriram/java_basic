// Comparable in java is used to sort the data of collection objects

// A class has to inherit the comparable interface to sort the data 

// Sorting logic has to be defined in compareTo() method of Comparable interface

// Using the collections class sort method the collection object data can be sorted

package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo implements Comparable<ComparableDemo> {
	
	private int id;
	
	private String name;
	
	private int price;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ComparableDemo(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}	

	@Override
	public String toString() {
		return "ComparableDemo [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public static void main(String [] args) {
		
		List<ComparableDemo> courses = new ArrayList<>();
		
		courses.add(new ComparableDemo(1, "Fan", 100));
		courses.add(new ComparableDemo(2, "Pad", 50));
		courses.add(new ComparableDemo(3, "Mat", 150));
		courses.add(new ComparableDemo(4, "Lamp", 300));
		
		Collections.sort(courses);
		
		for(ComparableDemo course : courses) {
			
			System.out.println(course);
			
		}
		
	}

	@Override
	public int compareTo(ComparableDemo o2) {

		if(this.price > o2.price) {
			return 1;
		}
		else {
			return -1;
		}
		
	}

}
