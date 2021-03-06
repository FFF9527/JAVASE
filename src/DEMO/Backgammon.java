package DEMO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by fff on 17-6-7.
 * 五子棋
 */
public class Backgammon {

    //定义棋盘的大小
    private static int BOARD_SIZE = 25;
    //定义一个二维数组来充当棋盘
    private String[][] board;
    public void initBoard()
    {
        //初始化棋盘数组
        board = new String[BOARD_SIZE][BOARD_SIZE];
        //把每个元素为“+”,用于控制台画出棋盘
        for (int i = 0; i < BOARD_SIZE; i++)
        {
            for (int j = 0; j < BOARD_SIZE; j++)
            {
                board[i][j] = "+";
            }
        }
    }
    //控制台输出棋盘的方法
    public void printBoard()
    {
        //打印数组元素
        for (int i = 0; i < BOARD_SIZE; i++)
        {
            for (int j = 0; j < BOARD_SIZE; j++)
            {
                //打印数组后不换行
                System.out.print(board[i][j]);
            }
            //每打印完一行数组后输出一个换行符
            System.out.println("\n");
        }
    }

    public static void main (String[] args) throws Exception
    {
        Backgammon gb = new Backgammon();
        gb.initBoard();
        gb.printBoard();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;

        while ((inputStr = br.readLine()) != null)
        {
            //将用户输入的字符串以逗号作为分隔符，分割成两个字符串
            String[] posStrArr = inputStr.split(",");
            //将两个字符串转换成用户下棋的坐标
            int xPos = Integer.parseInt(posStrArr[0]);
            int yPos = Integer.parseInt(posStrArr[1]);
            //把对应的数组元素赋值为"●"
            gb.board[yPos - 1][xPos - 1] = "●";

            /**
             * 电脑随机生成2个整数，作为电脑下棋的坐标，赋值给board数组
             * 1.坐标的有效性，只能是数字，不能超出棋盘的范围
             * 2.下棋的点，不能重复下棋
             * 3.每次下棋后，需要扫描谁赢了
             */

            gb.printBoard();
            System.out.println("请输入您下棋的坐标，应以x,y的格式：");
        }
    }
}