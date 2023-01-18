package receipt;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Receipt {
    static Random rand = new Random();
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        OrderPrice order= new OrderPrice();
         double burgerPrice = order.burgerPrice(2.99);
         double comboMealPrice = order.comboMealPrice(5.99);
         double snackPrice = order.snackPrice(1.99);
         double drinkPrice = order.drinkPrice(0.99);
         int quantity=0;
         int totalquantity;
         double total=0;
         int input;
         String input1=null;
      

        System.out.println("Cashier #1");
        System.out.println("What is the customer's order?");
        System.out.println(" ");
        Order();

        System.out.println("\n**************ORDER HERE!************* ");
        
         
 
        do{
            System.out.print("INSERT YOUR ORDER: ");
            input = scan.nextInt();
            switch (input){
                case 1:
                    System.out.print("Quantity: ");
                    quantity = scan.nextInt();
                    System.out.println(quantity+ "x Burger");
                    burgerPrice *= quantity;
                    total += burgerPrice;
                    break;
                case 2: 
                    System.out.print("Quantity: ");
                    quantity = scan.nextInt();
                    System.out.println(quantity + "x Combo Meal");
                    comboMealPrice *= quantity;
                    total += comboMealPrice;
                    break;
                 
                case 3: 
                    System.out.print("Quantity: ");
                    quantity = scan.nextInt();
                    System.out.println(quantity + "x Snack");
                    snackPrice *= quantity;
                    total += snackPrice;
                     break;
          
                case 4:
                    System.out.println("Quantity: ");
                    quantity = scan.nextInt();
                    System.out.println(quantity + "x Drink");
                    drinkPrice *= quantity;
                    total += drinkPrice;
                    break;
                default: 
                    System.out.print("Are you done? [1]=\"Yes\" and [2]=\"NO\": ");
                    input =scan.nextInt();
                    if (input==1){
                        input = 5;
                        break;
                    }
                    else{
                        continue;
                    }
            } 
            System.out.println(" ");
            
        }while(input < 5);
         
        System.out.println("");

        System.out.println("Total: "+(double)Math.round(total*100)/100);
      
    }
    
    public static void receipt(){
        System.out.println(" ");
        System.out.println("\t\t"+(100+rand.nextInt(50))+ "   "); //Order Number
        System.out.println("    Rate us HIGHLY SATISFIED and      ");
        System.out.println("       Receive ONE FREE ITEM          ");
        System.out.println("    Rate us HIGHLY SATISFIED and      ");
        System.out.println(" Purchase any sandwich and receive an ");
        System.out.println("    item of equal or lesser value     ");
        System.out.println("Go to www.krustykrab.com within 7 days");
        System.out.println("    and tell us about your visit.     ");
        System.out.println("      Validation Code:____________    ");
        System.out.println("  Expires 30 days after receipt date. ");
        System.out.println("Valid at participating US Krusty Krab.");
        System.out.println("            Survey Code:              ");
        System.out.print("      ");
        for (int i=1; i<=5;i++){
            int random = 1000 + rand.nextInt(9000);
            System.out.print(random);
            System.out.print("-");
        }
            int num = 0 + rand.nextInt(9);
            System.out.println(num);
        System.out.println("============================================");
        System.out.println("============================================");
        System.out.println("    ");
        System.out.println("     Krusty Krab Restaurant #1234    ");
        System.out.println("           2378 PINE RD NW           ");
        System.out.println("         RICE, MN "+(10000+rand.nextInt(90000))+"-"+(1000+rand.nextInt(+9000)));
        System.out.println("          TEL# 123 456 789        ");
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
          LocalTime localTime = LocalTime.now();  
        System.out.println(" \t\t\t"+(java.time.LocalDate.now())+" "+(dtf.format(localTime)));
        }
    
    public static void Order(){
        OrderPrice order = new OrderPrice();
        System.out.println("[1] Buger \t\t - \t\t"+order.burgerPrice(2.99));
        System.out.println("[2] Combo Meal \t\t - \t\t"+order.comboMealPrice(5.99));
        System.out.println("[3] Snack \t\t - \t\t"+order.snackPrice(1.99));
        System.out.println("[4] Drink \t\t - \t\t"+order.drinkPrice(0.99));
        System.out.println("[5] Cancel");
    }
}



class OrderPrice{
    public double burgerPrice(double burgerPrice){
        return burgerPrice;
    }
    
    public double comboMealPrice(double comboMealPrice){
        return comboMealPrice;
    }
    
    public double snackPrice(double snackPrice){
        return snackPrice;
    }
    
    public double drinkPrice(double drinkPrice){
        return drinkPrice;
    }
    

}
