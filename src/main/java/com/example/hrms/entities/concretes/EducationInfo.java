package com.example.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "education_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "school")
    private String school;

    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "graduate_date")
    private Date graduateDate;

    @Column(name = "isContinuing")
    private Boolean isContinuing;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "resume_id")
    private Resume resume;
}
