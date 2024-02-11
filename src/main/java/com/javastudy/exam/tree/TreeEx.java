package com.javastudy.exam.tree;

import com.javastudy.exam.tree.Tree.*;
import com.javastudy.exam.tree.Tree.Node;

public class TreeEx {
    public static void main(String[] args) {
            // 트리 생성
            Tree tree = new Tree();

            // 노드 생성
            Node node1 = tree.addNode(1);
            Node node2 = tree.addNode(2);
            Node node3 = tree.addNode(3);
            Node node4 = tree.addNode(4);
            Node node5 = tree.addNode(5);
            Node node6 = tree.addNode(6);
            Node node7 = tree.addNode(7);

            // 트리 연결관계 생성
            /*  트리 모양
             *        1
             *     2     3
             *   4  5  6   7
             */
            node1.addLeft(node2);
            node1.addRight(node3);
            node2.addLeft(node4);
            node2.addRight(node5);
            node3.addLeft(node6);
            node3.addRight(node7);

            // 순회
            tree.preOrder(node1);
            System.out.println();
            tree.inOrder(node1);
            System.out.println();
            tree.postOrder(node1);
            System.out.println();

            // 삭제
            node2.deleteLeft();
            node3.deleteRight();
            /* 삭제 이후 트리 모양
             *        1
             *     2     3
             *      5  6
             */

            // 순회
            System.out.println();
            tree.preOrder(node1);
            System.out.println();
            tree.inOrder(node1);
            System.out.println();
            tree.postOrder(node1);
            System.out.println();

    }
}
