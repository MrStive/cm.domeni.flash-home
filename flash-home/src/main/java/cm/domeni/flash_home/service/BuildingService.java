package cm.domeni.flash_home.service;

import cm.domeni.flash_home.domaine.building.Building;
import cm.domeni.flash_home.dto.BuildingDTO;
import cm.domeni.flash_home.repository.BuildingSpringRepository;
import cm.domeni.flash_home.service.mapper.BuildingMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@RequiredArgsConstructor
public class BuildingService {
    private final BuildingMapper buildingMapper;
    private final BuildingSpringRepository buildingSpringRepository;

    @Transactional
    public UUID createNewBuilding(BuildingDTO buildingDTO) {
        Building building = buildingMapper.mapToBuildingDTO(buildingDTO);
        return buildingSpringRepository.save(building).getId().toUuid();
    }
}
