package com.digitel.digitel_smartphones;

//Vanessa Victorino - 301201653
//01OCT24

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

	   @GetMapping("/")
	    public String showOrderForm(Model model) {
	        // Create an empty Order object to bind form data
	        model.addAttribute("order", new Order());
	        return "index";  // This corresponds to src/main/resources/templates/index.html
	   }
	   
    @PostMapping("/submitOrder")
    public String submitOrder(@ModelAttribute Order order, Model model) {
    	 String formattedTotalPrice = order.getFormattedTotalPrice();  // Get formatted total price
    	 String formattedPhonePrice = order.getFormattedPhonePrice(); 
    	    model.addAttribute("order", order);
    	    model.addAttribute("totalPrice", formattedTotalPrice + " CAD");  // Pass formatted price to view
    	    model.addAttribute("price", formattedPhonePrice);  // Add formatted phone price to the model
        return "show-order"; // Redirects to show-order.html
    }
}



