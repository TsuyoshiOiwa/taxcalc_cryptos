package tcc.domain.service.bittrex.json;

import java.util.HashMap;
import java.util.Map;

public final class PathResolver {

	private static final  Map<Class<?>, String> urlMap = new HashMap<>();
	private static final  Map<Class<?>, String> pathMap = new HashMap<>();


	private Class<?> clazz;

	static {
		urlMap.put(GetMarketSummaries.class, GetMarketSummaries.URL);
		pathMap.put(GetMarketSummaries.class, GetMarketSummaries.PATH);
		urlMap.put(GetMarkets.class, GetMarkets.URL);
		pathMap.put(GetMarkets.class, GetMarkets.PATH);
		urlMap.put(GetCurrencies.class, GetCurrencies.URL);
		pathMap.put(GetCurrencies.class, GetCurrencies.PATH);
	}

	public PathResolver(Class<?> clazz){
		this.clazz = clazz;
	}

	public String getPath() {
		for(Map.Entry<Class<?>, String> x : pathMap.entrySet()) {
			if(x.getKey().equals(clazz)) {
				return x.getValue();
			}
		}
		throw new IllegalArgumentException("引数のクラスには対応していません");
	}
	public String getUrl() {
		for(Map.Entry<Class<?>, String> x : urlMap.entrySet()) {
			if(x.getKey().equals(clazz)) {
				return x.getValue();
			}
		}
		throw new IllegalArgumentException("引数のクラスには対応していません");
	}


}
