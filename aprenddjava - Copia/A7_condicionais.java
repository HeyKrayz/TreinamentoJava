public class A7_condicionais {
    public static void main (String [] args) {

        int idade = 14;
        boolean VerificarIdade = idade >= 18; 
        if (VerificarIdade) {
            System.out.println ("voce tem "+ idade + " entao esta autorizado!");
        }

        else {
            System.out.println ("voce tem " + idade + " entao nao tem permissao!");
        }
        
    }
}