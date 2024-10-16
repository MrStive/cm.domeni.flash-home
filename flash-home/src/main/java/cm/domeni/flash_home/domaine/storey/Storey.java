package cm.domeni.flash_home.domaine.storey;

import cm.domeni.flash_home.domaine.FlashHomeEntityBase;
import cm.domeni.flash_home.domaine.building.BuildingId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_storey")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Storey extends FlashHomeEntityBase<StoreyId> {
    @Builder.Default
    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "c_id"))
    private StoreyId id = new StoreyId();
    @Column(name = "c_name")
    private String name;
    @AttributeOverride(name = "value", column = @Column(name = "c_building"))
    private BuildingId buildingId;
}
