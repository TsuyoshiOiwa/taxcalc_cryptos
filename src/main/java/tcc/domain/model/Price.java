package tcc.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Digits;

@Embeddable
public class Price implements Serializable {

	@ManyToOne
	private Currency currency;

	@Digits(integer=23, fraction=8)
	private BigDecimal btc;

	@Digits(integer=23, fraction=8)
	private BigDecimal usd;

	@Digits(integer=23, fraction=8)
	private BigDecimal jpy;

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public BigDecimal getBtc() {
		return btc;
	}

	public void setBtc(BigDecimal btc) {
		this.btc = btc;
	}

	public BigDecimal getUsd() {
		return usd;
	}

	public void setUsd(BigDecimal usd) {
		this.usd = usd;
	}

	public BigDecimal getJpy() {
		return jpy;
	}

	public void setJpy(BigDecimal jpy) {
		this.jpy = jpy;
	}



}
