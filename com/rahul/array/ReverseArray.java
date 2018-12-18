public class ReverseArray{
     public static void main(String []args){
        reverseString("pooh");
        
     }
     
     static String reverseString(String str) {
         char[] arr = str.toCharArray();
         for(int i=0, j=arr.length-1; ; i++,j--) {
             if(i>j) {
                 break;
             }
             swap(arr,i,j);
         }
         for(int i=0;i<arr.length;i++) {
             System.out.print(arr[i]);
         }
         return "";
     }
     
     static void swap(char[] arr, int i, int j) {
         char temp = arr[j];
         arr[j] = arr[i];
         arr[i] = temp;
     }
}
