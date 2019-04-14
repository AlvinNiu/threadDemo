package com.alvin.thread.demo;

import com.alvin.thread.demo.thread.PersonWork;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Alvin
 */
@SpringBootApplication
public class Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.print("Hello Word!!!!");
        //现在创建三个人开始洗盘子
        PersonWork personWork1 = new PersonWork("洗碗工1");
        PersonWork personWork2 = new PersonWork("洗碗工2");
        PersonWork personWork3 = new PersonWork("洗碗工3");

        personWork1.start();
        personWork2.start();
        personWork3.start();

        while (!personWork1.isEnd()&&!personWork2.isEnd()&&!personWork3.isEnd()){

        }
    }
}
