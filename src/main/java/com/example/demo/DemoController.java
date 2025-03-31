package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {
	@GetMapping("/demo")
	public String hello(@RequestParam String parameter) {
		return "A kiszolgáló fut és a paraméterben a következő értéket kaptam:" + parameter;
	}

	@GetMapping("/")
	public String hello() {
		return "A kiszolgáló fut";
	}
}
