 import java.io.*; 
 class EvenOrOdd {
        public static void main(String[] args) throws Exception {
                 InputStreamReader isr = new InputStreamReader(System.in);
                 BufferedReader br = new BufferedReader(isr);
                 String str = br.readLine();
                  int num = Integer.parseInt(str);
	if(num % 2 == 0){
	   System.out.println("The given number is an even ");
	}
	else{
	   System.out.println("The given number is an odd");
	 }
        }
}