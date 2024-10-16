package cm.domeni.flash_home.domaine.building;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Column(name = "c_city")
    private String city;
    @Column(name = "c_district")
    private  String district;
    @Column(name = "c_country")
    private  String country;
    @Embedded
    private  Reference reference;
}
