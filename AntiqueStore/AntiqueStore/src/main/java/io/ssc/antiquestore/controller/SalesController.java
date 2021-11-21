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

public class SalesController {

    @RequestMapping("/sales")
    public String indexProducts(Model model) {
        List<Product> productList = service.index();
        model.addAttribute("allProducts", productList);
        return "/sales";


}
