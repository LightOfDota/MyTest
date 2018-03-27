package dto;

import java.io.Serializable;
import java.util.List;



public class ProfessionalWisdomDTO implements Serializable{

	
	/**
	 * 智慧专业扩展�?
	 */
	 
	private static final long serialVersionUID = 1L;

	private String adminSchoolId ; //学校Id
	
	private String professionalWisdomName ; //智慧专业标题
	
	private List<ProfessionalInformationDTO> professionalInformation ; //智慧专业信息�?

	public String getAdminSchoolId() {
		return adminSchoolId;
	}

	public void setAdminSchoolId(String adminSchoolId) {
		this.adminSchoolId = adminSchoolId;
	}

	public String getProfessionalWisdomName() {
		return professionalWisdomName;
	}

	public void setProfessionalWisdomName(String professionalWisdomName) {
		this.professionalWisdomName = professionalWisdomName;
	}

	public List<ProfessionalInformationDTO> getProfessionalInformation() {
		return professionalInformation;
	}

	public void setProfessionalInformation(List<ProfessionalInformationDTO> professionalInformation) {
		this.professionalInformation = professionalInformation;
	}
	
}
