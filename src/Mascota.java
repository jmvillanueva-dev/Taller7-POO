public class Mascota
{
    private String nombre;
    private int edad;
    private double peso;
    private String categoria;

    public Mascota() {
    }

    public Mascota(String nombre, int edad, double peso, String categoria)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrarDatos()
    {
        System.out.println("Datos de la mascota");
        System.out.println(" > Nombre: " + getNombre());
        System.out.println(" > Edad: " + getEdad());
        System.out.println(" > Peso: " + getPeso());
        System.out.println(" > Categoria: " + getCategoria());
    }
}
