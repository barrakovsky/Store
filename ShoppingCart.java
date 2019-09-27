import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<Item> itemList = new ArrayList<Item>();
	
	
	public ShoppingCart(){
		
	}
	
	public ArrayList<Item> getItemList(){
		
		return this.itemList;
	}
	
	public void addItem(Item item){
		
		
		
		boolean exist = false; 

		for(int i = 0; i < itemList.size(); i++){
			if(itemList.get(i).getUpc().equals(item.getUpc()) ){
				itemList.get(i).setQtyOnHand(itemList.get(i).getQtyOnHand() + item.getQtyOnHand());

				exist = true;
				

			}
		}

		if(!exist){
			itemList.add(item); 
			
		}
		
	}
	
	public void removeItem(Item item){
		
		if(itemList.contains(item)){
			itemList.remove(item);
		}
	}
	
	public void clearItemsInCart(){
		itemList.clear();
	}
	
	public double totalPrice(){
		
		int totPrice = 0; 
		
		for (int i = 0; i < itemList.size(); i++){
			totPrice += (itemList.get(i).getPrice() * itemList.get(i).getQtyOnHand());
		}
		
		return totPrice;
	}
	
	public int totItems(){
		
		return itemList.size();
		
	}
	
	public String toString(){
		
		String str = "";
		
		for (int i = 0 ; i < itemList.size(); i++){
			
			str += itemList.toString(); 
		}
		
		return str;
		
	}
	

}
