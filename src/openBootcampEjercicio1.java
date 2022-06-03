

public class openBootcampEjercicio1 {
    
    
    public static void main(String[] args) {
        int resultado = suma(2, 3, 5);
        System.out.println("El resultado de la suma es " + resultado);
        
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("La cantidad de puertas del coche es " + miCoche.numeroDePuertas);
    }
    
    public static int suma(int a, int b, int c) {
        return c + a + b;
    };
};

class Coche {
    int numeroDePuertas = 0;
    
    public int incrementarPuertas() {
       return numeroDePuertas = numeroDePuertas + 1;
    };
};