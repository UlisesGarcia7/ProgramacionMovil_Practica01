/*
    Alumno: García Garzón Ulises Enrique
    Matricula: 2019030286
    Grupo: Clase "Boletos"
 */
package Practica01;

public class Boletos {
    // Atributos
    private int numBoleto;
    private String nomCliente;
    private String destino;
    private int tipoViaje;
    private double precio;
    private String fecha;
    
    // Constructores
    
    // Constructor Vacio
    public Boletos(){
        this.numBoleto = 0;
        this.nomCliente = "";
        this.destino = "";
        this.tipoViaje = 0;
        this.precio = 0.0;
        this.fecha = "";
    }
    
    // Constructor de Parametros
    public Boletos(int numBoleto, String nomCliente, String destino, int tipoViaje, double precio, String fecha){
        this.numBoleto = numBoleto;
        this.nomCliente = nomCliente;
        this.destino = destino;
        this.tipoViaje = tipoViaje;
        this.precio = precio;
        this.fecha = fecha;
    }
    
    // Constructor Vacio
    public Boletos(Boletos boletos){
        this.numBoleto = boletos.numBoleto;
        this.nomCliente = boletos.nomCliente;
        this.destino = boletos.destino;
        this.tipoViaje = boletos.tipoViaje;
        this.precio = boletos.precio;
        this.fecha = boletos.fecha;
    }
    
    // Encapsulamiento

    /**
     * @return the numBoleto
     */
    public int getNumBoleto() {
        return numBoleto;
    }

    /**
     * @param numBoleto the numBoleto to set
     */
    public void setNumBoleto(int numBoleto) {
        this.numBoleto = numBoleto;
    }

    /**
     * @return the nomCliente
     */
    public String getNomCliente() {
        return nomCliente;
    }

    /**
     * @param nomCliente the nomCliente to set
     */
    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the tipoViaje
     */
    public int getTipoViaje() {
        return tipoViaje;
    }

    /**
     * @param tipoViaje the tipoViaje to set
     */
    public void setTipoViaje(int tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public double calcularSubTotal(){
    double subTotal = 0.0;    
        if(this.tipoViaje==1){ subTotal = this.precio; }
        else if(this.tipoViaje==2){ subTotal = this.precio * 1.80; }
        return subTotal;
    }
    
    public double calcularImpuesto(){
    double impuesto = 0.0;
        impuesto = this.calcularSubTotal() * 0.16;
        return impuesto;
    }
    
    public double calcularDescuento(int edad){
    double descuento = 0.0;
        if(edad>=60){ descuento = this.calcularSubTotal() * 0.50; }
        return descuento;
    }
    
    public double calcularTotal(int edad){
    double total = 0.0;
        total = this.calcularSubTotal() + this.calcularImpuesto() - this.calcularDescuento(edad);
        return total;
    }
}
