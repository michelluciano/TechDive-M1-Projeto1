package appBanco;

import model.ContaCorrente;
import model.ContaInvestimento;
import model.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao Banco Tech Dive!");

        Scanner input = new Scanner(System.in);
        int opcao;
        int opcaoConta;
        int numeroDaConta= 0;
        double valorTransacao =0;
        ContaCorrente cc =null;
        ContaInvestimento ci = null;
        ContaPoupanca cp = null;
        int serialConta = 000 + 1;

        do{
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - Abrir conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Saldo");
            System.out.println("5 - Transferir");
            System.out.println("6 - Relatórios");
            System.out.println("7 - Sair");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Qual tipo de conta você deseja abrir?\n1.Conta Corrente\n2.Conta Investimento\n3.Conta Poupança");
                    opcaoConta = input.nextInt();
                    if (opcaoConta == 1){
                        cc = new ContaCorrente();
                        System.out.println("Digite o nome do cliente:");
                        cc.setNome(input.nextLine());
                        System.out.println("Digite o CPF");
                        cc.setCpf(input.nextLine());
                        System.out.println("Digite a renda mensal:");
                        cc.setRendaMensal(input.nextDouble());
                        cc.setConta(serialConta);
                        System.out.println("Digite a Agencia:\n 001 - Florianópolis\n002 - São José");
                        if (input.nextInt() == 1){
                            cc.setAgencia(1);;
                        }else if (input.nextInt() == 2){
                            cc.setAgencia(2);;
                        }
                        System.out.println("Digite o valor do saldo inicial:");
                        cc.setSaldo(input.nextDouble());
                        cc.saldo(serialConta);
                    }
                    else if(opcaoConta == 2){
                        ci = new ContaInvestimento();
                        System.out.println("Digite o nome do cliente:");
                        ci.setNome(input.nextLine());
                        System.out.println("Digite o CPF");
                        ci.setCpf(input.nextLine());
                        System.out.println("Digite a renda mensal:");
                        ci.setRendaMensal(input.nextDouble());
                        ci.setConta(serialConta);
                        System.out.println("Digite a Agencia:\n 001 - Florianópolis\n002 - São José");
                        if (input.nextInt() == 1){
                            ci.setAgencia(1);;
                        }else if (input.nextInt() == 2){
                            ci.setAgencia(2);;
                        }
                        System.out.println("Digite o valor do saldo inicial:");
                        ci.setSaldo(input.nextDouble());
                    }else{
                        cp = new ContaPoupanca();
                        System.out.println("Digite o nome do cliente:");
                        cp.setNome(input.nextLine());
                        System.out.println("Digite o CPF");
                        cp.setCpf(input.nextLine());
                        System.out.println("Digite a renda mensal:");
                        cp.setRendaMensal(input.nextDouble());
                        cp.setConta(serialConta);
                        System.out.println("Digite a Agencia:\n 001 - Florianópolis\n002 - São José");
                        if (input.nextInt() == 1){
                            cp.setAgencia(1);;
                        }else if (input.nextInt() == 2){
                            cp.setAgencia(2);;
                        }
                        System.out.println("Digite o valor do saldo inicial:");
                        cp.setSaldo(input.nextDouble());
                    }
                    break;
                case 2 :
                    //SACAR
                    System.out.println("Digite o numero da conta que será realizado o SAQUE:");
                    numeroDaConta = input.nextInt();
                    System.out.println("Digite o valor do SAQUE:");
                    valorTransacao = input.nextDouble();

                    cc.sacar(valorTransacao);
                    cc.extrato(numeroDaConta);

                break;
                case 3:
                   // DEPOSITAR
                    System.out.println("Digite o numero da conta que será realizado o SAQUE:");
                    numeroDaConta = input.nextInt();
                    System.out.println("Digite o valor do DEPOSITO:");
                    valorTransacao = input.nextDouble();

                    cc.depositar(valorTransacao);
                    cc.extrato(numeroDaConta);

                break;
                case 4:
                    //SALDO
                    System.out.println("Digite o numero da conta para verificar o SALDO:");
                    numeroDaConta = input.nextInt();
                    cc.saldo(numeroDaConta);
                    
                break;
                case 5:
                    System.out.println("Digite o numero da conta que será realizado o SAQUE:");
                    numeroDaConta = input.nextInt();

                break;
            }// fim switch



        }while (opcao != 6);

    }// fecha main
}// fecha classe
