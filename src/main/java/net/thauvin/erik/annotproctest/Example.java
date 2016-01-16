package net.thauvin.erik.annotproctest;

import com.beust.version.Version;

@Version(value = "0.1")
class Example {
	public static void main(String[] argv) throws Exception {
		System.out.println("Version: " + GeneratedVersion.VERSION);
	}
}