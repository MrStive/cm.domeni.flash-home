package cm.domeni.flash_home.service.mapper;

import cm.domeni.flash_home.domaine.building.Address;
import cm.domeni.flash_home.domaine.building.Building;
import cm.domeni.flash_home.dto.AddressDTO;
import cm.domeni.flash_home.dto.BuildingDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BuildingMapper {
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "description", source = "description")
    @Mapping(target = "amenities", source = "amenities")
    @Mapping(target = "address", source = "address")
    @Mapping(target = "storey", source = "storey")
    @Mapping(target = "name", source = "name")
    Building mapToBuildingDTO(BuildingDTO value);

    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "city", source = "cityName")
    @Mapping(target = "district", source = "district")
    Address mapToBuildingDTO(AddressDTO value);

}
