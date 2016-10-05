package org.xjtusicd3.database.model;

public class PersistencePatentcount {
	private String patent_inventor;
	private String patent_holder;
	private String counts_inventor;
	private String counts_holder;
	private String counts_application;
	private String counts_announcement;
	private String date_of_application;
	private String announcement_date;
	
	
	
	public String getCounts_inventor() {
		return counts_inventor;
	}
	public void setCounts_inventor(String counts_inventor) {
		this.counts_inventor = counts_inventor;
	}
	public String getCounts_holder() {
		return counts_holder;
	}
	public void setCounts_holder(String counts_holder) {
		this.counts_holder = counts_holder;
	}
	public String getCounts_application() {
		return counts_application;
	}
	public void setCounts_application(String counts_application) {
		this.counts_application = counts_application;
	}
	public String getCounts_announcement() {
		return counts_announcement;
	}
	public void setCounts_announcement(String counts_announcement) {
		this.counts_announcement = counts_announcement;
	}
	public String getDate_of_application() {
		return date_of_application;
	}
	public void setDate_of_application(String date_of_application) {
		this.date_of_application = date_of_application;
	}
	public String getAnnouncement_date() {
		return announcement_date;
	}
	public void setAnnouncement_date(String announcement_date) {
		this.announcement_date = announcement_date;
	}
	public String getPatent_inventor() {
		return patent_inventor;
	}
	public void setPatent_inventor(String patent_inventor) {
		this.patent_inventor = patent_inventor;
	}
	
	public String getPatent_holder() {
		return patent_holder;
	}
	public void setPatent_holder(String patent_holder) {
		this.patent_holder = patent_holder;
	}
	
}
