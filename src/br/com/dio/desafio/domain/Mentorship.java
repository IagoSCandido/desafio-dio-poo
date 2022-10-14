package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentorship extends Content {

    private LocalDate date;

    public Mentorship() {
    }

    @Override
    public double calculateXp() {
        return INITIAL_XP + 20d;
    }

    public LocalDate dateate() {
        return date;
    }

    public void setMentorshipDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
