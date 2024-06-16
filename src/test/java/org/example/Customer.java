package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Customer implements Serializable {
    private CustomerKey key;
    private String firstName;
    private String lastName;
    private int age;
}
