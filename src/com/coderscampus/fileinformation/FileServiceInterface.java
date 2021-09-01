package com.coderscampus.fileinformation;

import java.io.File;
import java.io.IOException;

// Normal User Interface
public interface FileServiceInterface {
	
	String standardFileName = "UserData.txt";
	String getUserInformationFromFile(String file) throws IOException; // readline
	void UpdateUserInformationToFile(File file, String line) throws IOException; //writeline
	
}

