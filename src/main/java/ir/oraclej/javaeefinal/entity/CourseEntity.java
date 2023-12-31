package ir.oraclej.javaeefinal.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name = "crs")
@Table(name = "TBL_COURSE")
@Data
public class CourseEntity extends JPAEntity{
    @Id
    @Column(name = "CID", columnDefinition = "NUMBER")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CRS_SEQ")
    @SequenceGenerator(name = "CRS_SEQ", allocationSize = 1, sequenceName = "SEQ_COURSE")
    private int id;
    @Column(name = "NAME", columnDefinition = "VARCHAR2(30)")
    private String name;
    @Column(name = "UNIT", columnDefinition = "NUMBER")
    private int unit;

    @OneToMany(targetEntity = RegisterEntity.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_CID", referencedColumnName = "CID")
    private List<RegisterEntity> registers;

}
