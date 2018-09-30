package tcc.domain.service.bittrex;


import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tcc.domain.repository.BittrexMarketPriceRepository;
import tcc.domain.service.bittrex.json.BittrexJson;
import tcc.domain.service.bittrex.json.PathResolver;

@Service
public class BittrexService {
	@Autowired
	private BittrexMarketPriceRepository bittrexMarketPriceRepository;

	private Client client;

	private Logger logger;

	BittrexService(){
		client = ClientBuilder.newClient();
		logger = LoggerFactory.getLogger(BittrexService.class);
	}


	//Test用クラス
	public String getResponse(String url, String path) {
		String result;
		WebTarget target = client.target(url)
				.path(path);

		try {
			result = target.request().get(String.class);
			logger.info(result);
		}catch(BadRequestException e) {
			logger.error("response=" + e.getResponse().readEntity(String.class), e);
			throw e;
		}

		return result;
	}

	//jacksonだと動く。moxyだと動かない
	public <T> BittrexJson<T> getResponse(Class<T> clazz){
		BittrexJson<T> result = new BittrexJson<T>();
		PathResolver pr =new PathResolver(clazz);

		WebTarget target = client.target(pr.getUrl())
				.path(pr.getPath());

		ParameterizedType parameterizedType = new ParameterizedType() {

			@Override
			public Type getRawType() {
				return BittrexJson.class;
			}

			@Override
			public Type getOwnerType() {
				return BittrexJson.class;
			}

			@Override
			public Type[] getActualTypeArguments() {
				return new Type[] {clazz};
			}
		};

		try {
			result = target.request().get(new GenericType<BittrexJson<T>>(parameterizedType) {});
		}catch(BadRequestException e) {
			logger.error(e.getMessage(), e);
		}

		return result;
	}


}
