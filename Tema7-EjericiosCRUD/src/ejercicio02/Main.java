package ejercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcion = 0;
		
		int contProductos = 0;
		
		String prodBuscado;
		
		Gestisimal productos[] = new Gestisimal[0];

		Scanner sc = new Scanner(System.in);
		
		while (opcion != 7) {
			
			System.out.println("### PRODUCTOS ###");
			System.out.println("____________________________");
			System.out.println("|                          |");
			System.out.println("| 1. Listado.              |");
			System.out.println("| 2. Alta.                 |");
			System.out.println("| 3. Baja.                 |");
			System.out.println("| 4. Modificación.         |");
			System.out.println("| 5. Entrada de mercancía. |");
			System.out.println("| 6. Salida de mercancía.  |");
			System.out.println("| 7. Salir.                |");
			System.out.println("|__________________________|");
			System.out.println();
			
			opcion = sc.nextInt();
			
			System.out.println();
			
			switch (opcion) {
			
				case 1 -> {
					
					if (productos.length != 0) {
						
						while (productos.length == 0 || productos[contProductos].equals(null)) {
							
							System.out.println(productos[contProductos].toString());
							
							contProductos++;
							
						}
						
						contProductos = 0;
						
					} else {
						
						System.out.println("La lista está vacía. No hay ningún producto.");
						System.out.println();
						
					}
					
					
					
				}
				
				case 2 -> {
						
					sc.nextLine();
					
					productos = Arrays.copyOf(productos, productos.length + 1);
					
					productos[productos.length - 1] = new Gestisimal();
					
					System.out.print("Introduzca el código del producto: ");
					productos[productos.length - 1].setCodigo(sc.nextLine());
					System.out.println();
					
					System.out.println("Introduzca una descripción: ");
					productos[productos.length - 1].setDesc(sc.nextLine());
					System.out.println();
					
					System.out.println("Introduzca un precio de compra");
					productos[productos.length - 1].setPrecioCompra(sc.nextDouble());
					System.out.println();
					
					System.out.println("Introduzca un precio de venta: ");
					productos[productos.length - 1].setPrecioVenta(sc.nextDouble());
					System.out.println();
					
					System.out.println("Introduzca el stock inicial: ");
					productos[productos.length - 1].setStock(sc.nextInt());
					System.out.println();
					
					System.out.println("*Producto añadido correctamente correctamente*");
					System.out.println();
						
				}
				
				case 3 -> {
					
					System.out.print("Introduzca el código del producto: ");
					prodBuscado = sc.nextLine();
					System.out.println();
					
					for (int i = 0; i < productos.length; i++) {
						
						if (prodBuscado.equals(productos[i].getCodigo())) {
							
							System.arraycopy(productos, i, productos, i-1, productos.length - i);
							
							productos = Arrays.copyOf(productos, productos.length + 1);
							
							System.out.println("*El producto ha sido eliminado*");
							
							break;
							
						}
						
						contProductos++;
						
					}
					
					if (contProductos == productos.length - 1) {
						
						System.out.println("*Código no encontrado*");
						System.out.println();
						
					}
					
					contProductos = 0;
					
				}
				
				case 4 -> {
					
					System.out.print("Introduzca el código del producto: ");
					prodBuscado = sc.nextLine();
					System.out.println();
					
					for (int i = 0; i < productos.length; i++) {
						
						if (prodBuscado.equals(productos[i].getCodigo())) {
							
							while (opcion != 6) {
							
								System.out.println("### MODIFICACIÓN ###");
								System.out.println("______________________");
								System.out.println("|                    |");
								System.out.println("| 1. Código.         |");
								System.out.println("| 2. Descripción.    |");
								System.out.println("| 3. Precio Compra.  |");
								System.out.println("| 4. Precio Venta.   |");
								System.out.println("| 5. Stock.          |");
								System.out.println("| 6. Salir.          |");
								System.out.println("|____________________|");
								System.out.println();
								
								opcion = sc.nextInt();
								
								switch (opcion) {
								
									case 1 -> {
										
										System.out.print("Introduzca el nuevo código del producto: ");
										productos[i].setCodigo(sc.nextLine());
										System.out.println();
										
									}
									
									case 2 -> {
										
										System.out.println("Introduzca una nueva descripción: ");
										productos[i].setDesc(sc.nextLine());
										System.out.println();
										
									}
									
									case 3 -> {
										
										System.out.println("Introduzca un nuevo precio de compra");
										productos[i].setPrecioCompra(sc.nextDouble());
										System.out.println();
										
									}
									
									case 4 -> {
										
										System.out.println("Introduzca un nuevo precio de venta: ");
										productos[i].setPrecioVenta(sc.nextDouble());
										System.out.println();
										
									}
									
									case 5 -> {
										
										System.out.println("Introduzca un nuevo stock: ");
										productos[i].setStock(sc.nextInt());
										System.out.println();
										
									}
									
									case 6 -> {
										
										System.out.println("*Saliendo*");
										
									}
									
									default -> {
										
										System.err.println("Opción no válida");
										
									}
								
								}
							
							}
								
							break;
							
						}
						
						contProductos++;
						
					}
					
					if (contProductos == productos.length - 1) {
						
						System.out.println("*Código no encontrado*");
						System.out.println();
						
					}
					
					contProductos = 0;
					
				}
				
				case 5 -> {
					
					System.out.print("Introduzca el código del producto: ");
					prodBuscado = sc.nextLine();
					System.out.println();
					
					for (int i = 0; i < productos.length; i++) {
						
						if (prodBuscado.equals(productos[i].getCodigo())) {
							
							System.out.println("Introduzca la cantidad entrante: ");
							productos[i].setStock(productos[i].getStock() + sc.nextInt());
							
							System.out.println("*Cantidad añadida al stock*");
							System.out.println();
							
							break;
							
						}
						
						contProductos++;
						
					}
					
					if (contProductos == productos.length - 1) {
						
						System.out.println("*Código no encontrado*");
						System.out.println();
						
					}
					
					contProductos = 0;
					
				}
				
				case 6 -> {
					
					System.out.print("Introduzca el código del producto: ");
					prodBuscado = sc.nextLine();
					System.out.println();
					
					for (int i = 0; i < productos.length; i++) {
						
						if (prodBuscado.equals(productos[i].getCodigo())) {
							
							System.out.println("Introduzca la cantidad saliente: ");
							productos[i].setStock(productos[i].getStock() - sc.nextInt());
							
							System.out.println("*Cantidad eliminada del stock*");
							System.out.println();
							
							break;
							
						}
						
						contProductos++;
						
					}
					
					if (contProductos == productos.length - 1) {
						
						System.out.println("*Código no encontrado*");
						System.out.println();
						
					}
					
					contProductos = 0;
					
				}
				
				case 7 -> {
					
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
