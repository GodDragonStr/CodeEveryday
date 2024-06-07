package harry.lee968;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MinCameraCover {
    public static void main(String[] args) {
        String s1 = "abcdea";
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.lastIndexOf("a"));
        String[] s2 = s1.split("b");
        char[] c1 = {'a', 'b'};
        StringBuilder s3;
        StringBuffer s4;
        System.out.println(c1[0]);
        for (String s : s2) {
            System.out.println(s);
        }


        Queue<Integer> q1 = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Please selecet offer or poll: ");
        l:while (scan.hasNext()) {
            String mode = scan.next();
            switch (mode) {
                case("o"): {
                    System.out.print("offer mode-offer num： ");
                    q1.offer(scan.nextInt());
                    System.out.println("\n q1: " + q1);
                    break;
                }
                case("p"): {
                    System.out.println("poll mode-poll num： " + q1.poll());
                    break;
                }
                default: break l;
            }
            System.out.print("Please selecet offer or poll: ");
        }

        scan.close();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {}
    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.right = right;
        this.left = left;
    }
}


class Solution {
    public int minCameraCover(TreeNode root) {
        // 层次遍历
        return 0;
    }
}