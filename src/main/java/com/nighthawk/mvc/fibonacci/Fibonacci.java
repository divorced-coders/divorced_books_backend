package com.nighthawk.mvc.fibonacci;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

// Entity annotation indicates that this class is a JPA entity.
// This means that a table will be created in the database based on this class.
import lombok.*;

@NoArgsConstructor
@Entity
public class Fibonacci {

  // The @Id annotation specifies the primary key of the table.
  // @GeneratedValue specifies how the primary key should be generated.
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  // Name of the assignment.
  private double value;

}
