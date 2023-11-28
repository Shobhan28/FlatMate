package com.flatmateapp.Service;

import com.flatmateapp.Payload.ListingDTO;

public interface ListingService {

    ListingDTO saveListing(ListingDTO listingDTO);

    ListingDTO approvePropertyListing(Long propertyId);

    ListingDTO getListingById(Long id);
}
