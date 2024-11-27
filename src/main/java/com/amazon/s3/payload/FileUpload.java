package com.amazon.s3.payload;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FileUpload implements Serializable {
private static final long serialVersionUID = 1279755737804448259L;
	
	private String fileName;
	
	private Long fileSize;
	
	private String filePath;
	
	private byte[] file;
	
	public FileUpload(String fileName, Long fileSize, String filePath) {
		super();
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.filePath = filePath;
	}

}
