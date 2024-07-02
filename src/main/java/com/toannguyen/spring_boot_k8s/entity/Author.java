package com.toannguyen.spring_boot_k8s.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * model class for "Author"
 *
 * @author @bootteam
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    private String id;

    private String lastname;

    private String firstname;
}
