package AlgdatUke8;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Stack;

public class FlytteEnStakk<T> implements Stakk<T> {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int[] b = {};
        Stack<Character> s = new Stack<>();
        Stack<Character> c = new Stack<>();
        s.push('A'); s.push('B'); s.push('C');
        System.out.println(s);
        while( !s.isEmpty()) {

            System.out.println(s.pop() + " ");
        }

        Stack<Integer> k = new Stack<>();
        k.push(10);k.push(80);k.push(5);
        while( !k.isEmpty()){
            System.out.println(k.pop()  );
        }

    }
    private T[] a ;
    private T[] b;
    private int antall;                // antall verdier på stakken

    public FlytteEnStakk()               // konstruktør - tabellengde 8
    {
        this(8);
    }

    @SuppressWarnings("unchecked")     // pga. konverteringen: Object[] -> T[]
    public FlytteEnStakk(int lengde)     // valgfri tabellengde
    {
        if (lengde < 0)
            throw new IllegalArgumentException("Negativ tabellengde!");

        a = (T[])new Object[lengde];     // oppretter tabellen
        antall = 0;// stakken er tom
        b = (T[])new Object[lengde];

    }

    @Override
    public void leggInn(T verdi) {
        if (antall == a.length)
            a = Arrays.copyOf(a, antall == 0 ? 1 : 2*antall);   // dobler

        a[antall++] = verdi;

    }

    @Override
    public T kikk() {
        if (antall == 0)       // sjekker om stakken er tom
            throw new NoSuchElementException("Stakken er tom!");

        return a[antall-1];    // returnerer den øverste verdien

    }

    @Override
    public T taUt() {
        if (antall == 0)       // sjekker om stakken er tom
            throw new NoSuchElementException("Stakken er tom!");

        antall--;             // reduserer antallet

        T temp = a[antall];   // tar var på det øverste objektet
        a[antall] = null;     // tilrettelegger for resirkulering

        return temp;          // returnerer den øverste verdien
    }

    @Override
    public int antall() {
        return 0;
    }

    @Override
    public boolean tom() {
        return false;
    }

    @Override
    public void nullstill() {

    }

    // de andre metodene skal inn her!



}