public class classeOpRelacionais {

    public static void main(String[] args) {
        // função nomeUm.
        String nomeUm = "Eliezer";
        // Objeto "new String" nomeDois = "Eliezer".
        String nomeDois = new String("Eliezer");

        // comando para comparação entre objetos usando "equals".
        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean SimNao = numero1 == numero2;
        if (numero1 < numero2) {
            System.out.println("Esta condição é verdadeira");
        }

        System.out.println("Número um é igual a número dois?" + SimNao);

        SimNao = numero1 != numero2;

        System.out.println("Número um é diferente de número dois?" + SimNao);

        SimNao = numero1 > numero2;

        System.out.println("Número um é maior que número dois?" + SimNao);
    }

}
