package main.java.reproductor;

import java.util.Scanner;

public class Usuarios {

public static void main(String[] args) {
	
    String Username;
    String Password;
    Password = "fabio lima" ;
    Username = "anima" ;
   
    Scanner input1 = new Scanner(System.in);
    System.out.println("Ingrese usuario : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Ingrese contraseña :");
    String password = input2.next();
    
    
    
    if (username.equals(Username) && password.equals(Password)) {

        System.out.println("Acceso conseguido");
    }

    else if (username.equals(Username)) {
        System.out.println("Contraseña incorrecta!");
    } else if (password.equals(Password)) {
        System.out.println("Usuario Incorrecto!");
    } else {
        System.out.println("Usuario y contraseña incorrectos!");
    }

}

public void ejecutaMetodo() {
	// TODO Auto-generated method stub
	
}

public Usuarios() {
	// TODO Auto-generated method stub
	
}

public void Usuarios() {
	// TODO Auto-generated method stub
	
}

public static int nextInt() {
	// TODO Auto-generated method stub
	return 0;
}


}