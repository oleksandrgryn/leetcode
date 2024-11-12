package easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class M509FibonacciNumber {

    Map<Integer, Integer> map = new HashMap<>(Map.of(0, 0, 1, 1));

    public int fib(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        map.put(n, fib(n - 1) + fib(n - 2));
        return map.get(n);
    }

    public int fibArray(int n) {
        if (n <= 1) {
            return n;
        }

        int[] fibStorage = new int[n + 1];
        fibStorage[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibStorage[i] = fibStorage[i - 1] + fibStorage[i - 2];
        }

        return fibStorage[n];
    }

    public int fibRecursively(int n) {
        if (n <= 1) {
            return n;
        }

        return fibRecursively(n - 1) + fibRecursively(n - 2);
    }


    @Test
    public void testFib() {
        Assert.assertEquals(2, fibArray(3));
        Assert.assertEquals(3, fibArray(4));
        Assert.assertEquals(5, fibArray(5));
        Assert.assertEquals(8, fibArray(6));
    }
}
