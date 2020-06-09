/**
 * 
 */
package com.stacksimplify.restservices.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chand
 *
 */
@RestController
public class HelloWorldController {

	/**
	 * @param args
	 */
	@RequestMapping(method= RequestMethod.GET,path="/helloworld")
	public String helloWorld() {
	return "Hello World";
	}
	
	/**
	 * @param args
	 */
	@GetMapping("/helloworld1")
	public String helloWorld1() {
	return "Hello World 1";
	}

	@GetMapping("/createUser")
	public UserDetails createUser() {
		return new UserDetails("Rohit","Chand","Khatima");
	}
}
