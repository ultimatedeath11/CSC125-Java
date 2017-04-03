/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbch8;

/**
 *
 * @author NoahFranck
 */
public class Player {
 
	private int score = 0;
	private String name  = "";
	
	
	public void setName(String a){
		name = a;
	}
	
	public void setScore(int b){
		score = b;
	}
	
	public String getName(){
		return name;
	}
	
	public int getScore(){
		return score;
	}
}
