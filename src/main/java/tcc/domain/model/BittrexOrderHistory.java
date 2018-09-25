package tcc.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

/**
 * @author supertsuyoshi
 *
 */
@Entity
@Table(name="bittrex_order_histories")
public class BittrexOrderHistory extends ParentOrderHistory implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="order_uuid")
	private String orderUuid;

	@Column(name="timestamp")
	private Timestamp timestamp;

	@Column(name="order_type")
	private String orderType;

	@Column(name="limit")
	@Digits(integer=23,fraction=8)
	private BigDecimal limit;

	@Column(name="quantity")
	@Digits(integer=23,fraction=8)
	private BigDecimal quantity;

	@Column(name="remaining_quantity")
	@Digits(integer=23,fraction=8)
	private BigDecimal remainingQuantity;

	@Column(name="commision")
	@Digits(integer=23,fraction=8)
	private BigDecimal commision;

	@Column(name="price")
	@Digits(integer=23,fraction=8)
	private BigDecimal price;

	@Column(name="price_per_unit")
	@Digits(integer=23,fraction=8)
	private BigDecimal pricePerUnit;

	@Column(name="is_conditional")
	private String isConditional;

	@Column(name="condition")
	private String condition;

	@Column(name="condition_target")
	private String conditionTarget;

	@Column(name="immediate_or_cancel")
	private String immediateOrCancel;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderUuid() {
		return orderUuid;
	}

	public void setOrderUuid(String orderUuid) {
		this.orderUuid = orderUuid;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public BigDecimal getLimit() {
		return limit;
	}

	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getRemainingQuantity() {
		return remainingQuantity;
	}

	public void setRemainingQuantity(BigDecimal remainingQuantity) {
		this.remainingQuantity = remainingQuantity;
	}

	public BigDecimal getCommision() {
		return commision;
	}

	public void setCommision(BigDecimal commision) {
		this.commision = commision;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(BigDecimal pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public String getIsConditional() {
		return isConditional;
	}

	public void setIsConditional(String isConditional) {
		this.isConditional = isConditional;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getConditionTarget() {
		return conditionTarget;
	}

	public void setConditionTarget(String conditionTarget) {
		this.conditionTarget = conditionTarget;
	}

	public String getImmediateOrCancel() {
		return immediateOrCancel;
	}

	public void setImmediateOrCancel(String immediateOrCancel) {
		this.immediateOrCancel = immediateOrCancel;
	}


	@Override
	public SumOrderHistory convert() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}



}
