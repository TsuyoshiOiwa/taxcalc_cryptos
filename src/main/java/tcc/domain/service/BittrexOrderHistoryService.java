package tcc.domain.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tcc.domain.model.BittrexOrderHistory;
import tcc.domain.repository.BittrexOrderHistoryRepository;

@Service
@Transactional
public class BittrexOrderHistoryService extends OrderHistoryService<BittrexOrderHistory>{
	@Autowired
	BittrexOrderHistoryRepository orderHistoryRepository;

	@Override
	protected List<BittrexOrderHistory> getAllOrderHisotry() throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	protected List<BittrexOrderHistory> getNotConvertedOrderHisotry() throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}


	@Override
	public void updateOrderHistoryByAPI() {
		// TODO 自動生成されたメソッド・スタブ

	}


	@Override
	protected void updateToIsConverted(List<BittrexOrderHistory> l) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

	}
}
