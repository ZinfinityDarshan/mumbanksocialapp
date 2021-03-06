package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.data.entity.Contact;
import app.service.BirthDayService;


@CrossOrigin(allowedHeaders="*")
@RestController
@RequestMapping("dob")
public class BirthDayController {

	@Autowired private BirthDayService bdservice;
	
	@GetMapping("getForToday/{td}")
	public List<Contact> getTodaysBOD(@PathVariable String td){
		System.out.println(td);
		return bdservice.getForToday(td);
	}
	
	
}
