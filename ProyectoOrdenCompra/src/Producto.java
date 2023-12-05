public class Producto {
    private String fabricante;
    private String nombre;
    private int precio;

    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
