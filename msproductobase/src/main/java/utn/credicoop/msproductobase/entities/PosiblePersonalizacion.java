package utn.credicoop.msproductobase.entities;



import utn.credicoop.msproductobase.controllers.DTOS.AreasDePersonalizacionDTO;
import utn.credicoop.msproductobase.controllers.DTOS.PosiblePersonalizacionDTO;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name= "posible_personalizacion")

public class PosiblePersonalizacion {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "areasDePersonalizacion_id")
    private Set<AreasDePersonalizacion> areasDePersonalizacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<AreasDePersonalizacion> getAreasDePersonalizacion() {
        return areasDePersonalizacion;
    }

    public void setAreasDePersonalizacion(Set<AreasDePersonalizacion> areasDePersonalizacion) {
        this.areasDePersonalizacion = areasDePersonalizacion;
    }

    public PosiblePersonalizacion() {
    }

    public PosiblePersonalizacion(PosiblePersonalizacionDTO posiblePersonalizacionDTO) {
        this.id = posiblePersonalizacionDTO.getId();
        this.areasDePersonalizacion = posiblePersonalizacionDTO.getAreasDePersonalizacion();
    }
}
