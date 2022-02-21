import java.util.ArrayList;
public class TestPedidos {
    public static void main(String[] args){
        // Elementos del menú
        Articulo articulo1 = new Articulo();
        articulo1.nombre = "Moka";
        articulo1.precio = 5.00;
        Articulo articulo2 = new Articulo();
        articulo2.nombre = "Latte";
        articulo2.precio = 6.00;
        Articulo articulo3 = new Articulo();
        articulo3.nombre = "Cafe de goteo";
        articulo3.precio = 4.00;
        Articulo articulo4 = new Articulo();
        articulo4.nombre = "Capuchino";
        articulo4.precio = 3.00;
        //Ordenar variables -- orden1, orden2, etc.
        Pedido pedido1 = new Pedido();
        pedido1.nombre = "Cindhuri";
        pedido1.listo = true;
        Pedido pedido2 = new Pedido();
        pedido2.nombre = "Jimmy";
        pedido2.items.add(articulo1);
        pedido2.total  = articulo1.precio;
        pedido2.listo = true;
        Pedido pedido3 = new Pedido();
        pedido3.nombre = "Noah";
        pedido3.items.add(articulo4);
        Pedido pedido4 = new Pedido();
        pedido4.nombre = "Sam";
        pedido4.items.add(articulo2);
        pedido4.items.add(articulo2);
        // Simulaciones de aplicaciones
        System.out.println(pedido1);
        System.out.println(pedido1.total);
        System.out.println(pedido2.items);
        System.out.println(pedido2.total);
        // Utiliza este código de ejemplo para probar las actualizaciones de varios pedidos
        System.out.printf("Nombre: %s\n", pedido1.nombre);
        System.out.printf("Total: %s\n", pedido1.total);
        System.out.printf("Listo: %s\n", pedido1.listo);
    }
}
