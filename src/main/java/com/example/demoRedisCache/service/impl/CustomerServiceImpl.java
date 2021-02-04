package com.example.demoRedisCache.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demoRedisCache.Customer;
import com.example.demoRedisCache.service.CustomerService;
import com.oracle.tools.packager.Log;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = {"customer"})
public class CustomerServiceImpl implements CustomerService {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerServiceImpl.class);


    @Override
    @Cacheable(key="#id")
    public Customer getCustomerById(String id) {
        LOG.info("Getting customer info for {id} " , id);
        return new Customer("User"+id, "ritikshukla535@gmail.com", id);
    }
}

