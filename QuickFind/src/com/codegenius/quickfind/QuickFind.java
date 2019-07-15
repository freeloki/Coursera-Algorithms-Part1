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
public class QuickFind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        QuickFindUF mQuickFind = new QuickFindUF(10);
        mQuickFind.print();

        mQuickFind.union(4, 3);
        mQuickFind.union(3, 8);
        mQuickFind.union(6, 5);
        mQuickFind.union(9, 4);
        mQuickFind.union(2, 1);
        //mQuickFind.union(4, 9);

        System.out.println("Connected: " + mQuickFind.connected(8, 9));

        System.out.println("Connected: " + mQuickFind.connected(5, 0));
        mQuickFind.union(5, 0);
        
         mQuickFind.union(7, 2);
          mQuickFind.union(6, 1);

        mQuickFind.print();
        
        
         QuickUnionUFImproved mQuickUnionUFImproved = new QuickUnionUFImproved(10);
        mQuickUnionUFImproved.print();

        mQuickUnionUFImproved.union(4, 3);
        mQuickUnionUFImproved.union(3, 8);
        mQuickUnionUFImproved.union(6, 5);
        mQuickUnionUFImproved.union(9, 4);
        mQuickUnionUFImproved.union(2, 1);
        //mQuickFind.union(4, 9);

        System.out.println("Connected: " + mQuickUnionUFImproved.connected(8, 9));

        System.out.println("Connected: " + mQuickUnionUFImproved.connected(5, 0));
        mQuickUnionUFImproved.union(5, 0);
        
         mQuickUnionUFImproved.union(7, 2);
          mQuickUnionUFImproved.union(6, 1);

        mQuickUnionUFImproved.print();
        
        System.out.println("Find: " + mQuickUnionUFImproved.find(4));
        System.out.println("Find New : " + mQuickUnionUFImproved.findNew(4));

    }

}
