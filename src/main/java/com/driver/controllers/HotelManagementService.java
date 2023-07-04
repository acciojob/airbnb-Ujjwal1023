package com.driver.controllers;

import com.driver.model.Booking;
import com.driver.model.Facility;
import com.driver.model.Hotel;
import com.driver.model.User;

import java.util.List;

public class HotelManagementService {

    HotelManagementRepository repository=new HotelManagementRepository();
    public String addHotel(Hotel hotel) {
        String ans=repository.addHotel(hotel);
        return ans;
    }

    public Integer addUser(User user) {
        int adharNo=repository.addUser(user);
        return adharNo;
    }

    public String getHotelWithMostFacilities() {
        String hotelName=repository.getHotelWithMostFacilities();
        return hotelName;
    }

    public int bookARoom(Booking booking) {
     return repository.bookARoom(booking);
    }

    public int getBookings(Integer aadharCard) {
        int count=repository.getBookings(aadharCard);
        return count;
    }

    public Hotel updateFacilities(List<Facility> newFacilities, String hotelName) {
        return repository.updateFacilities(newFacilities,hotelName);
    }
}
