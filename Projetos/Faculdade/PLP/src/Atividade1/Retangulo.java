package Atividade1;

public class Retangulo {

    public float largura;
    public float altura;
    private float area;
    private float perimetro;
    private double diagonal;

    public float getLargura() {return largura;}

    public void setLargura(float largura) {this.largura = largura;}

    public float getAltura() {return altura;}

    public void setAltura(float altura) {this.altura = altura;}

    public float getArea() {return area;}

    public void setArea(float area) {this.area = getAltura()*getLargura();}

    public float getPerimetro() {return perimetro;}

    public void setPerimetro(float perimetro) {this.perimetro = (getAltura()+getLargura())*2;}

    public double getDiagonal() {return diagonal;}

    public void setDiagonal(double diagonal) {this.diagonal = Math.sqrt((getAltura()*getAltura())+(getLargura()*getLargura()));}

//    public Retangulo() {
//        this.area = getAltura()*getLargura();
//        this.perimetro = (getAltura()+getLargura())*2;
//        this.diagonal = (float) Math.sqrt((getAltura()*getAltura())+(getLargura()*getLargura()));
//    }
}
