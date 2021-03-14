package co.edureka.student.entity;

import java.util.Set;

public class Faculty {
	private Integer facId;
	private String facName;
	private Set<Batch> batches;

	public Faculty(Integer facId, String facName) {
		this.facId = facId;
		this.facName = facName;
	}

	public Integer getFacId() {
		return facId;
	}

	public void setFacId(Integer facId) {
		this.facId = facId;
	}

	public String getFacName() {
		return facName;
	}

	public void setFacName(String facName) {
		this.facName = facName;
	}

	public Set<Batch> getBatches() {
		return batches;
	}

	public void setBatches(Set<Batch> batches) {
		this.batches = batches;
	}

}
