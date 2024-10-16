package cm.domeni.flash_home.domaine.building;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Reference {
    @Column(name = "c_reference_name")
    private String name;
    @Column(name = "c_reference_description")
    private  String description;
}
