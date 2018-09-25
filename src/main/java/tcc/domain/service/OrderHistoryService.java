package tcc.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tcc.domain.model.ParentOrderHistory;
import tcc.domain.model.SumOrderHistory;

/**
 * @author supertsuyoshi
 * SumOrderHistoryへの登録処理を記述する。
 * あと取引所ごとにデータ取得をする抽象メソッドも定義
 *
 */
@Service
@Transactional
abstract public class OrderHistoryService<H extends ParentOrderHistory> {

	/*
	 * 親クラス用のメソッド
	 */
	abstract protected List<H> getAllOrderHisotry() throws Exception;
	abstract protected List<H> getNotConvertedOrderHisotry() throws Exception;

	/*
	 * 子クラス用のメソッド
	 */
	abstract protected void updateToIsConverted(List<H> l) throws Exception;



	/*
	 * サービス利用者用のメソッド
	 */
	abstract public void updateOrderHistoryByAPI();
	public void updateSumOrderHistory() {

	}


	public void insert(List<SumOrderHistory> x) throws Exception{

	}

}
