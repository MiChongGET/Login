package com.e8net.game;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/12.
 *
 * 猜数字小游戏
 */
public class GuessNumber {
    public GuessNumber() {
    }

    public static void start(){
        //产生一个随机数
        int number  = (int) (Math.random()*100+1);

        //定义一个统计变量
        int count = 0;

        while (true) {
            count++;
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入1-100");
            int guessNum = sc.nextInt();
            //判断
            if (guessNum > number) {
                System.out.println("数字大了");
            } else if (guessNum < number) {
                System.out.println("你输入的数字小了");
            } else {
                System.out.println("恭喜你，你猜中了！"+"使用了"+count);
                System.out.println("数字是："+number);
                break;
            }
        }
    }
}
