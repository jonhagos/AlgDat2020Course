package AlgDatOblig1;

public class Oppgave2 {
    public static void main(String[] args) {
        int[]a = {3,3,4,4,5,5,6,6,7,8,9,10};
        int verdi =antallUlikeSortert(a);
        System.out.println(verdi);
    }

   public static int antallUlikeSortert(int[] a){
       final String IllegalState_Exception_Message = " Arrayet er ikkke sortert stigende";
       int teller = 1;
       if(a.length == 0) {
           teller = 0;
       }

       for(int i = 1; i < a.length; i++){
           if(a[i] < a[i-1]){
               throw new IllegalStateException(IllegalState_Exception_Message);
           }

           if(a[i-1] !=a[i])
               teller++;


       }
return teller;
   }



}
