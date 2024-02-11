package com.javastudy.exam.tree;

public class Tree {
    int count;

    public Tree() {
        count = 0;
    }

    public class Node {
        Object data;
        Node left;
        Node right;

        // 생성 시 매개변수를 받아 초기화하는 방법으로만 선언 가능
        public Node(Object data) {
            this.data = data;
            left = null;
            right = null;
        }

        public void addLeft(Node node) {
            left = node;
            count++;
        }

        public void addRight(Node node) {
            right = node;
            count++;
        }

        public void deleteLeft() {
            left = null;
            count--;
        }

        public void deleteRight() {
            right = null;
            count--;
        }
    }

    public Node addNode(Object data) {
        Node n = new Node(data);
        return n;
    }

    public void preOrder(Node node) {
        if(node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node) {
        if(node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void postOrder(Node node) {
        if(node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
}