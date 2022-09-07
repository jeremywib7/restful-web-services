package com.fang.rest.webservices.restfulwebservices.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

    @NonNull
    private String name;

    @NonNull
    private LocalDate birthDate;
}
