package cm.domeni.flash_home.domaine;

import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class FlashHomeEntityBase<T extends Serializable> extends EntityAdapter<T>
    implements FlashHomeEntity<T> {}
