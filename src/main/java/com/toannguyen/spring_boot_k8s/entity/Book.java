package com.toannguyen.spring_boot_k8s.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String id;
    private String title;
    private String isbn;
    private String description;
    private Integer page;
    private BigDecimal price;
}
