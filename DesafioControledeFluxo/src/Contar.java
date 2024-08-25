import java.util.Scanner;
public class Contar {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int valor1, valor2;

        System.out.println("-----------------------");
        System.out.println("BEM VINDO AO CONTADOR DE VALORES!");
        System.out.println("-----------------------");

        System.out.print("Digite o primeiro valor:");
        valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        valor2 = sc.nextInt();

        System.out.println("-----------------------");
        System.out.println("INICIANDO CONTAGEM...");
        System.out.println("-----------------------");

        try {
            contar(valor1, valor2);

        } catch (ParametrosException e) { 
            System.out.println("-------------------------------");
            System.out.println("!!! Error !!!");
            System.out.println(e.getMessage());

        }

        System.out.println("-----------------------");
        System.out.println("FIM.");
        System.out.println("-----------------------");
    }

    static void contar (int valor1, int valor2) throws ParametrosException {

        if (valor1 > valor2) {
            throw new ParametrosException  ("O segundo valor deve ser maior que o primeiro");

        } for(int i = valor1; i <= valor2; i++) {
            System.out.println("valor: " + i);

        }
    }
}