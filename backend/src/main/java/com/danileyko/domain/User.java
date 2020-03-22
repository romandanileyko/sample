package com.danileyko.domain;

import lombok.Data;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "user")
public class User {
   @Id
   private Integer id;
   private String username;
   private String password;
   private BigDecimal salary;
   private Integer age;
}
