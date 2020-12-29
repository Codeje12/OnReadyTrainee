package Logica;

public class Peugeot extends Vehiculo {

    int puertas;

    public Peugeot() {
    }

    public Peugeot(int puertas, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String mostrarInfo(){
        return "Marca: " + marca + "// Modelo: " + modelo + " // Cilindradas: " + this.puertas + " // Precio:$ " + precio;
    }
    
    
}
