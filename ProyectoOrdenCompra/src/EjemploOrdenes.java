import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Jorge", "Español");
        OrdenCompra orden1 =  new OrdenCompra("Factura No. 1");
        orden1.setCliente(cliente1);
        orden1.setFecha(new Date());
        orden1.addProducto(new Producto("The North Face", "Chaqueta winter", 1700000))
                .addProducto(new Producto("Vans", "Vans blue", 380000))
                .addProducto(new Producto("MNG", "Suéter Verde", 120000))
                .addProducto(new Producto("Columbia", "Chaleco", 235000));
        System.out.println(orden1);
        System.out.println(orden1.mostrarTotal());
        System.out.println();

        Cliente cliente2 = new Cliente("Jennyfer", "Salcedo") ;
        OrdenCompra orden2 = new OrdenCompra("Factura No.2");
        orden2.setCliente(cliente2);
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("Keychron", "Keyboard K2", 620000 ))
                .addProducto(new Producto("Asus", "Asus X415J", 1200000))
                .addProducto(new Producto("Razer", "Wireless Airpods", 473000))
                .addProducto(new Producto("Apple", "Apple Pencil", 670000));
        System.out.println(orden2);
        System.out.println(orden2.mostrarTotal());
        System.out.println();

        Cliente cliente3 = new Cliente("Diego", "Urrego") ;
        OrdenCompra orden3 = new OrdenCompra("Factura No.3");
        orden3.setCliente(cliente3);
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Apple", "Apple Magic Keyboard", 964000 ))
                .addProducto(new Producto("Apple", "Airpods Max", 2600000))
                .addProducto(new Producto("Razer", "Gamer wheelchair", 781000))
                .addProducto(new Producto("Mokin", "USB-C adapter", 120000));
        System.out.println(orden3);
        System.out.println(orden3.mostrarTotal());
        System.out.println();


    }
}
