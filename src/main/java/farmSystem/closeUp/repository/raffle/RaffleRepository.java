package farmSystem.closeUp.repository.raffle;

import farmSystem.closeUp.domain.RaffleProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaffleRepository extends JpaRepository<RaffleProduct, Long>, RaffleRepositoryCustom {
}
