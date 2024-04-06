package com.example.Google.ReCaptcha.Validation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
 *  Step 3.) Create the Model or Entity Class for Employee Details
 * 
 * In this step, we will create a class that will be mapped with the MySQL
 * database table.
 */

@Entity
@Table(name = "employee")
@Getter
@Data
@Setter
public class EmployeeEntity {

    /*
     * @Table annotation indicates the database table name which mapped with the
     * above Entity class.
     * 
     * @Id annotation has used for representing the variable as a primary key in the
     * table.
     * 
     * And the last annotation that is @Column is used to represent the name of the
     * column which mapped with the mentioned variables or fields. But if you did
     * not tag or specify the variable with @Column then it will create the column
     * with the same name as of variable.
     */

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Double salary;
    private String address;
}
