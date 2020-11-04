package AlgdatUke4;

public class TernayIf {
    public static void main(String[] args) {
        for(int i = 0;i < 10; i++){
            int a = i;
            int b = myTernarytest(a);
            System.out.println(b);
        }
    }

    public static int myTernarytest(int value){
      /*  if(value < 5)
            return 0;
        else
            return 98;*/
      return(value < 5)?0:98;

    }
}
