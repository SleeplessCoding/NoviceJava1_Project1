/**
 * Introduction to Java Programming I(IT151)
 * Professor Dr. Mazen Alkhatib
 * Individual Project 1
 */

/**
 * @author Nicholas Weinold
 * 4/09/2016
 */

import javax.swing.JOptionPane; // Decided to go with JOption because I like the boxes a lot more than Scanner


public class IndividualProject1 
{

    public static void main(String[] args) 
    {
      int productID; //Declaring productID variable as an Integer data type
      String productName; //Declaring productName variable as a String data type
      double productCost; //Declaring productCost variable as a double data type
      
      int dialogButton = JOptionPane.YES_NO_OPTION; //Wanted to practice with sone of the great JOptionPane methods so I added the yes/no button at the end
      int dialogConfirmation; //Declaring dialogConfirmation as an int to create a showConfirmDialog message using the dialogButton variable
      
      
      productID = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter product ID","Product ID",JOptionPane.QUESTION_MESSAGE)); //Product ID request
      productName = JOptionPane.showInputDialog(null,"Please enter product name","Product Name",JOptionPane.QUESTION_MESSAGE); //Product name request
      productCost = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter product price","Product Price",JOptionPane.QUESTION_MESSAGE)); //Product cost request
      
      /*
      * I just wanted to make the small program feel a little more complete so I added a showDialogConfirm with a Yes/No
      * button option. I did this to also practice with the JOptionPane methods.
      */
      
      dialogConfirmation = JOptionPane.showConfirmDialog(null,"You have selected \n\nProduct ID: " + productID + "\nProduct name: " + productName + 
                           "\n\nYour Total = $" + productCost,"Order Cofirmation",dialogButton);  // Product Order Confirmation message
     
      if(dialogConfirmation == JOptionPane.YES_OPTION) //If user selects Yes they get order confirmation message
      {
          JOptionPane.showMessageDialog(null,"Your order has been placed!","Thank You",JOptionPane.INFORMATION_MESSAGE); //Thank You for the order message  
      }
      else if(dialogConfirmation == JOptionPane.NO_OPTION) //If user selects No they get an apology message
            {
              JOptionPane.showMessageDialog(null,"Sorry we got that order wrong! Please try again.","OOPS",JOptionPane.WARNING_MESSAGE); //Order not right message
            } 
       //I wanted to while loop the program so NO_OPTION would restart the order process but I am not as comfortable with loops as I would like.
            
    }
    
}
