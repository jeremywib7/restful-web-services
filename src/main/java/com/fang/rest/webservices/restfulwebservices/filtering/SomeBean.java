package com.fang.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonFilter("SomeBeanFilter")
//@JsonIgnoreProperties({"field1", "field2"})
public class SomeBean {
    private String field1;

    //    @JsonIgnore
    private String field2;

    private String field3;
}
