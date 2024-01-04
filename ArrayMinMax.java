 class ArrayMinMax {
         public static void main(String[ ] args){
                  int arr[ ] = new int[5];
                  arr[ 0 ] = 32;
                  arr[ 1 ] = 23;
                  arr[ 2 ] = 5;
                  arr[ 3 ] = 2;
                  arr[ 4 ] = 65;
	     int min = arr[ 0 ];
                        int max = arr[ 0 ];
                       for( int i = 0; i < arr.length; i++){
                                   if(arr[i] > max ){
	                    max = arr[i]; 
	                }
	                if(arr[i] < min ){
                                        min = arr[i];
	                 }
                       }
		System.out.println("The Max element is:"+ max);
		System.out.print("The Min element is:"+ min);
         }
 }