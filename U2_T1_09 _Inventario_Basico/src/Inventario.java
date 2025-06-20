public class Inventario {

    private Producto[] stock;

    public Inventario(int tamaño){
        stock = new Producto[tamaño];

    }

    public boolean agregarProducto(Producto p){
        for (int u = 0; u < stock.length; u++){
            if(stock[u] == null){
                stock[u] = p;
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProducto(String codigo){
        for (int u = 0; u < stock.length; u++){
            if(stock[u] != null && stock[u].getCodigo().equals(codigo)){
                stock[u] = null;
                return true;
            }
        }
        return false;
    }

    public Producto buscar(String codigo) {
        for (int u = 0; u < stock.length; u++) {
            Producto p = stock[u];
            if (p != null && p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public int totalItems(){
        int total=0;
        for(int u = 0; u <stock.length; u++){
            if (stock[u]!=null){
                total = total +stock[u].getCantidad();
            }
        }
        return total;
    }

}
