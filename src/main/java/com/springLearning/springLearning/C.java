package com.springLearning.springLearning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Component(value = "cObj")
public class C {
//    @Autowired
    private A aObj;
//    @Autowired
    private B bObj;
    public void init(){
        System.out.println("I am created : Object of class C");
    }
    public void destroy(){
        System.out.println("I am Destroyed: object of class C");
    }
}
