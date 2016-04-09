/**
 * Created by suchi on 4/9/16.
 */
public class ArrayMax {
    public static void main(String args[]){
        int[] numbers=new int[]{5,10,9,0,-1,-4};
        System.out.println("Maximum element in array is:"+max(numbers));
    }
    public static int max(int[] n){
        int max=n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]>max){
                max=n[i];

            }

        }
        return max;
    }
}
