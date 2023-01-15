package jpabook.jpashop.domain.item;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Album extends Item {
    private String artist;
    private String etc;
}
