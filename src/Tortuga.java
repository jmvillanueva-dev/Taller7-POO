public class Tortuga extends Mascota
{
    private String tipo;
    private double tamanoCaparazon;

    public Tortuga(String tipo, double tamanoCaparazon)
    {
        this.tipo = tipo;
        this.tamanoCaparazon = tamanoCaparazon;
    }

    public void datosTortuga()
    {
        System.out.println(" > Tipo: " + tipo);
        System.out.println(" > Tamano Caparazon: " + tamanoCaparazon);
    }

    public void caminar() {
        System.out.println("  >> La tortuga inicia la caminata...");
    }
}
