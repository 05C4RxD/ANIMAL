// CREAMOS NUESTRA CLASE GATO 
class Gato extends Animal{ //CON LA PALABRA RESERVADA "EXTENDS", PARA HEREDAR LOS ATRIBUTOS Y METODOS DE LA CLASE ANIMAL
    // OCULTAMOS Y DAMOS ATRIBUTOS PROPIOS
    private String raza;
    //CREAMOS EL METODO CONSTRUCTOR
    public Gato(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, edad); //CON LA PALABRAS RESERVADA "SUPER" PODEMOS OBTENER LOS ATRIBUTOS DE LA OTRA CLASE
        this.raza = raza;   // ASIGNAMOS UN ATRIBUTO PROPIOS
    }
    //CREMOS NUESTRO METODO PARA MISTRAR LA RAZA
    public void mostrarRaza(){
        System.out.println("Raza: " + getRaza());
    }
    //CREAMOS LOS METODOS GETTERS AND SETTERS PARA OBTENER Y ASIGNAR LOS VALORES DE NUESTROS ATRIBUTOS
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    // CREAMOS METODO toString PARA VER EL ESTADO DEL OBJETO
    @Override
    public String toString() {
        return "Gato [raza=" + raza + "]";
    }
}