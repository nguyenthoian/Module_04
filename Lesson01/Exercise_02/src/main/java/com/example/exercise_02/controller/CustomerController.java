package com.example.exercise_02.controller;

import com.example.exercise_02.model.entity.Customer;
import com.example.exercise_02.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {

    @Autowired
    @Qualifier("customerRepository")
    private ICustomerRepository customerRepository;

    @RequestMapping("/customer/list")
    public String showList(Model mode) {
        mode.addAttribute("customerList", customerRepository.findAll());
        return "index";
    }

    @RequestMapping("/info")
    public String showCustomer(Model mode, @RequestParam("id") int id) {
        mode.addAttribute("cus", customerRepository.findById(id));
        return "info";
    }

    @PostMapping("/customer/list")
    public String update(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("address") String address, RedirectAttributes redirectAttributes, Model model) {
        customerRepository.update(id, name, email, address);
        model.addAttribute("customerList", customerRepository.findAll());
        return "index";
    }

}
