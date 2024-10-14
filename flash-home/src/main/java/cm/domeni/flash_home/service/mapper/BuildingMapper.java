package cm.domeni.flash_home.service.mapper;

import cm.domeni.flash_home.domaine.building.Address;
import cm.domeni.flash_home.domaine.building.Amenities;
import cm.domeni.flash_home.domaine.building.Building;
import cm.domeni.flash_home.domaine.building.Modality;
import cm.domeni.flash_home.dto.AddressDTO;
import cm.domeni.flash_home.dto.AmenitiesDTO;
import cm.domeni.flash_home.dto.BuildingDTO;
import cm.domeni.flash_home.dto.ModalityDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BuildingMapper {
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "description", source = "description")
    @Mapping(target = "address", source = "address")
    @Mapping(target = "storey", source = "storey")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "modality", source = "modality")
    @Mapping(target = "amenities", source = "amenities")
    Building mapToBuildingDTO(BuildingDTO value);

    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "city", source = "cityName")
    @Mapping(target = "district", source = "district")
    @Mapping(target = "country", source = "country")
    Address mapToBuildingDTO(AddressDTO value);

    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "type", source = "type")
    Amenities mapToBuildingDTO(AmenitiesDTO value);

    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "price", source = "price")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "caution", source = "caution")
    @Mapping(target = "type", source = "type")
    @Mapping(target = "minimum", source = "minimumFrequency")
    Modality mapToBuildingDTO(ModalityDTO value);

}