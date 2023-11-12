package ir.oraclej.javaeefinal.service;

import ir.oraclej.javaeefinal.UniversityException;
import ir.oraclej.javaeefinal.entity.CourseEntity;
import ir.oraclej.javaeefinal.entity.RegisterEntity;
import ir.oraclej.javaeefinal.entity.StudentEntity;
import ir.oraclej.javaeefinal.dao.CourseRepo;
import ir.oraclej.javaeefinal.dao.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    public boolean addOne(CourseEntity courseEntity) {
        try {
            courseRepo.save(courseEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean editOne(CourseEntity courseEntity) {
        try {
            courseRepo.save(courseEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean deleteOne(int id) {
        try {
            courseRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<CourseEntity> getAll(){
        return courseRepo.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public Optional<CourseEntity> getOne(int id){
        return courseRepo.findById(id);
    }
}
