public class Funcion {
    public static void main(String[] args) {
        System.out.println("El precio con iva incluido es: " + getPrice(100));
    }
    static double getPrice(double price){
        return 100 + (price * 0.21);
    }
}
