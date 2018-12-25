package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Algorithm
 * @description: 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 * @author: Wsl
 * @create: 2018-12-25 15:34
 **/
public class Execise3 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList();

        List<TreeNode> list = new ArrayList();
        if (root == null) return result;
        //加入根节点
        list.add(root);
        //直到list为空为止
        while (!list.isEmpty()) {
            //每次当前层节点都要重新初始化
            List<Integer> curList = new ArrayList();
            //初始化下一层所有节点的list
            List<TreeNode> nextList = new ArrayList();
            for (TreeNode cur : list) {//cur是当前节点，list是当前层的所有节点
                curList.add(cur.val);
                if (cur.left != null) nextList.add(cur.left);//下一层节点
                if (cur.right != null) nextList.add(cur.right);//下一层节点
            }
            list = nextList;
            result.add(0, curList);//当前层所有节点的list倒插进返回结果中
        }
        return result;
    }
}
