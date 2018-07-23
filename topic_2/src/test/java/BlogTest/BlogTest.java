package BlogTest;

import org.junit.Assert;
import org.junit.Test;

import Blog.Blog;
import Blog.Entry;
import RecentFilePackage.File;
import junit.framework.TestCase;

public class BlogTest extends TestCase {

	private static final String TITLE = "Title for a new entry";
	private static final String BODY = "Body for a new entry";
	private static final String AUTHOR = "Author";

	private Entry entry;
	private Blog blog;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		entry = new Entry(TITLE, BODY, AUTHOR);
		blog = new Blog();
	}

	@Test
	public void testForPostANewEntry() {
		Assert.assertEquals(entry, blog.postNewEntry(TITLE, BODY, AUTHOR));
	}

	@Test
	public void testForDeleteAEntry() {
		blog.postNewEntry(TITLE, BODY, AUTHOR);
		Assert.assertEquals(true, blog.deleteEntry(entry));
	}

	@Test
	public void testForShowTheTenMostRecentEntries() {
		for (int i = 0; i < 10; i++) {
			blog.postNewEntry(TITLE, BODY, AUTHOR);
		}
		Assert.assertEquals(10, blog.getSize());
	}

}
