package tcc.domain.service.bittrex.json;

import java.math.BigDecimal;

import javax.validation.constraints.Digits;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=false)
public class GetCurrencies {

	public static final String URL ="https://bittrex.com";
	public static final String PATH = "/api/v1.1/public/getcurrencies";

	@XmlElement(name="Currency")
	public String currency;

	@XmlElement(name="CurrencyLong")
	public String currencyLong;

	@XmlElement(name="MinConfirmation")
	public Integer minConfirmation;

	@XmlElement(name="TxFee")
	@Digits(integer=23, fraction=8)
	public BigDecimal txFee;

	@XmlElement(name="IsActive")
	public Boolean isActive;

	@XmlElement(name="IsRestricted")
	public Boolean isRestricted;

	@XmlElement(name="CoinType")
	public String coinType;

	@XmlElement(name="BaseAddress")
	public String baseAddress;

	@XmlElement(name="Notice")
	public String Notice;

	@Override
	public String toString() {
		StringBuilder ret = new StringBuilder();
		ret.append("|currency: ").append(currency).append("|");

		return ret.toString();
	}



}
