 import java.io.*;
 class AssignmentTwo{
         public static void main(String[] args) throws Exception {
               InputStreamReader isr = new InputStreamReader(System.in);
               BufferedReader br = new BufferedReader(isr);
                String str = br.readLine();
                int number = Integer.parseInt(str);

                 if(number % 2 == 0){
                  System.out.println("It is even number");
                 }
                 else{
                 System.out.println("It is odd number");
                 }
         }
 }