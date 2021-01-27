package com.qa.hello;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.hello.Blackjack.BlackjackSimple;

public class BlackjackTest {
	
	
	BlackjackSimple game =  new BlackjackSimple(); 
	
	
	
	
	@Before
	
	public void pretest() {
	
	System.out.println("before");
	}
	
	@Test
	
	public void gameWinTest() {
		
		assertEquals( 0, game.play(23,25));
		
	}
	
	public void gameLostTestPlayer() {
		
		assertEquals(21, game.play(21, 23));
	}
	
	
	
	public void gameLostTestDealer() {
		
		assertEquals( 21, game.play(25, 21));
		
	}
	
	public void game3() {
		
		assertEquals(20, game.play(20, 10) );
		
	}
	
	public void game4() {
		
		assertEquals( 15, game.play(7, 15));
		
	}
	
	

}
