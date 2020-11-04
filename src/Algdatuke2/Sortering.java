package Algdatuke2;

public class Sortering {
    public static void main(String[] args) {
        int[] a = {}; int[] b = {5};
        int[] c = {1,2,4,3,6,7,9,5,8,10};
        int[] d ={1,2,3,4,5,6,7,8,9,10};
        int[] e = {1,2,3,3,3,4,4,5,5,6,6,6,6,7,7,8};
        boolean x =erSortert(a);
        boolean y = erSortert(b);
        boolean z = erSortert(c);
        boolean u = erSortert(d);
        boolean k = erSortert(e);
        System.out.println(x+" "+y+" "+z+" "+u+" "+k
        );

    }
    public static boolean erSortert(int[]a){
        for(int i = 1; i < a.length;i++)
            if(a[i-1] > a[i]) return false;

            return true;
    }
}

