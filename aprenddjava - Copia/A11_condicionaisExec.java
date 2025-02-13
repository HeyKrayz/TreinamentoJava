public class A11_condicionaisExec {
    public static void main (String [] args) {

        byte dia = 0;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("dias de Fim De Semana");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println ("dia ultil!");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
    
}
