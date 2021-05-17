package com.nguyenkhoi.mongoddd.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Hello {
    @Setter
    private int id;

    @Setter
    private String content;

    @Setter
    private int number;

    @Setter
    private String name;

    @Id
    public int getId() {
        return id;
    }

    @Column
    public String getContent() {
        return content;
    }

    @Column
    public int getNumber() {
        return number;
    }

    @Column
    public String getName() {
        return name;
    }
}
