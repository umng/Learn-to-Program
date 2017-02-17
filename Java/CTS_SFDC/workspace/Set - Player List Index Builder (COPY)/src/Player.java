
	class Player {
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((skill == null) ? 0 : skill.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
		
			Player other = (Player) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			
			return true;
		}
		String name,skill;
		
		Player(){}
		Player(String name)
		{
			setName(name);
		}
		Player(String name, String skill)
		{
			setName(name);
			setSkill(skill);
		}
		void setName(String name)
		{
			this.name=name;
		}
		void setSkill(String skill)
		{
			this.skill=skill;
		}
		String getName(){
			return name;
		}
		String getSkill(){return skill;}
	}