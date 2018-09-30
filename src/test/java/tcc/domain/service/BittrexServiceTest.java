package tcc.domain.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tcc.domain.service.bittrex.BittrexService;
import tcc.domain.service.bittrex.json.BittrexJson;
import tcc.domain.service.bittrex.json.GetCurrencies;
import tcc.domain.service.bittrex.json.GetMarketSummaries;
import tcc.domain.service.bittrex.json.GetMarkets;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BittrexServiceTest {
	@Autowired
	BittrexService bittrexService;

	Logger logger;

	public BittrexServiceTest(){
		logger = LoggerFactory.getLogger(BittrexServiceTest.class);
	}

	@Test
	public void GetResponseTest() {
		logger.info("--------GetResponseTest START--------");

		BittrexJson<GetCurrencies> data1 = bittrexService.getResponse(GetCurrencies.class);
		logger.info("CurrencyInfo::" + data1.toString());

		BittrexJson<GetMarketSummaries> data2 = bittrexService.getResponse(GetMarketSummaries.class);
		logger.info("MarketSummaryInfo::" + data2.toString());

		BittrexJson<GetMarkets> data3 = bittrexService.getResponse(GetMarkets.class);
		logger.info("MarketInfo::" + data3.toString());
		logger.info("--------GetResponseTest End--------");

	}
}
