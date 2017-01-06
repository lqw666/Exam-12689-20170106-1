package com.hand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.mapper.CustomerMapper;
import com.hand.service.CustomerService;

@Service
public class CustomerServiceimpl implements CustomerService{
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public boolean CheckLogin(String title) {
		if(customerMapper.getCustomer(title).size()!=0){
			return true;
		}else {
			return false;
		}
	}
	

}
