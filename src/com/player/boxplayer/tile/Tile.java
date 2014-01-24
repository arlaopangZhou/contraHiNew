package com.player.boxplayer.tile;

public class Tile {
	private String title, subTitle, url;
	private String intent;
	
//	public Tile(String title) {
//		super();
//	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getSubTitle() {
		return subTitle;
	}
	
	public void setImageUrl(String url) {
		this.url = url;
	}
	
	public String getImageUrl() {
		return url;
	}

	public void setIntent(String value) {
		// TODO Auto-generated method stub
		this.intent = value;
	}

	public String getIntent() {
		return this.intent;
	}
}
