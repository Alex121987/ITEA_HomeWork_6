package hw6task5;

import java.util.Comparator;

public class Worker {
    private String PIB;
    private String job;
    private int year;

    public Worker(String PIB, String job, int year) {
        this.PIB = PIB;
        this.job = job;
        this.year = year;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Worker "+"Name: "+PIB+", job: "+job+", year: "+year;
    }
}


