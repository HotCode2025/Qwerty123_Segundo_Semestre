
public class pruebaAritmetica {
    public static void main(String[] args) {
        var a = 10;//Variables Locales
        int b = 7;//Memoria Stack
        miMetodo();
        //Los atributos tienen un alcance superior a una variable local

        //Objeto 1
        //Los objetos se almacenan en la memoria heappubl
        Aritmetica aritmetica1 = new Aritmetica();// De esta forma llamamos a un metodo en java
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();

        //llamamos al metodo con retorno
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("El resultado es: "+ resultado);


        //Lamado al metodo con argumento
        resultado = aritmetica1.sumarConArgumentos(5, 23);
        System.out.println("Metodo con argumento :" + resultado);
        System.out.println("aritmetica1 a = "+aritmetica1.a);
        System.out.println("aritmetica1 a = "+aritmetica1.b);


        //Creamos otro objeto
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a = "+ aritmetica2.a);
        System.out.println("aritmetica2 b ="+ aritmetica2.b);

    }

    public static void miMetodo(){
        //int a = 10;
        System.out.println("Aqui hay otro metodo");
    }
}
