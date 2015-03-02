package uva.sc.types;

import uva.sc.ast.INodeVisitor;

public class Number implements Type {

	public java.lang.String toString(){
		return "[Type]: double";
	}

	@Override
	public <T> T accept(INodeVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
}
