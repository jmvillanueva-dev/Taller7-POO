public class Main {
    public static void main(String[] args) {

        // Estudiante: Jhonny Villanueva M.
        System.out.println("Bienvenido a creando objetos con JAVA\n");

        // Primera clase: objetos sin parámetros - Gato
        Gato gato1 = new Gato();
        System.out.println("Objeto sin parámetros:");
        gato1.mostrarDatos();
        gato1.datosGato();
        gato1.hacerSonido();

        // Segunda clase: objetos con parámetros en la clase padre - Perro
        Perro perro1 = new Perro("Rayo",2,15.8,"Perro");
        System.out.println("\nObjeto con parámetros en la clase padre:");
        perro1.mostrarDatos();
        perro1.datosPerro();
        perro1.hacerSonido();

        // Tercera clase: objetos con parámetros en la clase hija - Tortuga
        Tortuga tortuga1 = new Tortuga("Marina",55.8);
        System.out.println("\nObjeto con parámetros en la clase hija:");
        tortuga1.mostrarDatos();
        tortuga1.datosTortuga();
        tortuga1.caminar();

        // Cuarta clase:  objetos con  parámetros en la clase padre e hija - Conejo
        Conejo conejo1 = new Conejo("Rodolfo",1,2,"Conejo","Cabeza de Leon",20);
        System.out.println("\nObjeto con parámetros en la clase padre e hija:");
        conejo1.mostrarDatos();
        conejo1.datosConejo();
        conejo1.saltar();

        // Quinta clase: generar objetos sin parámetros y después setearlos. - Pajaro
        Pajaro pajaro1 = new Pajaro();
        System.out.println("\nObjeto con parámetros seteados:");
        pajaro1.setTipo("Cantor ");
        pajaro1.setColorPlumaje("Café");
        pajaro1.setNombre("Piolin");
        pajaro1.setEdad(3);
        pajaro1.setPeso(0.5);
        pajaro1.setCategoria("Pajaro");
        pajaro1.mostrarDatos();
        pajaro1.datosPajaro();
        pajaro1.volar();

        // Estudiante: Jhonny Villanueva M.
    }
}