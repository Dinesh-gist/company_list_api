package com.gistimpact.companylist.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "entity_info")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "guid", unique = true, updatable = false, nullable = false, columnDefinition = "CHAR(36)") // @Column annotation is used to define the column in database that maps annotated field.
    private String guid;
    private String companyName;
}
