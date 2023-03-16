package com.springLearning.springLearning;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class B {
    private List<Integer> listForB;
    public void init(){
        System.out.println("I am created : Object of class B");
    }
    public void destroy(){
        System.out.println("I am Destroyed: object of class B");
    }
}
