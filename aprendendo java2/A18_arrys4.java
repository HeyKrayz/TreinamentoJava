public class A18_arrys4 {
    public static void main (String[] args) {
        int[][] Dias = new int [3][4];
        Dias[0][0] = 1;
        Dias[0][1] = 2;
        Dias[0][2] = 3;
        Dias[0][3] = 4;

        Dias[1][0] = 5;
        Dias[1][1] = 6;
        Dias[1][2] = 7;
        Dias[1][3] = 8;

        Dias[2][0] = 9;
        Dias[2][1] = 10;
        Dias[2][2] = 11;
        Dias[2][3] = 12;

        for (int buscar: Dias[2]) {
            System.out.println (buscar);
        }


    }
}