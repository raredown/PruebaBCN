package com.bcnc.prueba.application.prices;

import com.bcnc.prueba.domain.model.prices.Prices;
import com.bcnc.prueba.domain.model.prices.PricesRequest;

public interface PricesService {

	Prices getBestProduct(PricesRequest pricesRequest);
}
