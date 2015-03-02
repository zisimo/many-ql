package uva.sc.atom;

import uva.sc.ast.INodeVisitor;
import uva.sc.logic.Expression;

public class Literal extends Expression{
	
	//public Expression getOperand() {
	//	return this.operand;
	//}
	
	public Literal() {
		super();
	}

	public <T> T accept(INodeVisitor<T> visitor) {
		return visitor.visit(this);
	}

	public Expression evaluate() {
		// TODO Auto-generated method stub
		return null;
		
	}
	/*
	public Literal (String str){
		this.str = str;
	}
	
	public Literal (Double d){
		this.d = d;
	}
	
	public Literal (int i){
		this.i = i;
	}
	
	public Literal (boolean bool){
		this.bool = bool;
	}
	
	public String toString() {
		return "[String]: " + this.str + "[Double]: " + this.d + 
			   "[Integer]: " + this.i + "[Boolean]: " + this.bool;
	}*/

}
