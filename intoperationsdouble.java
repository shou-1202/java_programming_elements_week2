import java.util.Scanner;
class intoperationsdouble{
public static void main(String[] args){
  double a,b,c, oper_1, oper_2, oper_3, oper_4; //declaring variables
  Scanner input = new Scanner(System.in);// opening scanner to take input from the user
  System.out.println("Enter 3 numbers: ");
  a = input.nextInt(); // taking value of 1st number
  b = input.nextInt(); // taking value of 2nd number
  c = input.nextInt(); // taking value of 3rd number
  operation1 = a + b *c; //operation 1
  operation2 = a * b + c; //operation 2
  operation3 = c + a / b; //operation 3
  operation4 = a % b + c; //operation 4
  System.out.println("The results of Int Operations are "+oper_1+", "+oper_2+", "+oper_3+" and "+oper_4);// the output is The results of Int Operations are 47.0, 37.0, 7.833333333333333 and 12.0
}
}