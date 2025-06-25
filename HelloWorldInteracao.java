import java.util.Scanner;

class HelloWorldInteracao{
    public static void main(String[] args) {
        // Ler o nome
        System.out.println("Informe seu nome:");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        System.out.println("Hello World " + nome);
    }
}