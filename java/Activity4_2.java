package javaActivity4;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class Activity4_2 {

	public static void main(String[] args) throws IOException {
		//get the file object
		File file = new File("src\\javaActivity4\\newInputFile.txt");

		boolean fileStatus = file.createNewFile();

		if(fileStatus) {
			System.out.println("File created successfully!");
		} else {
			System.out.println("File already exists at this path.");
		}

		File fileUtil = FileUtils.getFile("src\\javaActivity4\\newInputFile.txt");

		//get the temp directory
		//File tmpDir = FileUtils.getTempDirectory();

		//System.out.println(tmpDir.getName());

		//copy file to temp directory
		//FileUtils.copyFileToDirectory(file, tmpDir);

		//create a new file
		//File newTempFile = FileUtils.getFile(tmpDir, file.getName());

		//get the content
		String data = FileUtils.readFileToString(fileUtil, "UTF-8");

		//print the content
		System.out.println("Data in File : "+data);

	}

}
