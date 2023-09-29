package in.shital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.shital.binding.Product;
import in.shital.service.ProductService;


@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		
		model.addAttribute("product",new Product());
		return "index";
		
	}
	@PostMapping("/save")
	public String handleSubmitBtn(Product p, Model model) {
		boolean isSaved=service.saveProduct(p);
		if(isSaved) {
			model.addAttribute("msg", "Data saved....");
		}
		
		return "index";
	}
}
