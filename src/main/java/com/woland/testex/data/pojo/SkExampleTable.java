package com.woland.testex.data.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Data
@Entity
public class SkExampleTable {

    @Id
    private Integer id;

    @JdbcTypeCode(SqlTypes.JSON)
    private MyJson obj;
}
