public class TestGenChocolatina {
    public static void main(String[] args) {
        Cajoneria cajoneria = new Cajoneria(5);

        // Crear cajas con chocolatinas
        Caja<Chocolatina> caja1 = new Caja<>("Rojo");
        caja1.setContenido(new Chocolatina("Milka", 100));

        Caja<Chocolatina> caja2 = new Caja<>("Azul");
        caja2.setContenido(new Chocolatina("Snickers", 50));

        Caja<Chocolatina> caja3 = new Caja<>("Verde");
        caja3.setContenido(new Chocolatina("KitKat", 45));

        Caja<Chocolatina> caja4 = new Caja<>("Amarillo");
        caja4.setContenido(new Chocolatina("Ferrero", 60));

        Caja<Chocolatina> caja5 = new Caja<>("Naranja");
        caja5.setContenido(new Chocolatina("Toblerone", 120));

        // Agregar cajas a la cajoneria
        cajoneria.add(caja1);
        cajoneria.add(caja2);
        cajoneria.add(caja3);
        cajoneria.add(caja4);
        cajoneria.add(caja5);

        // Imprimir el estado inicial
        System.out.println("📦 Estado inicial de la cajoneria:");
        System.out.println(cajoneria);

        // Buscar chocolatinas por marca y peso
        System.out.println("\n🔍 Buscando 'KitKat (45g)': " + cajoneria.search(new Chocolatina("KitKat", 45)));
        System.out.println("🔍 Buscando 'Snickers (50g)': " + cajoneria.search(new Chocolatina("Snickers", 50)));
        System.out.println("🔍 Buscando 'Ferrero (70g)': " + cajoneria.search(new Chocolatina("Ferrero", 70))); // No existe

        // Prueba de eliminación
        System.out.println("\n🗑 Eliminando 'Ferrero (60g)': " + cajoneria.delete(new Chocolatina("Ferrero", 60)));

        // Estado después de eliminar
        System.out.println("\n📦 Estado después de eliminación:");
        System.out.println(cajoneria);
    }
}
