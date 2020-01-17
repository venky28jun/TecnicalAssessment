package com.technical.assessment;

import java.io.Serializable;

import com.technical.assessment.common.interfaces.Fly;
import com.technical.assessment.common.interfaces.Sing;
import com.technical.assessment.common.interfaces.Swim;
import com.technical.assessment.common.interfaces.Walk;

public abstract class Animal implements Serializable, Cloneable, Sing, Walk, Fly, Swim {

	// Static Attributes
	////////////////////
	private static final long serialVersionUID = -3569073882262028599L;

}
