/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Sergio
 */
public class profesor extends persona{
	String str;
	int edad;
	String numeroDeTelefono;
	List<prestamo> prestamos;
	
	public profesor(String numeroDeTelefono){
		super(numeroDeTelefono);
	}
	public void printInformacionPersonal(){
		System.out.println("nombre: "  + str);
		System.out.println("edad " + edad);
		System.out.println("Telefono: " +numeroDeTelefono);
		
		}
	public void printlTodaLaInformacion(){
		System.out.println("nombre: "  + str);
		System.out.println("edad " + edad);
		System.out.println("Telefono: " +this.numeroDeTelefono);
		for(prestamo p: prestamos){
			System.out.println(p);
                }
        }
}
