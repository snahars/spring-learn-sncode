package com.sncode.imageupload.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCT_RECEIVE_DET", schema = "spring_db")
public class ProductReceiveDet {

    @Id

    @SequenceGenerator(name = "product_receive_det_sequence",
            sequenceName = "product_receive_det_sequence",
            allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "product_receive_det_sequence")

    private Long receiveDetId;

    @Column(name = "receive_id",
            nullable = false)

    private Long receiveId;

    @Column(name = "store_id",
            nullable = false)
    private Long storeId;

}
