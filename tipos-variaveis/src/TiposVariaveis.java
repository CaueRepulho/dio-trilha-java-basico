public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salaraioMinimo = 2500;
        System.out.println("Seu Salário é: " + salaraioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;

        numero = 2; //a variavel pode receber outro valor desde que o tipo esteja correto

        final double valorDePi = 3.14;

        System.out.println(valorDePi);

        String meuNome = "Caue"; //essa e a forma de criacao de uma string

    }
}
