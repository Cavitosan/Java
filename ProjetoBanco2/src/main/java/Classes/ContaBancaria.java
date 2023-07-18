
package Classes;


public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    
    public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial)
    {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double valor)
    {
        this.saldo += valor;
    }
    
    public void sacar(double valor)
    {
        if(saldo >= valor)
        {
            saldo -= valor;
        }
        else
        {
            System.out.println("O seu saldo é insuficiente.");
        }
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public String getNome()
    {
        return this.nomeTitular;
    }
}
