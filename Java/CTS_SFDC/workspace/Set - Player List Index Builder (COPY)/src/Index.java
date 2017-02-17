class Index implements Comparable<Index>{
	char ch;
	int count;
	Index(){}
	Index(char ch, int count)
	{setCh(ch);
	setCount(count);
		}
	void setCh(char ch)
	{this.ch=ch;
	}
	void setCount(int count)
	{this.count=count;}
	char getCh(){return ch;}

	int getCount(){return count;}

	@Override
	public int compareTo(Index o) {
	    if(this.ch > o.ch)
	        return 1;
	    else if (this.ch < o.ch)
	        return -1;
	    else return 0;
	    
	}
	}