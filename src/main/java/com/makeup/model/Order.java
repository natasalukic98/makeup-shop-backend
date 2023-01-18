package com.makeup.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "\"order\"")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Double sum;
    @ManyToOne()
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne()
    @JoinColumn(name="delivery_type_id")
    private DeliveryType deliveryType;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn( name = "order_id")
    private List<OrderItem> orderItems;


}
