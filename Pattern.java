public class Pattern {
    public static void main(String[] args) {
     //    int n = 4;
        // int m = 5;

/* 
        //outer loop

        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     
       //outer loop
            for(int i=1; i<=n; i++) {
                //inner loop
                for(int j=1; j<=m; j++){
                    
                    
                    //cell ->(i,j)

                     if(i == 1 || j == 1 || i == n || j == m){
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    } 

                }
                System.out.println();

                

            }*/

        //  int n = 4;
          
          //outer loop
        /*   for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=i; j++){
             System.out.print("*");
            }
            System.out.println();
          }
          

             


              //outer loop
                int n = 4;
                for (int i = n; i >= 1; i--) {
                 // Inner loop
                      for (int j = 1; j <= i; j++) {
                      System.out.print("*");
                       }
                      System.out.println();
                    }*/


                   /*    //outer loop
                      int n = 5;
                      for(int i= 1; i<=n; i++){

                        //inner loop
                        for(int j=1; j<=i; j++){
                            System.out.print(j+" ");

                        }
                        System.out.println();

*/


                  /*  int n = 5;
                      for(int i=1; i<=n; i++){
                        for(int j=1; j<n-i;j++){
                            System.out.print(j);

                        }
                        System.out.println();
                      }
                        



                    //5 outer loop
                    int n= 5;
                    int number = 1;
                        for(int i=1; i<=n; i++){
                            for(int j=1; j<=n-i+1; j++){
                                System.out.print(j);
                            }
                                System.out.println();
                            }
               int n = 5;
               //upper part
               for(int i = 1; i <= n; i++){
                //1st part
                  for(int j = 1; j <= i; j++){
                    System.out.print("*");
                  }
                  
                 //spaces
                  int spaces = 2 * (n-i);
                  for(int j=1; j<=spaces; j++){
                    System.out.print(" ");
                  }
                 //2nd part
                 for(int j=1; j<=i; j++){
                    System.out.print("*");
                 }
                 System.out.println();


                  }




                  //lower half part
               for(int i=n; i>=1; i--){
                //1st part
                  for(int j=1; j<=i; j++){
                    System.out.print("*");
                  }
                  
                 //spaces
                  int spaces = 2 * (n-i);
                  for(int j=1; j<=spaces; j++){
                    System.out.print(" ");
                  }
                 //2nd part
                 for(int j=1; j<=i; j++){
                    System.out.print("*");
                 }
                  System.out.println();
               } */


//4)
          
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
