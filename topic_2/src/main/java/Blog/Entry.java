package Blog;

import RecentFilePackage.File;

public class Entry {

	private String title = "";
	private String body = "";
	private String author = "";

	public Entry(String title, String body, String author) {
		this.title = title;
		this.body = body;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public String getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Entry [title=" + title + ", body=" + body + ", author=" + author + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Entry) {
			Entry tmpEntry = (Entry) obj;
			if (this.title.equals(tmpEntry.getTitle()) && this.body.equals(tmpEntry.getBody())
					&& this.author.equals(tmpEntry.getAuthor())) {
				return true;
			}
		}
		return false;
	}
}
