package dto;

import java.io.Serializable;

public class ProfessionalInformationDTO implements Serializable{

	
	/**
	 * 智慧专业信息表扩展类
	 */
	 
	private static final long serialVersionUID = 1L;

	private String professionalInformationName ; //智慧专业信息标题
	
	private String professionalInformationUrl ; //跳转的url
	
	private String professionalWisdomIntroduce ; //介绍
	
	private String professionalWisdomDetails ; //详情
    
	private String fileId ; //图片或�?�视频Id
	
	public String getProfessionalInformationName() {
		return professionalInformationName;
	}

	public void setProfessionalInformationName(String professionalInformationName) {
		this.professionalInformationName = professionalInformationName;
	}

	public String getProfessionalInformationUrl() {
		return professionalInformationUrl;
	}

	public void setProfessionalInformationUrl(String professionalInformationUrl) {
		this.professionalInformationUrl = professionalInformationUrl;
	}

	public String getProfessionalWisdomIntroduce() {
		return professionalWisdomIntroduce;
	}

	public void setProfessionalWisdomIntroduce(String professionalWisdomIntroduce) {
		this.professionalWisdomIntroduce = professionalWisdomIntroduce;
	}

	public String getProfessionalWisdomDetails() {
		return professionalWisdomDetails;
	}

	public void setProfessionalWisdomDetails(String professionalWisdomDetails) {
		this.professionalWisdomDetails = professionalWisdomDetails;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	
}
