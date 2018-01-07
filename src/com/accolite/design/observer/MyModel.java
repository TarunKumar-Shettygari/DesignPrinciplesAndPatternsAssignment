package com.accolite.design.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class MyModel {
	public static final String PLAYER="player";
	public static final String SCORE="score";
	Score s=new Score("player","0/0");
	private List<PropertyChangeListener> listener=new ArrayList<PropertyChangeListener>();
	public class Score{
		private String player;
		private String score;
		public Score(String player,String score){
			this.player=player;
			this.score=score;
		}
		public String getPlayer() {
			return player;
		}
		public void setPlayer(String player) {
			notifyListeners(this,PLAYER,this.player,this.player=player);
		}
		public String getScore() {
			return score;
		}
		public void setScore(String score) {
			notifyListeners(this,SCORE,this.score,this.score=score);
		}
		
	}
	private void notifyListeners(Object object,String property,String oldValue,String newValue) {
		for(PropertyChangeListener name:listener) {
			name.propertyChange(new PropertyChangeEvent(this,property,oldValue,newValue));
		}
	}
	public void subscribe(PropertyChangeListener listener) {
		this.listener.add(listener);
	}
	public Score getScore() {
		return s;
	}

}
