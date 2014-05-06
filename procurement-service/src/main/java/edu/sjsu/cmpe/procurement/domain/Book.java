package edu.sjsu.cmpe.procurement.domain;


public class Book {
    private long isbn;
    private String title;
    private String category;
    private String coverimage;
    // add more fields here

    /**
     * @return the isbn
     */
    public long getIsbn() {
	return isbn;
    }

    /**
	 * @return the category
	 */
	public String getCategory_book() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory_book(String category) {
		this.category = category;
	}

	/**
	 * @return the coverimage
	 */
	public String getCoverimage() {
		return coverimage;
	}

	/**
	 * @param coverimage the coverimage to set
	 */
	public void setCoverimage(String coverimage) {
		this.coverimage = coverimage;
	}

	/**
     * @param isbn
     *            the isbn to set
     */
    public void setIsbn(long isbn) {
	this.isbn = isbn;
    }

    /**
     * @return the title
     */
    public String getTitle() {
	return title;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle(String title) {
	this.title = title;
    }
}
