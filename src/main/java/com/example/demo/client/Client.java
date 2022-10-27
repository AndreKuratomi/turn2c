package com.example.demo.client;

import javax.persistence.*;

@Entity
@Table
public class Client {
    @Id
    @SequenceGenerator(
        name = "client_sequence",
        sequenceName = "client_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationSize.SEQUENCE,
        generator = "client_sequence",
    )
    private Long id;
    private String name;
    private String email;
    
    // 3 CONSTRUCTORS:
    // Constructor 1/3:
    public Client() {
    }
    
    // Constructor 2/3 (Constructor with everything):
    public Client(Long id,
                  String name,
                  String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    // Constructor 3/3 (Constructor without ID):
    public Client(String name,
                  String email) {
        this.name = name;
        this.email = email;
    }

    // GETTERS & SETTERS:
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void set(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void set(String email) {
        this.email = email;
    }

    // TOSTRING:
    @Override
    public String toString() {
        return "Client{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               "}";
    }
}
