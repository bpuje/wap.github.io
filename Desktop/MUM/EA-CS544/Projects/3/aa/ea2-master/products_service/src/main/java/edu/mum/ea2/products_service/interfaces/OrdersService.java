package edu.mum.ea2.products_service.interfaces;

import edu.mum.shared.interfaces.OrdersServiceShowcase;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "orders-service"
		, url = "http://localhost:8086"
)
public interface OrdersService extends OrdersServiceShowcase { }