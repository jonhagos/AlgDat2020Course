package Algdatuke2;

import javax.management.MBeanAttributeInfo;

public class Samleklass {
    public static void main(String[] args) {
        int[] a = SamleKlass122.randPerm(20);
        for(int k : a) System.out.println(k + " ");

        int m = SamleKlass122.maks(a);
        System.out.println("\n Største verdi ligger på plass " +m);
    }
}
