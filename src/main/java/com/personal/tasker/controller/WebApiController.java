package com.personal.tasker.controller;

import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController(value = "/web")
@Slf4j
public class WebApiController {

	
	
	@GetMapping(value = "/testValid", produces = { MediaType.APPLICATION_JSON_VALUE , MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public ResponseEntity<String> testValidInJson(@NotNull @RequestParam("name") String name) {
		log.info("testValidInJson");
		return new ResponseEntity<>("name", HttpStatus.OK);
	}
	
}
