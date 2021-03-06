package view;

import javax.swing.JFrame;

import form.Form;
import presenter.Presenter;

public abstract class AbstractView<PRESENTER extends Presenter, FORM extends Form> implements View<PRESENTER, FORM> {

	protected JFrame frame;

	@SuppressWarnings("unused")
	private PRESENTER presenter;

	@Override
	public void setPresenter(PRESENTER presenter) {
		this.presenter = presenter;
	}

}
