package Algdatuke2;

public class TabellInterval {
    public static void main(String[] args) {
        int[]a = {9,7,4,1,6,10};

        int maksind = maks(a,1,3) ;
        System.out.println(maksind);
        int maksverdi = a[maksind];
        System.out.println(maksverdi);
        System.out.println(maksind);
    }



  /*  public static int maks1(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til) ;
        {
            throw new IllegalArgumentException("Illegal interval");
        }


        int maksnd = fra;
        int maksverdi = a[fra];


        for (int i = fra + 1; i < til; i++) {
            if (a[i] > a[fra]) {
                maksnd = i;
                maksverdi = a[maksnd];
            }
        }

        return maksnd;
    }*/

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


