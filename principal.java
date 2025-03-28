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
