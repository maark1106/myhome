package com.mark1106.myhome.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2, max=30, message = "제목은 2~30자 사이여야 합니다!")
    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}