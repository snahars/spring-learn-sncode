package com.sncode.imageupload.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SUPPLIER", schema = "spring_db")
public class Supplier {

    @Id

    @SequenceGenerator(name = "supplier_sequence",
    sequenceName = "supplier_sequence",
    allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "supplier_sequence")

    private Long supplierId;

    @Column(name = "supplier_name",
            nullable = false)

    private String supplierName;

}
