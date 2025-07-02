package July_1_2025.First;

class Customer{
	private long id;
	private String name;
	private int age;
	private String city;
	
	public Customer(long id, String name, int age, String city) {
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
		Customer customer = new Customer(1, "Divyum", 20, "Mohali");
		customer.display();
		System.out.println(customer.getAge());
	}
}
