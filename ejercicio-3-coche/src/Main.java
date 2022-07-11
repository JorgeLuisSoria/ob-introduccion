public class Main {
    public static void main(String[] args) {
        //Mostramos el resultado de la operación de agregar puertas

        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }

    //Definimos una clase Coche
    static class Coche {
        public int puertas = 4; //Inicialización de la variable

        public void AgregarPuerta() {
            this.puertas++; //Incrementamos las puertas haciendo referencia a la variable líneas arriba
        }
    }
}
