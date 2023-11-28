package com.flatmateapp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "packages")
public class LegalPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;
    private String name;
    private String description;
    private double price;
    @ElementCollection
    @CollectionTable(name = "included_services", joinColumns = @JoinColumn(name = "package_id"))
    @Column(name = "service_name")
    private List<String> includedServices;
    private String termsAndConditions;
}
