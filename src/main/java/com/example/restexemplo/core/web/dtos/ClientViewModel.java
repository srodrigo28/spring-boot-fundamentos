package com.example.restexemplo.core.web.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import com.example.restexemplo.core.models.Client;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientViewModel {
    
    private Long id;
    private String name;
    private String phone;
    private String email;

    public String getPhone(){
        // return phone.replaceAll("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");
        return phone.replaceAll("(\\d{2})(\\d{1})(\\d{4})(\\d{4})", "($1) $2 $3-$4");
    }

    public static ClientViewModel of(Client client){
        /** 1 Method mais flexivel e não precisa procupar com a ordem */
        return ClientViewModel.builder()
            .id(client.getId())
            .name(client.getName())
            .email(client.getEmail())
            .phone(client.getPhone())
            .build();

        /** 2 desse modo e menos 
         * flexivel necesso usar o null não não 
         * vai passar os dados
        return new ClientViewModel(
            client.getId(),
            client.getName(),
            client.getPhone(),
            client.getEmail()
        );
        */
    }
}
