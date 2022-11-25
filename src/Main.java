public class Main {
    public static void main(String[] args) {
        /**
         * @author Marcos Jones Pernas
         * @version 25/11/2022
         */
        int suma =0;
        double por =1;
        /**
         * Creamos las variables suma y por
         */
        for(int i=10;i<91;i++){
            suma=suma+i;
            por=por*i;
        }
        /**
         * Sumamos los numeros entre 10 y 91
         * Multiplicamos los numeros entre 10 y 91
         */
        System.out.println("Suma "+suma);
        System.out.println("Multiplicacion "+por);

    }
}