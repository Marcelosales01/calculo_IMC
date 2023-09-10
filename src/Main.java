import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo, vamos calcular seu IMC.");

        System.out.println("Informe seu peso: ");
        p.peso = sc.nextDouble();

        System.out.println("Informe sua altura: ");
        p.altura = sc.nextDouble();

        p.IMC();

        }
    }
