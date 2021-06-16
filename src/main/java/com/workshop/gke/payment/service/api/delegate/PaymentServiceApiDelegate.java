package com.workshop.gke.payment.service.api.delegate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.workshop.gke.payment.service.api.CheckApiDelegate;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PaymentServiceApiDelegate implements CheckApiDelegate {
	@Override
	public ResponseEntity<Void> check() {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
