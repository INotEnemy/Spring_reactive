package com.woland.testex.data.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyJson implements Serializable {

    private Integer current;

    public int addToCurr(int i) {
        int newCurr = getCurrent() + i;
        setCurrent(newCurr);
        return newCurr;
    }
}
