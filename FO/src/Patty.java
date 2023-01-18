/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alabaso
 */
public class Patty {
     private String name = "Empty";
    private int qty = 0;
    private double price=0.00;
    private double totalPrice = 0.00;
    
    public void setBurgerInfo(String fName, int fQty, double fPrice){
        name = fName;
        price = fPrice;
        qty = fQty;
    }
  
   
   public String getBurgerName()
   {
       return this.name;
   
   }
   public double getBurgerPrice()
   {
       return this.totalPrice;
   
   }
   
   public int getBurgerQty()
   {
       return this.qty;
   }
   
   public double getBurgerTotalPrice()
   {
       totalPrice = price * qty;
       return this.totalPrice;
   }
}
