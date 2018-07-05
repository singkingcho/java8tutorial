package com.sz.exercise;

public class Line {


    private Point start;

    private Point end;

    public Line() {
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLength(){
        return Math.sqrt((start.getX() - end.getX())*(start.getX() - end.getX()) + (start.getY() -end.getY())*(start.getY() -end.getY()));
    }
}
