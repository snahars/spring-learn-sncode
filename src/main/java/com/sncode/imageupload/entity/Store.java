package com.sncode.imageupload.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STORE", schema = "spring_db")
public class Store {

    @Id

    @SequenceGenerator(name = "store_sequence",
            sequenceName = "store_sequence",
            allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "store_sequence")

    private Long storeId;

    @Column(name = "store_name",
            nullable = false)

    private String storeName;

    private Long parentStoreId;
}
