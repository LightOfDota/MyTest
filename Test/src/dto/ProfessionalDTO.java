package dto;

import java.io.Serializable;
import java.util.List;

public class ProfessionalDTO implements Serializable{

	
	/**
	 * 智慧专业扩展�?
	 */
	 
	private static final long serialVersionUID = 1L;

	private List<ProfessionalWisdomDTO> professionalWisdom ;

	public List<ProfessionalWisdomDTO> getProfessionalWisdom() {
		return professionalWisdom;
	}

	public void setProfessionalWisdom(List<ProfessionalWisdomDTO> professionalWisdom) {
		this.professionalWisdom = professionalWisdom;
	}
	
	
}
