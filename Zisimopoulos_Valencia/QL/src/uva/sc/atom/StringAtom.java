package uva.sc.atom;

import uva.sc.ast.INodeVisitor;
import uva.sc.logic.Expression;

public class StringAtom extends Expression{

	String value;
	
	public StringAtom(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public <T> T accept(INodeVisitor<T> visitor) {
		return visitor.visit(this);
	}

	public Expression evaluate() {
		return null;
	}

}
