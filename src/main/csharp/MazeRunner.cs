namespace CodeWars
{
    // https://www.codewars.com/kata/58663693b359c4a6560001d6
    class Kata
    {
        class Position {
          private int x;
          private int y;

          public Position(int x, int y) {
            this.x = x;
            this.y = y;
          }

          public int getX() { return x; }
          public int getY() { return y; }


        public Position move(string direction) {
          switch(direction) {
              case "N":
                  return new Position(getX()-1, getY());
              case "S":
                  return new Position(getX()+1, getY());
              case "E":
                  return new Position(getX(), getY()+1);
              case "W":
                  return new Position(getX(), getY()-1);
          }

          return this;
        }
}

      class Maze {
        private int[,] maze;


        public Maze(int[,] maze) {
          this.maze = maze;
        }

        private int getDimension() { return maze.GetLength(0); }

        public Position getStartPosition() {
          for (int x = 0; x < maze.GetLength(0); x++) {
            for (int y = 0; y < maze.GetLength(1); y++) {
              if (maze[x, y] == 2) {
                return new Position(x, y);
              }
            }
          }

          return null;
        }

        public bool isOutside(Position position) {
            return position.getX() < 0 || position.getX()>= getDimension()
               || position.getY() < 0 || position.getY() >= getDimension();
        }

        public bool isEndPoint(Position position) {
          return GetPointValue(position) == 3;
        }
        public bool hitWall(Position position) {
          return GetPointValue(position) == 1;
        }

        private int GetPointValue(Position position) {
          return maze[position.getX(),position.getY()];
        }
      }

        public string mazeRunner(int[,] maze, string[] directions)
        {
          Maze m = new Maze(maze);
          Position actualPosition = m.getStartPosition();

          foreach(string direction in directions) {
            actualPosition = actualPosition.move(direction);
            if(m.isOutside(actualPosition) || m.hitWall(actualPosition)) {
              return "Dead";
            }
            if (m.isEndPoint(actualPosition)) {
              return "Finish";
            }
          }

          return "Lost";
        }
      }
}