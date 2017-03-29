/*9
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SID
 */
class node_AddLLNum {

    int data;
    node_AddLLNum next;

    public node_AddLLNum(int y) {
        data = y;
        next = null;
    }

    node_AddLLNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    node_AddLLNum insert(node_AddLLNum root, int y) {
        node_AddLLNum n = new node_AddLLNum(y);
        node_AddLLNum temp = root;
        if (temp == null) {
            root = n;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
        return root;
    }

    node_AddLLNum insertatbegin(node_AddLLNum head, int y) {
        // System.out.println("dude");
        node_AddLLNum n = new node_AddLLNum(y);
        //n.data=y;
        n.next = head;
        head = n;
        return head;
        // display();
        //return head;
    }

    void display(node_AddLLNum root) {
        node_AddLLNum temp = root;
        if (temp == null) {
            System.out.println("empty");
        } else {
            System.out.print("HEAD");
            while (temp != null) {
                System.out.print("->" + temp.data);
                temp = temp.next;
            }
        }
        System.out.println("");
    }

    int length(node_AddLLNum root) {
        node_AddLLNum t = root;
        if (t == null) {
            return 0;
        } else {
            return 1 + length(t.next);
        }
    }
}

public class AddLLNum {

    static node_AddLLNum head1, head2, result;
    static int carry1 = 0;

    public static void main(String args[]) {

        //node_AddLLNum head2=null;
        head1 = insertatend(head1, 9);
        head1 = insertatend(head1, 7);
        head1 = insertatend(head1, 2);
        head1 = insertatend(head1, 5);
        head1.display(head1);
        //System.out.println(head1.length(head1));
        head2 = insertatend(head2, 3);
        head2 = insertatend(head2, 7);
        head2 = insertatend(head2, 5);
        head2.display(head2);
        
        addList(head1, head2);

    }

    static void addList(node_AddLLNum root1, node_AddLLNum root2) {
        if (root1 == null) {
            root2.display(root2);
            return ;
        } else if (root2 == null) {
            root1.display(root1);
            return ;
        }
        if (root1.length(root1) == root2.length(root2)) {

            result = addsame(root1, root2, 0);

        } else {
            if (root1.length(root1) < root2.length(root2)) {
                node_AddLLNum t = root1;
                root1 = root2;
                root2 = t;
            }
            node_AddLLNum cur = head1;
            int diff = root1.length(root1) - root2.length(root2);
            int h=diff;
            while (diff != 0) {
                cur = cur.next;
                diff--;
            }
            result = addsame(cur, root2, 0);
            //result.display(result);
            //System.exit(diff);
            adddiff(root1,cur,result,carry1);
        }

        if (carry1 > 0) {
            result = result.insertatbegin(result, carry1);
        }
        result.display(result);
    }

    static void adddiff(node_AddLLNum root1,node_AddLLNum cur, node_AddLLNum result2, int carry) {
        int sum;
        //cur.display(cur);System.exit(5);
        if(root1!=cur)
        {
            //System.out.println(cur.data+" "+root1.data);
            adddiff(root1.next, cur, result, carry);
            sum=root1.data+carry1;
            carry1=sum/10;
            sum=sum%10;
            result=result.insertatbegin(result, sum);
            //result.display(result);
            //break;//System.exit(2);
        }
        //return result;
    }

    static node_AddLLNum addsame(node_AddLLNum root1, node_AddLLNum root2, int carry) {

        if (root1 == null) {
            return null;
        }
        int sum;
        node_AddLLNum result2 = new node_AddLLNum(carry);
        result2.next = (addsame(root1.next, root2.next, carry));
        sum = root1.data + root2.data + carry1;
        carry = sum / 10;
        if (carry > 0) {
            carry1 = carry;
        } else {
            carry1 = 0;
        }
        sum = sum % 10;
        result2.data = sum;
        return result2;
        //return (root1.data+root2.data);
        /*if (root1.next == null) {
         return null;
         }
         int sum;
         node_AddLLNum result = null;
         result.next= (addsame(root1.next, root2.next, carry));
         sum=root1.data+root2.data+carry;
         carry=sum/10;
         sum=sum%10;
         result.data=sum;
         return result;*/
    }

    static node_AddLLNum insertatend(node_AddLLNum root, int y) {
        node_AddLLNum n = new node_AddLLNum(y);
        node_AddLLNum temp = root;
        if (temp == null) {
            root = n;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
        return root;
    }
}
