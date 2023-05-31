package com.first;

public class FirstMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("First", "Sagar Jadhav");
		
		HandleOptions.handleWelcomeScreenInput();

	}

}
