
public class Aritmetica {
    //ATRIBUTOS DE LA CLASE
    int a;
    int b;

    //El constructor es un metodo especial
    //CONSTRUCTOR 1
    public Aritmetica(){
        System.out.println("Se esta ejecutando el constructor 1");
    }
    //CONSTRUCTOR 2
    public Aritmetica(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando el constructor 2");
    }

    //Esto es un metodo
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("El resultado es: "+ resultado);
    }
    //Metodo con Retorno
    public int sumarConRetorno(){
        return this.a + this.b;
    }

    //Metodo con argumentos
    public int sumarConArgumentos(int a,int b){
        this.a = a;
        this.b = b;
        //return a + b;

        //Metodo anidado
        return sumarConRetorno();

    }
}
