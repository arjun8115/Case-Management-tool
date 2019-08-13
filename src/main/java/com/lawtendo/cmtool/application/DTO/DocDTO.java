package com.lawtendo.cmtool.application.DTO;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class DocDTO {

	private String uuid;
	
	private String cuid;
	
	@Override
	public String toString() {
		return "DocDTO [uuid=" + uuid + ", cuid=" + cuid + ", fileName=" + fileName + ", fileUrl=" + fileUrl
				+ ", mimeType=" + mimeType + ", createdAt=" + createdAt + ", fileId=" + fileId + "]";
	}

	private String fileName;
	
	private String fileUrl;
	
	private String mimeType;
	
	private Timestamp createdAt;
	
	private String fileId;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCuid() {
		return cuid;
	}

	public void setCuid(String cuid) {
		this.cuid = cuid;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getFileId() {
		return this.fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	


	
	
	
}
