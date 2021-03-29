package com.sncode.imageupload.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCT_RECEIVE", schema = "spring_db")
public class ProductReceive {

    @Id

    @SequenceGenerator(name = "product_receive_sequence",
            sequenceName = "product_receive_sequence",
            allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "product_receive_sequence")

    private Long receiveId;

    @Column(name = "product_id",
            nullable = false)

    private Long productId;

    @Column(name = "supplier_id",
            nullable = false)

    private Long supplierId;

    @Column(name = "quantity",
            nullable = false)

    private int quantity;

    @Column(name = "price",
            nullable = false)

    private double price;

    private Date manufactureDate;
    private Date expiredDate;

    @Column(name = "receive_date",
            updatable = false)

    private Date receiveDate;

}
