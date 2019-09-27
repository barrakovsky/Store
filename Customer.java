
public class Customer {
	
	private int id;
	private String first; 
	private String last; 
	private ShoppingCart spc = new ShoppingCart();
	

	public Customer(int custID, String first, String last){
		
		this.setFirst(first);
		this.setLast(last);
		this.setId(custID);
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst() {
		return first;
	}


	public void setFirst(String first) {
		this.first = first;
	}


	public String getLast() {
		return last;
	}


	public void setLast(String last) {
		this.last = last;
	}


	public ShoppingCart getSpc() {
		return spc;
	}


	public void setSpc(ShoppingCart spc) {
		this.spc = spc;
	}
	
	public String toString(){
		
		return this.getId() + " " + this.getFirst() + " " + this.getLast() ;
	}
}
