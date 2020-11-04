package Algdatuke2;

public class Oppgave4 {

    static void merge(int[] arr,int v, int sverdi,int h){
        int s1 = sverdi - v +1;    //størrelse av subarray
        int s2 = h - sverdi;

        int V[] = new int [s1];        // Arrayene for oddetall skal til venstre
        int H[] = new int [s2];          // og for partall skal på høyre.

        for (int i = 0;i < s1;i++){
            V[i] = arr[v + i];             //fille subarrayene
        }
        for (int j = 0; j < s2;j++){
            H[j] = arr[sverdi + 1 + j];
        }

        int i = 0;       //setter opp initialindeksering for subarrayene.
        int j = 0;
        int k = v;
        while(i < s1 &&j < s2){        //merging  av subarrayene kommer til opprinnelig arrayet
            if (V[i] <= H[j]){
                arr[k] = V[i];
                i++;
            } else {
                arr[k] = H[j];
                j++;
            }
            k++;
        }

        while (i < s1){      //kopiere tallene i venstrearrayet
            arr[k] = V[i];
            i++;
            k++;
        }
        while(j < s2){
            arr[k] = H[j];
            j++;
            k++;
        }
    }
      static void mergOgSort(int[] arr, int v,int h) {
          if (v < h) {

              int sverdi = (v + h) / 2;    //midtpunktet

              mergOgSort(arr,v,sverdi);     //sortering begge deler av arrayet
              mergOgSort(arr,sverdi + 1,h);

              merge(arr,v,sverdi,h);
          }
      }

      public static void delsortering(int[] a){
        int h = a.length - 1;
        int v = 0;
        int odd = 0;
        int even = 0;
        if(a.length == 0){
            return;
        }else if(a.length == 1) {
            return;
        }

        while(v < h){
            if(a[v] % 2 != 0 && v < h){        //setter addetallene til venstre
                v++;
                odd++;
            }else if (a[h] % 2 == 0 && v < h){
                h--;                             // setter partallene til høyre
                even ++;
            }else if (v < h){
                int temp = a[h];
                a[h] = a[v];
                a[v] = temp;
                v++;
                h--;
            }
        }
        if(v == 0 || h== 0){
            mergOgSort(a,0,a.length -1);
            return;
        }

        while(a[h] % 2 != 0 && h < a.length - 1){
            h++;
        }
        while (a[v] % 2 == 0 && v > 0){
            v--;
        }
        mergOgSort(a,0,v);
        mergOgSort(a,h,a.length - 1);

      }
  /*  public static int maks(int[] a) { throw new UnsupportedOperationException(); }

    public static int ombyttinger(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }*/



}
