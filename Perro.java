//CREAMOS NUESTRA CLASE PERRO
class Perro extends Animal{//CON LA PALABRA RESERVADA "ETENDS" PARA HEREDAR LOS METODOS Y ATRIBUTOS DE LA CLASE ANIMAL
    //OCULTAMOS Y DAMOS ATRIBUTOS PROPIOS
    private String raza; 
    //METODO CONSTRUCTOR
    public Perro(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, edad); //CON LA PALABRA RESERVADA "SUPER", HEREDAMOS LOS ATRIBUTOS DE LA CLASE ANMAL
        this.raza = raza; //ASIGNAMOS EL ATRIBUTO PROPIO
    }
    //CREAMOS METODO CONSTRUCTOR PARA MOSTRAR RAZA
    public void mostrar1Raza(){
        System.out.println("Raza: " + getRaza());
    }
    //CREAMOS METODOS GETTERS AND SETTERS PARA OBTENER Y ASIGNAR LOS VALORES DE NUESTROS ATRIBUTOS
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //CREAMOS METODO toString PARA VER EL ESTADO DE NUETRO OBJETO
    @Override
    public String toString() {
        return "Perro [raza=" + raza + "]";
    }
}