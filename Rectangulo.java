package poo;

public class Rectangulo {
    int base;
    int altura;
    
    Rectangulo (int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcularAreaR() {
        return base * altura;
    }
    double calcularPerimetroR() {
        return (2 * base) + (2 * altura);
    }
}