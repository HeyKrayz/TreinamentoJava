public class A23_OriObj {
    public static void main (String[] args) {
        A23_estudante estudantes = new A23_estudante();
        A23_estudantes2 estudantes2 = new A23_estudantes2();
        A23_imprimir imprimir = new A23_imprimir();

        estudantes.nome = "thorfinn";
        estudantes.idade = 20;
        estudantes.sexo = 'm';

        estudantes2.nome = "sung ji woo";
        estudantes2.idade = 24;
        estudantes2.sexo = 'm';
        
        A23_imprimir.imprimir (estudantes);
    }
}