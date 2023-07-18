
package App;

import Classes.ContaBancaria;


public class ProjetoBanco2 {

    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria(1234, "João", 1000.0);
        ContaBancaria conta2 = new ContaBancaria(9876, "Junior", 2000.50);
        
        conta1.depositar(100);
        conta2.depositar(500);

        conta1.sacar(2000.0);
        conta2.sacar(1500.50);
        
        System.out.println("Saldo da conta de " + conta1.getNome() + ": R$" + conta1.getSaldo());
        System.out.println("Saldo da conta de " + conta2.getNome() + ": R$" + conta2.getSaldo());
        
    }
}
