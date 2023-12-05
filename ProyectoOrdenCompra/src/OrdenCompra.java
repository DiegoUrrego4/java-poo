import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private static int ultimoId;
    public int indiceProductos;

    public OrdenCompra() {
        this.id = ++ultimoId; // id auto incremental
        this.productos = new Producto[4];
    }

    public OrdenCompra(String descripcion) {
        this();
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public OrdenCompra addProducto(Producto producto) {
        if (indiceProductos < this.productos.length) {
            productos[indiceProductos++] = producto;
        }
        return this;
    }

    public String mostrarTotal() {
        int suma = 0;
        for (Producto producto : productos) {
            suma += producto.getPrecio();
        }
        return "El precio total de la orden es: $" + suma + " Pesos";
    }

    // TODO: Borrar este método
    @Override
    public String toString() {
        String detalleOrden = "OrdenCompra{\n" +
                "id=" + id +
                ", \ndescripcion='" + descripcion + '\'' +
                ", \nfecha=" + fecha +
                ", \ncliente=" + this.cliente.getNombre() + " " + this.cliente.getApellido() +
                ", \nProductos: {";

        for (Producto producto : this.productos) {
            detalleOrden += "\n Articulo: " + producto.getNombre() + ", Marca: " + producto.getFabricante() + ", $" + producto.getPrecio();
        }

        detalleOrden += "\n} \n}";
        return detalleOrden;
    }
}
