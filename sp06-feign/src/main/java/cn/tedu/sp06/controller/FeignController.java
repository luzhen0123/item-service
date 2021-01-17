package cn.tedu.sp06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.sp01.pojo.Order;
import cn.tedu.sp01.pojo.User;
import cn.tedu.sp06.service.FeignOrderService;
import cn.tedu.sp06.service.FeignService;
import cn.tedu.sp06.service.feignUserService;
import cn.tedu.web.util.JsonResult;

@RestController
public class FeignController {
	@Autowired
	private FeignService feignService;
	@Autowired
	private feignUserService feignUserService;
	@Autowired
	private FeignOrderService feignOrderService;
	
	//根据商品ID,返回商品信息
	@GetMapping("/item-service/{orderId}")
	public JsonResult<List<Item>> getItems(@PathVariable String orderId) {
		JsonResult<List<Item>> items = feignService.getItems(orderId);
		return items;
	}
	//根据从body中传入的商品信息,减少库存
	@PostMapping("/item-service/decreaseNumber")
	public JsonResult decreaseNumber(@RequestBody List<Item> items) {
		return feignService.decreaseNumber(items);
	}
	//根据用户ID,查询用户信息
	@GetMapping("/userservice/{userId}")
	public JsonResult<User> getUser(@PathVariable String userId){
		return feignUserService.getUser(userId);
	}
	//根据用户ID,新增积分
	@GetMapping("/userservice/{userId}/score")
	public JsonResult addScore(@PathVariable String userId,@RequestParam Integer score) {
		return feignUserService.addScore(userId,score);
	}
	//根据订单编号,查询订单
	@GetMapping("/order-service/{orderId}")
	public JsonResult<Order> getOrder(@PathVariable String orderId){
		return feignOrderService.getOrder(orderId); 
	}
	//增加订单
	@GetMapping("/order-service")
	public JsonResult addOrder() {
		return feignOrderService.addOrder();
	}
}
