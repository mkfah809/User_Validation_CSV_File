package com.coderscampus.fileinformation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileServiceImpl implements FileServiceInterface{

	@Override
	public String getUserInformationFromFile(File file) throws IOException {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			return reader.readLine();
		} finally {
			if(reader != null) {
				reader.close();
			}
		}
	}

	@Override
	public void UpdateUserInformationToFile(File file, String line) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
