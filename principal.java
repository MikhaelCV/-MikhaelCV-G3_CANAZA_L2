public class Principal {
    public static void main(String[] args) {
        // Crear bolsa de Chocolatinas
        Bolsa<Chocolatina> bolsaCho = new Bolsa<>(3);
        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Ferrero");
        Chocolatina c3 = new Chocolatina("Nestlé");

        bolsaCho.add(c1);
        bolsaCho.add(c2);
        bolsaCho.add(c3);

        System.out.println("Contenido de la Bolsa de Chocolatinas:");
        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }

        // Crear bolsa de Golosinas
        Bolsa<Golosina> bolsaGolosinas = new Bolsa<>(3);
        Golosina g1 = new Golosina("Caramelo", 10.5);
        Golosina g2 = new Golosina("Chicle", 5.2);
        Golosina g3 = new Golosina("Gomita", 8.3);

        bolsaGolosinas.add(g1);
        bolsaGolosinas.add(g2);
        bolsaGolosinas.add(g3);

        System.out.println("\nContenido de la Bolsa de Golosinas:");
        for (Golosina golosina : bolsaGolosinas) {
            System.out.println(golosina.getNombre() + " - " + golosina.getPeso() + "g");
        }
    }
}

/* EJERCICIO 2 
public class Principal {
    // Método genérico para mostrar el contenido de una bolsa de cualquier tipo
    public static <T> void mostrarBolsa(Bolsa<T> bolsa) {
        for (T elemento : bolsa) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        // Bolsa de Chocolatinas
        Bolsa<Chocolatina> bolsaCho = new Bolsa<>(3);
        bolsaCho.add(new Chocolatina("Milka"));
        bolsaCho.add(new Chocolatina("Ferrero"));
        bolsaCho.add(new Chocolatina("Nestlé"));

        // Bolsa de Golosinas
        Bolsa<Golosina> bolsaGol = new Bolsa<>(3);
        bolsaGol.add(new Golosina("Caramelo", 10.5));
        bolsaGol.add(new Golosina("Chicle", 5.2));
        bolsaGol.add(new Golosina("Gomita", 8.3));

        // Mostrar contenido de ambas bolsas
        System.out.println("Contenido de la bolsa de Chocolatinas:");
        mostrarBolsa(bolsaCho);

        System.out.println("\nContenido de la bolsa de Golosinas:");
        mostrarBolsa(bolsaGol);
    }
}
*/


/* EJERCICIO 3
public class Principal {
    // Método generico para mostrar el contenido de una bolsa de cualquier tipo
    public static <T> void mostrarBolsa(Bolsa<T> bolsa) {
        for (T elemento : bolsa) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        // Bolsa de Chocolatinas
        Bolsa<Chocolatina> bolsaCho = new Bolsa<>(3);
        bolsaCho.add(new Chocolatina("Milka"));
        bolsaCho.add(new Chocolatina("Ferrero"));
        bolsaCho.add(new Chocolatina("Nestlé"));

        // Bolsa de Golosinas
        Bolsa<Golosina> bolsaGol = new Bolsa<>(3);
        bolsaGol.add(new Golosina("Caramelo", 10.5));
        bolsaGol.add(new Golosina("Chicle", 5.2));
        bolsaGol.add(new Golosina("Gomita", 8.3));

        // Mostrar contenido de ambas bolsas
        System.out.println("Contenido de la bolsa de Chocolatinas:");
        mostrarBolsa(bolsaCho);

        System.out.println("\nContenido de la bolsa de Golosinas:");
        mostrarBolsa(bolsaGol);
    }
}
*/

/*EJERCICIO 4
public class Principal {
    public static void main(String[] args) {
        // Crear una cajonería con capacidad de 3 cajas
        Cajoneria cajoneria = new Cajoneria(3);

        // creMOS cajas con diferentes colores y contenidos
        Caja<String> caja1 = new Caja<>("Rojo");
        caja1.setContenido("Documentos");

        Caja<Integer> caja2 = new Caja<>("Azul");
        caja2.setContenido(100);

        Caja<Chocolatina> caja3 = new Caja<>("Verde");
        caja3.setContenido(new Chocolatina("Ferrero"));

        // agregar las cajas a la cajonería
        cajoneria.add(caja1);
        cajoneria.add(caja2);
        cajoneria.add(caja3);

        // imprimir el contenido de la cajonería antes de eliminar algo
        System.out.println("Antes de eliminar:");
        System.out.println(cajoneria);

        // Buscar un elemento
        System.out.println(cajoneria.search(100)); // Debería encontrarlo en la caja azul

        // eliminar un elemento
        Object eliminado = cajoneria.delete(100);
        System.out.println("Elemento eliminado: " + eliminado);

        // Imprimir el contenido de la cajonería después de eliminar
        System.out.println("Después de eliminar:");
        System.out.println(cajoneria);
    }
}
*/


