package Algdatuke2;

import java.util.Arrays;

public class LukketInterval {
    public static void main(String[] args) {
        char[] c = {'A','B','C','D','E','F'};
        char[] d = Arrays.copyOfRange(c,2,9);// hvorfor ikke ArrayoutOfboundException
        for (char k:d){
            System.out.print(k +" ");

        }




    }





}
