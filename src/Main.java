import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 7;

        System.out.println(restar(a,b,c));
    }

    public static int restar(int a,int b,int c) {
        int sumTotal = a + b + c;
        return sumTotal;
    }
    /*public static void suma(int a, int b){
  */}


//Coche miCoche = new Coche();
//miCoche.puertas();

 class  Coche{
   public int nroPuertas = 0;
    public void  puertas(){
             this.nroPuertas++;

    }
}
   /* Crear una clase coche.

        Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

        Una función que incremente el número de puertas que tiene el coche.

        Crear un objeto miCoche en el main y añadirle una puerta.

        Mostrar el número de puertas que tiene el objeto. */

//si quiero que no devuelva ningun tipo de dato utilizo el public static void