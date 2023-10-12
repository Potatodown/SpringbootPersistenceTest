package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JobHistoryEntity {

    @Id
    private int Employee_Id;

    @Id
    private String Start_Date;

    private String End_Date;

    private int Job_Id;

    private int Department_Id;
}
