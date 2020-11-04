package AlgdatUke8;

public  interface Stakk<T> {
    public void leggInn(T verdi);    // eng: push
    public Object kikk();                 // eng: peek
    public Object taUt();                 // eng: pop
    public int antall();             // eng: size
    public boolean tom();            // eng: isEmpty
    public void nullstill();         // eng: clear

}
