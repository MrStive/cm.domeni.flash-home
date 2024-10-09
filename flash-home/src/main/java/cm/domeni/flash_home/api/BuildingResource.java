package cm.domeni.flash_home.api;

import cm.domeni.flash_home.dto.BuildingDTO;
import cm.domeni.flash_home.service.BuildingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class BuildingResource  implements BuildingApi{
    private final BuildingService buildingService;
    @Override
    public ResponseEntity<UUID> createNewBuilding(BuildingDTO buildingDTO) {
        return ResponseEntity.ok(buildingService.createNewBuilding(buildingDTO));
    }
}
