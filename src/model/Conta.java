package model;

public class Conta {

    private String nome;
    private String cpf; // TODO: validar o cpf depois
    private double rendaMensal;
    private int conta; // TODO: o sistema deve gerar a sequencia - FEITO
    private int agencia; // TODO: 001 - Florianópolis 002 = São José - FEITO
    private double saldo;
    private double valorChequeEspecial;
    static int serialContas =0;

    public Conta() {
        this.nome = nome;
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
        serialContas++;
        this.conta = serialContas;
        this.agencia = agencia;
        this.saldo = 0;
        this.valorChequeEspecial = 0;
    }

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

    public void sacar(double valor){
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++Realizando Saque+++++++++++");
        System.out.println(" - Saldo Anterior:   \tR$"+this.saldo);
        System.out.println(" - Valor do Saque:   \tR$"+valor);
        if(valor <= this.saldo){
            saldo = saldo - valor;
            System.out.println(" - Saldo Atual:      \tR$"+this.saldo);

        }else{
            System.out.println(" - Saldo insuficiente para realizar esta transação.");
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");
    }

    public void depositar( double valor){
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++ Depósito Realizado com Sucesso!+++++++++++");
        System.out.println(" - Saldo Anterior:   \tR$"+this.saldo);
        this.saldo = this.saldo + valor;
        System.out.println(" - Saldo Atual:      \tR$"+this.saldo);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");
    }

    public void saldo(int numConta){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++ Dados da Conta Bancária+++++++++++++++++++");
        System.out.println(" - Nome              \t    " + getNome()+"              \t+");
        System.out.println(" - Número da CPF     \t    " + getCpf()+"               \t+");
        System.out.println(" - Número da conta   \t    " + numConta+"               \t+");
        System.out.println(" - Agência           \t    " + ((getAgencia() == 1) ? "001 - Florianópolis":"002 - São Jose")+"          \t+");
        System.out.println(" - Valor do Cheque Especial\t R$ " + getValorChequeEspecial()+"\t+");
        System.out.println(" - Saldo             \t R$ " + getSaldo()+"             \t+");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");
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

    public void transferePara(double valor, Conta contaDestino){
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++Realizando Transferencia+++++++++++");
        System.out.println(" - Saldo Anterior:        \tR$"+this.saldo);
        System.out.println(" - Valor da trasnferencia:\tR$"+valor);
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
            contaDestino.saldo = contaDestino.saldo + valor;
            System.out.println(" - Saldo Atual:      \tR$"+this.saldo);
        }else{
            System.out.println(" - Saldo insuficiente para realizar esta transação.");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");


    }

    public void alterarDadosCadastrados(String nome, double rendaMensal, int agencia) {
            this.nome = nome;
            this.rendaMensal = rendaMensal;
            this.agencia = agencia;
        System.out.println("+++++++++++ Dados alterados com suceesso!+++++++");
        System.out.println("");
    }
}
