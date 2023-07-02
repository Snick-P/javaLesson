package com.javalesson.collection.map.treemap;

import java.io.Serializable;
import java.util.Objects;

public class SubjectGrade implements Serializable {
    private final String subject;
    private final int grade;

    public SubjectGrade(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubjectGrade)) return false;
        SubjectGrade that = (SubjectGrade) o;
        return getGrade() == that.getGrade() && Objects.equals(getSubject(), that.getSubject());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSubject(), getGrade());
    }

    @Override
    public String toString() {
        return "Discipline: "+subject+" Grade:"+grade;
    }
}
