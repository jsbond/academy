package practice.snake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String keyBoardText = reader.readLine();
        Integer boardForSnakeSize = Integer.parseInt(keyBoardText);

        SnakeService snakeService = SnakeService.getInstance(boardForSnakeSize);
        snakeService.draw();
        snakeService.showBoard();



    }
}
