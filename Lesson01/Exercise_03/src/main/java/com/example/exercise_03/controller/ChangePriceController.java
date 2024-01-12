package com.example.exercise_03.controller;
import com.example.exercise_03.model.Money;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChangePriceController {

    @RequestMapping("/changePrice")
    public String change(Model model) {
        model.addAttribute("money", new Money(0.0, 0.0, 0.0));
        return "index";
    }

    @PostMapping("/changePrice")
    public String result(@ModelAttribute("money") Money money, BindingResult bindingResult){
        money.setAmountVnd( money.getAmountUsd()*money.getChangePrice());
        money.setAmountUsd(0.0);
        money.setChangePrice(0.0);
        return "index";
    }

}
