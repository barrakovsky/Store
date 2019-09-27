
public class Book extends Item implements Cloneable{
	
	private int pageC;//page count
	private String author; 

	public Book(String title, String desc, double price, String upc, int qtyOnHand, int pageC, String author) {
		super(title, desc, price, upc, qtyOnHand);
		
		this.title = title;
		this.setPageC(pageC);
		this.setAuthor(author);
		
	}

	public int getPageC() {
		return pageC;
	}

	public void setPageC(int pageC) {
		this.pageC = pageC;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Object clone() {
        Book bk = null;
        bk = (Book)super.clone();
        
        return bk;
    }
	
	public String toString(){
			
			String str = ""; 
			
			str = this.getTitle() + " " +  this.getDesc() + " " +  this.getAuthor() + " " + this.getPrice() + " " +  this.getUpc() + " " +  this.getPageC() ;  
			
			return str;
		}
	
	public String toString(int qtyTobuy){
		
		String str = ""; 
		
		str = this.getTitle() + " " +  this.getDesc() + " " +  this.getAuthor() + " " + this.getPrice() + " " +  this.getUpc() + " " +  this.getPageC() + " " + this.getQtyOnHand();  
		
		return str;
	}


}
