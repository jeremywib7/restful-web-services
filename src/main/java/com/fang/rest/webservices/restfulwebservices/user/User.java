package com.fang.rest.webservices.restfulwebservices.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class User implements Serializable {

    @Id
    @NonNull
    private Integer id;

    @Size(min = 2, message = "Name should have at least 2 characters")
    @NonNull
    private String name;

    @Past(message = "Birthdate should be in the past")
    @NonNull
    private LocalDate birthDate;
}
