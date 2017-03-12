package practice.snake;

import java.util.Objects;

public class SnakeService {
    private static SnakeService instance;
    private String[][] board;
    private Snake snake;
    private String drawSymbol = "1";
    private String defaultBoardSymbol = "0";

    public static SnakeService getInstance(int size) {
        if (instance == null) {
            instance = new SnakeService(size);
        }
        return instance;
    }

    private SnakeService(int size) {
        this.board = new String[size][size];
        prepareDefaultBoard();
        snake = new Snake(Direction.RIGHT, new Coordinates());
    }

    private void prepareDefaultBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = defaultBoardSymbol;
            }
        }
    }

    public void draw() {
        Coordinates nextCoordinates = new Coordinates(0, 0);
        do {
            board[nextCoordinates.x][nextCoordinates.y] = drawSymbol;

            nextCoordinates = getNextCoordinatesForSnake();
            snake.coordinates = nextCoordinates;
        } while (nextCoordinates != null);
    }

    private Coordinates getNextCoordinatesForSnake() {
        Coordinates nextCoordinates;

        while (snake.numberOfLockedDirections < 4) {
            nextCoordinates = getCoordinatesWithCurrentDirection();

            if (coordinatesAreValid(nextCoordinates)) {
                snake.numberOfLockedDirections = 0;
                return nextCoordinates;
            }
            snake.numberOfLockedDirections++;
            snake.setNextDirection();
        }
        return null;
    }

    private Coordinates getCoordinatesWithCurrentDirection() {
        Coordinates coordinates = new Coordinates(snake.coordinates);

        switch (snake.currentDirection) {
            case RIGHT:
                coordinates.x++;
                break;
            case DOWN:
                coordinates.y++;
                break;
            case LEFT:
                coordinates.x--;
                break;
            case UP:
                coordinates.y--;
                break;
        }
        return coordinates;
    }

    private boolean coordinatesAreValid(Coordinates coordinates) {
        if (coordinates.x < 0
                || coordinates.x >= board.length
                || coordinates.y < 0
                || coordinates.y >= board.length)
            return false;

        if (hasDrawnSymbolAndNotPrevious(coordinates.x + 1, coordinates.y)
                || hasDrawnSymbolAndNotPrevious(coordinates.x, coordinates.y + 1)
                || hasDrawnSymbolAndNotPrevious(coordinates.x - 1, coordinates.y)
                || hasDrawnSymbolAndNotPrevious(coordinates.x, coordinates.y - 1))
            return false;

        return true;
    }

    private boolean hasDrawnSymbolAndNotPrevious(int x, int y) {
        if (x >= board.length || y >= board.length || x < 0 || y < 0) {
            return false;
        }
        return drawSymbol.equals(board[x][y]) && !snake.coordinates.are(x, y);
    }

    public void showBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[j][i]);
            }
            System.out.println();
        }
    }

    private class Snake {
        private Coordinates coordinates;
        private Direction currentDirection;
        private int numberOfLockedDirections;


        private Snake(Direction direction, Coordinates coordinates) {
            this.currentDirection = direction;
            this.coordinates = coordinates;
        }

        private void setNextDirection() {
            Direction[] allDirections = Direction.values();
            int index = currentDirection.ordinal() + 1;
            if (index < 4) {
                currentDirection = allDirections[index];
            } else {
                currentDirection = allDirections[0];
            }
        }
    }

    private class Coordinates {
        private int x;
        private int y;

        public Coordinates() {
        }

        public Coordinates(int coordinateX, int coordinateY) {
            this.x = coordinateX;
            this.y = coordinateY;
        }

        public Coordinates(Coordinates coordinates) {
            this.x = coordinates.x;
            this.y = coordinates.y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Coordinates)) return false;
            Coordinates that = (Coordinates) o;
            return x == that.x &&
                    y == that.y;
        }

        public boolean are(int x, int y) {
            return this.x == x && this.y == y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    private enum Direction {
        RIGHT,
        DOWN,
        LEFT,
        UP;
    }

    public String getDrawSymbol() {
        return drawSymbol;
    }

    public void setDrawSymbol(String drawSymbol) {
        this.drawSymbol = drawSymbol;
    }

    public String getDefaultBoardSymbol() {
        return defaultBoardSymbol;
    }

    public void setDefaultBoardSymbol(String defaultBoardSymbol) {
        this.defaultBoardSymbol = defaultBoardSymbol;
    }
}
