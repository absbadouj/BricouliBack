package com.demo.Bricouli.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Bricouli.services.CommandesService;
import com.demo.Bricouli.services.FacturationService;


@CrossOrigin("*")
@RestController

public class FacturationController {
	
	@Autowired FacturationService facturationService;
	@Autowired CommandesService commandeService;
	
	
}
