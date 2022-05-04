package usuario;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que nos permitir� realizar operaciones para crear el nombre de usuario de los clientes.
 * Esta clase contiene los atributos de cliente.
 * @author Antonio Jim�nez Cort�s
 * @version 1.1
 */
public class Usuario {
	
	/**
	 * Algoritmo principal que permite ejecutar el c�digo del programa.
	 * @param args par�metros de entrada. Es un array de Strings que debe aparecer obligatoriamente como argumento del m�todo main en un programa Java.
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
		
		System.out.println("Introduce el a�o de nacimiento:");
		year_nacimiento = sc.nextLine();

		nombre_usuario = nombre_user(nombre,apellido,year_nacimiento);
		
		if (lista_usuarios.contains(nombre_usuario)) {
			while (lista_usuarios.contains(nombre_usuario)) {
				System.out.println("El usuario ya existe, vu�lvelo a intentar introduciendo datos distintos");
			
				System.out.println("Introduce el nombre:");
				nombre = sc.nextLine();
			
				System.out.println("Introduce el apellido:");
				apellido = sc.nextLine();
			
				System.out.println("Introduce el a�o de nacimiento:");
				year_nacimiento = sc.nextLine();

				nombre_usuario = nombre_user(nombre,apellido,year_nacimiento);
			}
		}
		
		lista_usuarios.add(nombre_usuario);
		System.out.println(lista_usuarios);
	
	}
	
	/**
	 * Realiza la operaci�n de creaci�n de usuario recibiendo distintos par�metros.
	 * @param nombre Par�metro que indicar� el nombre del cliente.
	 * @param apellido Par�mtro que indicar� el apellido del cliente.
	 * @param year_nacimiento Par�metro que indicar� el a�o de nacimiento del cliente.
	 * @return Devuelve un nombre de usuario que se creado concatenando los distintos par�metros recibidos.
	 */
	public static String nombre_user(String nombre, String apellido, String year_nacimiento) {
		return  nombre + apellido + year_nacimiento;
		
	}


}