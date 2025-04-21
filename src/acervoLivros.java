import java.util.Scanner;

public class acervoLivros {

    public static String livro1 = "Viva ao povo brasileiro";
    public static String livro2 = "A morte de Ivan Illitch";
    public static String livro3 = "Jubiabá";

    public static void escolhaLivros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha as opções: 1, 2 ou 3:");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            System.out.println("O livro " + acervoLivros.livro1 + " está disponível");
        } else if (escolha == 2) {
            System.out.println("O livro " + acervoLivros.livro2 + " está disponível");
        } else if (escolha == 3) {
            System.out.println("O livro " + acervoLivros.livro3 + " está disponível");
        } else {
            System.out.println("Escolha inválida, Digite novamente");
        }
        sc.close();
    }

}