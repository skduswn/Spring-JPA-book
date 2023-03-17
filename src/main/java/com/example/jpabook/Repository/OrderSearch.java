package com.example.jpabook.Repository;

import com.example.jpabook.Domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderSearch {
    private String memberName;
    private OrderStatus orderStatus; //
}
