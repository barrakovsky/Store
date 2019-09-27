
public abstract class Item {
	
	String title; 
	private String desc; //description
	private double price;
	private String upc;//item number code that identifies the item
	private int qtyOnHand = 0; 
	
	public Item(String title, String desc, double price, String upc, int qtyOnHand){
		
		this.setTitle(title);
		this.setDesc(desc);
		this.setPrice(price);
		this.setUpc(upc);
		this.setQtyOnHand(qtyOnHand);
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}


	public int getQtyOnHand() {
		return qtyOnHand;
	}


	public void setQtyOnHand(int qtyOnHand) {
		this.qtyOnHand = qtyOnHand;
	}
	
	public Object clone() {
        Item i = null;
        try {
        	i = (Item)super.clone();
        }
        catch (CloneNotSupportedException e) {
            // This should never happen
        }
        
        return i;
    }
	
	public String toString(int qtyTobuy){
		return null; 
	}
	
	

}
