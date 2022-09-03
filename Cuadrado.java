package poo;

public class Cuadrado {
    int lado;    
    
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    double calcularAreaCu() {
        return lado*lado;
    }
    double calcularPerimetroCu() {
        return (4*lado);
    }
}
