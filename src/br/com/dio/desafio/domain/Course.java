package br.com.dio.desafio.domain;

public class Course extends Content {

    private double duration;

    public Course() {
    }

    @Override
    public double calculateXp() {
        return INITIAL_XP * duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", duration=" + duration +
                '}';
    }
}
