/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

import ("fmt")

func insertNode(root *ListNode, val int) *ListNode {
    newNode := &ListNode { Val: val, Next: nil }

    if root == nil {
        root = newNode
    } else {
        next := root

        for next.Next != nil {
            next = next.Next
        }

        next.Next = newNode
    }

    return root
}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    factor := 10
    carry := 0

    var result *ListNode = nil

    for l1 != nil || l2 != nil {
        l1Val := 0
        l2Val := 0

        if l1 != nil {
            l1Val = l1.Val
        }

        if l2 != nil {
            l2Val = l2.Val
        }

        sum := l1Val + l2Val + carry
        val := sum % factor
        carry = sum / factor

        result = insertNode(result, val)

        if l1 != nil {
            l1 = l1.Next
        }

        if l2 != nil {
            l2 = l2.Next
        }
    }

    if carry != 0 {
        result = insertNode(result, carry)
    }

    return result
}