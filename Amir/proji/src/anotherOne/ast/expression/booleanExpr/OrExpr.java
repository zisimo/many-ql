package anotherOne.ast.expression.booleanExpr;

import anotherOne.ast.expression.VariablesCollectionVisitor;

public class OrExpr extends BinaryBooleanExpr {//implements BooleanExpression{

	public BooleanExpression left;
	public BooleanExpression right;

	public OrExpr(BooleanExpression left, BooleanExpression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean accept(BooleanExpressionEvaluationVisitor visitor){//, Map<String, Id> varsMap) {
		return visitor.visit(this);//, varsMap);
	}

	public void accept(VariablesCollectionVisitor visitor){
	visitor.visit(this);
	}
}
