package tcc.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.AssociationOverride;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

@Entity
@Table(name="sum_order_histories")
public class SumOrderHistory extends BaseEntity implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="timestamp")
	private Timestamp timestamp;

	@ManyToOne
	@JoinColumn(name="exchange_id", referencedColumnName="id")
	private Exchange exchange;

	@ManyToOne
	@JoinColumn(name="market_id", referencedColumnName="id")
	private Market market;

	@Column(name="order_type")
	private Boolean orderType;

	@Embedded
	@AssociationOverride(name="currency", joinColumns=@JoinColumn(name="base_currency_id", referencedColumnName="id"))
	@AttributeOverrides({
		@AttributeOverride(name="btc", column=@Column(name="base_currency_btc")),
		@AttributeOverride(name="usd", column=@Column(name="base_currency_usd")),
		@AttributeOverride(name="jpy", column=@Column(name="base_currency_jpy")),
	})
	private Price basePrice;

	@Embedded
	@AssociationOverride(name="currency", joinColumns=@JoinColumn(name="market_currency_id", referencedColumnName="id"))
	@AttributeOverrides({
		@AttributeOverride(name="btc", column=@Column(name="market_currency_btc")),
		@AttributeOverride(name="usd", column=@Column(name="market_currency_usd")),
		@AttributeOverride(name="jpy", column=@Column(name="market_currency_jpy")),
	})
	private Price marketPrice;


	@Column(name="quantity")
	@Digits(integer=23,fraction=8)
	private BigDecimal quantity;

	@Column(name="price_per_unit")
	@Digits(integer=23,fraction=8)
	private BigDecimal pricePerUnit;

	@Column(name="commision_fee")
	@Digits(integer=23,fraction=8)
	private BigDecimal commisionFee;

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

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Exchange getExchange() {
		return exchange;
	}

	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	public Market getMarket() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public Boolean getOrderType() {
		return orderType;
	}

	public void setOrderType(Boolean orderType) {
		this.orderType = orderType;
	}

	public Price getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Price basePrice) {
		this.basePrice = basePrice;
	}

	public Price getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(Price marketPrice) {
		this.marketPrice = marketPrice;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(BigDecimal pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public BigDecimal getCommisionFee() {
		return commisionFee;
	}

	public void setCommisionFee(BigDecimal commisionFee) {
		this.commisionFee = commisionFee;
	}





}
