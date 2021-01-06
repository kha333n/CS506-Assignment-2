package WebDesignAssignment;

import java.sql.*;
import java.util.ArrayList;

public class DBHelper {
	private final String filename = ".\\assets\\MC190205061.accdb";
	private Connection conn;

	DBHelper(){
	}

	//return connection statement to the database
	public Statement getConnectionStatement() {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

			String url = "jdbc:ucanaccess://" + filename;

			conn = DriverManager.getConnection(url);

			return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	//Loads Products data into the program from DB
	public boolean loadProducts(ArrayList products){
		try{
			Statement stmt = getConnectionStatement();
			String sql = "SELECT * FROM Products";

			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()){

				products.add(
						new Product(
								rs.getInt(1),
								rs.getString(2),
								rs.getFloat(3),
								rs.getInt(4),
								rs.getInt(5)
						)
				);

			}
			conn.close();
			return true;
		} catch (SQLException throwables) {
			throwables.printStackTrace();
			return false;
		}
	}

	//Add new order in the database
	public boolean addOrder(int handouts,int referenceBook, int DVD,int USB,int totalItems,
	                               float SubTotal, float shipping, float grandTotal){
		try{
			Statement stmt = getConnectionStatement();
			String sql = new StringBuilder().append("INSERT INTO Orders(Handouts,ReferenceBook,DVD,USB,SubTotal,NoOfItems,")
					.append("Shipping,GrandTotal) VALUES (").append(handouts).append(",")
					.append(referenceBook).append(",").append(DVD).append(",").append(USB)
					.append(",").append(SubTotal).append(",").append(totalItems)
					.append(",").append(shipping).append(",").append(grandTotal).append(");")
					.toString();

			stmt.executeUpdate(sql);
			conn.close();
			return true;

		} catch (SQLException throwables) {
			throwables.printStackTrace();
			return false;
		}
	}

	//Save the state of products while exiting program.
	public boolean saveProducts(ArrayList products){
		try{
			Statement stmt = getConnectionStatement();
			for (int i = 0; i < 4; i++)
			{
				Product p = (Product) products.get(i);
				String sql = "UPDATE Products SET Quantity = '" + p.getQuantity() +
						"' , inCart = '" + p.getInCart() + "' WHERE ID = " + p.getId() + ";";
				stmt.executeUpdate(sql);
			}
			conn.close();
			return true;
		} catch (SQLException throwables) {
			throwables.printStackTrace();
			return false;
		}
	}
}
