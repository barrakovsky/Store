import java.util.ArrayList;

public class Store {

	private ArrayList<Item> items;
	private int storeID; 
	private int itemSoldCount = 0;
	private String adminPassword = "6351";//might need to consider changing it into a constant.
	double totSold = 0.0;
	
	public Store(int storeID, ArrayList<Item> itemsTemp){
		
		this.setStoreID(storeID);
		this.setItems(itemsTemp);
		
	}

	public int getStoreID() {
		return storeID;
	}

	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> itemsTemp) {
		
		this.items = new ArrayList<Item>(itemsTemp);
	
	}
	
	public void addItems(Item item){
		
		boolean exist = false; 
		
		for(int i = 0; i < items.size(); i++){
			if(items.get(i).getUpc().equals(item.getUpc()) ){
				items.get(i).setQtyOnHand(item.getQtyOnHand());
				
				exist = true;
				
				
			}
		}
		
		if(!exist){
			items.add(item); 
			
		}
		
		
		
		
	}
	
	
	public void removeItem(Item item){
		
		for(int i = 0; i < items.size(); i++){
			if(items.get(i).equals(item.getUpc())){
				items.get(i).setQtyOnHand(item.getQtyOnHand());
			}
		}
		
		
	}

	public int getItemSoldCount() {
		return itemSoldCount;
	}

	public void setItemSoldCount(int itemSoldCount) {
		this.itemSoldCount += itemSoldCount;
	}
	
	public void setTotalSale(double totSold){
		
		this.totSold += totSold; 
		
	}
	
	public double getTotSale(){
		return this.totSold;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	public String toString(){
		
		String str = ""; 
		for(int i=0; i < items.size(); i++){
			
			str += items.get(i).getClass().getName() + " " + items.get(i).toString() + "\n"; 
		}
		
		return str; 
		
	}
	
	
}
