import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public static boolean isPathCrossing(String path) {
        Set<String> pathSet = new HashSet<>();
        int x = 0, y = 0;
        String currentPath = x + "," + y;
        pathSet.add(currentPath);

        for (char direction : path.toCharArray()) {
            if (direction == 'N') {
                y++;
            } else if (direction == 'E') {
                x++;
            } else if (direction == 'S') {
                y--;
            } else if (direction == 'W') {
                x--;
            }

            currentPath = x + "," + y;
            if (pathSet.contains(currentPath)) {
                return true;
            }

            pathSet.add(currentPath);
        }

        return false;
    }

    public static void main(String[] args) {
        String path = "NESWW";
        System.out.println(isPathCrossing(path));
    }
}

