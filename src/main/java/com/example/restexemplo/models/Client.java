package com.example.restexemplo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sexo;
    
    @Column(nullable = false)
    private int age;

    public Client(String string, int i) {
    }

    public Client(String nome, String sexo, int age) {
        this.nome = nome;
        this.sexo = sexo;
        this.age = age;
    }

    public Client(Long id, String nome, String sexo, int age) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cliente: nome=" + nome + ", sexo=" + sexo + ", idade=" + age + " ";
    }

    public Long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    public String getSexo() {
        return sexo;
    }
    public int getAge() {
        return age;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
   
}
