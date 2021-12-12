package appBanco;

import model.Conta;
import model.ContaCorrente;
import model.ContaInvestimento;
import model.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao Banco Tech Dive!");

        Scanner input = new Scanner(System.in);

        Conta conta[] = new Conta[5];
        Conta contaDestino = null;
        int i = 0;
        int opcao;
        int opcaoConta;
        int numeroDaConta= 0;
        double valorTransacao =0;
        int serialContas = 0;
        String nome;
        String cpf;
        double rendaMensal;
        int agencia =0;
        double saldo;


        ContaCorrente cc = null;
        ContaInvestimento ci = null;
        ContaPoupanca cp = null;


        do{
            System.out.println("=========================================");
            System.out.println("         B A N C O   T E C H D I V E     ");
            System.out.println("=========================================");
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - Abrir/Alterar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Saldo");
            System.out.println("5 - Extrato");
            System.out.println("6 - Transferir");
            System.out.println("7 - Relatórios");
            System.out.println("8 - Sair");
            System.out.println("=========================================");
            opcao = input.nextInt();

            switch (opcao){
                case 1:

                    System.out.println("Qual tipo de conta você deseja abrir?\n1.Conta Corrente\n2.Conta Investimento\n3.Conta Poupança\n4.Alterar dados de conta existente");
                    opcaoConta = input.nextInt();
                    input.nextLine();
                    if (opcaoConta == 1){

                        for (i =0 ; i < conta.length ; i++) {
                            if (conta[i] == null) {
                                conta[i] = new Conta();
                                break;
                            }
                        }

                        System.out.println("Digite o nome do cliente:");
                        nome = input.nextLine();
                        System.out.println("Digite o CPF");
                        cpf = input.nextLine();
                        System.out.println("Digite a renda mensal:");
                        rendaMensal = input.nextDouble();
                        System.out.println("Digite a Agencia:\n001 - Florianópolis\n002 - São José");
                        if (input.nextInt() == 1){
                            agencia=1;
                        }else if (input.nextInt() == 2){
                            agencia =2;
                        }
                        System.out.println("Digite o valor do saldo inicial:");
                        saldo = input.nextDouble();
                        //cc = new ContaCorrente();
                        conta[i].setConta(serialContas++);
                        conta[i].setNome(nome);
                        conta[i].setCpf(cpf);
                        conta[i].setRendaMensal(rendaMensal);
                        conta[i].setSaldo(saldo);
                        conta[i].setAgencia(agencia);
                        for (i =0 ; i < conta.length ; i++) {
                            System.out.println(conta[i]);
                        }


                    }
                    else if(opcaoConta == 2){

                    }else if (opcaoConta ==3){

                    }else{
                        System.out.println();
                        System.out.println("Digite o nome do cliente:");
                        nome = input.nextLine();
                        System.out.println("Digite a renda mensal:");
                        rendaMensal= input.nextDouble();
                        System.out.println("Digite a Agencia:\n001 - Florianópolis\n002 - São José");
                        if (input.nextInt() == 1){
                            agencia =1;
                        }else if (input.nextInt() == 2){
                            agencia= 2;
                        }
                        conta[i].alterarDadosCadastrados(nome,rendaMensal,agencia);
                    }
                    break;
                case 2 :
                    //SACAR
                    System.out.println("Digite o numero da conta que será realizado o SAQUE:");
                    numeroDaConta = input.nextInt();
                    System.out.println("Digite o valor do SAQUE:");
                    valorTransacao = input.nextDouble();

                    conta[i].sacar(valorTransacao);

                break;
                case 3:
                   // DEPOSITAR
                    System.out.println("Digite o numero da conta que será realizado o SAQUE:");
                    numeroDaConta = input.nextInt();
                    System.out.println("Digite o valor do DEPOSITO:");
                    valorTransacao = input.nextDouble();

                    conta[i].depositar(valorTransacao);

                break;
                case 4:
                    //SALDO
                    System.out.println("Digite o numero da conta para verificar o SALDO:");
                    numeroDaConta = input.nextInt();
                    conta[i].saldo(numeroDaConta);

                break;
                case 5:
                    //extrato
                    System.out.println("Digite o numero da conta para ver o EXTRATO:");
                    conta[i].extrato(input.nextInt());

                break;
                case 6:
                    //trasnferir;
                    System.out.println("Digite o valor a ser trasnferido:");
                    valorTransacao = input.nextDouble();
                    System.out.print("Conta para transferência: ");
                    numeroDaConta = input.nextInt();
                    for ( i =0 ; i < conta.length ; i++) {
                        if (conta[i].getConta() == numeroDaConta) {
                            contaDestino = conta[i];

                            break;

                        }else{
                            System.out.println("A conta numero "+numeroDaConta+" não existe.");
                        }
                    }
                    conta[i].transferePara(valorTransacao,contaDestino);

                break;
            }// fim switch



        }while (opcao != 8);

    }// fecha main
}// fecha classe
