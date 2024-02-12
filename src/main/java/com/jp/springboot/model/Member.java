package com.jp.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {
    public Member(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long memberId;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "member")
    @JoinColumn(name = "personId")
    private Person person;

    private String name;
    private String gender;
    private String phone;
    private String email;
}
