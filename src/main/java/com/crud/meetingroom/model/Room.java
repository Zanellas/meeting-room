package com.crud.meetingroom.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="MEETINGROOM")
@Data
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String date;
    private String startHour;
    private String endHour;
}
