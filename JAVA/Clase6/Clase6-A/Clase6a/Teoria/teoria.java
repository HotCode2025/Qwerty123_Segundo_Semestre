
public class teoria {
    public static void main(String[] args) {
        var valorX = 20;
        System.out.println("valorX = "+ valorX);
        cambioValor(valorX);
        
    }

    // ESTO ES PARAMETRO POR VALOR
    public static void cambioValor(int args1){
        System.out.println("args1 = " + args1);
        args1 = 15;
    }
}
