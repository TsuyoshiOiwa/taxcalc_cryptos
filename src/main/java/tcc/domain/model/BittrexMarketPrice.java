package tcc.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

@Entity
@Table(name="bittrex_markets_price")
public class BittrexMarketPrice extends BaseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name="market_id", referencedColumnName="id")
	private Market market;

	@Column(name="timestamp")
	private Timestamp timestamp;

	@Column(name="high")
	@Digits(integer=23,fraction=8)
	private BigDecimal high;
	
	@Column(name="low")
	@Digits(integer=23,fraction=8)
	private BigDecimal low;
	
	@Column(name="volume")
	@Digits(integer=23,fraction=8)
	private BigDecimal volume;
	
	@Column(name="last")
	@Digits(integer=23,fraction=8)
	private BigDecimal last;
	
	@Column(name="base_volume")
	@Digits(integer=23,fraction=8)
	private BigDecimal baseVolume;
	
	@Column(name="bid")
	@Digits(integer=23,fraction=8)
	private BigDecimal bid;
	
	@Column(name="ask")
	@Digits(integer=23,fraction=8)
	private BigDecimal ask;
	
	@Column(name="open_buy_orders")
	private Integer openBuyOrders;
	
	@Column(name="open_sell_orders")
	private Integer openSellOrders;
	
	@Column(name="prev_day")
	@Digits(integer=23,fraction=8)
	private BigDecimal prevDay;
	
	
	
}
