package com.example.tddCoursework.production;

/*	Author: Adanna Obibuaku*
 *	Date: 08/11/19
 *	Purpose: The is creates a module mark type
 */
public class ModuleMark implements Data {
	final private Module module;
	final private int mark;

	public ModuleMark(Module module, int mark) {
		this.module = module;
		this.mark = mark;
	}

	public Module getModule() {
		return module;
	}

	public int getMark() {
		return mark;
	}

	public String toString() {
		return String.format("Module: %10s| Mark: %10d", getModule(), getMark());
	}
}
