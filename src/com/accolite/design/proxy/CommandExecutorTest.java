package com.accolite.design.proxy;

public class CommandExecutorTest {
	
	public static void main(String[] args) {
		CommandExecutorProxy executor=new CommandExecutorProxy("testUser","abcd1234");
		try {
			executor.runCommand("cmd /c mkdir C:\\Users\\Hyderabad-Intern\\Desktop\\sampleFolder");
			//executor.runCommand("cmd /c rmdir C:\\Users\\Hyderabad-Intern\\Desktop\\sampleFolder");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
