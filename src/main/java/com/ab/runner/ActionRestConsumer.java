package com.ab.runner;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SpringBootRest-ProviderApp")
public interface ActionRestConsumer {
	
	@GetMapping("/API/actor/wish")
	public ResponseEntity<String> getWishMessage();
}
