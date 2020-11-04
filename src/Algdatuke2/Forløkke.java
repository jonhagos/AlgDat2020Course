package Algdatuke2;

import java.util.Arrays;

public class Forløkke {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        int []b = new int[5];

        for(int i = 0, j = 4;i < a.length;i++,j--){
            b[j] = a[i];
        }
        System.out.println(Arrays.toString(b));

        for(int k : a)
            if( k == a.length)
                System.out.println(k);
            else
                System.out.print( k +"," );


    }



}
