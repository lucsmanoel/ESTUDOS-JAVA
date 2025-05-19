import java.util.Scanner;

public class Main {
    public static int soma(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
             int numero1 = scanner.nextInt();
        System.out.println("Digite o Segundo Valor");
             int numero2 = scanner.nextInt();
        System.out.println("Digite o Terceiro Valor");
             int numero3 = scanner.nextInt();

/* CRIEI UMA VARIAVEL INTEIRA COM NOME DE RESULTADO ARMAZENEI RESULTADO DA FUNÇAO NELA*/
        int resultado = Main.soma(numero1, numero2, numero3);
        // Correção aqui: usando Main.soma e passando três argumentos
        System.out.println("A SUA MEDIA É " + resultado);
        }

    }
