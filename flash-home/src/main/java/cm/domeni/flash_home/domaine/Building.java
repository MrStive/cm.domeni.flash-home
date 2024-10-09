package cm.domeni.flash_home.domaine;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;

@Builder
@Entity
@Table(name = "t_building")
public class Building {
    @Builder.Default
    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "c_id"))
    private  BuildingId id = new BuildingId();
    @Column(name = "c_name")
    private String name;
    @Column(name = "c_description")
    private String description;
    @AttributeOverride(name = "value", column = @Column(name = "c_id"))
    @AttributeOverride(name = "value", column = @Column(name = "c_id"))
    private Amenities storey;
    private Address address;
}
