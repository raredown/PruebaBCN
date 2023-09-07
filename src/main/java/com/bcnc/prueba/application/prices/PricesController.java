package com.bcnc.prueba.application.prices;

import org.springframework.http.ResponseEntity;

import com.bcnc.prueba.domain.model.prices.Prices;
import com.bcnc.prueba.domain.model.prices.PricesRequest;

public interface PricesController {
	ResponseEntity<Prices> getBestProduct(PricesRequest pricesRequest);

}
