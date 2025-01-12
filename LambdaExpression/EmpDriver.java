package com.LambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmpDriver {

	public static void main(String[] args) {
		Emp e1=new Emp("Amaran", 30, 60000, 1);
		Emp e2=new Emp("Jali Ready", 26, 20000, 6);
		Emp e3=new Emp("Bugga Ready", 23, 30000, 9);
		Emp e4=new Emp("Pushpa Raju", 35, 10000, 5);
		Emp[] emp= {e1,e2,e3,e4};
		Predicate<Double>p=i->i<=5000;
		Consumer<Emp>cs=e->System.out.println(e.name+","+e.sal);
		Function<Emp, Double>fn=e->{
			double bonus=0;
			if(e.sal>=10000 && e.sal<=20000) {
				bonus=(e.sal*10)/100;
				return bonus;
			}
			else if(e.sal>20000 && e.sal<=30000) {
				bonus=(e.sal*20)/100;
				return bonus;
			}
			else if(e.sal>30000 && e.sal<=50000) {
				bonus=(e.sal*50)/100;
				return bonus;
			}
			else {
				
					bonus=(e.sal*60)/100;
					return bonus;
				}
			
		};
		for(Emp em:emp) {
			double bonus=fn.apply(em);
			if(p.test(bonus)) {
				cs.accept(em);
				System.out.println("Bonus"+"="+bonus);
			}
		}

	}

}
