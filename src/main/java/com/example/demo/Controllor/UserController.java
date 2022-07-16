package com.example.demo.Controllor;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Produit;
import com.example.demo.Model.User;
import com.example.demo.Services.ProduitService;
import com.example.demo.Services.UserService;

@RestController
@RequestMapping("/api/user/")
@CrossOrigin(origins = "*")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private ProduitService prodService;

	@GetMapping(path = "allprod/{phone}")
	public Iterable<Produit> usersprods(@PathVariable String phone) {
		ArrayList<Produit>res =new ArrayList<Produit>();
		Iterable<Produit> l =prodService.findAll() ;
		for (Produit produit : l) {
			if (	produit.getUser().getPhone().compareTo(phone)==0 )
			{
				res.add(produit);
			}
		
		}
		return l;
	}

	@GetMapping(path = "all")
	public Iterable<User> users() {
		return userService.findAll();
	}

	@GetMapping(path = "auth/{email}")
	public User userbyemail(@PathVariable String email) {
		return userService.findemail(email);
	}

	@PostMapping(path = "add")
	public User adduser(@RequestBody User p) {
		return userService.create(p);
	}

	@DeleteMapping("del/{id}")
	public void deleteuser(@PathVariable int  id) {
		userService.Delete(id);

	}

}
