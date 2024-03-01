package Muniemon_01;

import java.util.Scanner;

public class Main_Muniemon {
	private static Muniemon muniemon;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("---------Menú:----------");
			System.out.println("------------------------");
			System.out.println("1. Dar de alta Muniemon-");
			System.out.println("------------------------");
			System.out.println("------------------------");
			System.out.println("--2. Mostrar Muniemon---");
			System.out.println("------------------------");
			System.out.println("------------------------");
			System.out.println("-3. Salir del programa--");
			System.out.println("------------------------");
			System.out.println("----------Menú:---------");
			System.out.print("---Ingrese su opción: ----");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				darDeAltaMuniemon(scanner);
				break;
			case 2:
				mostrarMuniemon();
				break;
			case 3:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida. Intente de nuevo.");
			}
		} while (opcion != 3);
	}

	private static void darDeAltaMuniemon(Scanner scanner) {
		if (muniemon != null) {
			System.out.println("Ya hay un Muniemon registrado. No se puede agregar otro.");
			return;
		}

		String nombre = "Charmander"; // Nombre del Pokemon
		int vida = 100; // Vida inicial
		int ataque = 65; // Ataque inicial
		int defensa = 30; // Defensa inicial
		Enum_Muniemon tipo = Enum_Muniemon.FUEGO; // Tipo de Pokemon

		muniemon = new Muniemon(nombre, vida, ataque, defensa, tipo);
		System.out.println("Muniemon creado con éxito.");
	}

	private static void mostrarMuniemon() {
		if (muniemon == null) {
			System.out.println("No hay ningún Muniemon registrado.");
		} else {
			System.out.println("Detalles del Muniemon:");
			System.out.println(muniemon);
		}
	}
}
