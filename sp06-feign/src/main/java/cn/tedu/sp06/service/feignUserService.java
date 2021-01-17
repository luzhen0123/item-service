package cn.tedu.sp06.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import cn.tedu.sp01.pojo.User;
import cn.tedu.web.util.JsonResult;

@FeignClient(name = "user-service")
public interface feignUserService {
	@GetMapping("/{userId}")
	JsonResult<User> getUser(@PathVariable String userId);
	@GetMapping("/{userId}/score")
	JsonResult addScore(@PathVariable String userId, @RequestParam Integer score);
}
