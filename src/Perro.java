public class Perro extends Mascota
{
    private String raza;
    private boolean estaEntrenado;

    public Perro()
    {
    }

    public Perro(String nombre, int edad, double peso, String categoria)
    {
        super(nombre, edad, peso, categoria);
    }

    public void datosPerro()
    {
        System.out.println(" > Tipo: " + raza);
        System.out.println(" > ¿Tiene Entrenamiento?: " + estaEntrenado);
    }

    public void hacerSonido() {
        System.out.println("  >> Guauf, Guauf, Guauf!");
    }
}
