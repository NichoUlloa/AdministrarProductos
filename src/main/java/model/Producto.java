package model;

public class Producto {
    // atributos
    private String nombreProducto;
    private String idProducto;
    private TipoMarca marca;

    public Producto(String nombreProducto, String idProducto, TipoMarca marca) {
        this.nombreProducto = nombreProducto;
        this.idProducto = idProducto;
        this.marca = marca;
    }

    // getters
    public String getNombreProducto() {
        return nombreProducto;
    }
    public String getIdProducto() {
        return idProducto;
    }
    public TipoMarca getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return this.nombreProducto + ", " + this.idProducto + ", " + this.marca;
    }

}