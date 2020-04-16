package mapshandsons;



import java.io.Serializable;
import java.util.Date;

public class Project implements Serializable,Comparable<Project> {
	private int id;
	private String domain;
	private Date startdate;
	private Date enddate;
	public Project(int id, String domain, Date startdate, Date enddate) {
		super();
		this.id = id;
		this.domain = domain;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	public int getId() {
		return id;
	}
	public String getDomain() {
		return domain;
	}
	public Date getStartdate() {
		return startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", domain=" + domain + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}
	
	@Override
	public int compareTo(Project o) {
		if(this.id>o.id) {
			return 1;
			
		}else if(this.id<o.id){
			return -1;
		}else {
		return 0;
		
		
		}
	}
	

}