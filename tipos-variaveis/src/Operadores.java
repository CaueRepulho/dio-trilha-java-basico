
public class Operadores {

    public static void main(String[] args) {
        String nomeCompleto = "Linguagem " + "Java"; // uso do + para concatenacao
        System.out.println("A contatenacao gera: " + nomeCompleto);

        int numero = 5;

        numero = -numero; // torna a variavel negativa 
        numero = numero * -1; //retorna a variavel a ser positiva

        numero--; //decremento de valores

        boolean variavel = true;
        System.out.println(!variavel); //negativa

        //uso de if else
        int a, b;
        a = 5;
        b = 5;

        String resultado = "";
        if (a == b) {
            resultado = "verdadeir"; 
        }else {
            resultado = "falso";
        }

    }
}
