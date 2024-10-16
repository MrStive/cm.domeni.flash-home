package cm.domeni.flash_home.domaine.storey;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@NoArgsConstructor
@Getter
@Setter
public class StoreyId implements Serializable {
    private String value = UUID.randomUUID().toString();

    public UUID toUuid(){
        return UUID.fromString(this.value);
    }
}
