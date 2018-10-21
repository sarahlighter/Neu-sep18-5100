package Mreview;

import java.util.ArrayList;

public class Mreview extends java.lang.Object implements java.lang.Comparable<Mreview> {
	private String title;
	private ArrayList<Integer> rating;
	public Mreview(){
		title="";
		rating= new ArrayList<Integer>();
	}
	public Mreview(String ttl){
		this();
		this.title=ttl;
	}
	public Mreview(String ttl, int firstRating) {
		this(ttl);
		this.rating.add(firstRating);
	}
	public String getTitle(){
		return this.title;
	}
	public void addRating(int r){
		this.rating.add(r);
	}
	public double aveRating(){
		int sum=0;
		for(Integer r: this.rating){
			sum+=r;
		}
		return (double)sum/this.rating.size();
	}
	public int numRating(){
		return this.rating.size();
	}
	@Override
	public int compareTo(Mreview obj) {
		return title.compareTo(obj.title);
	}
	public boolean equals(Object obj){
		if(title.equals(((Mreview)obj).getTitle())){
			return true;
		}
		return false;
	}
	@Override
	public String toString(){
		String result="";
		result="Movie Title: "+this.getTitle()+"\tRating: "+this.aveRating();
		return result;
	}

}
