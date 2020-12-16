package WebDesignAssignment;

import javax.swing.*;

public class Product {
	private String name;
	private int id;
	private float price;
	private int quantity;

	//inCart is used to determine how much products are in the cart...
	private int inCart;

	//Default constructor
	Product(){
		id = 0;
		name = "null";
		price = 0;
		quantity = 0;
		inCart = 0;
	}

	//Parametrized constructor
	Product(int ID, String NAME, float PRICE, int QUANTITY,int InCart){
		id = ID;
		name = NAME;
		price = PRICE;
		quantity = QUANTITY;
		inCart = InCart;
	}

	Product(Product product){
		//Verifying that product is not null
		try {
			id = product.id;
			name = product.name;
			price = product.price;
			quantity = product.quantity;
			inCart = product.inCart;
		}
		catch (NullPointerException npe){
			JOptionPane.showMessageDialog(null,
					"Copying product failed.\n" +
							"Initializing with default values.",
					"Copy Constructor Exception", JOptionPane.WARNING_MESSAGE);
			id = 0;
			name = "null";
			price = 0;
			quantity = 0;
		}
	}

	public void setInCart(int INCART){
		inCart = INCART;
	}

	public void setId(int ID){
		id = ID;
	}

	public void setName(String NAME){
		name = NAME;
	}

	public void setPrice(float PRICE){
		price = PRICE;
	}

	public void setQuantity(int QUANTITY){
		quantity = QUANTITY;
	}

	public int getInCart(){
		return inCart;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public float getPrice(){
		return price;
	}

	public int getQuantity(){
		return quantity;
	}

}
