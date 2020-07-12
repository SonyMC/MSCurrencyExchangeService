package com.in28minutes.microservices.currencyexchangeservice.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.microservices.currencyexchangeservice.beans.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	ExchangeValue findByFromAndTo(String from, String to);
	
	ExchangeValue findByFrom(String from);

	ExchangeValue findByTo(String to);
	
}
