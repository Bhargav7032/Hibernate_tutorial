package com.ciq.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LeaveTracker {
	@Column
	private int id;//1,2,3,4
	@Column
	private int SickLeave=3;
	@Column
	private int earnedLeave=15;
	@Column
	private int MeternityLeave=180;
	@Column
	private int emergencyLeave=7;
	
	
	public LeaveTracker() {
			
	}

	public LeaveTracker(int sickLeave, int earnedLeave, int meternityLeave, int emergencyLeave) {
		super();
		SickLeave = sickLeave;
		this.earnedLeave = earnedLeave;
		MeternityLeave = meternityLeave;
		this.emergencyLeave = emergencyLeave;
	}

	public int getSickLeave() {
		return SickLeave;
	}

	public void setSickLeave(int sickLeave) {
		SickLeave = sickLeave;
	}

	public int getEarnedLeave() {
		return earnedLeave;
	}

	public void setEarnedLeave(int earnedLeave) {
		this.earnedLeave = earnedLeave;
	}

	public int getMeternityLeave() {
		return MeternityLeave;
	}
	public void setMeternityLeave(int meternityLeave) {
		MeternityLeave = meternityLeave;
	}

	public int getEmergencyLeave() {
		return emergencyLeave;
	}

	public void setEmergencyLeave(int emergencyLeave) {
		this.emergencyLeave = emergencyLeave;
	}

	@Override
	public String toString() {
		return "LeaveTracker [id=" + id + ", SickLeave=" + SickLeave + ", earnedLeave=" + earnedLeave
				+ ", MeternityLeave=" + MeternityLeave + ", emergencyLeave=" + emergencyLeave + "]";
	}
	}
	