package ru.iway.admin.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.iway.entity.Booking;

@Controller
//@RequestMapping({"/booking"})
public class BookingController {
	 
	@GetMapping("/booking")
	    public String main(Model model) {
	        model.addAttribute("booking", new Booking());
	        return "booking";
	    }

	@PostMapping("/orders")
	public String save(Booking booking, Model model) {
	        model.addAttribute("booking", booking);
	        return "orders";
	    }
}
