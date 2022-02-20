package com.codingwithtushar.cards.controller;

import com.codingwithtushar.cards.model.Cards;
import com.codingwithtushar.cards.model.Customer;
import com.codingwithtushar.cards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;

    @PostMapping("/myCards")
    public List<Cards> getCardDetails(@RequestBody Customer customer)  {
        System.out.println("tushar : getMyCards function is called and customerId is " + customer.getCustomerId());
        List<Cards> cards = cardsRepository.findByCustomerId(customer.getCustomerId());
        return cards;
    }
}
