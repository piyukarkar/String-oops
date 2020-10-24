package oops.interfaces;

public abstract interface YouTuber extends VideoEditor {

	int x = 6;
	void makeVideo();
	
	default void uplodeVideo() {               //new feture add krva mate 
		System.out.println("upload the video" );
	}
}

