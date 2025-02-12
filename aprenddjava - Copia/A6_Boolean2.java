public class A6_Boolean2 {
    public static void main (String [] args) {

        double ContaBancaria_1 = 1000;
        double ContaBancaria_2 = 4000;
        double Computador = 3500;
        boolean AprovarCompraDeUmPc = ContaBancaria_1 >= Computador || ContaBancaria_2 >= Computador;
        System.out.println ("sua compra foi " + AprovarCompraDeUmPc);
    }
}
