package BlogTest;


import org.junit.Assert;
import org.junit.Test;

import Blog.Blog;
import Blog.Entry;

public class BlogTest {
	
	private static final String TITLE = "Title for a new entry";
	private static final String BODY = "Body for a new entry";
	private static final String AUTHOR = "Author";

	// buscar initialize para los datos en comun
	@Test
	public void testForPostANewEntry() {
		Entry newEntry = new Entry(TITLE, BODY, AUTHOR);
		Blog blog = new Blog();
		Assert.assertEquals(newEntry, blog.postNewEntry(TITLE, BODY, AUTHOR));
	}

	@Test
	public void testForDeleteAEntry() {
		Entry newEntry = new Entry(TITLE, BODY, AUTHOR);
		Blog blog = new Blog();
		blog.postNewEntry(TITLE, BODY, AUTHOR);
		Assert.assertEquals(true, blog.deleteEntry(newEntry));
	}

}
