public class TestGen {
    // Método genérico para buscar un elemento en un arreglo
    public static <T> boolean exist(T[] array, T elemento) {
        for (T item : array) {
            if (item.equals(elemento)) {
                return true; // Se encontró el elemento
            }
        }
        return false; // No se encontró el elemento
    }

    public static void main(String args[]) {
        // Arreglo de Strings
        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        System.out.println(exist(v, "Sanchez")); // true
        System.out.println(exist(v, "Salas")); // false

        // Arreglo de enteros
        Integer[] w = {12, 34, 56};
        System.out.println(exist(w, 34)); // true
        System.out.println(exist(w, 99)); // false

        // Prueba con objetos Golosina
        Golosina g1 = new Golosina("Caramelo", 10.5);
        Golosina g2 = new Golosina("Chicle", 5.2);
        Golosina g3 = new Golosina("Gomita", 8.3);
        Golosina[] golosinas = {g1, g2, g3};

        System.out.println(exist(golosinas, g2)); // true
        System.out.println(exist(golosinas, new Golosina("Caramelo", 10.5))); // false (no es el mismo objeto)

        // Prueba con objetos Chocolatina
        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Ferrero");
        Chocolatina c3 = new Chocolatina("Nestlé");
        Chocolatina[] chocolates = {c1, c2, c3};

        System.out.println(exist(chocolates, c2)); // true
        System.out.println(exist(chocolates, new Chocolatina("Milka"))); // false (no es el mismo objeto)
    }
}
