package cm.domeni.flash_home.domaine.building;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "t_amenities")
public class Amenities {
    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "c_id"))
    private AmenitiesId id = new AmenitiesId();
    @Column(name = "c_name")
    private String name;
    @Column(name = "c_description")
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(name = "c_type")
    private AmenityType type;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "c_building", referencedColumnName = "c_id")
    private Building building;
}
