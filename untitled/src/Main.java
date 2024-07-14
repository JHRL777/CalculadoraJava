import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



        Listas  listado = new Listas();
        listado.setEdad(20);
        listado.setNombre("Jhonatan");
        listado.setUbicacion("Bogota");

        List<Listas> obLista = new ArrayList<>();

        obLista.add(listado);
        obLista.add(listado);
        obLista.add(listado);






        Scanner iniciodato = new Scanner(System.in);
        String inicio = "SI";

        while (inicio.equals("SI")) {
            System.out.println("Calculadora");
            System.out.println("-----------------------------------------");

            // Ingreso de números
            System.out.println("Ingrese un numero 1: ");
            int num1 = obtenerNumeroValido(iniciodato);

            System.out.println("Ingrese un numero 2: ");
            int num2 = obtenerNumeroValido(iniciodato);

            // Operaciones
            Calculadora calculador = new Calculadora();
            calculador.setNum1(num1);
            calculador.setNum2(num2);

            String suboperacion = "SI";
            while (suboperacion.equals("SI")) {
                System.out.println("-----------------------------------------");
                System.out.println("Tipo operacion");
                System.out.println("[+] Suma");
                System.out.println("[-] Resta");
                System.out.println("[*] Multiplicacion");
                String operacion = iniciodato.nextLine();
                calculador.setTipo(operacion);


                        System.out.println("--------------RESULTADO------------------");
                        System.out.println(calculador.sigosCalculadora());



                System.out.println("-----------------------------------------");
                System.out.println("Presione 'SI' para continuar con otra operacion, cualquier otra tecla para terminar.");
                suboperacion = iniciodato.nextLine();
            }

            System.out.println("-----------------------------------------");
            System.out.println("Presione 'SI' para continuar, cualquier otra tecla para terminar.");
            inicio = iniciodato.nextLine();
        }
    }

    // Método para obtener un número válido desde el usuario
    private static int obtenerNumeroValido(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }
}