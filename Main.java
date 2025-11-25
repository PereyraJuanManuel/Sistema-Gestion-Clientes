import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static int contadorId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Crear Cliente\n2. Leer Clientes\n3. Actualizar Cliente\n4. Eliminar Cliente\n5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    clientes.add(new Cliente(contadorId++, nombre, email));
                    System.out.println("Cliente creado.");
                    break;
                case 2:
                    for (Cliente c : clientes) {
                        System.out.println(c);
                    }
                    break;
                case 3:
                    System.out.print("ID a actualizar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    for (Cliente c : clientes) {
                        if (c.getId() == id) {
                            System.out.print("Nuevo nombre: ");
                            c.setNombre(scanner.nextLine());
                            System.out.print("Nuevo email: ");
                            c.setEmail(scanner.nextLine());
                            System.out.println("Cliente actualizado.");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("ID a eliminar: ");
                    id = scanner.nextInt();
                    clientes.removeIf(c -> c.getId() == id);
                    System.out.println("Cliente eliminado.");
                    break;
                case 5:
                    return;
            }
        }
    }
}