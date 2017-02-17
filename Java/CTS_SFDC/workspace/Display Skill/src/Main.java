
import java.util.List;


public class Main {
    
    public static void main(String ags[])throws Exception{
        System.out.println("List of all skills"); 
        List<Skill> skillList = null;
        SkillDAO skillIns = new SkillDAO();
 
        skillList = skillIns.listAllSkills();
        
        int i=0;
        for(Skill s : skillList) {
        	System.out.println((++i) + ") " + s.getSkillName());
        }
        
    }
}
