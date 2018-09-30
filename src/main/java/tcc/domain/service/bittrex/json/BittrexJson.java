package tcc.domain.service.bittrex.json;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
public class BittrexJson<T> {
	@XmlElement(name="success")
	public Boolean success;

	@XmlElement(name="message")
	public String message;

	@XmlElement(name="result")
	public List<T> result;


	@Override
	public String toString() {
		StringBuilder ret = new StringBuilder();

		ret.append("success: ").append(success).append("\n");
		ret.append("message: ").append(message).append("\n");
		ret.append("result-element: ").append(result).append("\n");

		return ret.toString();
	}

}
