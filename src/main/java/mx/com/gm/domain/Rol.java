package mx.com.gm.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table (name="rol")
public class Rol implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rol;
    
    @NotEmpty
    private String nombre;
    
    @OneToMany(mappedBy = "id_rol")
    Set<UsuarioRol> usuario_rol;
}
