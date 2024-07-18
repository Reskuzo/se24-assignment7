package de.unibayreuth.se.teaching.list.data.persistence;

public class ListClearedObserver implements Observer {
    public int clearedCount = 0;
    @Override
    public void update() {
        System.out.println("List cleared!");
        clearedCount++;
    }
}
