/* 
* Generated by
* 
*      _____ _          __  __      _     _
*     / ____| |        / _|/ _|    | |   | |
*    | (___ | | ____ _| |_| |_ ___ | | __| | ___ _ __
*     \___ \| |/ / _` |  _|  _/ _ \| |/ _` |/ _ \ '__|
*     ____) |   < (_| | | | || (_) | | (_| |  __/ |
*    |_____/|_|\_\__,_|_| |_| \___/|_|\__,_|\___|_|
*
* The code generator that works in many programming languages
*
*			https://www.skaffolder.com
*
*
* You can generate the code from the command-line
*       https://npmjs.com/package/skaffolder-cli
*
*       npm install -g skaffodler-cli
*
*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
*
* To remove this comment please upgrade your plan here: 
*      https://app.skaffolder.com/#!/upgrade
*
* Or get up to 70% discount sharing your unique link:
*       https://app.skaffolder.com/#!/register?friend=5c9aa686c888b454cd596559
*
* You will get 10% discount for each one of your friends
* 
*/
package com.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

import com.helloworld.db.helloworld_db.entity.User;
import com.helloworld.db.helloworld_db.service.SecurityService;

@RestController
@PropertySource("classpath:${configfile.path}/Helloworld.properties")
@RequestMapping(value="${endpoint.api}", headers = "Accept=application/json")
public class SecurityController {
	
	@Autowired
	private SecurityService securityService;
	
    //LOGIN
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public User login(@RequestBody User login) throws Exception {
		return securityService.findByUsernameAndPassword(login.getUsername(), login.getPassword());
	}
	
	//VERIFY TOKEN
	@RequestMapping(value = "/verifyToken", method = RequestMethod.POST)
	public User verifyToken(@RequestBody User user) throws Exception {
		return securityService.verifyToken(user.getToken());
	}
	
	//CHANGE PASSWORD
	@Secured({"ROLE_PRIVATE_USER"})
	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	public HashMap<String,String> changePassword(@RequestBody Map<String,String> passwords, HttpServletResponse response) throws Exception {
		boolean check = securityService.changePasssword(passwords.get("passwordOld"), passwords.get("passwordNew"), response);
		if(check)
			return new HashMap<String,String>();
		else {
			response.sendError(500);
return null;
	}
	}
}