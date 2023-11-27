package com.flatmateapp.Controller;

import com.flatmateapp.Payload.ListingDTO;
import com.flatmateapp.Service.ListingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/listings")
public class ListingController {


    private final ListingService listingService;

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    @PostMapping
    public ResponseEntity<ListingDTO> addProperty(@RequestBody ListingDTO listingDTO) {
        ListingDTO savedListing = listingService.saveListing(listingDTO);
        return new ResponseEntity<>(savedListing, HttpStatus.CREATED);
    }

}
