package main.java.reproductor;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Reproductor {
	public static void main(String[] args){ 
		
			System.out.println("Bienvenido a MusiX");
		
		int opciones;
		Scanner Usuarios = new Scanner(System.in);
		Usuarios op1=null;
		
		
		 
		System.out.println("Menu");
		System.out.println("1.- Iniciar sesión");
		System.out.println("Elija una opción: "); 
		opciones=Usuarios.nextInt();
		 
		switch(opciones) {
		case 1: 
		op1=new Usuarios ();
		op1.Usuarios();
		break;
		
		
		
		}
		int input1; 
		Scanner Username = new Scanner (System.in);
		Scanner op2=Usuarios;
		input1=Usuarios.nextInt();
		
		switch(input1) {
		case 1: 
		op1=new Usuarios ();
		op1.Usuarios();
		
		break;
		}
		}
		

		private String nombre;
		private Boolean estado;
		private Boolean repaleatoria;
		public Reproductor(String nombre, Boolean estado, Boolean repaleatoria) {

			  
			this.nombre = nombre;
			this.estado = estado;
			this.repaleatoria = repaleatoria;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Boolean getEstado() {
			return estado;
		}
		public void setEstado(Boolean estado) {
			this.estado = estado;
		}
		public Boolean getRepaleatoria() {
			return repaleatoria;
		}
		public void setRepaleatoria(Boolean repaleatoria) {
			this.repaleatoria = repaleatoria;
		}
		{
			List< String> Reproductor = new ArrayList< String>();

			Reproductor.add("Artistas");
			Reproductor.add("Canciones");
			Reproductor.add("Usuarios");
			Reproductor.add("Albums");
			
		
	          
	
			}
			
		}

