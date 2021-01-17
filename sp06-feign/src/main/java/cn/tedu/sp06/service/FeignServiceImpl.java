package cn.tedu.sp06.service;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.web.util.JsonResult;
@Component
public class FeignServiceImpl implements FeignService {

	@Override
	public JsonResult<List<Item>> getItems(String orderId) {
		System.out.println("降级");
		return JsonResult.err("执行降级方法");
	}

	@Override
	public JsonResult decreaseNumber(List<Item> items) {
		System.out.println("降级");
		return JsonResult.err("执行降级方法");
	}

}
