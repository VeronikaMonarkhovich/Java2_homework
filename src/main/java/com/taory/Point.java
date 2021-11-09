package com.taory;

import java.util.*;

    public class Point implements Comparable<Point>{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Pont [x=" + x + ", y=" + y + "]";
        }

        public static void main (String[]args){

            Point point1 = new Point(8, 3);
            Point point2 = new Point(6, 44);
            Point point3 = new Point(26, 15);
            Point point4 = new Point(1, 56);

            List<Point> points = new ArrayList<>();
            points.add(point1);
            points.add(point2);
            points.add(point3);
            points.add(point4);

            Collections.sort(points, Comparator.comparing(Point::getX));
            System.out.println("Points sorted by x:");
            points.forEach(System.out::println);

            Collections.sort(points, Comparator.comparing(Point::getX));
            Collections.reverse(points);
            System.out.println("Points sorted by -x:");
            points.forEach(System.out::println);

            Collections.sort(points, Comparator.comparing(Point::getY));
            System.out.println("Points sorted by y:");
            points.forEach(System.out::println);

            Collections.sort(points, Comparator.comparing(Point::getY));
            Collections.reverse(points);
            System.out.println("Points sorted by -y:");
            points.forEach(System.out::println);
        }

        @Override
        public int compareTo(Point otherP) {
            return this.x - otherP.x;
        }
    }