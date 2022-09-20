package com.api.timf.Entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class VOCEntity {

    @Id
    @GeneratedValue
    private Long id;
}
