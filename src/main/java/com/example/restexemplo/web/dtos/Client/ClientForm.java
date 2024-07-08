package com.example.restexemplo.web.dtos.Client;

import com.example.restexemplo.core.models.Client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientForm {
    
    private String name;
    private String email;
    private String phone;

    public String cleanedPhone(){ // todos caracteres diferent de 1 a 9
        return phone.replaceAll("[^0-9]", "");
    }

    public Client toClient(){
        return Client.builder()
            .name(name)
            .email(email)
            .phone(cleanedPhone())
            .build();
    }
}
