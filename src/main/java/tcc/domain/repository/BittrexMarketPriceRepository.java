package tcc.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tcc.domain.model.BittrexMarketPrice;

public interface BittrexMarketPriceRepository extends JpaRepository<BittrexMarketPrice, Integer> {
	List<BittrexMarketPrice> findByMarketId(Integer marketId);
}
