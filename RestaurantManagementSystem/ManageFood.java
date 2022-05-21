package RestaurantManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageFood {
	ArrayList<Food> foodlist = new ArrayList<>();
	ArrayList<GuestOrder> guestorder = new ArrayList<>();
	Food Food;
	public GuestOrder GuestOrder;
	public int SelectFood;
	
	public ManageFood() {
		
	}
	Scanner bp=new Scanner(System.in);
	
	public void bp() {
		System.out.println("Enter number food add in menu");
		int n=Integer.parseInt(bp.nextLine());
		for (int i = 0; i < n; i++) {
			Food food= new Food();
			food.input();
			foodlist.add(food);
			
		}
	}
	public void print() {
		for (int i = 0; i < foodlist.size(); i++) {
			System.out.println((i+1)+"."+foodlist.get(i).detail());
		
		}
	}


		
	public void Price() {
		float PriceFood=0;
		float TotalPayment=0;
		int number;
		GuestOrder guest = new GuestOrder();
		guest.Input();
		guestorder.add(guest);
		for (int i = 0; i < 10; i++) {
			System.out.println("Select Food"+(i+1));
			SelectFood = bp.nextInt();
			if(SelectFood==0) {
				guest.setTotalPayment(TotalPayment);
				System.out.println("Total Payment");
				System.out.println(TotalPayment);
				System.out.println("Thank You, See you again!");
				break;
			} else {
				System.out.println("Enter Numbert");
				number = bp.nextInt();
				Food food = foodlist.get(SelectFood-1);
				guest.setEatList(food);
				PriceFood = food.Price*number;
				
				}
			TotalPayment+=PriceFood;
			System.out.println("Order Finish");
			System.out.println("Payment"+(i+1)+"is:");
			System.out.println(" "+PriceFood);
			System.out.println("Finish Order enter 0");
			}
		}
	public void Printorder() {
		for (int i = 0; i < guestorder.size(); i++) {
			guestorder.get(i).print(); 
		}
	}
		public String search() {
			Scanner bp=new Scanner(System.in);
			String idtable;
			int up=0;
			System.out.println("Enter table number payment:");
			idtable= bp.nextLine();
			for (int i = 0; i < guestorder.size(); i++);
				if (guestorder.get(1).getIdTable().equalsIgnoreCase(idtable)) {
					guestorder.get(1).print();
					up++;
				}
			if (up==0) {
				System.out.println("No Table Number"+idtable);
			}
			return idtable;
	}
		public String EditName() {
			System.out.println("Enter name to edit:");
			return bp.nextLine();
			
		}
		public float EditPrice() {
			System.out.println("Enter price to edit:");
			return bp.nextFloat();
			
		}
		public void EditFood() {
			String namefood;
			int up=0;
			System.out.println("Enter name of food to fix:");
			namefood= bp.nextLine();
			for (int i = 0; i < foodlist.size(); i++) {
				if (foodlist.get(i).getName().equals(namefood)) {
					up++;
					foodlist.get(i).setName(EditName());
					foodlist.get(i).setPrice(EditPrice());
					break;
				
				}
			}if (up==0) {
				System.out.println("No food name is"+namefood);
			}
			
		}
			
		public void DeleteFood() {
			String deletefood;
			int up=0;
			System.out.println("Enter name of food to delete");
			deletefood = bp.nextLine();
			for (int i = 0; i < foodlist.size(); i++) {
				if (foodlist.get(i).getName().equals(deletefood)) {
					up++;
					foodlist.remove(i);
					System.out.println("delete finish");
					break;
				
				}
			}if (up==0) {
				System.out.println("No food name is"+deletefood);
			}
				
			
			
		}
	}

		
		