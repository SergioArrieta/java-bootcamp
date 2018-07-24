package RecentFileTest;

import org.junit.Assert;
import org.junit.Test;

import RecentFilePackage.File;
import RecentFilePackage.RecentFile;
import junit.framework.TestCase;

public class RecentFileTest extends TestCase {

	private File doc1;
	private File doc2;
	private File doc3;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		doc1 = new File("First doc");
		doc2 = new File("Second doc");
		doc3 = new File("Thirst doc");
	}

	@Test
	public void testRecentFileIsEmpty() {
		RecentFile recent = new RecentFile();
		Assert.assertEquals(0, recent.getSize());
	}

	@Test
	public void testAddNewFile() {
		RecentFile recent = new RecentFile();
		recent.openFile(doc1);
		Assert.assertEquals(1, recent.getSize());
		Assert.assertEquals(doc1.getName(), recent.getTopFile().getName());
	}

	@Test
	public void testAddTheSameDocTwoTimes() {
		RecentFile recent = new RecentFile();
		recent.openFile(doc1);
		recent.openFile(doc2);
		recent.openFile(doc3);

		Assert.assertEquals(3, recent.getSize());
		Assert.assertEquals(doc3, recent.getTopFile());
	}

	@Test
	public void testRecentListIsFull() {
		RecentFile recent = new RecentFile();

		for (int i = 0; i < 15; i++) {
			File doc = new File("Doc: " + i);
			recent.openFile(doc);
		}

		File doc = new File("Doc: " + 16);
		recent.openFile(doc);

		Assert.assertEquals(15, recent.getSize());
	}
}
