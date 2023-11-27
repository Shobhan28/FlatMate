package com.flatmateapp.Controller;

import com.flatmateapp.Payload.ListingDTO;
import com.flatmateapp.Service.ListingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/listings")
public class ListingController {

    private ListingService listingService;

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    @PostMapping
    public ResponseEntity<ListingDTO> addProperty(@RequestBody ListingDTO listingDTO) {
        ListingDTO savedListing = listingService.saveListing(listingDTO);
        return new ResponseEntity<>(savedListing, HttpStatus.CREATED);
    }

    // You can add more CRUD endpoints or additional functionality as needed

    @PatchMapping("/{propertyId}/approve")
    public ResponseEntity<ListingDTO> approvePropertyListing(@PathVariable Long propertyId) {
        ListingDTO approvedListing = listingService.approvePropertyListing(propertyId);
        return new ResponseEntity<>(approvedListing, HttpStatus.OK);
    }
}
