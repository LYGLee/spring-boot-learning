package com.boot.dao;

import com.boot.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by wl on 2017/6/27.
 */
public interface CustomerRepository extends MongoRepository<Customer,String> {

    Customer findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);
}
