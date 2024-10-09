package cm.domeni.flash_home.service.mapper;

import cm.domeni.flash_home.domaine.Building;
import cm.domeni.flash_home.dto.BuildingDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BuildingMapper {
    @BeanMapping(ignoreByDefault = true)
    Building mapToUser(BuildingDTO value);
}
