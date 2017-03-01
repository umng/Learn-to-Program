import java.sql.SQLException;


public class SkillBO {

	public Skill getSkillByName(String skill) throws ClassNotFoundException, SQLException {
		return new SkillDAO().getSkillByName(skill);
	
	}

}
