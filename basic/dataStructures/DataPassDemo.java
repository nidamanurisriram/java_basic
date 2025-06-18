// Passing data of a one collection object to another collection object

package dataStructures;

import java.util.ArrayList;
import java.util.List;

class Storage {
	
	int id;
	String name;
	int quantity;
	
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Storage() {
		// TODO Auto-generated constructor stub
	}

	public Storage(int id, String name, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + quantity;
	}
	
}

public class DataPassDemo {

	public static void main(String[] args) {	
		
	List<Storage> storageList = new ArrayList<Storage>();
	
	storageList.add(new Storage(1, "Garments", 100));
	storageList.add(null);
	storageList.add(null);
	storageList.add(new Storage(4, "Accessories", 100));
	
	System.out.println("Print storage list elements " + storageList);
	
	List<Storage> storageList1 =  new ArrayList<Storage>();
	
	for(int i = 0; i<storageList.size(); i++) {
		storageList1.add(storageList.get(i));
	}
	
	System.out.println("Print storage list1 elements " + storageList1);
		
	}
	
}
