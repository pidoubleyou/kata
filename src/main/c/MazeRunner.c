#include <stddef.h>
#include <string.h>

int *findStartPosition(const int *maze, size_t dimension) {
  int *actual = maze;
  int *max = maze + dimension*dimension;
  for(int *actual=maze; actual <= max; actual++) {
    if (*actual == 2) {
      return actual;
    }
  }
  return -1;
}

int *move(int *position, size_t dimension, char direction) {
  switch(direction) {
          case 'N':
            position -= dimension;
            break;
          case 'S':
            position += dimension;
            break;
          case 'E':
            position++;
            break;
          case 'W':
            position--;
            break;
      }
  
  return position;
}

int isOutside(int dimension, int *min, int* max, int* actual, int *before) {
  int diff1 = before-min;
  int diff2 = actual-min;
  
  return 
    // leave maze south or north
    actual > max || actual < min ||
    // leave maze west
    diff1%dimension == 0 && diff2%dimension == dimension-1 ||
    // leave maze east
    diff2%dimension == 0 && diff1%dimension == dimension-1
        ;
}

char *maze_runner(const int *maze, size_t n, const char *directions) {

    int *max = maze + n*n;
    int *actual = findStartPosition(maze, n);
    int moves = strlen(directions);

  for(int i = 0; i < moves; i++, directions++) {
      int *before = actual;
      actual = move(actual, n, *directions);
    
      if (isOutside(n, maze, max, actual, before)
         || *actual == 1) {
        return "Dead";
      }
      if (*actual == 3) {
        return "Finish";
      }
    }
  
    //  <----  hajime!
    return "Lost";
}
