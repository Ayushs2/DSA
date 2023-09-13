package com.company;

import java.util.ArrayList;

public class MazePath {
    //sc= source Column
    //sr = source row
    //dr = destination row
    //dc = destination column
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        mazePath(1, 1, n, m, "");
//        ArrayList<String> ans = getMazePaths(1,1,n,m);
//        System.out.println(ans);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> horizPath = new ArrayList<>();
        ArrayList<String> vertiPath = new ArrayList<>();
        if (sc < dc) {
            horizPath = getMazePaths(sr, sc + 1, dr, dc);
        }

        if (sr < dr) {
            vertiPath = getMazePaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> totalPaths = new ArrayList<>();
        for (String hpath : horizPath) {
            totalPaths.add("h" + hpath);
        }
        for (String vpath : vertiPath) {
            totalPaths.add("v" + vpath);
        }
        return totalPaths;
    }

    public static void mazePath(int sr, int sc, int dr, int dc, String psf) {
        if (sr > dr || sc > dc) {
            return;
        }
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        mazePath(sr, sc + 1, dr, dc, psf + "h");
        mazePath(sr + 1, sc, dr, dc, psf + "v");
    }

}
