package 多线程.runnable;

/**
 * @author 吕二宁
 * @version 1.0
 * @description: TODO
 * @date 2022/4/27 20:59
 */
public class RunnableTest1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("执行run方法");
        }
    }

    public static void main(String[] args) {
        RunnableTest1 runnableTest1 = new RunnableTest1();
        new Thread(runnableTest1,"测试").start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("执行start方法");
        }
    }
}
