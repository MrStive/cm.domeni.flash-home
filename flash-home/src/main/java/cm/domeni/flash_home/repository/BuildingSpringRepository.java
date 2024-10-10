package cm.domeni.flash_home.repository;

import cm.domeni.flash_home.domaine.building.Building;
import cm.domeni.flash_home.domaine.building.BuildingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingSpringRepository extends JpaRepository<Building, BuildingId> {
}
