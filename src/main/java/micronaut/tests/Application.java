package micronaut.tests;

import io.micronaut.runtime.Micronaut;

public class Application {
	public static void main(String[] args) {
      // Make sure there's a reference to an introspected class somewhere
      var failing = new IntrospectedFailingClass();
      System.out.println((null == failing.getFailingField()));
		Micronaut.run(Application.class);
	}
}