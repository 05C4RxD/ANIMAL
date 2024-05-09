class Animal{  //CREADNO NUESTRA SUPER CLASE Ó CLASE PADRE
    // OCULTAMOS Y DAMOS ATRIBUTOS
    private String nombre, alimento;
    private int edad;
    // HACEMOS NUESTRO METODO CONSTRUCTOR
    public Animal(String nombre, String alimento, int edad){
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
    }
    // CREAMOS NUESTRO METODO PARA MOSTRAR LOS RESULTADOS
    public void mostrarResultados(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Alimento: " + getAlimento());
        System.out.println("Edad: " + getEdad());
    }
    // CREAMOS METODOS GETTERS AND SETTERS PARA OBTNER Y ASIGNAR VALORES
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    // CREAMOS EL METODO toString PARA VER EL ESTADO DEL OBJETO
    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + "]";
    }
}