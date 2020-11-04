package OppgaveUke2;

public class Oppgave121 {
    public static void main(String[] args) {
        int[]a = {1,2,5,8,0,4,3};
        int minInd = min(a,0,7);
        int minverdi =a[minInd];
        System.out.println(minInd );
        System.out.println(minverdi);
        System.out.println(min(a));
    }

    public static int min(int[] a,int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til)
            throw new IllegalArgumentException("Illegal interval");

        int minInd = fra;
        int minVerdi = a[fra];
        for (int i = fra; i < til; i++) {
            if (a[i] < minVerdi)
                minInd = i;
            minVerdi = a[minInd];
        }
        return minInd;

    }

    public static int min(int[] a){
        return min (a,0,7);
    }
}
