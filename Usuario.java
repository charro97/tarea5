package usuario;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que nos permitirá realizar operaciones para crear el nombre de usuario de los clientes.
 * Esta clase contiene los atributos de cliente.
 * @author Antonio Jiménez Cortés
 * @version 1.1
 */
public class Usuario {
	
	/**
	 * Algoritmo principal que permite ejecutar el código del programa.
	 * @param args parámetros de entrada. Es un array de Strings que debe aparecer obligatoriamente como argumento del método main en un programa Java.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		String apellido;
		String year_nacimiento;
		String nombre_usuario;

		List<String> lista_usuarios = new ArrayList<>();
		lista_usuarios.add("antoniojimenez1997");
		
		System.out.println("Introduce el nombre:");
		nombre = sc.nextLine();
		
		System.out.println("Introduce el apellido:");
		apellido = sc.nextLine();
		
		System.out.println("Introduce el año de nacimiento:");
		year_nacimiento = sc.nextLine();

		nombre_usuario = nombre_user(nombre,apellido,year_nacimiento);
		
		if (lista_usuarios.contains(nombre_usuario)) {
			while (lista_usuarios.contains(nombre_usuario)) {
				System.out.println("El usuario ya existe, vuélvelo a intentar introduciendo datos distintos");
			
				System.out.println("Introduce el nombre:");
				nombre = sc.nextLine();
			
				System.out.println("Introduce el apellido:");
				apellido = sc.nextLine();
			
				System.out.println("Introduce el año de nacimiento:");
				year_nacimiento = sc.nextLine();

				nombre_usuario = nombre_user(nombre,apellido,year_nacimiento);
			}
		}
		
		lista_usuarios.add(nombre_usuario);
		System.out.println(lista_usuarios);
	
	}
	
	/**
	 * Realiza la operación de creación de usuario recibiendo distintos parámetros.
	 * @param nombre Parámetro que indicará el nombre del cliente.
	 * @param apellido Parámtro que indicará el apellido del cliente.
	 * @param year_nacimiento Parámetro que indicará el año de nacimiento del cliente.
	 * @return Devuelve un nombre de usuario que se creado concatenando los distintos parámetros recibidos.
	 */
	public static String nombre_user(String nombre, String apellido, String year_nacimiento) {
		return  nombre + apellido + year_nacimiento;
		
	}


}