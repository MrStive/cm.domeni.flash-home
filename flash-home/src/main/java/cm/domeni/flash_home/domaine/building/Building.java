package cm.domeni.flash_home.domaine.building;

import cm.domeni.flash_home.domaine.FlashHomeEntityBase;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name = "t_building")
@Getter
@Setter
@SuperBuilder
public class Building extends FlashHomeEntityBase<BuildingId> {
    @Builder.Default
    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "c_id"))
    private BuildingId id = new BuildingId();
    @Column(name = "c_name")
    private String name;
    @Column(name = "c_description")
    private String description;
    @ElementCollection(targetClass = Amenities.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "t_building_amenities",
            joinColumns = @JoinColumn(name = "c_building", referencedColumnName = "c_id")
    )
    @Column(name = "c_amenities", nullable = false)
    private List<Amenities> amenities;
    @Enumerated(EnumType.STRING)
    @Column(name = "c_storey")
    private Storey storey;
    @AttributeOverrides(
            {
                    @AttributeOverride(name = "city", column = @Column(name = "c_city")),
                    @AttributeOverride(name = "district", column = @Column(name = "c_district"))
            })
    private Address address;
}