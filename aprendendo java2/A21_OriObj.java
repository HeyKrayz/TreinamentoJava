public class A21_OriObj {
    public static void main (String[] agrs) {
        A21_ClassCarro carro = new A21_ClassCarro();
        System.out.println ("Tipo De Carro: "+ carro.Modelo + "-  Ano de Lançamento: "+ carro.ano + "-  Valor: "+ carro.valor );

        A21_ClassCarro carro2 = new A21_ClassCarro();
        System.out.println ("Tipo De Carro: "+ carro2.Modelo2 + "-  Ano de Lançamento: "+ carro2.ano2 + "-  Valor: "+ carro2.valor2 );
    }
}