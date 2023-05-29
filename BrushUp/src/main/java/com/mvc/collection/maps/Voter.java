package com.mvc.collection.maps;

public class Voter {
	int voterId;
	String voterName;
	
	
	public Voter(int voterId, String voterName) {
		super();
		this.voterId = voterId;
		this.voterName = voterName;
	}


	public int getVoterId() {
		return voterId;
	}


	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}


	public String getVoterName() {
		return voterName;
	}


	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + voterId;
		result = prime * result + ((voterName == null) ? 0 : voterName.hashCode());
		return result;
	}


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Voter other = (Voter) obj;
//		if (voterId != other.voterId)
//			return false;
//		if (voterName == null) {
//			if (other.voterName != null)
//				return false;
//		} else if (!voterName.equals(other.voterName))
//			return false;
//		return true;
//	}
	
	
	
	
	
	
}
