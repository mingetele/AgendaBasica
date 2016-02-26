package agendabasica;

import java.util.Scanner;

public class AgendaBasica {

    public static void main(String[] args) {
        //PersonalData Datos = new PersonalData(); almacena 1 persona
        PersonalData Datos[] = new PersonalData[100];

        Scanner lector = new Scanner(System.in);
        int opc = 0, contUs = 0;

        do {

            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Ingresar usuario");
            System.out.println("2.Actualizar usuario");
            System.out.println("3.Eliminar usuario");
            System.out.println("4.Buscar Usuario");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion");
            opc = lector.nextInt();

            switch (opc) {
                case 1:
                    if (contUs < 99) {
                        Datos[contUs] = new PersonalData();

                        System.out.print("Digite el nombre del usuario:");
                        Datos[contUs].setNombre(lector.next());
                        System.out.print("Digite el Apellido del usuario:");
                        Datos[contUs].setApellido(lector.next());
                        System.out.print("Digite la Cedula del usuario:");
                        Datos[contUs].setCedula(lector.next());
                        System.out.print("Digite La Direccion del usuario:");
                        Datos[contUs].setDireccion(lector.next());
                        System.out.print("Digite el Telefono del usuario:");
                        Datos[contUs].setTelefono(lector.next());
                        System.out.print("Digite el area");
                        Datos[contUs].setAreas(lector.next());
                        contUs++;
                        break;

                    }
                case 2:
                    System.out.println("Nombre: " + Datos[contUs].getNombre());
                    System.out.println("Apellido: " + Datos[contUs].getApellido());
                    System.out.println("Cedula: " + Datos[contUs].getCedula());
                    System.out.println("Direccion: " + Datos[contUs].getDireccion());
                    System.out.println("Telefono: " + Datos[contUs].getTelefono());
                    System.out.println("Area: " + Datos[contUs].getAreas());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                //default;
                // System.out.println("tonto");
                //break;

            }

        } while (opc != 5);

    }

}
