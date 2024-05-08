
package desafio5;


public class Circulo {
    
    // Atributos
    private final double PI = 3.14;
    private double radio;


    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    // Métodos
    public double area(){
        return PI*(radio*radio);
    } 
    
    public double longitud(){
        return 2*PI*radio;
    }
    
}
