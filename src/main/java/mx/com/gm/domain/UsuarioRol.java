package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UsuarioRol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario_rol;
     
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    Usuario id_usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_rol")
    Rol id_rol;
}
