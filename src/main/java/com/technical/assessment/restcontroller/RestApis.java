package com.technical.assessment.restcontroller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.technical.assessment.Animal;
import com.technical.assessment.Birds;
import com.technical.assessment.ButterFly;
import com.technical.assessment.ButterFly.STAGE;
import com.technical.assessment.Rooster.LANGUAGE;
import com.technical.assessment.Chicken;
import com.technical.assessment.Dolphins;
import com.technical.assessment.Duck;
import com.technical.assessment.Fish;
import com.technical.assessment.Parrot;
import com.technical.assessment.Rooster;

@RestController
public class RestApis {

	@RequestMapping(value = "/getAnimals", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	public String getAnimals() {
		try {
			String response = "";
			Collection<Animal> animals = new ArrayList<>();
			animals.add(new Birds());
			animals.add(new Duck());
			animals.add(new Chicken());
			animals.add(new Rooster());
			animals.add(new Rooster(LANGUAGE.Swedish));
			animals.add(new Rooster(LANGUAGE.Italian));
			animals.add(new Rooster(LANGUAGE.German));
			animals.add(new Parrot("living with dogs I says", "Woof, woof"));
			animals.add(new Parrot("living with cats I says", "Meow"));
			animals.add(new Parrot(" living near the rooster I says", "Cock-a-doodle-doo"));
			animals.add(new Fish());
			animals.add(new Fish("Sharks", "grey", "large", "Eats other fish"));
			animals.add(new Fish("Clownfish", "orange", "small", "Make jokes"));
			animals.add(new Dolphins());
			animals.add(new ButterFly(STAGE.CATERPILLAR));
			animals.add(new ButterFly(STAGE.BUTTERFLY));

			GsonBuilder gb = new GsonBuilder();
			gb.serializeNulls();
			Gson gson = gb.create();
			response = gson.toJson(animals);

			return response;
		} catch (Exception e) {
			return null;
		}

	}

}
