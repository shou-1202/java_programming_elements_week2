import java.util.Scanner;
class distance{
public static void main(String[] args){
  int distance_in_feet;//declaring variable
  Scanner input = new Scanner(System.in);//opening scanner to take input fro the user
  System.out.println("Enter distance in feet: ");
  distance_in_feet = input.nextInt(); //taking value of distance in feet from the user
  double distance_in_yards = (double)distance_in_feet/3; //calculating distance in yards
  double distance_in_miles = distance_in_yards/1760; //calculating distance in miles
  System.out.println("Distance in feet is "+distance_in_feet+" and in yards is "+distance_in_yards+" and in miles is "+distance_in_miles);// The output is Distance in feet is 15 and in yards is 5.0 and in miles is 0.002840909090909091
  input.close(); //closing scanner object
}
}
  