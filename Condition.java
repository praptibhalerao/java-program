import java.util.Scanner;

public class Condition {
    public static void main (String args[]) {
     Scanner Sc = new Scanner(System.in);
   
   
   
     /*  int age = Sc.nextInt();

    if (age > 18){
        System.out.println("Adult");
    }else {
        System.out.println("Not adult");
    }
    }
    
} */

    /*int a = Sc.nextInt();
    int b = Sc.nextInt();
    if(a == b ){
            System.out.println("equal");

    } else {
          if(a > b){
            System.out.println("a is greater");
          } else {
            System.out.println("a is lesser");
        }
   }
}} */

   int button = Sc.nextInt();
   switch(button) {
    case 1 : System.out.println("hii");
        break;
    case 2 :  System.out.println("hello"); 
        break;
    case 3:
        System.out.println("Namaste");       
    break;
    default:
        System.out.println("Invaild id Button");
        break;
    }
 }
}