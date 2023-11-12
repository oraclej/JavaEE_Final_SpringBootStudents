package ir.oraclej.javaeefinal.dao;

import ir.oraclej.javaeefinal.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {
}
