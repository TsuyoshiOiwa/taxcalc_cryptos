package tcc.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tcc.domain.model.BittrexOrderHistory;

/**
 * @author supertsuyoshi
 *
 */
public interface BittrexOrderHistoryRepository extends JpaRepository<BittrexOrderHistory, Integer> {
	List<BittrexOrderHistory> findByIsCopied(Boolean isCopied);
}
