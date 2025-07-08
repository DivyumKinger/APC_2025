package July_8_2025.First;


import java.util.LinkedList;

class Customer_AGAIN {
	private long id;
	private String name;
	private int age;
	private String city;
	
	public Customer_AGAIN(long id, String name, int age, String city) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void display(){
		System.out.println("Name: " + name);
		System.out.println("City: " + city);
		System.out.println("id: " + id);
		System.out.println("age: " + age);
	}
}

public class Main {
	public static void main(String[] args) {
		Customer_AGAIN A = new Customer_AGAIN(1, "Divyum", 20, "Mohali");
		Customer_AGAIN B = new Customer_AGAIN(2, "HEEHH", 20, "Mohali");
		Customer_AGAIN C = new Customer_AGAIN(3, "Divyum", 20, "Mohali");
		
		LinkedList <Customer_AGAIN> list;
		list = new LinkedList<Customer_AGAIN>();
		list.add(A);
		list.add(B);
		list.add(C);
		
		for(Customer_AGAIN customer: list){
			customer.display();
		}
		
	}
}
