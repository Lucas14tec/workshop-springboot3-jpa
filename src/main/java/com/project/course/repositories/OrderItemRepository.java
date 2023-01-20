package com.project.course.repositories;

import com.project.course.entities.OrderItem;
import com.project.course.entities.User;
import com.project.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository <OrderItem, OrderItemPK> {

}
