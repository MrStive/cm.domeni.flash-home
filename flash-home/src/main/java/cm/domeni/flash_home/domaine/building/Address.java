package cm.domeni.flash_home.domaine.building;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Setter;

@Embeddable
@Setter
@Builder
public class Address {
    private String city;
    private  String district;
}
