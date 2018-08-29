package tcc.domain.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * @author supertsuyoshi
 * @version 0.1
 * マーケットの情報を格納するモデル
 * BTC-USD ETH-BTC QRL-BTCなど
 */
@Entity
@Table(name="markets")
public class Market implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name="base_currency_id", referencedColumnName="id")
	private Currency baseCurrency;

	@ManyToOne
	@JoinColumn(name="market_currency_id", referencedColumnName="id" )
	private Currency marketCurrency;

	@Column(name="name")
	private String name;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Currency getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(Currency baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public Currency getMarketCurrency() {
		return marketCurrency;
	}

	public void setMarketCurrencyId(Currency marketCurrency) {
		this.marketCurrency = marketCurrency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}



}
