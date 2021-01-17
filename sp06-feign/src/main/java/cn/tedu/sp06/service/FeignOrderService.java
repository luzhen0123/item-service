package cn.tedu.sp06.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cn.tedu.sp01.pojo.Order;
import cn.tedu.web.util.JsonResult;

@FeignClient(name = "order-service")
public interface FeignOrderService {
	@GetMapping("/{orderId}")
	JsonResult<Order> getOrder(@PathVariable String orderId);
	@GetMapping("/")
	JsonResult addOrder();
	
}
