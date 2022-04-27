package usuario;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Usuario {
	
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
	
	public static String nombre_user(String nombre, String apellido, String year_nacimiento) {
		return  nombre + apellido + year_nacimiento;
		
	}


}