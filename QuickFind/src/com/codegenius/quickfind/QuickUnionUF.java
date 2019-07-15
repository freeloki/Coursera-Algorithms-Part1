/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codegenius.quickfind;

/**
 *
 * @author codemania
 */
public class QuickUnionUF {

    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }

        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        id[i] = j;
    }
    
     public void print() {
        System.out.println("QuickUnion Id Array Result:");
        for (int i = 0; i < id.length; i++) {

            System.out.println("id[" + i + "] = " + id[i]);
        }
    }

}
