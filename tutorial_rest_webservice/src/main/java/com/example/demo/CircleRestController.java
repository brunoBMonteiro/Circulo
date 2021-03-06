package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController

public class CircleRestController {
	
	@RequestMapping(value = "/{raio}", method = RequestMethod.GET, produces = "aplicattion/json")
	public Circle circle(@PathVariable double raio) {
		Circle c1 = new Circle(raio);
		return c1;
	}
	
	@GetMapping(value = "/circle")
	public Circle paramcircle(@RequestParam(value = "raio") double raio) {
		Circle c1 = new Circle(raio);
		return c1;
	}
}
