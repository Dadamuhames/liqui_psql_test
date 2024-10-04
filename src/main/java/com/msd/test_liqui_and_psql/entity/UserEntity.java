package com.msd.test_liqui_and_psql.entity;

import com.msd.test_liqui_and_psql.entity.abstracts.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_entity")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity extends BaseEntity {
  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "phone", nullable = false, unique = true)
  private String phone;

  @Column(name = "age", nullable = false)
  private Integer age;
}
