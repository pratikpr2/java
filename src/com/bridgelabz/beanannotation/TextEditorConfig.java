package com.bridgelabz.beanannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {

	@Bean
	public TextEditor texteditor() {
		return new TextEditor(spellChecker());
	}
	@Bean
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}
	
}
