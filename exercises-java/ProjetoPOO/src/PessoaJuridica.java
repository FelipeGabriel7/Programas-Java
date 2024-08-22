public class PessoaJuridica extends  Pessoa{
    private String cnpj;
    private double salarioPj;
    private double horasTrabalhadas;
    private double valorPorHora;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getSalarioPj() {
        return salarioPj;
    }

    public void setSalarioPj(double salarioPj) {
        this.salarioPj = salarioPj;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double calculaSalario(double salario){
        setSalario(super.getSalario());
        return salarioPj;
    }
}
