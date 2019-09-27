

public class Movie extends Item implements Cloneable{
	
	private int length; 
	private String director; 
	private String category; 

	public Movie(String title, String desc, double price, String upc, int qtyOnHand,int length , String director, String category) {
		
		super(title, desc, price, upc, qtyOnHand);
		this.setLength(length);
		this.setDirector(director);
		this.setCategory(category);
			
	}

	public int getLength() {
		return length; 
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	public Object clone() {
        Movie mv = null;
        mv = (Movie)super.clone();
        
        return mv;
    }
	

	public String toString(){
			
			 
			
			String str = this.getTitle() + " " + this.getDesc() + " " +  this.getPrice() + " " +  this.getUpc() + " " +  this.getDirector() + " " +  this.getLength() + " " +  this.getCategory() ;  
			
			return str;
		}
	
	public String toString(int qtyTobuy){
		
		String str = this.getTitle() + " " + this.getDesc() + " " +  this.getPrice() + " " +  this.getUpc() + " " +  this.getDirector() + " " +  this.getLength() + " " +  this.getCategory() 
		+ " " + this.getQtyOnHand();
		
		return str; 
	}

}
