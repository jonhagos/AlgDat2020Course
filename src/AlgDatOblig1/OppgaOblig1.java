package AlgDatOblig1;

import java.util.NoSuchElementException;

public class OppgaOblig1 {
    public static void main(String[] args) {
        int[] a ={};
        int[] b = {4};
        int[] c ={3,2,1};
       // int størsteverdi = maks(a);
        int størsteverdi1 = maks(b);
        int størsteverdi2 = maks(c);
       // System.out.println(størsteverdi);
        System.out.println(størsteverdi1);
        System.out.println(størsteverdi2);
        int ombytt = ombyttinger(c);
        System.out.println(ombytt);
    }

    public static int maks(int[] a){

        int størsteverdi = 0;

        if(a.length < 1)
            throw new NoSuchElementException("This table is empty");
        else if (a.length == 1)

            størsteverdi = a[0];     //Arrayet har bare en element

        for(int i = 1;i < a.length;i++){
            if(a[i] < a[i-1]){
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
            størsteverdi =a[i];
        }
        return størsteverdi;

    }

   public static int ombyttinger(int[] a) {
        int teller = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                teller++;
                System.out.println("nå byttes " + a[i - 1] + " og " + a[i]);
            }

            int temp = a[i];
            a[i] = a[i - 1];
            a[i - 1] = temp;
        }
        return teller;
    }




    }


