package eva3_3_captura;
import java.util.Scanner;
public class EVA3_3_CAPTURA {
    
    public static void main(String[] args) {
        String nombre = capturarTexto("Introduce tu nombre: ");
        String apellido = capturarTexto("Introduce tu apellido: ");
        double paga = capturarDouble("Introduce tu salario: ");
        int edad = capturarNumero("Introduce tu edad: ");    
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + paga);
    }
    public static String capturarTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        String texto = captu.nextLine();
        return texto;
    }
    public static int capturarNumero(String digito){
        Scanner captu = new Scanner(System.in);
        System.out.println(digito);
        int numero = captu.nextInt();
        return numero;
    }
    public static double capturarDouble(String doble){
        Scanner captu = new Scanner(System.in);
        System.out.println(doble);
        double salario = captu.nextDouble();
        return salario;
    }
}