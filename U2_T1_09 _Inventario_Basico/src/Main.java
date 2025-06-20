//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario(3);

        Producto Producto1 = new Producto("001", "Coca-Cola", 3);
        inventario.agregarProducto(Producto1);

        Producto Producto2 = new Producto("002", "Pepsi", 5);
        inventario.agregarProducto(Producto2);

        Producto Producto3 = new Producto("003", "Sabritas", 6);
        inventario.agregarProducto(Producto3);

        Producto Producto4 = new Producto("004", "Pan", 8);
        System.out.println("¿Se logro agregar el producto 4?: " + inventario.agregarProducto(Producto4));

        System.out.println("Items totales en inventario: " + inventario.totalItems());

        Producto Buscado1 = inventario.buscar("004");
        System.out.println("Producto buscado: " + (Buscado1 != null ? Buscado1.getNombre() : "No se encontro"));

        boolean eliminado = inventario.eliminarProducto("001");
        System.out.println("¿Producto eliminado?: " + eliminado);

        System.out.println("Itmes totales finales: " + inventario.totalItems());
    }
}