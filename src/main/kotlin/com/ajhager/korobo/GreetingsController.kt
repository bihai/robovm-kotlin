package com.ajhager.korobo

import org.robovm.apple.uikit.UILabel
import org.robovm.apple.uikit.UITextField
import org.robovm.apple.uikit.UIViewController
import org.robovm.objc.annotation.CustomClass
import org.robovm.objc.annotation.IBAction
import org.robovm.objc.annotation.IBOutlet

CustomClass("GreetingsController")
public class GreetingsController : UIViewController() {
    private var label: UILabel? = null
    private var textField: UITextField? = null

    IBOutlet
    public fun setTextField(textField: UITextField) {
        this.textField = textField;
    }

    IBAction
    private fun textChanged() {
        label!!.setText("I see you typing!");
    }

    IBOutlet
    public fun setLabel(label: UILabel) {
        this.label = label
    }

    IBAction
    private fun clicked() {
        var name = textField!!.getText()
        if (name.isEmpty()) {
            name = "Unknown";
        }
        label!!.setText("Hello " + name + "!");
    }
}