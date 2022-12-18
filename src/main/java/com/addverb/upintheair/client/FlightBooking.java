package com.addverb.upintheair.client;

import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

public class FlightBooking {

    public static void main(String[] args) {
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:9091/add-customer";
//        Customer customer = new Customer();
//        customer.setName("Diptampaul");
//        customer.setEmail("diptampaul@gmail.com");
//        customer.setPhone("9873900018");
//        customer.setCity("Delhi");
//        customer.setDateOfBirth(LocalDate.of(2000,11,10));
//        Status response = rt.postForObject(url, customer, Status.class);
//        System.out.println(response);
    }
}
