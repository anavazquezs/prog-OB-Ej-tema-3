

public class openBootcampEjercicio1 {
    
    
    public static void main(String[] args) {
        
        //Llamar a la función en el main y darle valores.
        int resultado = suma(2, 3, 5);
        System.out.println("El resultado de la suma es " + resultado);
        
        //Crear un objeto miCoche en el main
        Coche miCoche = new Coche();
        //Añadirle una puerta.
        miCoche.incrementarPuertas();
        //Mostrar el número de puertas que tiene el objeto.
        System.out.println("La cantidad de puertas del coche es " + miCoche.numeroDePuertas);
    }
    
// Crear una función con tres parámetros que sean números que se suman entre sí.
    public static int suma(int a, int b, int c) {
        return c + a + b;
    };
};

//Crear una clase coche.
class Coche {
//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    int numeroDePuertas = 0;
    
    //Una función que incremente el número de puertas que tiene el coche.
    public int incrementarPuertas() {
       return numeroDePuertas = numeroDePuertas + 1;
    };
};