import java.util.Scanner;
class calculator{
public static void main(String[] args){
  int number1, number2; //declaring two variable to store input value 
  Scanner input = new Scanner(System.in); //open scanner to take input
  System.out.println("Enter 2 numbers: ");
  number1 = input.nextInt();// storing 1st variable value
  number2 = input.nextInt();// storing 2nd variable value
  int sum = number1+number2, subtract = number1-number2, multiplication = number1*number2;
  double division = (double)number1/(double)number2;
  System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+sum+", "+subtract+", "+multiplication+" and "+division);// the output is The addition, subtraction, multiplication and division value of 2 numbers 6 and 5 is 11, 1, 30 and 1.2
  input.close(); //closing scanner object
}
}
  