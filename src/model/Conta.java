package model;

public class Conta {

    private String nome;
    private String cpf; // TODO: validar o cpf depois
    private double rendaMensal;
    private int conta; // TODO: o sistema deve gerar a sequencia
    private int agencia; // TODO: 001 - Florianópolis 002 = São José
    private double saldo;
    private double valorChequeEspecial;

    //getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorChequeEspecial() {
        return valorChequeEspecial;
    }

    public void setValorChequeEspecial(double valorChequeEspecial) {
        this.valorChequeEspecial = valorChequeEspecial;
    }

    //Métodos

    public String sacar(double valor){
        if(valor < saldo){
            saldo = saldo - valor;
            return "Saque realizado no valor de R$"+valor;
        }else{
            return "Saldo insuficiente.";
        }
    }

    public double depositar( double valor){
        saldo = saldo + valor;
        return saldo;
    }

    public void saldo(int numConta){
        System.out.println("++++++++++++++++ Dados da Conta Bancária+++++++++++++++++++");
        System.out.println(" - Nome              \t    " + getNome()+"              \t+");
        System.out.println(" - Número da CPF     \t    " + getCpf()+"               \t+");
        System.out.println(" - Número da conta   \t    " + numConta+"               \t+");
        System.out.println(" - Agência           \t    " + ((getAgencia() == 1) ? "001 - Florianópolis":"002 - São Jose")+"          \t+");
        System.out.println(" - Saldo             \t R$ " + getSaldo()+"             \t+");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void extrato( int conta){
        System.out.println("++++++++++++++++ Extrato Conta +++++++++++++++++++++");
        System.out.println(" - Nome              \t\t\t    " + getNome());
        System.out.println(" - Número da CPF  ´  \t\t\t    " + getCpf());
        System.out.println(" - Número da conta   \t\t\t    " + conta);
        System.out.println(" - Agência           \t\t\t    " + ((getAgencia() == 1) ? "001 - Florianópolis":"002 - São Jose"));
        System.out.println(" - Saldo             \t\t\t R$ " + getSaldo());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public String transferir(double valor, int contaOrigem, int contaDestino){
        return "Foi trasnferido o valor de R$"+valor+
                "\nDa conta :"+contaOrigem+
                "\nPara a conta:"+contaDestino;
    }

    public String alterarDadosCadastrados(String nome){
        return "Alterado com sucesso";
    }
}
