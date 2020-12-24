package com.example.RESTproj;

public class Film {

	private int fID;
	private String title;
	private String genre;
	private String year;
	private String director;
	private String char1;
	private String char2;
	private String char3;
	
	
	public int getfID() {
		return fID;
	}

	public void setfID(int fID) {
		this.fID = fID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getChar1() {
		return char1;
	}

	public void setChar1(String char1) {
		this.char1 = char1;
	}

	public String getChar2() {
		return char2;
	}

	public void setChar2(String char2) {
		this.char2 = char2;
	}

	public String getChar3() {
		return char3;
	}

	public void setChar3(String char3) {
		this.char3 = char3;
	}

	public Film() {
		super();
		generateID();

	}
	
	private void generateID() {
		//get a random number between 0 and 999
		int num = 000;
		
		this.fID = num;
	}
	
	
}
