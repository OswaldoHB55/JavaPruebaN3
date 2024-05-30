package Exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExamMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        int id = 1;
        String resp;

        do {
            Cliente cliente = new Cliente();
            cliente.setId(id++);
            System.out.println("Ingrese nombre");
            cliente.setNombre(sc.nextLine());
            System.out.println("Ingrese apellido");
            cliente.setApellido(sc.nextLine());
            System.out.println("Ingrese su email");
            cliente.setEmail(sc.nextLine());
            System.out.println("Ingrese su número telefónico");
            cliente.setTelefono(sc.nextLine());
            cliente.setCodigo(cliente.generarCodigo(cliente.getApellido(), cliente.getNombre()));

            clientes.add(cliente);
            System.out.println("¿Desea ingresar otro cliente? S/N");
            resp = sc.next().toLowerCase();
            sc.nextLine();

            System.out.println();
        } while (resp.equals("s"));

        Iterator<Cliente> it = clientes.iterator();
        System.out.println("Clientes registrados");
        while (it.hasNext()) {
            Cliente cliente1 = it.next();
            System.out.println(cliente1);
            System.out.println();
        }
    }
}
