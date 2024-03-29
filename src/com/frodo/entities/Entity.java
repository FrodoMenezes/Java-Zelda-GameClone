package com.frodo.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Entity {
	
	protected double x;
	protected double y;
	protected int width;
	protected int heigth;
	
	private BufferedImage sprite;
	
	public Entity(int x, int y, int width, int heigth, BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.heigth = heigth;
		this.sprite = sprite; 
	}
	
	public void setX(int newX) {
		this.x = newX;
	}
	
	public void setY(int newY) {
		this.y = newY;
	}
	
	public int getX() {
		return (int)this.x;
	}
	
	public int getY() {
		return (int)this.y;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeigth() {
		return this.heigth;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.drawImage(sprite, this.getX(), this.getY(), null);
	}
	
}
