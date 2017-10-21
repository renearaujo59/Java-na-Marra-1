package javanamarra;

import java.util.Scanner;

public class UmForQueConta {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        String mensagem;
        System.out.println("Digite uma mensagem, eu vou exibi-la cinco vezes. ");
        System.out.print("Mensagem: ");
        mensagem = teclado.nextLine();
        for (n = 1; n <= 5; n++) {
            System.out.println(n + "." + mensagem);
        }
        System.out.println("\nAgora vou exibi-la dez vezes contando de cinco em cinco.");
        for (n = 5; n <= 50; n += 5) {
            System.out.println(n + ". " + mensagem);
        }
        System.out.println("\nFinalmente , tres vezes de tras para frente.");
        for (n = 3; n > 0; n -= 1) {
            System.out.println(n + ". " + mensagem);
        }
    }
}
