package br.com.dio.desafio.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);
    private Set<Dev> subscribedDevs = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getSubscribedDevs() {
        return subscribedDevs;
    }

    public void setSubscribedDevs(Set<Dev> subscribedDevs) {
        this.subscribedDevs = subscribedDevs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(getName(), bootcamp.getName()) && Objects.equals(getDescription(),
                bootcamp.getDescription()) && Objects.equals(getInitialDate(),
                bootcamp.getInitialDate()) && Objects.equals(getFinalDate(),
                bootcamp.getFinalDate()) && Objects.equals(getSubscribedDevs(),
                bootcamp.getSubscribedDevs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription(), getInitialDate(), getFinalDate(), getSubscribedDevs());
    }
}
