package com.clouddestinations.engg.assessment.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Rating implements Serializable {
    private static final long serialVersionUID = 8974249549534931004L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int year;
    private String assessedRating;

    public Rating() {

    }

    public Rating(int year, String assessedRating) {
        this.year = year;
        this.assessedRating = assessedRating;
    }

    @Override
    public String toString() {
        return "Rating [assessedRating=" + assessedRating + ", id=" + id + ", year=" + year
                + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAssessedRating() {
        return assessedRating;
    }

    public void setAssessedRating(String assessedRating) {
        this.assessedRating = assessedRating;
    }
}
