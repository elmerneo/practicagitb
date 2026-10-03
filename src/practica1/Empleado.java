/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;
// <Parte 1 Definir la clase  y el encapsulado
public class Empleado {
   // Paso 2: Definir las variales globales
String nombre;
int edad;
String dpi;
Double salario;
   // Paso 3: Definir el constructor sin parametros
   public Empleado(){
   this.nombre= "";
   this.edad = 0;
   this.dpi = "";
   this.salario = 0.0;
   } 
   public Empleado(String nombre,int edad,
           String dpi, Double salario){
   this.nombre = nombre;
   this.edad = edad;
   this.dpi = dpi;
   this.salario = 0.0;
   }
   //Paso 4:  Metodo Get y Metodo SEt
   
   public String getNombre(){
   return this.nombre;
   }
   public void setNombre(String nombre){
   this.nombre = nombre;
   }
   
   
   
   
   
   
   
   
   
   
   
   

}
