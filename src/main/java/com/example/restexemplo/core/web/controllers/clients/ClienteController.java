package com.example.restexemplo.core.web.controllers.clients;

// import java.util.ArrayList;
// import com.example.restexemplo.core.models.Client;
import java.util.Map;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.restexemplo.core.repository.ClientRepository;
import com.example.restexemplo.core.web.dtos.ClientViewModel;

@Controller
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClienteController {
    
    private final ClientRepository clientRepository;

    @GetMapping
    public ModelAndView index(){
    /*** Opção 2  */
        var clients = clientRepository.findAll()
        .stream()
        .map(ClientViewModel::of)
        .toList();
    
        var model = Map.of("clients", clients);
        return new ModelAndView("clients/index", model);
    }
}

