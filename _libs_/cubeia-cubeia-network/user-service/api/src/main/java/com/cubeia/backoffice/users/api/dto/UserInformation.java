/**
 * Copyright (C) 2010 Cubeia Ltd <info@cubeia.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.cubeia.backoffice.users.api.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Extended user information. This is a convenience type for some common
 * user attributes. 
 * @author Fredrik Johansson, Cubeia Ltd
 */
@XmlRootElement(name="UserInformation")
public class UserInformation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String firstName;
	private String lastName;
    private String middleName;
    private String nickName;
	private String email;
	private String title;
	private String city;
	private String billingAddress;
	private String fax;
	private String cellphone;
	private String country;
	private String currency;
	private String timeZone;
	private String zipcode;
	private String state;
	private String phone;
	private String workphone;
	private Gender gender;
	private Date dateOfBirth;
    private String avatarId;
	
	/** 
	 * @return String, a readable representation
	 */
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	/*------------------------------------------------
	 
		ACCESSORS & MUTATORS
		
		This are all bound to XML by JAXB annotations
		for marshalling and unmarshalling.
		
		Some attributes will use custom adapters for
		marshalling/unmarshalling. They are annotated
		with @XmlJavaTypeAdapter(class)

	 ------------------------------------------------*/
	
	/**
	 * Date of birth.
	 * @return dob
	 */
	@XmlElement(name="dateOfBirth")
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	/**
	 * County. It is recommended to use ISO 3166-1 alpha-2, or alpha-3 codes.
	 * @return country
	 */
	@XmlElement(name="country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * First name.
	 * @return first name
	 */
	@XmlElement(name="firstName")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Last name.
	 * @return last name
	 */
	@XmlElement(name="lastName")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    /**
     * Last name.
     * @return middle name
     */
    @XmlElement(name="middleName")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Last name.
     * @return nickname
     */
    @XmlElement(name="nickName")
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
	 * Email address.
	 * @return email
	 */
	@XmlElement(name="email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * User's title.
	 * @return title
	 */
	@XmlElement(name="title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * City.
	 * @return city
	 */
	@XmlElement(name="city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Billing address.
	 * @return billing adr
	 */
	@XmlElement(name="billingAddress")
	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	/**
	 * Fax number. 
	 * @return fax number
	 */
	@XmlElement(name="fax")
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * Cell phone number.
	 * @return cell phone number
	 */
	@XmlElement(name="cellphone")
	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	/**
	 * Zip code.
	 * @return zip code
	 */
	@XmlElement(name="zipcode")
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * State.
	 * @return state
	 */
	@XmlElement(name="state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Phone number.
	 * @return phone nr.
	 */
	@XmlElement(name="phone")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Work phone number.
	 * @return work phone
	 */
	@XmlElement(name="workphone")
	public String getWorkphone() {
		return workphone;
	}

	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}

	/**
	 * Gender.
	 * @return gender
	 */
	@XmlElement(name="gender")
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	/**
	 * User id. Assigned by the service.
	 * @return user id
	 */
	@XmlElement(name="id")
	public Long getId() {
        return id;
    }
	
	public void setId(Long id) {
        this.id = id;
    }

	/**
	 * Time zone. 
	 * @return time zone
	 */
    @XmlElement(name="tz")
	public String getTimeZone() {
        return timeZone;
    }
    
	public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
	
	/**
	 * Users currency. It is recommended to use an ISO 4217 currency code.
	 * @return currency
	 */
    @XmlElement(name="currency")
    public String getCurrency() {
        return currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * User avatar's Id.
     * @return avatarId
     */
    @XmlElement(name="avatarId")
    public String getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(String avatarId) {
        this.avatarId = avatarId;
    }

    //custom equals - do not compare "Id" fields
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInformation that = (UserInformation) o;

        if (billingAddress != null ? !billingAddress.equals(that.billingAddress) : that.billingAddress != null)
            return false;
        if (cellphone != null ? !cellphone.equals(that.cellphone) : that.cellphone != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(that.dateOfBirth) : that.dateOfBirth != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (gender != that.gender) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) return false;
        if (nickName != null ? !nickName.equals(that.nickName) : that.nickName != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (timeZone != null ? !timeZone.equals(that.timeZone) : that.timeZone != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (workphone != null ? !workphone.equals(that.workphone) : that.workphone != null) return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
        if (avatarId != null ? !avatarId.equals(that.avatarId) : that.avatarId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (billingAddress != null ? billingAddress.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (cellphone != null ? cellphone.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (timeZone != null ? timeZone.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (workphone != null ? workphone.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (avatarId != null ? avatarId.hashCode() : 0);
        return result;
    }
}