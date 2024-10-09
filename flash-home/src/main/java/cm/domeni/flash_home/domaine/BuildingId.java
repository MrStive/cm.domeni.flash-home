package cm.domeni.flash_home.domaine;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Embeddable
@NoArgsConstructor
@Getter
@Setter
public class BuildingId {
    private String value = UUID.randomUUID().toString();

    public UUID toUuid(String value){
        return UUID.fromString(value);
    }

}
