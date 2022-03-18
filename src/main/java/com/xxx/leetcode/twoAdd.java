package com.xxx.leetcode;//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。 
//
// 你可以按任意顺序返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
// 
//
// 示例 3： 
//
// 
//输入：nums = [3,3], target = 6
//输出：[0,1]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// 只会存在一个有效答案 
// 
//
// 进阶：你可以想出一个时间复杂度小于 O(n²) 的算法吗？ 
// Related Topics 数组 哈希表 👍 13463 👎 0


import lombok.Data;
import lombok.val;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)

/**
 * dsa
 */

/**
 * 13213
 *
 * dasfa
 * fsa
 */
class twoAdd {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(2);
        n1.setNext(n2);
        n2.setNext(n3);
        twoAdd twoAdd = new twoAdd();
        twoAdd.addTwoNumbers(n1,n1);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigDecimal b1;
        StringBuffer sb1 = new StringBuffer();
        sb1 = getDecimal(l1,sb1);
        System.out.println(sb1.toString());
        StringBuffer sb2 = new StringBuffer();
        sb2 = getDecimal(l2,sb2);
        System.out.println(sb2.toString());
        BigDecimal rst = new BigDecimal(sb1.toString()).add(new BigDecimal(sb2.toString()));
        System.out.println(rst.toString());
        ListNode rstn = new ListNode(Integer.valueOf(String.valueOf(rst.toString().toCharArray()[rst.toString().toCharArray().length-1])));
        for (int i = rst.toString().toCharArray().length-1; i > 0; i--) {
            ListNode next = new ListNode(Integer.valueOf(String.valueOf(rst.toString().toCharArray()[i-1])));
            appendList(rstn, next);
        }
        System.out.println(getDecimal(rstn,new StringBuffer()).toString());
        return rstn;
    };

    public StringBuffer getDecimal(ListNode l1,StringBuffer stringBuffer) {
        if (l1.next != null) {
            stringBuffer.insert(0,l1. val);
            return getDecimal(l1.next,stringBuffer);
        } else {
            stringBuffer.insert(0,l1.val);
            return stringBuffer;
        }
    }

    public ListNode appendList(ListNode listNode,ListNode next) {
        if (listNode.next == null) {
            return listNode.next = next;
        } else {
            return appendList(listNode.next,next);
        }
    }

    @Data
 public static class ListNode {
     int val;
     ListNode next;

     ListNode() {
     }

     ListNode(int val) {
         this.val = val;
     }

     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
 }


}
//leetcode submit region end(Prohibit modification and deletion)
