package com.bridgelabz.visitordesign;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruits fruit);
}
