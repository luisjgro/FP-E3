package eva3_2_valor_retorno;

public class EVA3_2_VALOR_RETORNO {

    public static void main(String[] args) {
        int resu;
        resu = sumarDosNumeros(5, 10);
        System.out.println("Resultado = " + resu);
        System.out.println("Resultado = " + sumarDosNumeros(100, 200));
        
    }
    
    public static int sumarDosNumeros(int num1, int num2){
        return num1 + num2;
    }
    
    
}
