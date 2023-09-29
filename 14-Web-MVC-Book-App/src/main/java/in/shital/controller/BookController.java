package in.shital.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.shital.entity.Book;
import in.shital.repository.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository repo;

	@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id") Integer id) {
		ModelAndView mav=new ModelAndView();
		Optional<Book> findById = repo.findById(id);
		if (findById.isPresent()) {
			Book bookObj = findById.get();
			mav.addObject("book", bookObj);
		}
		mav.setViewName("index");
		return mav;
	}
	/*
	 * @GetMapping("/book") public String getBookById(@RequestParam("id") Integer
	 * id, Model model) { Optional<Book> findById = repo.findById(id); if
	 * (findById.isPresent()) { Book bookObj = findById.get();
	 * model.addAttribute("book", bookObj); } return "index"; }
	 */
}



//@RequestParam is used to read the data which is coming in the request
//Controller method is taking one id from the request. with that id it is retrieving one record from the database...
//that record it is storing in the ModelAndView object
//ModelAndView is used to send the response to the view
//it will send the response to the view in the form of key and value
//here book is the key and bookObj is the object 

//in the second method,by taking return type as string we can directly return index page 
//no need to create ModelAndView object