import java.util.Arrays;

public class SalesByMatch{
    public static void main(String[] args) {
        
        int[] ar= {1 ,1, 3 ,1, 2, 1, 3, 3, 3 ,3};
        
        Arrays.sort(ar);
        int pair=0;
        int i=0,j;
        
        for ( ; i < ar.length-1;i++) {
            int count=1;
            for ( j = i+1; j < ar.length; j++) {
                if(ar[i]==ar[j]){
                    count++;
                }
                else
                {
                    i=j-1;
                    break;
                }
                
            }
            pair=pair+count/2;
            count=0;
            if(j==ar.length){
                break;
            }
        } 
    System.out.println(pair);
        
    }
}