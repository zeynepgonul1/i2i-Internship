package com.swagger.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Customer Data Transfer Object")
public class CustomerDTO {

    @Schema(description = "Unique ID of the customer", example = "1")
    private Long id;

    @NotBlank
    @Schema(description = "Full name of the customer", example = "John Doe")
    private String name;

    @Email
    @Schema(description = "Email address", example = "john.doe@example.com")
    private String email;

    // Alt + Insert (Windows) ile getter/setter ekleyebilirsin
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
