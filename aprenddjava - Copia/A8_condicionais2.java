public class A8_condicionais2 {
    public static void main (String [] args) {
        int valorNaConta = 300;
        int PreçoDoFone = 50;
        String TerDinheiro = "sua compra foi aprovada!";
        String NaoTerDinheiro = "saldo insuficiente";

        if (valorNaConta >= PreçoDoFone) {
            System.out.println (TerDinheiro);
            valorNaConta -= PreçoDoFone;
        } else {
            System.out.println (NaoTerDinheiro);
        }

    }    
}
