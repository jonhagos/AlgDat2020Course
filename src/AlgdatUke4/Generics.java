package AlgdatUke4;

public class Generics {
    public static void main(String[] args) {
        Integer[] a = {1, 4, 0, 7, 12, 45, 98, 19, 50, 2, 9};
        Character[] b = {'A', 'B', 'C', 'Z', 'V'};
        String [] c = {"Art","AFD","Poteter","Nike"};
        person[] d = {new person ("Peter","Pettersen"),new person ("Kari", "Pettersen"),new person ("Nils", "zbrahmsen"),new person("Tony","tansen")};
        System.out.println("maks av integer Array");
        System.out.println(maks(a));
        System.out.println("maks av char array");
        System.out.println(maks(b));
        System.out.println("Genereric maks av integer Array");
        System.out.println(maks_generic(a));
        System.out.println("Genereric maks av char array");
        System.out.println(maks_generic(b));
        System.out.println("Genereric maks av String array");
        System.out.println(maks_generic(c));
        System.out.println("Genereric maks av person array");
        System.out.println(maks_generic(d));


    }

    static
    <T extends Comparable<? super  T>>
    int maks_generic(T[] values) {
        T current_max = values[0];
        int current_index = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] .compareTo(current_max) >0) {
                current_max = values[i];
                current_index = i;
            }
        }
        return current_index;
    }

    static int maks(Integer[] values) {
        int current_max = values[0];
        int current_index = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] > current_max) {
                current_max = values[i];
                current_index = i;
            }
        }
        return current_index;
    }
    static int maks(Character[] values) {
        char current_max = values[0];
        int current_index = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] > current_max) {
                current_max = values[i];
                current_index = i;
            }
        }
        return current_index;

    }
    public static class person implements Comparable<person> {
        String first_name;
        String last_name;

        person(String first_name, String last_name) {
            this.first_name = first_name;
            this.last_name = last_name;
        }

        public int compareTo(person other) {
        /*
        if (person.last_name < other.last_name)
          return -1;
        if(person.last_name == other.last_name)
           return 0;
        if ( person.last_name > other.lastname)
        return 1,
         */
            int last_compar = this.last_name.compareTo(other.last_name);
            if(last_compar == 0) {
                return this.first_name.compareTo(other.first_name);
            }
            else{
                return last_compar;
            }
        }
    }
}


