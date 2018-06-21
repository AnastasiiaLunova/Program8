package main.org.itstep;

public class Controller {
	View view;
	Model model;

	public Controller(View view, Model model) {
		super();
		this.view = view;
		this.model = model;
	}

	public Controller() {
		super();
	}

	public void enteringSentence() {
			view.printMesage(view.INPUT_SENTENSE);
			if (model.inputWordByScanerWord1(model.getWord1()) != null) {
				view.printMesageAndWord(view.OUR_WORD, model.getWord1());
			} else {
				view.printMesage(view.WRONG_INPUT);
			}
			view.printMesage(view.INPUT_SENTENSE);
			if (model.inputWordByScanerWord2(model.getWord2()) != null) {
				view.printMesageAndWord(view.OUR_WORD, model.getWord2());
			} else {
				view.printMesage(view.WRONG_INPUT);
			}
			view.printMesage(view.INPUT_SENTENSE);
			if (model.inputWordByScanerNumber(model.getNumber()) != 0) {
				view.printMesageAndNumber(view.OUR_WORD, model.getNumber());
			} else {
				view.printMesage(view.WRONG_INPUT);
			}
		view.printMesageAndWord(view.OUR_SENTENCE, model.writeSentence(model.getWord1(), model.getWord2(), model.getNumber()));
	}
}
