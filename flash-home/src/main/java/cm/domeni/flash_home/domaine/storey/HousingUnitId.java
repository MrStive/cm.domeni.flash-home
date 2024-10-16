package cm.domeni.flash_home.domaine.storey;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Setter
@Getter
public class HousingUnitId implements Serializable {
    private String value = UUID.randomUUID().toString();

    public UUID toUuid(String value){
        return UUID.fromString(value);
    }

}
