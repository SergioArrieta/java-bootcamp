package topic_2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import RecentFilePackage.File;
import RecentFilePackage.RecentFile;
import junit.framework.TestCase;

public class RecentFileTest extends TestCase {

	@Test
	public void testRecentFileEmpty() {
		RecentFile recent = new RecentFile();
		Assert.assertEquals(0, recent.getSize());
	}

	@Test
	public void testAddFile() {
		RecentFile recent = new RecentFile();
		File doc = new File("Primer archivo");
		recent.openFile(doc);
		Assert.assertEquals(1, recent.getSize());
		Assert.assertEquals(doc.getName(), recent.getTopFile().getName());
	}

	@Test
	public void testAddSameDocTwoTimes() {
		RecentFile recent = new RecentFile();
		File doc1 = new File("Primer archivo");
		File doc2 = new File("Segundo archivo");
		File doc3 = new File("Primer archivo");

		recent.openFile(doc1);
		recent.openFile(doc2);
		recent.openFile(doc3);

		Assert.assertEquals(2, recent.getSize());
		Assert.assertEquals(doc1, recent.getTopFile());
	}

	@Test
	public void testRecentListIsFull() {
		RecentFile recent = new RecentFile();

		for (int i = 0; i < 15; i++) {
			File doc = new File("Archivo: " + i);
			recent.openFile(doc);
		}

		File doc = new File("Archivo: " + 16);
		recent.openFile(doc);

		Assert.assertEquals(15, recent.getSize());
	}
}
