package com.oracle.cap9.exemplo30;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestFileTime {
	public static void main(String[] args) throws IOException {
		
		Date januaryFirst = new GregorianCalendar(2013, Calendar.JANUARY, 1).getTime();
		
		File file = new File("/tmp/file");
		file.createNewFile();
		file.setLastModified(januaryFirst.getTime());
		System.out.println(file.lastModified());
		file.delete();
		
		Path path = Paths.get("/tmp/file2");
		Files.createFile(path);
		FileTime fileTime = FileTime.fromMillis(januaryFirst.getTime());
		Files.setLastModifiedTime(path, fileTime);
		System.out.println(Files.getLastModifiedTime(path));
		Files.delete(path);
		
	}
}
