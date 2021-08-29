
package conta;

public class contapoupança {
     public class ContaPoupança extends Conta {
  
         public ContaPoupança (int numeroConta, int agencia) {
      super(numeroConta, agencia);
   }
          public void gerarAcrescimo() {
     saldo -= 0,05;
   }

   public boolean sacar(double valor, boolean gerarAcrescimo){
     if (gerarAcrescimo) {
       return sacar(valor + valor *0,5);
     }
     else {
       return sacar(valor);
     }
   }
 }
 }

   
