package Algdat1;

public class StørsteVerdien112 {

    public static void main(String[] args) {
        int[] a = {1,4,6,8,9,3,2};
        int maksind = maks(a);
        int maksverdi = a[maksind];
        System.out.println(maksind);
        System.out.println(maksverdi);


    }
    public static int maks(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int maksind = 0;  // indeks til foreløpig største verdi

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] > a[maksind]) maksind= i;  // indeksen oppdateres
        }

        return maksind;  // returnerer indeksen/posisjonen til største verdi

    } // maks
}
