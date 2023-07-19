package com.example.Proiectspring.controller;

import jakarta.persistence.*;

@Entity
@Table(name = "t_fotbalisti")
public class Fotbalisti extends Echipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "number")
    private int number;

    @Column(name="name")
    private String name;

    @Column(name="team")
    private String team;

    @ManyToOne
    @JoinColumn(name = "id_echipe")
    private Echipe echipe;

    public Fotbalisti(int number, String name, String team) {
        super(team);
        this.id = id;
        this.number = number;
        this.name = name;
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fotbalisti() {
        super();
    }


    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }



    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Fotbalisti{" +
                "id=" + id +
                "number=" + number +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
