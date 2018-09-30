package tcc.domain.service.bittrex.json;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.validation.constraints.Digits;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=false)
public class GetMarketSummaries {
	public static final String URL ="https://bittrex.com";
	public static final String PATH = "/api/v1.1/public/getmarketsummaries";

	@XmlElement(name="MarketName")
	public String marketName;

	@XmlElement(name="High")
	@Digits(integer=23, fraction=8)
	public BigDecimal high;

	@XmlElement(name="Low")
	@Digits(integer=23, fraction=8)
	public BigDecimal low;

	@XmlElement(name="Volume")
	@Digits(integer=23, fraction=8)
	public BigDecimal volume;

	@XmlElement(name="Last")
	@Digits(integer=23, fraction=8)
	public BigDecimal last;

	@XmlElement(name="BaseVolume")
	@Digits(integer=23, fraction=8)
	public BigDecimal baseVolume;

	@XmlElement(name="TimeStamp")
	public Timestamp timestamp;

	@XmlElement(name="Bid")
	@Digits(integer=23, fraction=8)
	public BigDecimal bid;

	@XmlElement(name="Ask")
	@Digits(integer=23, fraction=8)
	public BigDecimal ask;

	@XmlElement(name="PrevDay")
	@Digits(integer=23, fraction=8)
	public BigDecimal prevDay;

	@XmlElement(name="OpenBuyOrders")
	public Integer openBuyOrders;

	@XmlElement(name="OpenSellOrders")
	public Integer openSellOrders;

	@XmlElement(name="Created")
	public Timestamp created;

	@XmlElement(name="DisplayMarketName")
	public String displayMarketName;

	@Override
	public String toString() {
		StringBuilder ret = new StringBuilder();
		ret.append("marketName: ").append(marketName).append("|");
		//ret.append("high: ").append(high).append("|");
		//ret.append("low: ").append(low).append("|");
		ret.append("volume: ").append(volume).append("|");
		ret.append("last: ").append(last).append("|");
		//ret.append("baseVolume: ").append(baseVolume).append("|");
		ret.append("timestamp: ").append(timestamp).append("|");
		//ret.append("bid: ").append(bid).append("|");
		//ret.append("ask: ").append(ask).append("|");
		//ret.append("prevDay: ").append(prevDay).append("|");
		ret.append("openBuyOrders: ").append(openBuyOrders).append("|");
		ret.append("openSellOrders: ").append(openSellOrders).append("|");
		//ret.append("created: ").append(created).append("|");
		//ret.append("displayMarketName: ").append(displayMarketName).append("|");

		return ret.toString();
	}

}
