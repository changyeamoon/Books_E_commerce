<%@page import="java.util.ArrayList"%>
<%@page import="Model.BookBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bookstore.css">
        <title>The Bookstore</title>
    </head>
    <body>
        <div id="main">
            <div id="header">
                <div id="widgetBar">

                    <div class="headerWidget">
               
                    <a href="CartController">Cart</a>
                    </div>

                    <div class="headerWidget">
                       <a href="./LogoutController">LogOut</a>
                    </div>

                    <div class="headerWidget">
                         <a href="./CheckoutController">Checkout</a>
                    </div>
  <div class="headerWidget">
                         <a href="./InventoryController">Inventory</a>
                    </div>
                </div>

                <a href="./InventoryController">
                    <img src="#" id="logo" alt="Bookstore">
                </a>

                <img src="#" id="logoText" alt="The Bookstore">
            </div>

                <%
                    ArrayList<BookBean> books = (ArrayList)session.getAttribute("cart_info");
                   
                    out.println("<table border='1'>");
                          out.print("<th> Title </th>");
                                                out.print("<th> Author </th>");
                                                                        out.print("<th> Price </th>");
         out.print("<th> Quantity </th>");
                    for (int i = 0 ; i < books.size() ; ++i){
                        out.println("<tr>");
                      

                        out.println("</tr>");
                        
                        out.println("<tr>");
                        out.print("<td> " + books.get(i).getTitle() + "</td>");
                        
                        out.print("<td> " + books.get(i).getAuthor() + "</td>");
                        out.print("<td> " + books.get(i).getPrice()+ "</td>");
                        out.print("<td> " + books.get(i).getQuantity()+ "</td>");

                        out.print("<td>  <form action='CartController' method='post'> <input type='hidden' value='" +books.get(i).getBook_id() + "' name='book_id' ><input type='submit' name= 'Modify_Items' value='delete'> <input type='text' name='quantity' > <input type='submit' name='Modify_Items' value='edit'> </form>  </td>");
                        
                        out.println("</tr>");
                    }

                    out.println("</table>");
                    %>
                
       
            
            
            


            <div id="footer">
                <hr>
                <p id="footerText">[ footer text ]</p>
            </div>
        </div>
    </body>
</html>
