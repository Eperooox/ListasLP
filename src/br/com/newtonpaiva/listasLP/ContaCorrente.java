package br.com.newtonpaiva.listasLP;

public class ContaCorrente
{
    private double saldo;
    public int numero;
    private Cliente cliente;
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getSaldo() {return saldo;}
    public void deposita(double valor){saldo += valor;}

    public void setSaldo(double saldo) {this.saldo = saldo;}

}
