public class Carro{

  public void ligar(){
    System.out.println(" Ligando o carro ");
  }

  public void desligar(){
    System.out.println(" Desligar o carro ");
  }

  public void buzinar(){
    System.out.println("Bi bi bi bi ");
  }

  public void parar(){
    System.out.println(" Parei ");
  }


  public static void main(String[] args){
    Carro carro = new Carro();

    carro.buzinar();
    carro.parar();
    carro.desligar();
    carro.ligar();
  }
}
