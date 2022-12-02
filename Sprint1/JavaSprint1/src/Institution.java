
public class Institution {

	private int course_id;
	private String course_name;
	private String course_teacher;
	private float course_duration;
	private int total_fees;
	
	public Institution(int course_id,String course_name,String course_teacher,float course_duration,int total_fees)
	{
		super();
		this.course_id=course_id;
		this.course_name=course_name;
		this.course_teacher=course_teacher;
		this.course_duration=course_duration;
		this.total_fees=total_fees;
		
		
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_teacher() {
		return course_teacher;
	}

	public void setCourse_teacher(String course_teacher) {
		this.course_teacher = course_teacher;
	}



	public float getCourse_duration() {
		return course_duration;
	}

	public void setCourse_duration(float course_duration) {
		this.course_duration = course_duration;
	}

	public int getTotal_fees() {
		return total_fees;
	}

	public void setTotal_fees(int total_fees) {
		this.total_fees = total_fees;
	}

	@Override
	public String toString() {
		return "Institution [course_id=" + course_id + ", course_name=" + course_name + ", course_teacher="
				+ course_teacher + ", course_duration=" + course_duration + ", total_fees=" + total_fees + "]";
	}
	
	
	
}
