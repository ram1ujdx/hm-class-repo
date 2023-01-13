package com.hm.assignment;

public abstract class MediaItem extends Item {

	
	
	private int runtime;

	public MediaItem() {
	
	}

	public MediaItem(int id, String title, int noOfCopies, int runtime) {
		super(id, title, noOfCopies);
		this.runtime=runtime;

	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	public abstract void play() ;

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime +  super.toString() + "]";
	}
	
	
	
	
}
