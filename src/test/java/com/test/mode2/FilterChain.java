package com.test.mode2;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	public List<Filter> filterList =new ArrayList<Filter>();
	public Target target;
	
	public void addFilter(Filter filter){
		filterList.add(filter);
	}
	
	public void setTarget(Target target){
		this.target=target;
	}
	
	public void execute(String request){
		for (Filter filter : filterList) {
			filter.execute(request);
		}
		target.execute(request);
	}
}
