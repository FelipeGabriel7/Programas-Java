import java.util.Date;

public class PessoaFisica extends Pessoa {
    private String rg;
    private String cpf;
    private String data_nascimento;
    private double salarioMes;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf (String cpf){
        this.cpf = cpf;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }

    public double calculaSalario(double salario) {
        setSalarioMes(super.getSalario() - (super.getSalario() - 0.3));
        return salarioMes;
    }
}
