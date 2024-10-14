package cm.domeni.flash_home.domaine.building;

import cm.domeni.flash_home.domaine.FlashHomeEntityBase;
import cm.domeni.flash_home.domaine.storey.HousingUnit;
import cm.domeni.flash_home.domaine.storey.HousingUnitId;
import cm.domeni.flash_home.domaine.storey.Storey;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "t_building")
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Building extends FlashHomeEntityBase<BuildingId> {
    @Builder.Default
    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "c_id"))
    private BuildingId id = new BuildingId();
    @Column(name = "c_name")
    private String name;
    @Column(name = "c_description")
    private String description;
    @OneToMany(mappedBy = "building", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, targetEntity = Building.class)
    private List<Amenities> amenities;
    @OneToMany(fetch = FetchType.LAZY)
    private Set<Storey> storey = new HashSet<>();
    @Embedded
    private Address address;
    @Embedded
    private Modality modality;
    @CollectionTable
    @AssociationOverrides(

    )
    private Set<HousingUnitId> housingUnits = new HashSet<>();
}