package PojoLibrarySonuul;

public class Q1_Product {
	
	private Q1_Details[] product;

	public Q1_Product(Q1_Details [] product) {
		
		this.product = product;
	}

	

	public Q1_Details[] getDetails() {
		return product;
	}

	public void setDetails(Q1_Details[] product) {
		this.product = product;
	}
	
	

}
