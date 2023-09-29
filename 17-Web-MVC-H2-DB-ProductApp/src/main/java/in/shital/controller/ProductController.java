package in.shital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.shital.entity.Product;
import in.shital.repo.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository repo;
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("p", new Product());
		return "index";
	}
	
	@PostMapping("/product")
	public String handleSave(@ModelAttribute("p") Product p,Model model) {
		
		p=repo.save(p);
		if(p.getPid()!=null) {
			model.addAttribute("msg", "Product saved...");
		}
		return "index";
	}
	//for getting list of products
	
	@GetMapping("/products")
	public String loadProducts(Model model) {
		model.addAttribute("products", repo.findAll());
		return "data";
	}
}
