package com.javainuse.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	public List<BooksBean> getBooksDetails(){
		
	 return Arrays.asList((new BooksBean(1L, "Mastering SpringBoot", "Venkata Krishna")));
	}

}
