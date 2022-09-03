package poo;

public class PruebaFiguras {
    public static void main(String args[]) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        System.out.println("El area del circulo es = " + figura1.calcularAreaC());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerimetroC());
        System.out.println();
        System.out.println("El area del rectangulo es = " + figura2.calcularAreaR());
        System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerimetroR());
        System.out.println();
        System.out.println("El area del cuadrado es = " + figura3.calcularAreaCu());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerimetroCu());
        System.out.println();
        System.out.println("El area del triangulo es = " + figura4.calcularAreaTR());
        System.out.println("El perimetro del triangulo es = " + figura4.calcularPerimetroTR());
        figura4.determinarTipoTriangulo();
    }
}
