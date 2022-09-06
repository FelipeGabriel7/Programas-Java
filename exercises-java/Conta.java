

public class Conta{

  private int saldo;

  
  public void exibeSaldo(int saldo){
    System.out.printf(" O seu saldo é ", this.saldo);
  }

  public void depositar(int valor){
    this.saldo += valor;
    System.out.printf(" O valor depostisado foi : " + valor);
    System.out.println(" Seu novo saldo : " + this.saldo);
  }

  public void verificaSaldo(){
    System.out.printf(" Seu saldo atual "  + this.saldo);
  }

  public static void main(String[] args){

  Conta conta = new Conta();
  System.out.println(" Conta Bancaria ");

  conta.depositar(1000);
  conta.depositar(4000);
  conta.verificaSaldo();
}
}

