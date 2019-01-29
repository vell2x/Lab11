package movieslab;

public class Movie {
	private String title;
	private String category;
	
	public Movie() {
		
	}
	
	public Movie (String title, String category) {
		this.setTitle(title);
		this.setCategory(category);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
    public String toString() {
        return "Title: " + title + "Category: " + category;
    }
}
