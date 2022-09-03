package poo;

public class Circulo {
	int radio; 
	
	Circulo (int radio) {
		this.radio = radio;
    }        
	double calcularAreaC() {
		return Math.PI*Math.pow(radio,2);
	}    
	double calcularPerimetroC() {
		return 2*Math.PI*radio;
	}               
}
