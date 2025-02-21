package cn.jianwoo.test;

import cn.jianwoo.play.Animation;
import cn.jianwoo.play.AudioPlay;

import java.io.File;

/**
 * Description:反方向的鈡
 * User:只想守護伱.Leo
 * Date:2022-12-04
 * Time:1:57
 */
public class FanFangXiangDeZhong {
    public static void main(String[] args) {
        String path =
                new File("").getAbsolutePath() + File.separator + "src/main/resources/notes" + File.separator;

        String notes = " 6+  0   5+  0   3+  0   2+  0   0   0   6   0   5   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   6   0   5   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                //5
                " 6+  0   5+  0   3+  0   2+  0   0   0   6   0   5   0   0   0   " +
                " 0   0   0   0   0   0   5   0   0   0   0   0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   6   0   5   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                //9
                " 0   0   0   0   0   0   0   0   0   0   0   0   5   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   6   0   " +
                " 0   0   1+  0   0   0   2+  0   0   0   3+  0   0   0   5+  0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   6   0   " +
                //13
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   6   0   " +
                " 0   0   1+  0   0   0   2+  0   0   0   3+  0   0   0   5+  0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   6   0   " +
                //17
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                //21
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                //25
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                //29
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                //33
                " 7   0   0   0   5   0   0   0   5   0   0   0   5   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   1+  0   " +
                " 0   0   2+  0   0   0   3+  0   0   0   5+  0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   2+  0   " +
                //37
                " 0   0   0   0   1+  0   2+  0   0   0   1+  0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   1+  0   " +
                " 0   0   2+  0   0   0   3+  0   0   0   5+  0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   6   0   " +
                //41
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   1+  0   " +
                " 0   0   2+  0   0   0   3+  0   0   0   5+  0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   2+  0   " +
                //45
                " 0   0   0   0   1+  0   2+  0   0   0   1+  0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   1+  0   " +
                " 0   0   2+  0   0   0   3+  0   0   0   5+  0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   6   0   " +
                //49
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                //53
                " 0   0   0   0   0   0   0   0   1+  0   0   0   7   0   0   0   " +
                " 6   0   0   0   0   0   0   0   6   0   0   0   0   0   0   0   " +
                " 6   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 6   0   0   0   0   0   0   0   6   0   0   0   0   0   0   0   " +
                //57
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                //61
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   1+  0   " +
                " 0   0   2+  0   0   0   3+  0   0   0   5+  0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   6   0   " +
                //65
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                //69
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                //73
                " 3   0   0   0   5   0   0   0   5   0   0   0   5   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   1+  0   " +
                " 0   0   2+  0   0   0   3+  0   0   0   5+  0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   2+  0   " +
                //77
                " 0   0   0   0   1+  0   2+  0   0   0   1+  0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   1+  0   " +
                " 0   0   2+  0   0   0   3+  0   0   0   5+  0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   6   0   " +
                //81
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   1+  0   " +
                " 0   0   2+  0   0   0   3+  0   0   0   5+  0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   2+  0   " +
                //85
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   1+  0   " +
                " 0   0   2+  0   0   0   3+  0   0   0   5+  0   0   0   0   0   " +
                " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   2+  0   " +
                //89
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                //97
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                "";

        String Note =
                " 1+  0   2+  0   6   0   5   0   0   0   3   0   2   0   0   0   " +
                        " 0   0   2   0   3   0   5   0   0   0   0   0   0   0   0   0   " +
                        " 1+  0   2+  0   6   0   5   0   0   0   3   0   2   0   3   0   " + //
                        " 0   0   2   0   3   0   5   0   6   0   0   0   0   0   0   0   " +
                        //5
                        " 1+  0   2+  0   6   0   5   0   0   0   3   0   2   0   3   0   " +
                        " 0   0   2   0   3   0   2   0   0   0   0   0   0   0   0   0   " +
                        " 1+  0   2+  0   6   0   5   0   0   0   3   0   2   0   3   0   " + //
                        " 0   0   2   0   3   0   5   0   6   0   0   0   0   0   0   0   " + //
                        //9
                        " 0   0   0   0   0   0   0   0   0   0   0   0   5   0   0   0   " +
                        " 6   0   5   0   3   0   2   0   0   0   0   0   3   0   6-  0   " +
                        " 0   0   1   0   0   0   2   0   0   0   3   0   0   0   5   0   " +
                        " 6   0   5   0   3   0   2   0   0   0   0   0   3   0   6-  0   " +
                        //13
                        " 0   0   0   0   0   0   0   0   0   0   5   6   1+  2+  3+  5+  " +
                        " 6   0   5   0   3   0   2   0   0   0   0   0   3   0   6-  0   " +
                        " 0   0   1   0   0   0   2   0   0   0   3   0   0   0   5   0   " +
                        " 6   0   5   0   3   0   2   0   0   0   0   0   3   0   6-  0   " +
                        //17
                        " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   3+  0   " +
                        " 3+  0   2+  3+  0   0   3+  0   3+  0   2+  3+  0   0   3+  0   " +
                        " 3+  0   2+  3+  0   0   3+  0   3+  0   2+  3+  0   0   3+  0   " +
                        " 3+  0   2+  3+  0   0   3+  0   3+  0   2+  3+  0   0   3+  0   " +
                        //21
                        " 3+  0   2+  3+  0   0   3+  0   3+  0   2+  3+  0   0   3+  0   " +
                        " 3+  0   2+  3+  0   0   3+  0   3+  0   2+  3+  0   0   3+  0   " +
                        " 3+  0   2+  3+  0   0   1+  0   2+  0   3+  0   1+  0   3+  0   " +
                        " 3+  0   2+  3+  0   0   3+  0   3+  0   2+  3+  0   0   3+  0   " +
                        //25
                        " 3+  0   2+  3+  0   0   3+  3+  3+  5   0   5   0   0   0   0   " +
                        " 0   0   5   0   6   0   7   0   1+  0   2+  0   7+  0   1+  0   " +
                        " 6   0   7   0   5   0   6   0   0   0   0   0   3+  0   0   0   " +
                        " 0   0   5   0   6   0   7   0   1+  0   2+  0   7+  0   1+  7   " +
                        //29
                        " 6   0   7   0   5   0   6   0   0   0   0   0   3+  0   0   0   " +
                        " 6   0   7   0   5   0   6   0   0   0   0   0   3+  0   0   0   " +
                        " 7   0   1+  0   7   0   7   0   0   0   1+  0   2+  0   7   0   " +
                        " 0   6   7   0   6   7   0   6   7   0   6   7   0   6   7   0   " +
                        //33
                        " 5   0   0   0   3   0   0   0   3   0   0   0   2   0   0   0   " +
                        " 1+  0   2+  0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        " 0   0   5   0   0   0   6   0   0   0   1+  0   0   0   0   0   " +
                        " 1+  0   2+  0   6   0   5   0   0   0   0   0   6   0   5   0   " +
                        //37
                        " 0   0   0   0   3   0   5   0   0   0   3   0   0   0   0   0   " +
                        " 1+  0   2+  0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        " 0   0   5   0   0   0   6   0   0   0   1+  0   0   0   0   0   " +
                        " 1+  0   2+  0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        //41
                        " 0   0   0   0   0   0   0   0   1++ 7+  5+  2+  1+  7   5   2   " +
                        " 1+  0   2+  0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        " 0   0   5   0   0   0   6   0   0   0   1+  0   0   0   0   0   " +
                        " 1+  0   2+  0   6   0   5   0   0   0   0   0   6   0   5   0   " +
                        //45
                        " 0   0   0   0   3   0   5   0   0   0   3   0   0   0   0   0   " +
                        " 1+  0   2+  0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        " 0   0   5   0   0   0   6   0   0   0   1+  0   0   0   0   0   " +
                        " 1+  0   2+  0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        //49
                        " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                        " 1+  0   2+  0   3+  0   6+  0   0   0   5+  0   0   0   3+  2+  " +
                        " 1+  0   2+  0   3+  0   5+  0   0   0   6+  0   0   0   1++ 7+  " +
                        " 1++ 0   6+  0   3+  0   2+  0   0   0   3+  0   0   0   6+  0   " +
                        //53
                        " 0   0   0   0   0   0   0   0   6   0   0   0   5   0   0   0   " +
                        " 3   6   6   6   6   6   6   6   2   6   6   1+  0   6   6   6   " +
                        " 3   0   6   6   6   6   6   6   6   6   6   6   6   6   6   6   " +
                        " 3   6   6   6   6   0   6   6   2   6   6   6   3   0   0   2+  " +
                        //57
                        " 3   1+  1+  1+  1+  1+  1+  6   1+  1+  1+  1+  0   1+  1+  1+  " +
                        " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   1+  0   " +
                        " 0   0   2+  0   0   0   3+  0   0   0   5+  0   0   0   0   0   " +
                        " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   6   0   " +
                        //61
                        " 0   0   0   0   0   0   0   0   0   0   5   6   1+  2+  3+  5+  " +
                        " 6   0   5   0   3   0   2   0   0   0   0   0   3   0   1   0   " +
                        " 0   0   2   0   0   0   3   0   0   0   5   0   0   0   5   0   " +
                        " 6   0   5   0   3   0   2   0   0   0   0   0   3   0   6-  0   " +
                        //65
                        " 6-  0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                        " 0   0   5   0   6   0   7   0   1+  0   2+  0   7   0   1+  0   " +
                        " 6   0   7   0   5   0   6   0   0   0   0   0   3+  0   0   0   " +
                        " 0   0   5   0   6   0   7   0   1+  0   2+  0   7+  0   1+  7   " +
                        //69
                        " 6   0   7   0   5   0   6   0   0   0   0   0   3+  0   0   0   " +
                        " 6   0   7   0   5   0   6   0   0   0   0   0   3+  0   0   0   " +
                        " 7   0   1+  0   7   0   7   0   0   0   1+  0   2+  0   7   0   " +
                        " 0   6   7   0   6   7   0   6   7   0   6   7   0   6   7   0   " +
                        //73
                        " 7   0   0   0   3   0   0   0   3   0   0   0   2   0   0   0   " +
                        " 1+  0   7   0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        " 0   0   5   0   0   0   6   0   0   0   1+  0   0   0   0   0   " +
                        " 1+  0   7   0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        //77
                        " 0   0   0   0   3   0   5   0   0   0   3   0   0   0   0   0   " +
                        " 1+  0   7   0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        " 0   0   5   0   0   0   6   0   0   0   1+  0   0   0   0   0   " +
                        " 1+  0   7   0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        //81
                        " 0   0   0   0   0   0   0   0   1++ 7+  5+  2+  1+  7   5   2   " +
                        " 1+  0   7+  0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        " 0   0   5   0   0   0   6   0   0   0   1+  0   0   0   0   0   " +
                        " 1+  0   7+  0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        //85
                        " 0   0   0   0   3   0   5   0   0   0   3   0   0   0   0   0   " +
                        " 1+  0   7+  0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        " 0   0   5   0   0   0   6   0   0   0   1+  0   0   0   0   0   " +
                        " 1+  0   7+  0   6   0   5   0   0   0   0   0   6   0   3   0   " +
                        //89
                        " 0   0   0   0   0   0   0   0   2   3   5   6   1+  2+  3+  5+  " +
                        " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   1+  0   " +
                        " 0   0   2+  0   0   0   3+  0   0   0   5+  0   0   0   0   0   " +
                        " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   2+  0   " +
                        //93
                        " 0   0   0   0   1+  0   2+  0   0   0   1+  0   0   2+  3+  5+  " +
                        " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   1+  0   " +
                        " 0   0   2+  0   0   0   3+  0   0   0   5+  0   0   0   0   0   " +
                        " 6+  0   5+  0   3+  0   2+  0   0   0   0   0   3+  0   6   0   " +
                        //97
                        " 0   0   0   0   0   0   0   0   0   0   5   6   1+  2+  3+  5+  " +
                        " 6+  0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                        " 1   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +


                        " 0   0   0   0   0   0   0   0   ";

        String accompaniments = " 4-- 0   1-  0   5-  0   0   0   5-- 0   2-  0   5-  0   0   0   " +
                " 6-- 0   3-  0   5-  0   0   0   0   0   0   0   0   0   0   0   " +
                " 4-- 0   1-  0   5-  0   0   0   5-- 0   2-  0   5-  0   0   0   " +
                " 6-- 0   3-  0   5-  0   0   0   0   0   0   0   0   0   0   0   " +
                //5
                " 4-- 0   1-  0   5-  0   0   0   5-- 0   2-  0   5-  0   0   0   " +
                " 6-- 0   3-  0   5-  0   0   0   0   0   0   0   0   0   0   0   " +
                " 4-- 0   1-  0   5-  0   0   0   5-- 0   2-  0   5-  0   0   0   " +
                " 6-- 0   3-  0   5-  0   0   0   0   0   0   0   0   0   0   0   " +
                //9
                " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +
                " 4-- 0   1-  0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1-  0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                //13
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1-  0   5-  0   0   0   5-- 0   2-  0   5-  0   0   0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1-  0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +

                //17
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   0   0   " +
                " 4-- 0   1-  0   5-  0   6-  0   5-- 0   2-  0   6-  0   7-  0   " +
                " 6-- 0   3-  0   5-  0   0   0   0   0   0   0   7-  0   0   0   " +
                " 4-- 0   1-  0   5-  0   6-  0   5-- 0   2-  0   6-  0   7-  0   " +
                //21
                " 6-- 0   3-  0   6-  0   1   0   3   0   0   0   0   0   0   0   " +
                " 4-- 0   1-  0   5-  0   6-  0   5-- 0   2-  0   6-  0   7-  0   " +
                " 6-- 0   3-  0   5-  0   2   0   0   0   0   0   7-  0   0   0   " +
                " 4-- 0   1-  0   5-  0   6-  0   5-- 0   2-  0   6-  0   7-  0   " +
                //25
                " 6-- 0   3-  0   6-  0   1   0   1   0   0   0   3-  0   0   0   " +
                " 5-  0   2   0   3   0   0   0   6-  0   0   0   3   0   0   0   " +
                " 4-  0   1   0   3   0   1   0   4-  0   1   0   4   0   0   0   " +
                " 5-- 0   3-  0   7-  0   0   0   6-- 0   3-  0   1   0   0   0   " +
                //29
                " 4-  0   1   0   3   0   1   0   4-  0   1   0   4   0   0   0   " +
                " 4-  0   1   0   3   0   1   0   4-  0   1   0   4   0   0   0   " +
                " 2-  0   6-  0   2   0   2-  0   0   0   2-  0   4   0   2   0   " +
                " 3-- 0   7-- 0   3-  0   7-- 0   5-  0   3-  0   7-  0   5-  0   " +
                //33
                " 3-- 0   7-- 0   3-  0   7-- 0   5-  0   3-  0   7-  0   5-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                //37
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                //41
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                //45
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                //49
                " 6---0   6-- 0   3-  0   6-- 0   6-  0   0   0   0   0   0   0   " +
                " 4-  0   1   0   4   0   0   0   5-  0   2-  0   5   0   0   0   " +
                " 6-  0   3-  0   6   0   3-  0   5   0   0   0   3   0   0   0   " +
                " 4-  0   1   0   4   0   0   0   5-  0   2   0   5   0   0   0   " +
                //53
                " 6-  0   3-  0   6   0   3   0   6-  0   0   0   5-  0   0   0   " +
                " 4-- 0   1   0   5-  0   6-  0   5-- 0   2-  0   6-  0   7-  0   " +
                " 6-- 0   3-  0   7-  0   1   0   3   0   1   0   7-  0   3-  0   " +
                " 4-- 0   1-  0   5-  0   6-  0   5-- 0   2-  0   6-  0   7-  0   " +
                //57
                " 6-- 0   3-  0   7-  0   1   0   3   0   1   0   7-  0   3-  0   " +
                " 4-- 0   1-  0   5-  0   6-  0   5-- 0   2-  0   6-  0   7-  0   " +
                " 6-- 0   3-  0   7-  0   1   0   3   0   1   0   7-  0   3-  0   " +
                " 4-- 0   1-  0   5-  0   6-  0   5-- 0   2-  0   6-  0   7-  0   " +
                //61
                " 6-- 0   3-  0   5-  0   6-  0   1   0   7-  0   6-  0   3-  0   " +
                " 4-- 0   1-  0   5-  0   0   0   5-- 0   2-  0   5-  0   0   0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1-  0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                //65
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 5-  0   2   0   3   0   0   0   6-  0   0   0   3   0   0   0   " +
                " 4-  0   1   0   3   0   1   0   4-  0   1   0   4   0   0   0   " +
                " 5-- 0   3-  0   7-  0   0   0   6-- 0   3-  0   1   0   0   0   " +
                //69
                " 4-  0   1   0   3   0   1   0   4-  0   1   0   4   0   0   0   " +
                " 4-  0   1   0   3   0   1   0   4-  0   1   0   4   0   0   0   " +
                " 2-  0   6-  0   2   0   2-  0   0   0   2-  0   4   0   2   0   " +
                " 3-- 0   7-- 0   3-  0   7-- 0   5-  0   3-  0   7-  0   5-  0   " +
                //73
                " 3-- 0   7-- 0   3-  0   7-- 0   5-  0   3-  0   7-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                //77
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                //81
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                //85
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                //89
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                //93
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   0   0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   3-  0   " +
                " 4-- 0   1   0   4-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   " +
                //97
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   0   0   " +
                " 6-- 0   3-  0   6-  0   3-  0   6-  0   3-  0   6-  0   0   0   " +
                " 6-- 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   " +

                "";


        //正常速度
        new AudioPlay(140).loadNotes(notes).start();
        new AudioPlay(140).loadNotes(Note).start();
        /**
         * 副音部分
         */
        new AudioPlay(140).loadNotes(accompaniments).start();
        new Animation(140).loadNotes(Note).start();
    }
}
