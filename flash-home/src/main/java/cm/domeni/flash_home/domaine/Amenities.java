package cm.domeni.flash_home.domaine;

import jakarta.persistence.Embeddable;

import java.util.List;

@Embeddable
public class Amenities {
private List<ExternalAmenities> externalAmenities;
private List<InternalAmenities> internalAmenities;
}