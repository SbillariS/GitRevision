package com.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class School
{
	@Id
    private int sid;
    private String sname;
    private String saddress;
    private int spin;
}
