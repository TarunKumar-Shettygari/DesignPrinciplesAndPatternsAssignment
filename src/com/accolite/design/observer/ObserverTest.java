package com.accolite.design.observer;

import com.accolite.design.observer.MyModel.Score;

public class ObserverTest {
	public static void main(String[] args) {
		MyModel myModel=new MyModel();
		@SuppressWarnings("unused")
		Observer client=new Client(myModel);
		@SuppressWarnings("unused")
		Observer men=new Men(myModel);
		@SuppressWarnings("unused")
		Observer women=new Women(myModel);
		Score s=myModel.getScore();
		s.setPlayer("kohli");
		s.setScore("68/1");
		s.setPlayer("dhoni");
		s.setScore("123/2");
		
	}	

}
