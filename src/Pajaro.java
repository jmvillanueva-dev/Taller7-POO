public class Pajaro extends Mascota
{
    private String tipo;
    private String colorPlumaje;

    public Pajaro() {
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public void datosPajaro()
    {
        System.out.println(" > Tipo: " + tipo);
        System.out.println(" > Color: " + colorPlumaje);
    }

    public void volar() {
        System.out.println("  >> El pajaro ha iniciado su vuelo!");
    }
}
