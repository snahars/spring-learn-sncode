package com.sncode.imageupload.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name = "PRODUCT", schema = "spring_db",
uniqueConstraints = {
        @UniqueConstraint(name = "product_name_unique", columnNames = "product_name")
})
public class Product {

    @Id

    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )

    @Column(name = "product_id",
            updatable = false)

    private Long productId;

    @Column(name = "product_name",
            nullable = false)

    private String productName;



}
