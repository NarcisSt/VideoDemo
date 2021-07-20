package com.example.demo.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "VIDEO")
public class Video {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private Date date;

    @Lob
    private Blob content;

    private String genre;
}
