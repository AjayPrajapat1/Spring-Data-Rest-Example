package com.ajayprajapat.restrepository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ajayprajapat.restrepository.entity.EmployeeEntity;

@RepositoryRestResource(collectionResourceRel = "employees", path = "employee-list")
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
