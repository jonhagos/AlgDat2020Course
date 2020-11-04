package Algdatuke2;

public class FeilOgUntakk {
    public static void main(String[] args) {
        int[] a = {9,7,10,8,2,6,14,4,19,12,5,3,13,20,1,18,17,11,15,16};
        int m = maks(a,10,0);
        System.out.println(m);
    }

    public static int maks(int[] a, int fra, int til)
    {
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] > maksverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }
}
