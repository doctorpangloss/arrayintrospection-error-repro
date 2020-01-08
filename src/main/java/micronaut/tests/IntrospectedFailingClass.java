package micronaut.tests;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class IntrospectedFailingClass {
	private int[][] failingField;

	public IntrospectedFailingClass() {
	}

	public int[][] getFailingField() {
		return failingField;
	}

	public IntrospectedFailingClass setFailingField(int[][] failingField) {
		this.failingField = failingField;
		return this;
	}
}
