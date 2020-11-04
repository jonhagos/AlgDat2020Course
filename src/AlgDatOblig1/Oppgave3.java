package AlgDatOblig1;

public class Oppgave3 {

    public static void main(String[] args) {
        int[] a ={1,2};
        int[] b = {};
        int antall =antallUlikeUsortert(a);
        int antall2 =antallUlikeUsortert(b);
        System.out.println(antall);
        System.out.println(antall2);
    }
    public static int antallUlikeUsortert(int[] a){
        int teller = 0;

        if(a.length == 0) {
            teller = 0;
        }
        for(int i = 0; i < a.length;i++){
            boolean ikketelle = false;
            for(int j = 0;j< i ; j++){
                if(a[j] == a[i]) {
                    ikketelle = true;
                    break;
                }

            }
            if (!ikketelle){
                teller++;

            }

        }

        return teller;
    }
}
