package com.alvin.thread.demo.thread;

/**
 * @author Alvin
 * @date 2019-04-14 19:09
 * @description 盘子
 **/
public class Dish {
    /**
     * 表示盘子总数量
     */
    static int numbers = 10000;
    /**
     * 表示盘子当前处理的数量
     */
    static int index = 0;
    private  static final Object mylock = new Object();

    public static void add() {
        synchronized (mylock) {
            index++;
        }
    }
}
