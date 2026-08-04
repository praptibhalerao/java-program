import java.util.Scanner;

public class BitManu{
    public static void main(String[] args) {
 /*      // get bit
        int n = 5;//0101
        int pos = 2;
        int bitMask = 1<<pos;
        int notbitMask = ~(bitMask); //clear bit
     //set bit
        int newNumber = bitMask | n;
        System.out.println(newNumber);   

//clear bit
        int newNumber = notbitMask & n;
        System.out.println(newNumber);
        
         if ((bitMask & n) == 0){
            System.out.println("bit was zeros");

        }else{
            System.out.println("bit was one");
        } */
    //get bit the 3rd bit (position =2) of a number n. (n= 0101)
    //bit mask :1<<i And (1000 & 0101= 0000)
    

    //update bit(update the 2nd bit (position =1) of a number n to 1(n=0101))
    

    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
   
    //oper =1 : set oper=0 :clear
    int n = 5;//0101 -> 0111
    int pos = 1;

    int bitMask = 1<<pos;
    if(oper == 1){
        //set
        int newNumber = bitMask | n;
        System.out.println(newNumber);

    }else{
        //clear
        int newbitMask = ~(bitMask);
        
        int newNumber = newbitMask & n;
        System.out.println(newNumber);
        }    
    }

    }
    

