package ir.oraclej.javaeefinal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
//@Data
//@Embeddable
public class RegisterPK implements Serializable {
    private int sid;
    private int cid;
    private String term;
}
