package RestaurantManagementSystem;

import java.util.Scanner;

public class Food {
	public String Name;
	public float Price;
	
	public Food() {
		this.Name=Name;
		this.Price=Price;
	}
	
	public void input() {
		Scanner bp=new Scanner(System.in);
		System.out.println("Enter Name Food");
		Name=bp.nextLine();
		System.out.println("Enter Price Food");
		Price=bp.nextFloat();
	}
	public void Payment() {
		System.out.println("Price:"+Price);
	}
	public String detail() {
		return Name+" "+Price;
	}
	public float setPrice() {
		return Price;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setPrice(float Price) {
		this.Price=Price;
	}
}
