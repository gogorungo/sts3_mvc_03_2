package org.comstudy21.myapp.saram;

public class SaramDto {
	public static int sequence = 0;
	private int idx;
	private String id;
	private String name;
	private String email;
	
	
	public SaramDto() {
		this(0,"","","");
	}

	public SaramDto(int idx, String id, String name, String email) {
		this.idx = idx;
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public static int nextSeq() {
		return ++sequence;
	}
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "SaramDto [idx=" + idx + ", id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idx;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaramDto other = (SaramDto) obj;
		if (idx != other.idx)
			return false;
		return true;
	}

	public void setData(SaramDto dto) {
		this.idx = dto.getIdx();
		this.id = dto.getId();
		this.name = dto.getName();
		this.email = dto.getEmail();		
	}

}
