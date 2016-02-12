package com.gzc.namenode;

/**
 * inode acts like a file descriptor
 * @author Zhenchao Gan
 * @version 0.1 Build 9000 Jan 3, 2016.
 * @since Jan 1, 2016
 */
public class inode
{

    /** the filename of this inode. */
    private String filename;

    /** the filesize of this inode. */
    private int filesize;

    /** the location where the file stored. */
    private String location;

	/**
	* Returns value of filename
	* @return
	*/
	public String getFilename() {
		return filename;
	}

	/**
	* Sets new value of filename
	* @param
	*/
	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	* Returns value of filesize
	* @return
	*/
	public int getFilesize() {
		return filesize;
	}

	/**
	* Sets new value of filesize
	* @param
	*/
	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}

	/**
	* Returns value of location
	* @return
	*/
	public String getLocation() {
		return location;
	}

	/**
	* Sets new value of location
	* @param
	*/
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	* Default empty inode constructor
	*/
	public inode() {
		super();
	}

	/**
	* Default inode constructor
	*/
	public inode(String filename, int filesize, String location) {
		super();
		this.filename = filename;
		this.filesize = filesize;
		this.location = location;
	}
}
