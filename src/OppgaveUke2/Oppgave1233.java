package OppgaveUke2;

import java.util.NoSuchElementException;

public class Oppgave1233 {

    public static void fratilKontroll(int tablengde, int fra, int til)
    {
        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
    }


    public static int maks(int[] a, int fra, int til) {

        if (a == null) throw new NullPointerException
                ("parametertabellen a er null!");


        fratilKontroll(a.length, fra, til);

        if (fra == til) throw new NoSuchElementException
                ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");

        int m = fra;             // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];  // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++) if (a[i] > maksverdi)
        {
            m = i;               // indeks til største verdi oppdateres
            maksverdi = a[m];    // største verdi oppdateres
        }

        return m;  // posisjonen til største verdi i a[fra:til>

    }
    public static void main(String[] args) {
        // int[] a = {1,2,3,4,5,6,7,8,9};
        int[] a = new int[0];
        int m = maks(a,0,0);
        int maksverdi =a[m];
        System.out.println(m);
        System.out.println(maksverdi);
    }
}