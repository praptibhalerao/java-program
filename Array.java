import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
       /*  int[]marks = new int[3];
        int[]marks = {97,98,95};
        marks[0] = 97; //phy
        marks[1] = 98; //che
        marks[2] = 95; //eng
         System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
*/
        Scanner Sc = new Scanner(System.in);
        int size = Sc.nextInt();
        int number[]= new int[size];


        // input
        for(int i=0; i<size; i++){
            number[i] = Sc.nextInt();
        }
          int x = Sc.nextInt();

        //Output
        for(int i=0; i<number.length; i++){
            if(number[i]==x){
                System.out.println("x found at index: " + i);
            }
                
        }
            
        }
    }
