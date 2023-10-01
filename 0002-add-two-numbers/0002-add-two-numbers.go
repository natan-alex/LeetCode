/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

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
        sum := carry
        
        if l1 != nil {
            sum += l1.Val
            l1 = l1.Next
        }
        
        if l2 != nil {
            sum += l2.Val
            l2 = l2.Next
        }
        
        val := sum % factor
        carry = sum / factor

        result = insertNode(result, val)
    }

    if carry != 0 {
        result = insertNode(result, carry)
    }

    return result
}