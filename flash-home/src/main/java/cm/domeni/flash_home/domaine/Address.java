package cm.domeni.flash_home.domaine;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String city;
    private  String district;
}
