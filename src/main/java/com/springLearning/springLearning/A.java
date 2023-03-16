package com.springLearning.springLearning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component(value = "aObj")
public class A {
    @Autowired
    @Qualifier("bObj")
    private B bObj;

    @Autowired
    @Qualifier("listOfB")
    private List<B> listOfB;
    @Value("10")
    private long temp;
    public A(B bObj, ArrayList<B> listOfB, long temp) {
        this.bObj = bObj;
        this.listOfB = listOfB;
        this.temp = temp;
    }

    public void init(){
        System.out.println("I am created : Object of class A");
    }

    public void destroy(){
        System.out.println("I am Destroyed: object of class A");
    }
}
