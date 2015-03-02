package uva.sc.types;

import uva.sc.ast.INodeVisitor;

public class Unidentified implements Type {

	public java.lang.String toString(){
		return "[Type]: undefined";
	}

	public <T> T accept(INodeVisitor<T> visitor) {
		return visitor.visit(this);
	}

}
