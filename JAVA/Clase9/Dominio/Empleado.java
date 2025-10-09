package JAVA.Clase9.Dominio;

public class Empleado extends Persona {
    //ATRIBUTOS
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;

    //CONSTRUCTOR
    public Empleado(String nombre, double sueldo){
        super();
        //No se si sera version de java...pero no me dejaba hacer el call desde el super
        this.nombre = nombre;
        this.idEmpleado = ++Empleado.contadorEmpleados;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
}