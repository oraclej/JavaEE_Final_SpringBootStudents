package ir.oraclej.javaeefinal.dao;

import ir.oraclej.javaeefinal.entity.RegisterEntity;
import ir.oraclej.javaeefinal.entity.RegisterPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepo extends JpaRepository<RegisterEntity, RegisterPK> {
}
