package src.org.kolyan.studentadmissioncontroller;

import java.beans.PropertyEditorSupport;

public class AddressPincodeEditorClass extends PropertyEditorSupport {

    @Override
    public void setAsText(String pincode) {
        pincode = "08";
        setValue(Integer.parseInt(pincode));
    }
}
