package cm.domeni.flash_home.domaine.storey;

import cm.domeni.flash_home.domaine.FlashHomeEntityBase;
import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class HousingUnit extends FlashHomeEntityBase<HousingUnitId> {
    @Builder.Default
    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "c_id"))
    private HousingUnitId id = new HousingUnitId();
    @ManyToOne
   @JoinColumn(name = "c_storey", referencedColumnName = "c_id")
    private Storey storey;
}
