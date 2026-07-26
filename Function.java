import java.util.Scanner;

public class Function{
   /*  public static void printMyName (String name){
        System.out.println(name);
        return;
    } 
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        String name = Sc.next();

        printMyName(name);
   }
}
//2
public static int CalculateSum (int a, int b){
        int sum = a+b;
        return sum;
    } 
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
    
        int sum = CalculateSum(a, b);
        System.out.println("sum of 2 no."+sum);
   }
}



//3) make a function to multiply 2 no. and return the product

public static int CalculateProduct (int a, int b){
        
        return a * b;
    } 
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
       System.out.println("Product of 2 no."+ CalculateProduct(a,b));
   }
}*/


//4) find the factorial of a number

public static void printFactorial(int n){
    //loop    
    if(n < 0){
        System.out.println("Invaild Number");
        return;
    }
    int Factorial = 1;
    for(int i=n;i>=1; i--){
            Factorial = Factorial *i;
    }
    System.out.println(Factorial);
    return;
} 
 public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        printFactorial(n);
       
    }
}