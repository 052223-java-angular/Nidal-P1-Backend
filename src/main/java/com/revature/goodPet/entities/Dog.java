package com.revature.goodPet.entities;



import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "dogs")
public class Dog {
    @Id
    private String id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private double price;

    @ManyToOne
    @JoinColumn(name = "breed_id")
    @JsonBackReference
    private Breed breed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User users;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    @JsonBackReference
    private Sales sale;

}
