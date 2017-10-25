package com.oracle.cap14.autoavaliaca.exercicio8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LeaderBoard {
	private ReadWriteLock rwl = new ReentrantReadWriteLock();
	private List<Integer> highscores = new ArrayList<Integer>();
	
	public void addScore(Integer score) {
		Lock lock = rwl.writeLock();
		lock.lock();
		try{
			
		}finally {
			lock.unlock();
		}
	}
	
	public List<Integer> getHighScores() {
		Lock lock = rwl.readLock();
		lock.lock();
		try {
			return Collections.unmodifiableList(highscores);
		} finally {
			lock.unlock();
		}
	}
	
}
