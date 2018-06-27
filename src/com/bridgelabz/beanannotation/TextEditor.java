package com.bridgelabz.beanannotation;

public class TextEditor {

	private SpellChecker spellchecker;
	
	public TextEditor(SpellChecker spellchecker) {
		System.out.println("Inside Text Editor");
		this.spellchecker=spellchecker;
	}
	
	public void spellChecker() {
		spellchecker.checkSpelling();
	}
}
