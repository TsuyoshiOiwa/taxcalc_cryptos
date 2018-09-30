package tcc.domain.service.bittrex.json;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.validation.constraints.Digits;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=false)
public class GetMarkets {
	public static final String URL = "https://bittrex.com";
	public static final String PATH = "/api/v1.1/public/getmarkets";

	@XmlElement(name="MarketCurrency")
	public String marketCurrency;

	@XmlElement(name="BaseCurrency")
	public String baseCurrency;

	@XmlElement(name="MarketCurrencyLong")
	public String marketCurrencyLong;

	@XmlElement(name="BaseCurrencyLong")
	public String baseCurrencyLong;

	@XmlElement(name="MinTradeSize")
	@Digits(integer=23, fraction=8)
	public BigDecimal minTradeSize;

	@XmlElement(name="MarketName")
	public String marketName;

	@XmlElement(name="IsActive")
	public Boolean isActive;

	@XmlElement(name="IsRestricted")
	public Boolean isRestricted;

	@XmlElement(name="Created")
	public Timestamp created;

	@XmlElement(name="Notice")
	public String notice;

	@XmlElement(name="IsSponsored")
	public Boolean isSponsored;

	@XmlElement(name="LogoUrl")
	public String logoUrl;

	@Override
	public String toString() {
		StringBuilder ret = new StringBuilder();
		ret.append("|market: ").append(marketName).append("|");

		return ret.toString();
	}
}
