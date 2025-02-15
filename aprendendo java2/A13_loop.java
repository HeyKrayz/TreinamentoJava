public class A13_loop {
    public static void main (String [] args) {

        int ValorMax = 100;

        for (int i = 0; i < ValorMax; i += 5) {
            if (i >= ValorMax) {
                break;
            }
        System.out.println (i);
        }
    }
}