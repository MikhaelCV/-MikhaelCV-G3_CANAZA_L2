import java.util.ArrayList;

public class Cajoneria {
    private ArrayList<Caja<?>> lista;

    public Cajoneria(int capacidad) {
        lista = new ArrayList<>(capacidad);
    }

    public void add(Caja<?> caja) {
        lista.add(caja);
    }

    public String search(Object elemento) {
        for (int i = 0; i < lista.size(); i++) {
            Caja<?> caja = lista.get(i);
            if (caja.getContenido() != null && caja.getContenido().equals(elemento)) {
                return String.format("Elemento encontrado en la posición %d, dentro de la caja de color %s.",
                        (i + 1), caja.getColor());
            }
        }
        return "Elemento no encontrado en ninguna caja.";
    }

    public Object delete(Object elemento) {
        for (int i = 0; i < lista.size(); i++) {
            Caja<?> caja = lista.get(i);
            if (caja.getContenido() != null && caja.getContenido().equals(elemento)) {
                Object eliminado = caja.getContenido();
                caja.setContenido(null); // Vaciar la caja
                return eliminado;
            }
        }
        return null; // ellemento no encontrado
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        // Encabezado
        sb.append(String.format("%-10s %-15s %-20s%n", "Posición", "Color Caja", "Objeto"));
        sb.append("----------------------------------------------------\n");

        // Contenido
        for (int i = 0; i < lista.size(); i++) {
            Caja<?> caja = lista.get(i);
            String contenido = (caja.getContenido() == null) ? "<vacío>" : caja.getContenido().toString();
            
            sb.append(String.format("%-10d %-15s %-20s%n", (i + 1), caja.getColor(), contenido));
        }
        
        return sb.toString();
    }
}
