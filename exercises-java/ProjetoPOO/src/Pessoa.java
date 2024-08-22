public abstract class Pessoa {

    private String nome;
    private int idade;
    private double salario;

    public abstract double calculaSalario(double salario);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    };
    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
