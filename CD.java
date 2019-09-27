
public class CD extends Item implements Cloneable{
	
	private int trackC;//track count
	//can also have an artist field
	

	public CD(String title, String desc, double price,  String upc, int qtyOnHand,int trackC) {
		super(title, desc, price, upc, qtyOnHand);
		this.setTrackC(trackC);
		
	}

	public int getTrackC() {
		return trackC;
	}

	public void setTrackC(int trackC) {
		this.trackC = trackC;
	
	}
	
	public Object clone() {
        CD cd = null;
        cd = (CD)super.clone();
        
        return cd;
    }
	
	public String toString(){
		
		String str = ""; 
		
		str = this.getTitle() + " " +  this.getDesc() + " " +  this.getPrice() + " " +  this.getUpc() + " " +  this.getTrackC();  
		
		return str;
	}
	
	
	public String toString(int qtyTobuy){
			
			String str = ""; 
			
			str = this.getTitle() + " " +  this.getDesc() + " " +  this.getPrice() + " " +  this.getUpc() + " " +  this.getTrackC() + " " + this.getQtyOnHand();  
			
			return str;
		}
	
	
}

