package com.example.jpabook.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name ="order_item")

public class OrderItem {
    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order; //주문

    private int orderPrice; // 주문가격
    private int count;

    //생성메서드//
    public static OrderItem createOrderItem(Item item,
                                            int orderPrice, int count) {
        OrderItem orderItem = new OrderItem();
        orderItem.setItem(item);
        orderItem.setOrderPrice(orderPrice);
        orderItem.setCount(count);
        item.removeStock(count);
        return orderItem;
    }


    //주문취소//
    public void cancel() {
        getItem().addStock(count);
    }


    //조회 로직//
    public int getTotalPrice() {
        return getOrderPrice() * getCount();
    }
}
