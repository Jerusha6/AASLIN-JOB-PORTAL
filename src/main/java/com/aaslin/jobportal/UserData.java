package com.aaslin.jobportal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="users_data")
public class UserData {
    @Id
    private String name;
    private byte[] resume;
}
