package io.ssc.antiquestore.controller;

import io.ssc.antiquestore.model.Product;
import io.ssc.antiquestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;

	@RequestMapping ("/home")
	public String getHome(Model model) {

		model.addAttribute("message", "Hello from the product controller");
		return "home";
	}

	@RequestMapping("/products")
	public String indexProducts(Model model) {
		List<Product> productList = service.index();
		model.addAttribute("allProducts", productList);
		return "products";
	}

	@RequestMapping("/products/new")
	public String newProductForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "new-product";
	}

	@RequestMapping(value = "products/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		service.save(product);
		return "redirect:/products";
	}

	@RequestMapping("/products/edit/{id}")
	public ModelAndView editProductForm(@PathVariable(name = "id") Integer id) {
		ModelAndView modelAndView = new ModelAndView("edit-product");
		Product product = service.update(id);
		modelAndView.addObject("product", product);
		return modelAndView;
	}

	@RequestMapping("/products/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") Integer id) {
		service.delete(id);
		return "redirect:/products";
	}
}
