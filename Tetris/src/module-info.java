module Tetris {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
	opens controller to javafx.fxml;
}
