package com.example.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "job_adverts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_advert_id")
    private Integer jobAdvertId;

    @Column(name = "job_position_name")
    private String jobPositionName;

    @Column(name = "job_requirement")
    private String jobRequirement;

    @Column(name = "city")
    private String city;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "job_position_count")
    private Integer jobPositionCount;

    @Column(name = "deadLine")
    private Date deadLine;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;
}
