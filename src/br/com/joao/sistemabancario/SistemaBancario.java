package br.com.joao.sistemabancario;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {

        int opcao = 0;
        double saldo = 0;
        double deposito ;
        double saque ;
        Scanner leitura = new Scanner(System.in);
        String menu = """
                ********************
                1 - saldo
                2 - deposito
                3 - saque
                4 - sair
                """;

        while (opcao != 4){
            System.out.println(menu);
            System.out.print("digite uma opção: ");
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("saldo = " + saldo);
            }else if (opcao == 2) {
                System.out.print("quanto voçê quer depositar: ");
                deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("deposito de " + deposito + " realizado com sucesso!!!");
            }else if (opcao == 3) {
                System.out.print("quanto voçê quer sacar: ");
                saque = leitura.nextDouble();
                if (saque <= saldo){
                    System.out.println("saque de " + saque + " realizado com sucesso!!");
                    saldo -= saque;
                }else {
                    System.out.println("saldo insuficiente");
                }
            }else {
                System.out.println("saindo da aplicação.....");
            }

        }

    }
}
