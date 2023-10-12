package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JobsEntity {

    @Id
    private int jobs_id;

    private String job_title;

    private Double min_salary;

    private Double max_salary;

    public int getJobs_id() {
        return jobs_id;
    }

    public void setJobs_id(int jobs_id) {
        this.jobs_id = jobs_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public Double getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(Double min_salary) {
        this.min_salary = min_salary;
    }

    public Double getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(Double max_salary) {
        this.max_salary = max_salary;
    }
}
