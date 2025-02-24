import java.util.Scanner;
class Areaoftriangle{
public static void main(String[] args){
  int base, height; //declaring variables to store the value of base and height
  Scanner input = new Scanner(System.in); // opening scanner object to take user input
  System.out.println("Enter Base and height: "); 
  base = input.nextInt();//taking input for base
  height = input.nextInt(); // taking input for height
  double area = 0.5*(double)base*(double)height;// calculating area in cm
  double area_in_inches = area/2.54; //calculating area in inches
  System.out.println("The area of triangle in cm is "+area+" and inches is "+area_in_inches);// The output is The area of triangle in cm is 18.0 and inches is 7.086614173228346
  input.close();//closing scanner object
}
}