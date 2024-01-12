package com.example.exercise_04.controller;

import com.example.exercise_04.Repository.IDictionaryRepository;
import com.example.exercise_04.model.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryRepository iDictionaryRepository;

    @RequestMapping("/dictionary")
    public String search(Model model) {
        model.addAttribute("dictionary", new Dictionary("", ""));
        return "index";
    }

    @PostMapping("/dictionary")
    public String findByWordEn(@ModelAttribute("dictionary") Dictionary dictionary, BindingResult bindingResult, Model model) {
        if(iDictionaryRepository.search(dictionary.getWordEn()) != null){
            dictionary.setWordVn(iDictionaryRepository.search(dictionary.getWordEn()));
            dictionary.setResult("");
        } else {
            dictionary.setWordEn("");
            dictionary.setWordVn("");
            dictionary.setResult("không tìm thấy từ bạn cần");
        }
        return "index";
    }
}

