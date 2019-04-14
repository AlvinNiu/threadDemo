package com.alvin.thread.demo.thread;

/**
 * @author Alvin
 * @date 2019-04-14 18:57
 * @description 工人工作 继承Thread类，重写run方法
 **/

public class PersonWork extends Thread {
    String personName;
    public int count = 0;
    /**
     * 是否结束
     */
    public boolean isEnd = false;

    public PersonWork(String personName) {
        this.personName = personName;
    }

    public boolean isEnd() {
        return isEnd;
    }

    /**
     * 重写run方法，只需要将阻塞比较耗时的操作放在此处即可
     */
    @Override
    public void run() {
        System.out.println(personName + "开始洗盘子");
        while (Dish.index < Dish.numbers) {
            //这个盘子在洗的过程中，数量要加1
            Dish.add();
            try {
                //洗一个盘子需要10s
                System.out.println(personName + "现在洗第" + (Dish.index) + "个盘子");
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
        isEnd = true;
        System.out.println("打完收工,我一共洗了" + count + "个盘子");
    }
}
