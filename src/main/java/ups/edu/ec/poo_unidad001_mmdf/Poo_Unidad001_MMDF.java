/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.edu.ec.poo_unidad001_mmdf;

/**
 *
 * @author DELL
 */
public class Poo_Unidad001_MMDF {

    public static void main(String[] args) {
        
        var nissan1 = new Carro();
        nissan1.marca="Gtr";
       
        nissan1.motor="V6 biturbo de 3.8 litros con 600hp y 650Nm ";
        
        nissan1.año="2021";
        
        nissan1.peso="1.570kg";
        
        System.out.println("La marca del carro es: "+nissan1.marca+" El motor del carro es: "+nissan1.motor+" El año del carro es: "+nissan1.año+" El peso del carro es: "+nissan1.peso);
                
        var toyota = new Carro();
        toyota.marca="Supra";
       
        toyota.motor="2.0 de 3.0 litros";
        
        toyota.año="2021";
        
        toyota.peso="1.800kg";
        
        System.out.println("La marca del carro es: "+toyota.marca+"El motor del carro es: "+toyota.motor+" El año del carro es: "+toyota.año+" El peso del carro es: "+toyota.peso);
                
        var estudiante1 = new Estudiante();
        estudiante1.nombre="Juan Perez";
       
        estudiante1.carrera="Biomedicina";
        
        estudiante1.calificacion="80";
        
        estudiante1.altura="1.80cm";
        
        System.out.println("El nombre del estudiantes es: "+estudiante1.nombre+" La carrera del estudiante es: "+estudiante1.carrera+" La calificacion del estudiante es: "+estudiante1.calificacion+" La altura del estudiante es: "+estudiante1.altura);
        
        var estudiante2 = new Estudiante();
        estudiante2.nombre="Pepe peñas";
       
        estudiante2.carrera="Telecomunicaciones";
        
        estudiante2.calificacion="85";
        
        estudiante2.altura="1.85cm";
        
        System.out.println("El nombre del estudiantes es: "+estudiante2.nombre+" La carrera del estudiante es: "+estudiante2.carrera+" La calificacion del estudiante es: "+estudiante2.calificacion+" La altura del estudiante es: "+estudiante2.altura);
        
        var hp = new Computadora();
        hp.modelo="ohmen";
        
        hp.grafica="Rtx 3050";
        
        hp.memoria="120GB";
      
        hp.espacio="2 Tera";
        
        System.out.println("El modelo de la computadora es: "+hp.modelo+" La grafica es: "+hp.grafica+" La memoria es: "+hp.memoria+" El espacio es: "+hp.espacio);
        
        var moto1 = new Moto();
        moto1.color="Verde y Negro";
      
        moto1.modelo="Ninja";
     
        moto1.precio="3.500";

        moto1.motor="998cc";
        
        System.out.println("El color de la moto es: "+moto1.color+" El modelo es: "+moto1.modelo+" El precio es: "+moto1.precio+" El motor es: "+moto1.motor);
                
        var moto2 = new Moto();
        moto2.color="Blanco y Rojo";
      
        moto2.modelo="Ducati";
     
        moto2.precio="4.500";

        moto2.motor="1000cc";
        
        System.out.println("El color de la moto es: "+moto2.color+" El modelo es: "+moto2.modelo+" El precio es: "+moto2.precio+" El motor es: "+moto2.motor);
                
        var producto1 = new Producto();
        producto1.descripcion="Grande";
  
        producto1.precio="45";
        
        producto1.codigo="564861";
  
        producto1.peso="10kg";
        
        System.out.println("La descripcion del producto es: "+producto1.descripcion+" El precio es: "+producto1.precio+" El codigo es: "+producto1.codigo+" El peso es: "+producto1.peso);
        
        var producto2 = new Producto();
        producto2.descripcion="Mediano";
  
        producto2.precio="25";
        
        producto2.codigo="874785";
  
        producto2.peso="6kg";
        
        System.out.println("La descripcion del producto es: " + producto2.descripcion + " El precio es: " + producto2.precio + " El codigo es: " + producto2.codigo + " El peso es: " + producto2.peso);
        
    }
}
