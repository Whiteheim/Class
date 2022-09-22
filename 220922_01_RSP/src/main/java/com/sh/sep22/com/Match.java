package com.sh.sep22.com;

public class Match {
	private String result;
	private int win;
	private int lose;
	private int draw;
	private String judge;
	
	public Match() {
		// TODO Auto-generated constructor stub
	}

	public Match(String result, int win, int lose, int draw, String judge) {
		super();
		this.result = result;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
		this.judge = judge;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public String getJudge() {
		return judge;
	}

	public void setJudge(String judge) {
		this.judge = judge;
	}
	
	
	
	
	
}
