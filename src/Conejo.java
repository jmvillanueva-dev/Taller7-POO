public class Conejo extends Mascota
{
    private String tipo;
    private int altura;

    public Conejo(String nombre, int edad, double peso, String categoria, String tipo, int altura)
    {
        super(nombre, edad, peso, categoria);
        this.tipo = tipo;
        this.altura = altura;
    }

    public void datosConejo()
    {
        System.out.println(" > Tipo: " + tipo);
        System.out.println(" > Altura: " + altura);
    }

    public void saltar() {
        System.out.println("  >> He dado un salto!");
    }

}
