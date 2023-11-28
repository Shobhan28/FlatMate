package com.flatmateapp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor@AllArgsConstructor
public class PackagePayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentIntentId;
    private double amount;
    private String currency;
    // Additional fields
    private String payerName;
    private String payerEmail;
    private Date paymentDate;
}
