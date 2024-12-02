package com.example.EmployeeManagement.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "designation")
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long designationId;

    private String designationName;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
