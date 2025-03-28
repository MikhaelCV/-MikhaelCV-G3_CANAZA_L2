public class Chocolatina {
    private String marca;

    public Chocolatina(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Chocolatina: " + marca;
    }
}

/*EJERCICIO 6
public class Chocolatina {
    private String marca;
    private double peso; // en gramos

    public Chocolatina(String marca, double peso) {
        this.marca = marca;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Chocolatina that = (Chocolatina) obj;
        return Double.compare(that.peso, peso) == 0 && marca.equalsIgnoreCase(that.marca);
    }

    @Override
    public String toString() {
        return marca + " (" + peso + "g)";
    }
}
*/

    

