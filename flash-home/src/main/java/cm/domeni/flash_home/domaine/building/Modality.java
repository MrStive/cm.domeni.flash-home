package cm.domeni.flash_home.domaine.building;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springdoc.core.converters.ModelConverterRegistrar;
import org.springdoc.core.converters.models.MonetaryAmount;

import javax.persistence.*;

@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Modality {
    @Column(name = "c_price")
    @Convert(converter = ModelConverterRegistrar.class)
    private MonetaryAmount price;
    @Column(name = "c_caution")
    private String caution;
    @Enumerated(EnumType.STRING)
    @Column(name = "c_payment_frequency")
    private PaymentFrequency paymentFrequency;
    @Builder.Default
    @Column(name = "c_min_frequency")
    private int minimumFrequency = 1;
}
