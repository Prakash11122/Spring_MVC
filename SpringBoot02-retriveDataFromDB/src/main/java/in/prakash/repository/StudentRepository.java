package in.prakash.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.prakash.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Serializable> {

}
