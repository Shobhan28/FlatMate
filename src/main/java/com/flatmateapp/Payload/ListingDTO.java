package com.flatmateapp.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListingDTO {

    private long lid;
    private String accommodationType;
    private int numberOfRooms;
    private int bhkType;
    private boolean furnished;
    private boolean parkingAvailable;
    private String locality;
    private String amenities;
    private double rent;
    private String contactPerson;
    private String contactEmail;
    private String contactNumber;
    private String status;
}
