public class Main {
    public static void main(String[] args) {
        //Mostramos el resultado de la suma de la funcion suma
        int resultado = 0;
        resultado = suma(6,8,9);
        System.out.println(resultado);
    }

    //Definimos una función que reciba tres parámetros (números) y entregue un valor númerico(int);
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
