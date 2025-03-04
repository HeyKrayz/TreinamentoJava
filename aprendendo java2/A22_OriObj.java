public class A22_OriObj {
    public static void main (String[] args) {
        A22_CalculadoraTest calculadora = new A22_CalculadoraTest();
        int num1 = 1;
        int num2 = 2;

        calculadora.NumerosDeParametros (num1, num2);
        System.out.println("numero: "+ num1+ " numero: "+ num2);

    }
}