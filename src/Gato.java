public class Gato extends Mascota
{
    private String raza;
    private String color;

    public Gato()
    {
    }

    public void datosGato()
    {
        System.out.println(" > Tipo: " + raza);
        System.out.println(" > Color: " + color);
    }

    public void hacerSonido() {
        System.out.println("  >> Miau, miau, miua!");
    }
}
