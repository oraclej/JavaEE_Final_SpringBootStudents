package ir.oraclej.javaeefinal.dao;


import ir.oraclej.javaeefinal.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {
}
