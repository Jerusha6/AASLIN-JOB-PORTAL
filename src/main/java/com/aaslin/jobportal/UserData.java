package com.aaslin.jobportal;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users_data")
public class UserData {
    @Id
    private String name;
    @Lob
    @Column(name = "resume", columnDefinition = "LONGBLOB")  // <-- Fix here
    private byte[] resume;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getResume() {
		return resume;
	}
	public void setResume(byte[] resume) {
		this.resume = resume;
	}
	public UserData() {
		super();
	}
	public UserData(String name, byte[] resume) {
		super();
		this.name = name;
		this.resume = resume;
	}
	@Override
	public String toString() {
		return "UserData [name=" + name + ", resume=" + Arrays.toString(resume) + "]";
	}
	
	
}
