import java.util.Scanner;
class totalpurchaseprice{
public static void main(String[] args){
  double unit_price;
  int quantity;// declaring variables
  Scanner input = new Scanner(System.in); // opening scanner to take input from the user
  System.out.println("Enter unit price: ");
  unit_price = input.nextDouble(); // taking value of unit price 
  System.out.println("Enter quantity: ");
  quantity = input.nextInt(); //taking value of quantity
  double total_purchase_price = quantity*unit_price;// calculating total purchase price 
  System.out.println("The total purchase price is INR "+total_purchase_price+" if the quantity "+quantity+" and unit price is INR  "+unit_price); //the output is The total purchase price is INR 1350.0 if the quantity 3 and unit price is INR  450.0
  input.close(); // closing scanner object
}
}