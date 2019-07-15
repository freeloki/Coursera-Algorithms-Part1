/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codegenius.quickfind;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author codemania
 */
public class QuickUnionUFImproved {

    private int[] id;
    private int[] sz;
    private int[] findMax;

    public QuickUnionUFImproved(int N) {
        id = new int[N];
        sz = new int[N];
        findMax = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
            findMax[i] = -1;
        }
    }

    private int root(int i) {
        while (i != id[i]) {

            // path compression.
            id[i] = id[id[i]];
            i = id[i];
        }

        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private void findMax(int i) {
        int index = root(i);
        if (findMax[index] < i) {
            findMax[index] = i;
        }
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        if (i == j) {
            return;
        }

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        
        findMax(p);
        findMax(q);

    }

    public int find(int root) {
        int current = -1;
        int temp;

        for (int i = 0; i < id.length; i++) {
            if (id[root] == root(i)) {
                temp = i;
                if (current == -1) {
                    current = i;
                }

                if (current < temp) {
                    current = temp;
                }

            }
        }

        return current;
    }

    public int findNew(int i) {
        return findMax[i];
    }

    public void print() {
        System.out.println("Improved QuickUnion Id Array Result:");
        for (int i = 0; i < id.length; i++) {

            System.out.println("id[" + i + "] = " + id[i]);
        }
    }

}
