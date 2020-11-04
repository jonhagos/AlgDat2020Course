package Algdatuke2;

public class Inversjoner {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 3, 6, 7, 9, 5, 8, 10};


        int[] b = {1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 8, 9};
        System.out.println(inversjoner(a));
        System.out.println(inversjoner(b));

    }

    public static int inversjoner(int[] a) {
        int antall = 0; // antall inversjoner
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j])
                    antall++; // en inversjon siden i<j
            }
        }
        return antall;
    }

    public static int antallUlikeSortert(int[] a) {
        final String IllegalState_Exception_Message = "Arrayet er ikke sortert stigende";
        int teller = 1; // antall forskjellig verier.
        if (a.length == 0)
            teller = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                throw new IllegalStateException(IllegalState_Exception_Message);
            }
            if (a[i] != a[i - 1])
                teller++;
        }
        return teller;
    }

    public static int antallUlikesortert(int[] a) {
        int count = a.length;
        int verdi1 = 0;
        int verdi2 = 0;
        if (a.length < 1)
            return 0;
        for (int i = 0; i < a.length; i++) {
            verdi1 = a[i];
            for (int j = i + 1; j < a.length; j++) {
                verdi2 = a[j];
                if (verdi1 == verdi2) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}