public class JavaApplication5 {

    public static void main(String[] args) {
        int[] num = { 3, 6, 1, 7, 2, 8, 10, 4, 9, 5 };
        sort(num,num.length);
 
        for (int h : num)
            System.out.print(h + " ");
    }
     public static void sort( int[] input,int n)
 
     {
 
         int min=0,max=0;
 
         for (int i = 1; i < n; i++)
 
         {
 
             if (input[i] > max)
 
                 max = input[i];
 
             if (input[i] < min)
 
                 min = input[i];
 
         }
