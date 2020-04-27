package caixaeletronico;

import java.util.Scanner;

public class Caixaeletronico {

    public static void main(String[] args) {
        //Declaração de variaveis inicias>>
        String CPF = ("123.456.789-00");
        String CPF2;
        String senha = ("01020304");
        String senha2;
        //variaveis do switch para se ter um controle
        int escolha;
        int saldo = 1000;
        int deposito;
        int saque;
        int transferencia;
        int sair = 1;
        String agencia1 = ("4893"), agencia2;
        String conta1 = ("4676-6"), conta2;
        String banco1 = ("brasil"), banco2;
        int t = 0, i, x = 0;
        //Scanner 
        Scanner ler = new Scanner(System.in);
        //Inicio do codigo
        do {
            System.out.println("Bem vindo ao banco!");
            System.out.println("Primeiro digite seu CPF");
            CPF2 = ler.next();
            //se o cpf for legal ele irá prosseguir
            if (CPF.equals(CPF2)) {
                System.out.println("Prosseguindo");
            } //se não
            else {
                for (;;) {
                    System.out.println("CPF errado digite novamente");
                    CPF2 = ler.next();
                    if (CPF.equals(CPF2)) {
                        System.out.println("Prosseguindo");
                    }
                }
            }
            //Mesma coisa agora com a senha
            System.out.println("Agora digite sua senha");
            senha2 = ler.next();
            if (senha.equals(senha2)) {
                System.out.println("Prosseguindo");
            } else {
            //O usuario tem até 2 chances se não sua conta vai ser bloqueada

                for (i = 1; i <= 2; i++) {
                    System.out.println("senha errada digite novamente");
                    senha2 = ler.next();
                    if (i == 2) {
                        x = 1;
                        System.out.println("Oops conta bloqueada por tentativa");
                    } else if (senha.equals(senha2)) {
                        System.out.println("Prosseguindo");
                        x = 0;
                    }
                }
            }
            while (x != 1) {

                System.out.println("escolha qual opção deseja abaixo");
                System.out.println("digite 1 para saldo");
                System.out.println("digite 2 para deposito");
                System.out.println("digite 3 para saque");
                System.out.println("digite 4 para transferencia");
                System.out.println("digite 0 para sair");
                escolha = ler.nextInt();

                switch (escolha) {
                    case 0:
                        x=1;
                        System.out.println("bye bye");
                        break;
                    case 1:
                        System.out.println("seu saldo atual é de: " + saldo + " Reais");
                        break;
                    case 2:
                        System.out.println("quanto deseja depositar ?");
                        deposito = ler.nextInt();
                        saldo = deposito + saldo;
                        System.out.println("seu saldo atual é de: " + saldo+ " Reais");
                        break;
                    case 3:
                        System.out.println("quanto deseja sacar?");
                        saque = ler.nextInt();
                        saldo = saque - saldo;
                        System.out.println("seu saldo atual é de: " + saldo + " Reais");
                        break;
                    case 4:
                        System.out.println("quanto deseja transferir");
                        transferencia = ler.nextInt();
                        System.out.println("digite o numero da agencia");
                        agencia2 = ler.next();
                        if (agencia1.equals(agencia2)) {
                            System.out.println("prosseguindo");
                        }
                        else {
                            for (;;) {
                                System.out.println("numero errado digite novamente");
                                agencia2 = ler.next();
                                if (agencia1.equals(agencia2)) {
                                    System.out.println("prosseguindo");
break;
                                }
                            }
                        }
                            System.out.println("digite o numero da conta");
                            conta2 = ler.next();
                            if (conta1.equals(conta2)) {
                                System.out.println("prosseguindo");
                            } else {
                                for (;;) {
                                    System.out.println("numero errado digite novamente");
                                    conta2 = ler.next();
                                    if (conta1.equals(conta2)) {
                                        System.out.println("prosseguindo");
                                        break;
                                    }
                                }
                            }
                                System.out.println("digite o nome do banco");
                                banco2 = ler.next();
                                if (banco1.equals(banco2)) {
                                    System.out.println("prosseguindo");
                                } else {
                                    for (;;) {
                                        System.out.println("numero errado digite novamente");
                                        banco2 = ler.next();
                                        if (banco1.equals(banco2)) {
                                            System.out.println("prosseguindo");
                                            break;
                                        }
                                    }
                                }
                                saldo = saldo-transferencia;
                            System.out.println("seu saldo atual é de: " + saldo + " Reais");
                        }
                } 
}while (sair != 0);
    }
}