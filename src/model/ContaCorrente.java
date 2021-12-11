package model;

public class ContaCorrente extends Conta{


    double valorChequeEs = 15*getRendaMensal()/100;

    public ContaCorrente(){
        setValorChequeEspecial(valorChequeEs);
        setSaldo(1);
    }
}
