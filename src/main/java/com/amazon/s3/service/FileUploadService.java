package com.amazon.s3.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.amazon.s3.payload.FileUpload;

public interface FileUploadService {

	String fileUplaod(String bucketName, MultipartFile file);

	String createBucket(String bucketName);

	List<String> getBucketList();

	List<FileUpload> getBucketfiles(String bucketName);

	String softDeleteBucket(String bucketName);

	String hardDeleteBucket(String bucketName);

	String deleteFile(String bucketName, String fileName);

	FileUpload downloadFile(String bucketName, String fileName);


}
