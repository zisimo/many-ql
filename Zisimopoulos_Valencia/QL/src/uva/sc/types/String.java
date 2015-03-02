package uva.sc.types;

import uva.sc.ast.INodeVisitor;


public class String implements Type{
	
	public java.lang.String toString(){
		return "[Type]: string";
	}

	@Override
	public <T> T accept(INodeVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
}
