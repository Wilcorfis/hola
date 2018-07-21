
package com.mycompany.mavencursojavacalse4tarde.ensayo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data//setter  los getters tostring -hachcodeequals
@AllArgsConstructor // cpnstructor con todos los argumentos
@NoArgsConstructor//constructor vacio 
@RequiredArgsConstructor // constructor con algunos argumentos
public class Persona {
    
    @NonNull @EqualsAndHashCode.Include 
    private String codigo;
    @EqualsAndHashCode.Exclude //excluirlos del hascode y equals
    private String nombres,apellidos;
    
            
    
}
