import java.util.Scanner;
class quotientandremainder{
public static void main(String[] args){
  int number1, number2;// declaring variables
  Scanner input = new Scanner(System.in); //opening scanner to take input from the user
  System.out.println("Enter 2 numbers:");
  number1 = input.nextInt();// taking value of 1st number
  number2 = input.nextInt();// taking value of 2nd number
  double quotient = (double)number1/(double)number2; // calculating quotient
  double remainder = number1%number2;//calculating remainder
  System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+number1+" and "+number2);// the output is The Quotient is 1.0 and Reminder is 0.0 of two number 6 and 6
  input.close();//closing scanner object
}
}