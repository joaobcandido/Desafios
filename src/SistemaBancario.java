import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {

    int opcao = 0;
    Scanner leitura = new Scanner(System.in);
    String menu = """
            *****************************
            1 - saldo
            2 - deposito
            3 - saque
            4 - sair
            """;

    while (opcao != 4){
        System.out.println(menu);
        System.out.print("digite uma opção: ");
        opcao = leitura.nextInt();
    }


    }
}
