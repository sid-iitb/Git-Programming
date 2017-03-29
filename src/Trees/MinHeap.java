/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author sidhsaho
 */
public class MinHeap {

    int[] Heap;
    static int size;
    int maxSize;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        Heap = new int[this.maxSize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    int parent(int pos) {
        return pos / 2;
    }

    int leftChild(int pos) {
        return 2 * pos;
    }

    int rightChild(int pos) {
        return 2 * pos + 1;
    }

    boolean isLeaf(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    void swap(int fpos, int spos) {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    void minHeapify(int pos) {
        if (!isLeaf(pos)) {
            if (Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]) {
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }

    void minHeap() {
        for (int i = size / 2; i >= 1; i++) {
            minHeapify(i);
        }
    }

    void insert(int element) {
        Heap[++size] = element;
        int current = size;
        while (Heap[current] < Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public static void main(String[] args) {

    }
}
