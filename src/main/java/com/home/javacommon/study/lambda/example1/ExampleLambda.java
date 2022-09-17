package com.home.javacommon.study.lambda.example1;

import com.home.javacommon.study.lambda.Cal;
import com.home.javacommon.study.Example;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ExampleLambda implements Example {

    @Override
    public void runApp() {
        Cal add = (int a, int b) ->{
            return a + b;
        };

        int c = add.cal(3,4);
        log.info("3 + 4 = {}", c);


        Cal mult = (int a, int b) ->{
            return a * b;
        };

        c = mult.cal(3,4);
        log.info("3 * 4 = {}", c);


    }


}
