package Model;
import java.io.Serializable;
import java.sql.*;
import java.util.*;

public class CartBean implements Serializable {
    
    private int cart_id;
    private int book_id;
    private int user_id;
    private int quantity;
    
    public CartBean(){
        this.book_id = -1;
        this.user_id = -1;
        this.quantity = -1;
    }

    public CartBean(int quantity, int book_id, int user_id) {
        this();
        this.cart_id = cart_id;
        this.user_id = user_id;
        this.quantity = quantity;
    }

    //getters
    public int getCart_id() { return cart_id; }
    public int getBook_id() { return book_id; }
    public int getUser_id() { return user_id; }

    //setters
    public void setCart_id(int cart_id) { this.cart_id = cart_id; }
    public void setBook_id(int book_id) { this.book_id = book_id; }
    public void setUser_id(int user_id) { this.user_id = user_id; }
    
    public boolean addCartToDb() {
        // Call the db to register this item
        return true;
    }
    
    
    //other
    
   public void clearCartForUserId( String user_id){
       
   }
    
    
    public double returnTotal(){
        try {
            // 1. Get a connection to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project2", "root", "root");
            
            // 2. Create a statement
            Statement stmt = conn.createStatement();
            
            // 3. Execute the SQL query
            ResultSet res = stmt.executeQuery("SELECT book.book_id, book.price, book.quantity, cart.book_id"
                    + "                       FROM book, cart"
                    + "                       WHERE book.book_id=cart.book_id" );
            
            // 4. Process the result set
            return res.getDouble("book.price") *res.getInt("book.quantity");

        }
        catch (Exception e){ System.err.println(e); }
        return 0;
    }

    public ArrayList<BookCartBean> fetchAllCartBooksByUserId(String user_id) {
        ArrayList<BookCartBean> cartsBooked = new ArrayList<BookCartBean>();
        return cartsBooked;
    }

    public void update_quantity_by(String user_id, int book_id, int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete_cart(String user_id, int book_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}