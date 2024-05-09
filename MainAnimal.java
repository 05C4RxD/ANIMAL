import java.util.Scanner; //IMPORTAMOS LA LIBRERIA SCANNER PARA LEER EL DATOS INGRESADOS
class MainAnimal{ //CREAMOS NUESTRA CLASE MinAnimal
    //CREAMOS EL METODO MAIN PARA EJECUTAR EL PROGRAMA SIN ERRORES
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //DECLARAMOS LAS VAREABLES
        String nombre, alimento, raza, ani;
        int edad;
        //PREGUNTAMOS AL USUARIO ¿QUÉ MASCOTA TIENE?
        System.out.println("¿QUÉ MASCOTA TIENES?");
        ani = scan.nextLine(); //GUARDAMOS EL DATO EN LA VAREABLE "AMI"

        //PEDIMOS Y GUARDAMOS DATOS REQUERIDOS
        System.out.print("INGRESA EL NOMBRE DE TU MASCOTA: ");
        nombre = scan.nextLine();
        System.out.print("INGRESA LA RAZA DE TU MASCOTA: ");
        raza = scan.nextLine();
        System.out.print("INGRESA EL ALIMENTO DE TU MASCOTA: ");
        alimento = scan.nextLine();
        System.out.print("INGRESA LA EDAD DE TU MACOTA: ");
        edad = scan.nextInt();

        //CREAMOS OBJETOS DE LAS CLASES ANIMAL, GATO Y PERRO PARA GUARDAR LOS DATOS INGRESADOS
        Animal animal = new Animal(nombre, alimento, edad);
        Gato gato = new Gato(nombre, alimento, raza, edad);
        Perro perro = new Perro(nombre, alimento, raza, edad);

        //MANDAMOS A LLAMAR LA FUNACIÓN "mostrarResultados()" PARA MOSTRAR LOS RESULTADOS DESDE LA CLASE ANIMAL
        animal.mostrarResultados();

        //COMPARAMOS LA VAREABLE "AMI" CON LAS PALABRAS PERRO Y GATO PARA SABER QUE MASCOTA TIENE
        if(ani.equals("perro")){
            perro.mostrar1Raza();
        }else {
            gato.mostrarRaza();
        }

    } 
}