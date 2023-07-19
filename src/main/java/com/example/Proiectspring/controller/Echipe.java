package com.example.Proiectspring.controller;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "t_echipe")
public class Echipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "team")
    private String team;
    @Column(name = "ranking")
    private int ranking;
    @Column(name = "liga")
    private String liga;

    @OneToMany(mappedBy = "echipe")
    private List<Fotbalisti> fotbalistiList;
    public Echipe(String team, int ranking, String liga) {
        this.id = id;
        this.team = team;
        this.ranking = ranking;
        this.liga = liga;
    }

    public Echipe(String team) {
        this.team = team;
    }

    public Echipe() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    @Override
    public String toString() {
        return "Echipe{" +
                "id=" + id +
                "team='" + team + '\'' +
                ", ranking=" + ranking +
                ", liga='" + liga + '\'' +
                '}';
    }
}
