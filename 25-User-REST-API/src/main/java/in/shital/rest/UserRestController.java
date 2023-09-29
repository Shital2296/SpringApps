package in.shital.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.shital.binding.User;

@RestController
public class UserRestController {

	private Map<Integer, User> dataMap=new HashMap<>();
	
	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user){
		System.out.println(user);
		dataMap.put(user.getId(), user);
		return new ResponseEntity<String>("User saved", HttpStatus.CREATED);
	}

//	@GetMapping("/user")
//    public User getUser(@RequestParam("userid") Integer userId,
//    		@RequestParam("username") String name) {
//      User user=dataMap.get(userId);
//      return user;     	
//     }
	
	@GetMapping("/user/{id}/data")
	public User getUser(@PathVariable("id") Integer userId) {
		User user=dataMap.get(userId);
	    return user;
	}
}

//Here in this method, we are getting the data in json format, springboot will automatically convert 
//the json data into java object 
//In order to get the values from client(postman) we have the annotation @RequestBody 
//It will read the data and store into user object
//@RequestParam is for single parameter
//@RequestBody is for multiple parameters
//ResponseEntity is a class to set custom Http status codes in response

//Hashmap used for storing the data in key-value format

//{
//"id":101,
//"name":"Shital",
//"email":"shital@gmail.com"
//}
//key values should be same as the variales in binding class

//MsgConverter- Internally Dispatcher servlet will use msg converter to convert json data into object

	     
//When our method is having @RequestParam, Dispatcher servlet will understand that userid is coming in the url
//To read query params from url, we will use @RequestParam annotation
//localhost:8080/user?userid=102
//json data will go to the client as a response

//we can use more than one query params to fetch data
//localhost:8080/username?userid=101&username=Shital


//Query parameters------------>@RequestParam
//Path parameters------------->@PathVariable

//localhost:8080/user/101/data

//unique records----------->go for Path parameters
//multiple records---------->go for Query parameters
