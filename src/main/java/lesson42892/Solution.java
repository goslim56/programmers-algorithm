package lesson42892;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/42892
public class Solution {
    class Node {
        Node left = null;
        Node right = null;
        int x;
        int y;
        int index;
        boolean isPreVisited = false;
        boolean isPostVisited = false;

        public Node(int x, int y, int index) {
            this.x = x;
            this.y = y;
            this.index = index;
        }
    }
    List<Node> nodeList = new ArrayList<>();
    List<Integer> preOrderIndex = new ArrayList<>();
    List<Integer> postOrderIndex = new ArrayList<>();
    public int[][] solution(int[][] nodeinfo) {
        int[][] answer = new int[2][1];
        
        for (int i = 0; i < nodeinfo.length; i++) {
            nodeList.add(new Node(nodeinfo[i][0], nodeinfo[i][1],i+1));
        }

        nodeList.sort((a, b) -> {
            if (a.y != b.y) {
                return b.y - a.y;
            } else {
                return a.x - b.x;
            }
        });


        Node rootNode = nodeList.get(0);
        for (int i =1 ; i< nodeinfo.length;i ++ ) {
            drawEdge(rootNode, nodeList.get(i));
        }

        preOrder(rootNode); //전위 순회
        postOrder(rootNode); //후위 순회

        answer[0] = preOrderIndex.stream().mapToInt(Integer::intValue).toArray();
        answer[1] = postOrderIndex.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
    
    public void drawEdge(Node rootNode, Node currentNode) {
        if (rootNode.x < currentNode.x) {
            if (rootNode.right == null) {
                rootNode.right = currentNode;
            } else {
                drawEdge(rootNode.right, currentNode);
            }
        }  else {
            if (rootNode.left == null) {
                rootNode.left = currentNode;
            } else {
                drawEdge(rootNode.left, currentNode);
            }
        }
    }

    public void preOrder(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        if (!rootNode.isPreVisited) {
            preOrderIndex.add(rootNode.index);
            rootNode.isPreVisited = true;
        }
        preOrder(rootNode.left);
        preOrder(rootNode.right);
    }

    public void postOrder(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        postOrder(rootNode.left);
        postOrder(rootNode.right);
        if (!rootNode.isPostVisited) {
            postOrderIndex.add(rootNode.index);
            rootNode.isPostVisited = true;
        }
    }
}
