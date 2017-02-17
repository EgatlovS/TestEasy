package de.nvg.testeasy.storage;

public class GitPathConfig {

	private final String remoteRepositoryPath;
	private final String localRepositoryPath;
	private final String testEasyFilePath;

	public GitPathConfig(String remoteRepositoryPath, String localRepositoryPath, String testEasyFilePath) {
		this.remoteRepositoryPath = remoteRepositoryPath;
		this.localRepositoryPath = localRepositoryPath;
		this.testEasyFilePath = testEasyFilePath;
	}

	public String remoteRepositoryPath() {
		return remoteRepositoryPath;
	}

	public String localRepositoryPath() {
		return localRepositoryPath;
	}

	public String testEasyFilePath() {
		return testEasyFilePath;
	}

}
