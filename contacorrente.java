
package conta;

public class contacorrente {
 public class ContaCorrente extends Conta {
 
   public ContaCorrente (int numeroConta, int agencia) {
      super(numeroConta, agencia);
   }

   public void gerarTaxa() {
     saldo -= 0,05;
   }

   public boolean sacar(double valor, boolean cobraB){
     if (cobraB) {
       return sacar(valor + valor *0,05);
     }
     else {
       return sacar(valor);
     }
   }
 }
 