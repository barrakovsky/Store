/*Name:Bar Rakovsky
* Due Date: 07/28/18
* project 5: Store
* 
* In this project we were given basic instruction on how to create a store application. 
* In general i meant to implement a customer side and an administrator side- but all my administrator function needed a user input- so i listed them in my 
* switch command but didn't implemented them fully. 
* I implemented 8 classes- 
* Item - Movie, CD, Book. - hold the information about the different items in the store. 
* 	For this i also added the qty on hand that we have in the store since that if there is no inventory the customer cannot buy the product. 
* Store- 
* 	holds the information pertaining a certain store. - Holds all the items that  there are in the store. Can add items to the store etc'. 
* Customer- 
* 	holds the information regarding the customer and a "pointer" to a shopping cart. 
* 	The customer can add only what we have in store. 
* 	The customer can remove items from its cart -- still needs to implement the check from the customer how many items he would like to remove. 
* 	The customer can see his cart
* 	The customer can pay - after he pays the amount of inventory he both is being removed from the store. and also the amount of sale is being added into the tot sale of the store 
* 		which an admin can choose to see it. 
* 
* ---------Admin password- 6351------- you will need it to get into the admin m ode of the program. 
*
* 
*----I still need to work on the formating of the toString functions. 
* 	 
* 
* 
* 
*/

import java.util.ArrayList;
import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		
		boolean yes = true; 
		boolean yes1 = true; 
		String password; 
		int custID = 0; 
		
		
		Store store = new Store(1,addItemsToStore()); 
		Customer c1 = new Customer(++custID,"Bar", "Rakovsky" ); 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Welcome Back valuble customer");
		
		do{
			
			System.out.println("\nPlease enter the mode you would like to enter:\n" +
					"1-View store inventory\n" +
					"2-Add item into your cart\n" +
					"3-Remove item from your cart\n" +
					"4-View your cart\n" +
					"5-Pay\n" +
					"6-Admin mode\n" + 
					"7-exit");

			int case1 = sc.nextInt();
			switch (case1){
			case 1: 
				viewInventory(store); 
				break;
			case 2: 
				addItemIntoTheCart(store, c1);
				break;
			case 3: 
				removeItemFromCart(c1); 
				break;
			case 4: 
				viewYourCart(c1); 
				break;
			case 5: 
				if(c1.getSpc().getItemList().size() == 0){
					System.out.println("Your Cart is empty");
				}else{
					pay(store, c1);
					System.out.println("Good bye!");
					yes = false; 
				}
				break;
			case 6:
				
					System.out.println("Please enter the admin password: "); 
					password = sc.next(); 
					
					if(password.equals(store.getAdminPassword())){
						
						do{
							
							System.out.println("Please enter the operation you would like to do: \n" +
									"1-Add inventory to the store\n" +
									"2-Remove inventory from the store\n" + 
									"3-Get the total sales of the store\n" +
									"4-Set new admin password\n" +
									"5-Go back to the customer mode\n");
									
									int case2 = sc.nextInt(); 
									
									//this method will allow an employee of the store to add more inventory, remove inventory, get the total sales and set a new admin password.
									//I did not implemented these methods in my code. but it can be easily done. 
									switch (case2){
									case 1: 
										//addItems();
										break;
									case 2: 
										//removeItems(); 
										break;
									case 3:
										System.out.println("Total sale of the store stands on : " + store.getTotSale());
										break;
									case 4:
										//setNewAdminPassword(); 
									case 5: 
										yes1 = false; 
										
									}
							
						}while(yes1);
						
						
						
						
					}else{
						System.out.println("You didn't enter the correct password to enter an admin mode.");
					}
					
					break; 
					
			case 7:
				System.out.println("Good bye!");
					yes = false; 
					break; 
					
			}
		
			
				
		}while(yes); 

				
		
		

		sc.close();
		
	}
	
	

	//This method helps to initially add items to the store- adds initial stock into the store. 
	public static ArrayList<Item> addItemsToStore() {
		
		Item mv1 = new Movie("Mission: Impossible - Fallout MV1", "Mission: Impossible", 20.0, "842485036934" ,5 , 148, "Christopher McQuarrie","Action"); 
		Item mv2 = new Movie("MAMMA MIA!", "MAMMA MIA!", 20.0, "842485036935" ,6 , 114, "Ol Parker","Action"); 
		Item mv3 = new Movie("Incredibles 2", "Incredibles 2", 20.0, "842485036936" ,2 ,118, "Brad Bird","Action");
		
		Item bk1 = new Book("The Harry Potter and the sorcerers stone", "Harry Poter", 40.0, "842485036937" ,2 , 450, " J.K. Rowling"); 
		Item bk2 = new Book("The Harry Potter and the Chamber of Secrets", "Harry Poter", 35.0, "842485036938" ,2 , 300, " J.R.R. Tolkien"); 
		Item bk3 = new Book("The Lord of the Rings Trilogy", "Lord of the ring", 60.0, "842485036939" , 2 ,148, "insert director");
		
		Item cd1 = new CD("Music of the Sun", "Dance-pop", 20.0, "842485036931" ,3, 10);
		Item cd2 = new CD("Future Classics" , "Trance", 20.0, "842485036932" ,4, 10);
		Item cd3 = new CD("Baby, Baby", "Pop", 20.0, "842485036933" ,5, 10);
		
		Item[] itemsArray = {mv1, mv2, mv3, bk1, bk2,bk3,cd1, cd2,cd3};
		
		
		ArrayList<Item> items = new ArrayList<Item>(); 
		
		for (int i = 0 ; i < itemsArray.length; i++){
			items.add(itemsArray[i]);
		}
		
				
		return items; 
		
	}
	

	
	public static void viewInventory(Store store1){
		
		System.out.println(store1.toString()); 
	
	}
	
	public static void addItemIntoTheCart(Store store1, Customer c1){
		
		//i would ask here the customer to scan the upc of the item- like each cashier does in every store. 
		//and if it will be a valid scan then it will go to the shopping cart of the customer
		
		//lets say that the customer would like to purchase a movie - UPC- 842485036934 and 842485036937 and accidentally the user scanned an invalid upc. 
		//usually the program will wait for user input but i put everything in a string so you won't need a user input
		
		String[] upcCheck = {"842485036934","842485036937","123456"}; 
		
		//the user also need to input the qty that he would like to buy (needs to be minimum 1)- lets assume that it would be 1
		int qtyToBuy = 1;
		
		
		
			for( int j = 0; j < upcCheck.length; j++){


				for(int i = 0; i < store1.getItems().size(); i++){

					if(store1.getItems().get(i).getUpc().equals(upcCheck[j]) && store1.getItems().get(i).getQtyOnHand() != 0){

						
						Item i1 = (Item) store1.getItems().get(i).clone(); 
								//tore1.getItems().get(i).c;
						i1.setQtyOnHand(qtyToBuy);
						
						

						c1.getSpc().addItem(i1);

						//here the user will be asked if he would like to scan another item 
						i = store1.getItems().size(); 

					}
					
					if( i == store1.getItems().size()-1){
						System.out.println("You scanned an invalid upc");
					}

				}
				
				
				
			}

		
		
		
		
		
		
	}
	
	
	public static void removeItemFromCart(Customer c1){
		
		//need to check if the customer even has something in his cart before he can remove it. 
		boolean cont = true; 
		
		//in stores, you need to scan or select the item you want to be removed from your shopping cart. 
		//ask the user to scan or select from the list-
		
		//let say that the customer scanned the item 
		//lets say that the customer wants to remove from the cart the first item he entered, which has upc- 842485036934. 
		
		String upcCheck = "842485036934"; 
		
		do{
			
			if(c1.getSpc().getItemList().size() != 0){
				
				for ( int i = 0; i < c1.getSpc().getItemList().size(); i ++){
					
					if (c1.getSpc().getItemList().get(i).getUpc().equals(upcCheck)){
						
						c1.getSpc().getItemList().remove(c1.getSpc().getItemList().get(i)); 
						cont = false;
					}
					
				}
								
				
				
				
			}else{
				System.out.println("Your shopping cart is empty");
				cont = false; 
			}
			
			
			
		}while(cont); 
		
		
	}
	
	public static void viewYourCart(Customer c1){
		
		if(c1.getSpc().getItemList().size() != 0){
			
			for (int i = 0; i < c1.getSpc().getItemList().size(); i ++){
				System.out.println(c1.getSpc().getItemList().get(i).toString(0)); //maybe use here a different toString function
			}
		}else{
			System.out.println("Your cart is empty");
		}
	}
	
	public static void pay(Store store1, Customer c1){
		
		System.out.println("Summary:");
		viewYourCart(c1); 
		
		
		System.out.println("Total to pay: $" +c1.getSpc().totalPrice()); 
		
		//here is where the customer will give a certain payment method.. 
		System.out.println("Thanks for your payment, Hope to see you again"); 
		
		
		//also, we need to deduct inventory from the store and clear the customer item array list since he paid. 
		
		for (int i = 0; i < c1.getSpc().getItemList().size(); i++){
			
			for (int j = 0; j < store1.getItems().size(); j ++){
				
				if(c1.getSpc().getItemList().get(i).getUpc().equals(store1.getItems().get(j).getUpc())){
					store1.getItems().get(j).setQtyOnHand(store1.getItems().get(j).getQtyOnHand()-c1.getSpc().getItemList().get(i).getQtyOnHand());
					store1.setItemSoldCount(c1.getSpc().getItemList().get(i).getQtyOnHand());
				}
			}
		}
		
		store1.setTotalSale(c1.getSpc().totalPrice());
		c1.getSpc().clearItemsInCart();
		
		
		
		
		
	}

}
