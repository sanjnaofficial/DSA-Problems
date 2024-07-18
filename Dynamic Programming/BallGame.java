import java.util.*;
import java.util.ArrayList;


public class BallGame {

  public static void main(String[] args) {

    // Get the input from the user.
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int p = scanner.nextInt();
    int x = scanner.nextInt();

    // Find the greatest common divisor of n and p.
    int gcd = gcd(n, p);

    // Create a list of all possible positions for the ball.
    List<Integer> positions = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (i % gcd == 0) {
        positions.add(i);
      }
    }

    // Create a list of all possible sequences of moves.
    List<List<Integer>> sequences = new ArrayList<>();
    for (int i = 0; i <= x; i++) {
      for (int j = 0; j < positions.size(); j++) {
        for (int k = 0; k < positions.size(); k++) {
          if (positions.get(k) != positions.get(j) && (positions.get(j) % positions.get(k) == 0 || positions.get(k) % positions.get(j) == 0)) {
            sequences.add(Arrays.asList(i, j, k));
          }
        }
      }
    }

    // Count the number of sequences that end with the ball at the initial position.
    int count = 0;
    for (List<Integer> sequence : sequences) {
      if (sequence.get(sequence.size() - 1) == p) {
        count++;
      }
    }

    // Print the result.
    System.out.println(count);
  }

  private static int gcd(int a, int b) {
    while (b > 0) {
      int temp = a % b;
      a = b;
      b = temp;
    }
    return a;
  }
}
