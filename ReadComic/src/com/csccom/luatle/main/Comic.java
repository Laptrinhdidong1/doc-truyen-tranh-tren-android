/**
 * 
 */
package com.csccom.luatle.main;


/**
 * @author ADMIN
 * 
 */
public class Comic {
	public String mTitle;
	public String mContent;
	public long mImage;
	
	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public String getmContent() {
		return mContent;
	}

	public void setmContent(String mContent) {
		this.mContent = mContent;
	}

	public long getmImage() {
		return mImage;
	}

	public void setmImage(long mImage) {

		this.mImage = mImage;
	}

	public Comic(String title, String content, long bitmap) {
		this.mContent = content;
		this.mTitle = title;
		this.mImage = bitmap;

	}
}
