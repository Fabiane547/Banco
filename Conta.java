
package conta;

public class Conta {
     private double saldo;
    private int agencia;
    private int numero;
    private String cliente;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;        
        this.agencia = agencia;
        this.numero = numero;
}
     public void deposita(double valor) {
        this.saldo += valor;
}
    
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    } 
} 
     public boolean transfere(double valor Conta destino) {
         if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita (valor)
            return tru
        }
        return false
}
    
    public double getSaldo() {
        return this.saldo;
    }

   public double getSaldo() {
       return this.saldo;

   public void gerarTaxa() {}
}
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("Não é possível valores negativos");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Não é possível valores negativos");
            return
        }
        this.agencia = agencia;
    }
    public void setCliente(String Cliente) {
        this.cliente = cliente
    }

    public Cliente getCliente() {
        return cliente;
    

    public static int getTotal() {
        return Conta.total
    }



    
   
