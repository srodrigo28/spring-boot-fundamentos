package com.example.restexemplo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.restexemplo.core.models.Client;

@Controller
public class ExemploRotasController {
    
    @GetMapping("/teste")
    public String test(Model model) {
        model.addAttribute("nome", "Sebastião");
        return "teste";
    }

    @GetMapping("/teste2")
    public ModelAndView action2(){
        var modelAndView = new ModelAndView("teste");
        modelAndView.addObject("nome", "João");
        return modelAndView;
    }

    // Start Rota form
    @GetMapping("/teste3")
    public String action3(){
        return "form";
    }

    // Recebendo dados do formulário e salvando no console
    @PostMapping("/teste3")
    public String action4(Client client){
        System.out.println(client.toString());
        return "form";
    }
    // End

    // Carregando valores nos campos inputs
    @GetMapping("/teste4")
    public String action4(Model model){
        model.addAttribute("client", new Client("Sebastião M ", "m", "27"));
        return "formTeste";
    }

    // passando RequestParam param 
    // http://localhost:8080/teste5?q=java
    @GetMapping("/teste5")
    public String action5(@RequestParam String q){
        System.out.println(q);
        return "teste";
    }

    // http://localhost:8080/teste6?age=27&skills=python,java,php
    @GetMapping("/teste6")
    public String action6(
        @RequestParam(name = "q", required = false, defaultValue = "treinaWeb")
        String busca,
        @RequestParam int age,
        @RequestParam List<String> skills
    ){
        System.out.println(busca);
        System.out.println(age);
        System.out.println(skills);
        return "teste";
    }

    // pegando valor por id dinamico
    // http://localhost:8080/teste7/10
    @GetMapping("/teste7/{id}")
    public String action7(@PathVariable Long id){
       System.out.println(id);
       return "teste";
    }

    // pegando valor por id dinamico
    // http://localhost:8080/teste7/10/notebook
    @GetMapping("/teste8/{id}/{name}")
    public String action8(
        @PathVariable Long id,
        @PathVariable Long name
    ){
       System.out.println(id);
       return "teste"; // página html que recebe
    }
}
