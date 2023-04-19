package com.ibrahimbayburtlu.springjavabeanvalidation.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Must be not null") // not null value
    @Size(min = 3) // min length 3 value
    private String  nameSurname;

    @NotBlank(message = "Must be bot Blank")
    private String schoolName;

    @Email(message = "Email should be valid")
    private String email;

    @Min(value = 18, message = "Cannot be younger than 18 years old.")
    private int age;

    @Pattern(regexp = "[0-9\\s]{12}")
    private String phone;

}
