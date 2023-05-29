/** 
   A program to convert a phone number.
*/

import java.util.Scanner; 

class Lab4 {
  public static void main(String[] args) {
    System.out.println("Please Enter your phone number:"); 

    Scanner in = new Scanner(System.in);
    String phone = in.nextLine(); 

    String firstThree =phone.substring(0,3);

    String secondThree =phone.substring(3,6);

    String lastFour=phone.substring(6,10);

    System.out.printf("(%s) %s-%s.", firstThree, secondThree, lastFour); 

  }
}
