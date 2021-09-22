package Atividade1;

public class Funcionario extends Pessoa {

    private double salarioBruto;
    private double salarioLiquido;
    private double imposto;
    private double aumentoSal;
    private float porc;

    public double getSalarioBruto() {return salarioBruto;}

    public void setSalarioBruto(double salarioBruto) {this.salarioBruto = salarioBruto;}

    public double getSalarioLiquido() {return salarioLiquido;}

    public void setSalarioLiquido(double salarioLiquido) {this.salarioLiquido = getSalarioBruto()-getImposto();}

    public double getImposto() {return imposto;}

    public void setImposto(double imposto) {this.imposto = imposto;}

    public float getPorc() {return porc;}

    public void setPorc(float porc) {this.porc = getPorc()/100;}

    public double getAumentoSal() {return aumentoSal;}

    public void setAumentoSal(double aumentoSal) {this.aumentoSal = getSalarioLiquido()+(getPorc()*getSalarioBruto());}
}
