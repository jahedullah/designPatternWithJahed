package org.example.lcproblems.ArraysAndHashing;

import java.util.HashMap;
import java.util.Stack;

/**
 * lc link -> https://leetcode.com/problems/kth-largest-element-in-a-stream/
 */
public class NextGreaterElement {
  public static void main(String[] args) {
    NextGreaterElement nextGreaterElement = new NextGreaterElement();
    int[] result = nextGreaterElement.nextGreaterElement(new int[] {4, 1, 2}, new int[] {1, 3, 4, 2});

    // Print result
    for (int num : result) {
      System.out.print(num + " ");
    }
  }

  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> mapOfNextGreaterElement = new HashMap<>();
    Stack<Integer> stack = new Stack();

    for (int i = 0; i < nums1.length; i++) {
      mapOfNextGreaterElement.put(nums1[i], -1);
    }

    for (int i = 0; i < nums2.length; i++) {
      int current = nums2[i];

      while (!stack.isEmpty() && current > stack.peek()) {
        int poppedValue = stack.pop();
        mapOfNextGreaterElement.put(poppedValue, current);
      }

      if (mapOfNextGreaterElement.containsKey(current)) {
        stack.push(current);
      }
    }

    return convertMapToArray(mapOfNextGreaterElement, nums1);
  }

  public int[] convertMapToArray(HashMap<Integer, Integer> map, int[] nums1) {
    int[] result = new int[map.size()];

    for (int i = 0; i < result.length; i++) {
      result[i] = map.get(nums1[i]);
    }

    return result;
  }
}
