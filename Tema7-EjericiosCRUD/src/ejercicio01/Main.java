package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcion = 0;
		
		int contAlumnos = 0;
		
		String alumnoBuscado;
		
		Alumno alumnos[] = new Alumno[30];

		Scanner sc = new Scanner(System.in);
		
		while (opcion != 5) {
			
			System.out.println("### ALUMNOS/AS ###");
			System.out.println("_____________________");
			System.out.println("|                   |");
			System.out.println("| 1. Listado.       |");
			System.out.println("| 2. nuevo Alumno.  |");
			System.out.println("| 3. Modificar.     |");
			System.out.println("| 4. Borrar.        |");
			System.out.println("| 5. Salir          |");
			System.out.println("|___________________|");
			System.out.println();
			
			opcion = sc.nextInt();
			
			System.out.println();
			
			switch (opcion) {
			
				case 1 -> {
					
					for (int i = 0; i < alumnos.length; i++) {
						
						if (alumnos[i] == null) {
							
							break;
							
						}
						
						System.out.println(alumnos[i].toString());
						System.out.println();
						
					}
					
				}
				
				case 2 -> {
					
					for (int i = 0; i < alumnos.length; i++) {
						
						if (alumnos[i].equals(alumnos[i].getNombre())) {
							
							alumnos[i].setNombre(sc.nextLine());
						
							break;
							
						}
						
					}
					
				}
				
				case 3 -> {
					
					System.out.print("Introduzca el nombre del alumno: ");
					
					alumnoBuscado = sc.nextLine();
					
					System.out.println();
					
					for (int i = 0; i < alumnos.length; i++) {
						
						if (alumnoBuscado.equalsIgnoreCase(alumnos[i].nombre)) {
							
							System.out.print("Introduzca su nota: ");

							alumnos[i].setNotaMedia(sc.nextInt());
							
							System.out.println();
							
							break;
							
						} 
						
					}
					
					if (contAlumnos == alumnos.length) {
						
						System.out.println("*Nombre no encontrado*");
						System.out.println();
						
					}
					
				}
				
				case 4 -> {
					
					System.out.print("Introduzca el nombre del alumno: ");
					
					alumnoBuscado = sc.nextLine();
					
					System.out.println();
					
					for (int i = 0; i < alumnos.length; i++) {
						
						if (alumnoBuscado.equalsIgnoreCase(alumnos[i].nombre)) {
							
							alumnos[i] = null;
							
							System.out.println("*Alumno eliminado*");
							System.out.println();
							
							break;
							
						} 
						
					}
					
					if (contAlumnos == alumnos.length) {
						
						System.out.println("*Nombre no encontrado*");
						System.out.println();
						
					}
					
				}
				
				case 5 -> {
					
					System.out.println("*Saliendo del programa*");
					
				}
				
				default -> {
					
					System.err.println("Opción inválida");
					
				}
			
			}
			
		}
		
		sc.close();
		
	}

}
