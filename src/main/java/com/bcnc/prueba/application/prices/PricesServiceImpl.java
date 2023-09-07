package com.bcnc.prueba.application.prices;

import org.springframework.stereotype.Service;

import com.bcnc.prueba.domain.model.prices.Prices;
import com.bcnc.prueba.domain.model.prices.PricesRequest;
import com.bcnc.prueba.infrastructure.adapter.h2.entity.PricesEntity;
import com.bcnc.prueba.infrastructure.adapter.h2.jpa.PricesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PricesServiceImpl implements  PricesService{
	private final PricesRepository pricesRepository;
	@Override
	public Prices getBestProduct(PricesRequest pricesRequest) {
		
		PricesEntity priceEntity= pricesRepository.findBestProduct(pricesRequest.getDateApp(), pricesRequest.getProductId(), pricesRequest.getBrandId()).get(0);
		return Prices.fromModel(priceEntity);
	}

}
