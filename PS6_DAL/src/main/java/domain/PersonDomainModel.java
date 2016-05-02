package domain;


import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import util.LocalDateAdapter;

public class PersonDomainModel {
	
	protected UUID personID;
    protected  String firstName;
    protected  String lastName;
    protected  String street;
    protected  Integer postalCode;
    protected  String city;
    protected  Date birthday;
    
    
    
	public UUID getPersonID() {
		return personID;
	}
	public void setPersonID(UUID personID) {
		this.personID = personID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

    /**
     * Default constructor.
     */

    
    
/////////
//    
//    public String getFirstName() {
//        return firstName.get();
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName.set(firstName);
//    }
//
//    public StringProperty firstNameProperty() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName.get();
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName.set(lastName);
//    }
//
//    public StringProperty lastNameProperty() {
//        return lastName;
//    }
//
//    public String getStreet() {
//        return street.get();
//    }
//
//    public void setStreet(String street) {
//        this.street.set(street);
//    }
//
//    public StringProperty streetProperty() {
//        return street;
//    }
//
//    public int getPostalCode() {
//        return postalCode.get();
//    }
//
//    public void setPostalCode(int postalCode) {
//        this.postalCode.set(postalCode);
//    }
//
//    public IntegerProperty postalCodeProperty() {
//        return postalCode;
//    }
//
//    public String getCity() {
//        return city.get();
//    }
//
//    public void setCity(String city) {
//        this.city.set(city);
//    }
//
//    public StringProperty cityProperty() {
//        return city;
//    }
//
//    @XmlJavaTypeAdapter(LocalDateAdapter.class)
//    public LocalDate getBirthday() {
//        return birthday.get();
//    }
//
//    public void setBirthday(LocalDate birthday) {
//        this.birthday.set(birthday);
//    }
//
//    public ObjectProperty<LocalDate> birthdayProperty() {
//        return birthday;
//    }
}