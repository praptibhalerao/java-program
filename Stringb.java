
public class Stringb{
    public static void main(String[] args) {
    /*   StringBuilder sb = new StringBuilder("Tony");
     System.out.println(sb);

     sb.insert(2, 'n');
     System.out.println(sb.charAt(0));
      

     sb.setCharAt(0, 'p');
     System.out.println(sb);
   
    // delete the extra 'n'
     sb.delete(2, 4);
     System.out.println(sb);
     
     //2
     StringBuilder sb = new StringBuilder("h");
     sb.append("e"); // str = str + "e";
     sb.append("l");
     sb.append("l");
     sb.append("o");
     System.out.println(sb.length());

*/
     //3
     StringBuilder sb = new StringBuilder("hello");
     for( int i=0; i<sb.length()/2; i++){
        int front = i;
        int back = sb.length() - 1-i;
        
        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);
        
        sb.setCharAt(front, backChar);
        sb.setCharAt(back, frontChar);
    }
    System.out.println(sb);
    }
}