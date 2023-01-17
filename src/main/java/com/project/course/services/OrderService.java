package com.project.course.services;

import java.util.List;
import java.util.Optional;

import com.project.course.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.course.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<com.project.course.entities.Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<com.project.course.entities.Order> obj = repository.findById(id);
        return obj.get();
    }
}