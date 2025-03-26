package com.pankiba.manytomany.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(exclude = { "employees" })
@ToString
@NoArgsConstructor
@Entity
public class Project implements Serializable {

	private static final long serialVersionUID = 5538009164762114237L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projectid_generator")
	@SequenceGenerator(name = "projectid_generator", sequenceName = "project_id_seq", allocationSize = 50, initialValue = 1001)
	private Long projectId;

	private String name;

	@JsonBackReference
	@ManyToMany(mappedBy = "projects")
	private Set<Employee> employees = new HashSet<Employee>();

	public Project(String name) {
		this.name = name;
	}

}
