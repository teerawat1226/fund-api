package com.fund.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fund.criteria.Criteria;
import com.fund.service.FundService;

@RequestMapping("/api/v1/")
@RestController
public class FundController {

	@Autowired
	private FundService fundService;

	@PostMapping("fundsell")
	public Object fundsell(@RequestBody Criteria criteria) {
		Object response = fundService.searchFundsell(criteria);
		if (response != null) {
			return ResponseEntity.ok().body(response);
		} else {
			return ResponseEntity.badRequest();
		}
	}

}
