import java.util.Scanner;
class sideofsquare{
public static void main(String[] args){
  int perimeter;//declaring variable
  Scanner input = new Scanner(System.in);//opening scanner to take input from the user
  System.out.println("Enter perimeter: ");
  perimeter = input.nextInt(); //taking value of perimeter from the user
  double side = perimeter/4; //calculating side of square
  System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter); //the output is The length of the side is 11.0 whose perimeter is 44
}
}