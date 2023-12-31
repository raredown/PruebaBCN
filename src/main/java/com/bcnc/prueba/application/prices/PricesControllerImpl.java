package com.bcnc.prueba.application.prices;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcnc.prueba.application.exception.BadRequestException;
import com.bcnc.prueba.application.exception.InternalServerError;
import com.bcnc.prueba.domain.model.prices.Prices;
import com.bcnc.prueba.domain.model.prices.PricesRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/prices")
@RequiredArgsConstructor

public class PricesControllerImpl  implements PricesController{
	private final PricesService pricesService;

	@Override
	@GetMapping("/")
	public ResponseEntity<Prices> getBestProduct(PricesRequest pricesRequest) {
		
		Prices result = null;
		try {
			result= pricesService.getBestProduct(pricesRequest);
			if (result == null ){
				throw new BadRequestException("dont exixt");
			}
		} catch (Exception e) {
			throw new InternalServerError("internal.server.error");
			}
		return ResponseEntity.ok(result);
	}

}
