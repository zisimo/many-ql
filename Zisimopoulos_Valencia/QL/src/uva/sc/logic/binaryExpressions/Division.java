package uva.sc.logic.binaryExpressions;

import java.math.BigDecimal;

import uva.sc.ast.INodeVisitor;
import uva.sc.atom.NumberAtom;
import uva.sc.logic.Expression;

public class Division extends BinaryExpression{

	public Division(Expression firstOperand, Expression secondOperand) {
		super(firstOperand, secondOperand);
	}
	
	public String toString() {
		return "[op /]";
	}

	public <T> T accept(INodeVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
