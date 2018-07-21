
package com.mycompany.mavencursojavacalse4tarde.ensayo;

public class Main {

    public static void main(String[] args) {
        Persona persona =new Persona();
        persona.setCodigo("10");
        persona.setNombres("Juan");
        persona.setApellidos("Perez");
        //constructor de solo el codigo 
        Persona p2 = new Persona("10");
      
    }
    
}
