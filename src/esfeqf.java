import java.util.Scanner;

public class esfeqf {
public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    // we initalize the data type
    int m;
    System.out.println("Enter a number: ");
    m = input.nextInt();

    boolean k = true;
   // int x = 1;


    if (m > 0)
    System.out.println("It is positive");

    else if(m < 0){
       System.out.println("It is negative");
    }
  // it doesn't print the negative number
   else {
       System.out.println("It is zero");
    }

  //System.out.println(-----------------------);
 //  System.out.println(x);
}





}
