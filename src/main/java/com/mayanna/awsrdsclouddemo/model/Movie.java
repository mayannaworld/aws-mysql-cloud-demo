package com.mayanna.awsrdsclouddemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movie {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "title")
    private String movietitle;
    @Column(name = "streamingPlatform")
    private String streamingPlatform;
    @Column(name = "language")
    private String language;

}
