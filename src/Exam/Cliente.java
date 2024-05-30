package Exam;

    import java.util.Random;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String codigo;

    public Cliente() {}

    public Cliente(int id, String nombre, String apellido, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.codigo = generarCodigo(apellido, nombre);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String generarCodigo(String apellido, String nombre) {
        String letrasApellido = apellido.length() >= 2 ? apellido.substring(0, 2) : apellido;
        String letrasNombre = nombre.length() >= 2 ? nombre.substring(0, 2) : nombre;
        int numeroAleatorio = new Random().nextInt(900) + 100;
        return letrasApellido + letrasNombre + numeroAleatorio;
    }

    @Override
    public String toString() {
        return "Cliente [Id: " + id + ", Código: " + codigo + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Email: " + email + ", Teléfono: " + telefono + "]";
    }
}


//1. Crear la clase Cliente con los siguientes atributos: id, codigo, nombre, apellido,
//email y teléfono (se debe aplicar el encapsulamiento de las propiedades).
//2. En una nueva clase que implemente el método main, se deberá hacer el
//registro de clientes solicitando los datos al usuario, los clientes serán
//almacenados en una colección de tipo ArrayList. El programa deberá seguir
//solicitando datos de clientes hasta que el usuario decida detener el registro de
//datos.
//3. El código del cliente debe ser generado tomando las dos primeras letras del
//apellido y las dos primeras letras del nombre, a estas cuatro letras se les
//deberá concatenar un número de tres dígitos generado de manera aleatoria.
//4. Una vez que el usuario decida detener la carga de datos el programa deberá
//mostrar los empleados registrados, haciendo uso de la clase Iterator.
