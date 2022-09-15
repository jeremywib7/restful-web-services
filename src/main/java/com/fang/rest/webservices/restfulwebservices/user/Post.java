package com.fang.rest.webservices.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 10)
    @NonNull
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @NonNull
    private User user;

}
