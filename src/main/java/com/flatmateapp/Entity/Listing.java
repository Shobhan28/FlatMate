package com.flatmateapp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "listings")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lid;

    @Column(name = "accommodation_type", nullable = false)
    private String accommodationType;  // Apartment, House, Room, etc.

    @Column(name = "number_of_rooms")
    private int numberOfRooms;

    @Column(name = "bhk_type")
    private int bhkType;

    @Column(name = "furnished")
    private boolean furnished;

    @Column(name = "parking_available")
    private boolean parkingAvailable;

    @Column(name = "locality")
    private String locality;

    @Column(name = "amenities")
    private String amenities;

    @Column(name = "rent_amount")
    private double rent;

    @Column(name = "contact_person")
    private String contactPerson;

    @Column(name = "contact_email", nullable = false)
    private String contactEmail;

    @Column(name = "contact_number", length = 15)
    private String contactNumber;

    private String status;
}