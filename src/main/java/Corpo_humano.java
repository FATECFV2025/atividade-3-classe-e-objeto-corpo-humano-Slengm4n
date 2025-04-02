package main.java;

public class Corpo_humano {
    private  double peso;
    public double altura;
    public double IMC;

    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setIMC(double IMC){
        this.IMC = IMC;
    }

    public void calcularIMC(){
        IMC = peso/(altura*altura);
    }

    public double getIMC(){
        return this.IMC;
    }
}

