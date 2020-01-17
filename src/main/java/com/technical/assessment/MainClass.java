package com.technical.assessment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

import com.technical.assessment.ButterFly.STAGE;
import com.technical.assessment.Rooster.LANGUAGE;

public class MainClass {

	public static void main(String[] args) {

		solution_A_1();
		solution_A_2();
		solution_A_3();


		solution_B_1_and_2();
		solution_B_3();

		solution_D_1_and_2();
		
		solution_E();
		
		solution_BONUS_1();

	}

	//Solutions
	////////////
	public static void solution_A_1() {
		// Birds
		////////
		System.out.println("\n");
		System.out.println("--Birds--");
		Collection<Birds> birds = new ArrayList<Birds>();
		birds.add(new Birds());

		for (Birds b : birds) {
			b.walk();
			b.fly();
			b.sing();
			b.swim();
		}
	}

	public static void solution_A_2() {
		// Duck
		////////
		System.out.println("\n");
		System.out.println("--Duck--");

		Collection<Duck> duck = new ArrayList<Duck>();
		duck.add(new Duck("Quack, quack"));
		for (Duck d : duck) {
			d.say();
			d.swim();
			d.fly();
			d.walk();
			d.sing();
		}

		// Chicken
		////////
		System.out.println("\n");
		System.out.println("--Chicken--");
		Collection<Chicken> chicken = new ArrayList<Chicken>();
		chicken.add(new Chicken("Cluck, cluck"));
		for (Chicken c : chicken) {
			c.say();
			c.walk();
			c.sing();
		}

	}
	
	public static void solution_A_3() {
		// Rooster
		////////
		System.out.println("\n");
		System.out.println("--Rooster--");
		Collection<Rooster> rooster = new ArrayList<Rooster>();
		rooster.add(new Rooster("Cock-a-doodle-doo"));
		rooster.add(new Rooster(LANGUAGE.Swedish));
		for (Rooster r : rooster) {
			r.say();
			r.walk();
			r.sing();
		}
	}
	
	public static void solution_B_1_and_2() {
		// Fieshes
		////////
		System.out.println("\n");
		System.out.println("--Fieshes--");
		Collection<Fish> fishes = new ArrayList<Fish>();
		fishes.add(new Fish());
		fishes.add(new Fish("Sharks", "grey", "large", "Eats other fish"));
		fishes.add(new Fish("Clownfish", "orange", "small", "Make jokes"));

		for (Fish f : fishes) {
			System.out.println(f.getFishName() + " - Color :" + f.getColor() + " - Size : " + f.getSize() + " - "
					+ f.getComments());
			f.walk();
			f.fly();
			f.sing();
			f.swim();
			System.out.println(".....");
		}
	}

	public static void solution_B_3() {
		// Dolphins
		////////
		System.out.println("\n");
		System.out.println("--Dolphins--");
		Collection<Dolphins> dolphins = new ArrayList<Dolphins>();
		dolphins.add(new Dolphins());
		for (Dolphins dol : dolphins) {
			dol.walk();
			dol.fly();
			dol.sing();
			dol.swim();
			System.out.println(".....");
		}
	}

	public static void solution_D_1_and_2() {
		// ButterFly
		////////
		System.out.println("\n");
		System.out.println("--ButterFly--");
		Collection<ButterFly> butterfly = new ArrayList<ButterFly>();
		butterfly.add(new ButterFly(STAGE.CATERPILLAR));
		butterfly.add(new ButterFly(STAGE.BUTTERFLY));
		for (ButterFly b : butterfly) {
			System.out.println(b.getStage());
			b.walk();
			b.fly();
			b.sing();
			b.swim();
			System.out.println(".....");
		}
	}

	public static void solution_E() {
		// Counting Animals
		////////
		System.out.println("\n");
		System.out.println("--Counting Animals--");
		System.out.println("----------------------");
		Collection<Animal> animals = new ArrayList<>();
		animals.add(new Birds());
		animals.add(new Duck());
		animals.add(new Chicken());
		animals.add(new Rooster());
		animals.add(new Parrot());
		animals.add(new Fish());
		animals.add(new Fish("Sharks", "grey", "large", "Eats other fish"));
		animals.add(new Fish("Clownfish", "orange", "small", "Make jokes"));
		animals.add(new Dolphins());
		animals.add(new ButterFly(STAGE.CATERPILLAR));
		animals.add(new ButterFly(STAGE.BUTTERFLY));

		AtomicInteger walkCount = new AtomicInteger(0);
		AtomicInteger flyCount = new AtomicInteger(0);
		AtomicInteger singCount = new AtomicInteger(0);
		AtomicInteger swimCount = new AtomicInteger(0);

		animals.stream().forEach(E -> {
			if (E.walk())
				walkCount.getAndIncrement();
			if (E.fly())
				flyCount.getAndIncrement();
			if (E.sing())
				singCount.getAndIncrement();
			if (E.swim())
				swimCount.getAndIncrement();
		});
		System.out.println("______________________");
		System.out.println("Count of animals that can walk : " +walkCount);
		System.out.println("Count of animals that can fly : " + flyCount);
		System.out.println("Count of animals that can sing : " +singCount);
		System.out.println("Count of animals that can swim : " +swimCount);
	}
	
	
	public static void solution_BONUS_1() {
		// Rooster sounds in different languages
		////////
		System.out.println("\n");
		System.out.println("--Rooster sounds in different languages--");
		Collection<Rooster> rooster = new ArrayList<Rooster>();
		rooster.add(new Rooster(LANGUAGE.Swedish));
		rooster.add(new Rooster(LANGUAGE.Italian));
		rooster.add(new Rooster(LANGUAGE.German));
		rooster.add(new Rooster());
		for (Rooster r : rooster) {
			r.say();
			r.walk();
			r.sing();
			System.out.println(".....");
		}
	}

}
