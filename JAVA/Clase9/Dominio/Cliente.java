package JAVA.Clase9.Dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//SEGUN IA ESTE METODO ES EL QUE SE USA ACTUALMENTE

public class Cliente extends Persona {
    // Atributos
    private static int contadorClientes;
    private int idCliente; 
    private LocalDate fechaRegistro;
    private boolean vip;

    // Formato de fecha (constante)
    private static final String FORMATO_FECHA = "dd/MM/yyyy";
    private static final DateTimeFormatter FORMATEADOR = DateTimeFormatter.ofPattern(FORMATO_FECHA);

    // Constructor
    public Cliente(String nombre, LocalDate fechaRegistro, boolean vip) {
        super();
        this.idCliente = ++contadorClientes; 
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }


    public int getIdCliente() {
        return this.idCliente;
    }


    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    public LocalDate getFechaRegistro() {
        return this.fechaRegistro;
    }


    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


    public boolean isVip() {
        return this.vip;
    }


    public void setVip(boolean vip) {
        this.vip = vip;
    }
        // Método para obtener la fecha como String formateado
    public String getFechaRegistroFormateada() {
        return fechaRegistro.format(FORMATEADOR);
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + idCliente +
                ", nombre='" + getNombre() + '\'' +
                ", fechaRegistro=" + getFechaRegistroFormateada() +
                ", vip=" + vip +
                '}';
    }

    
}