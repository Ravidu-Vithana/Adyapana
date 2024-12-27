/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class Student {

    private String initials;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String mobile;
    private String email;
    private String line1;
    private String line2;
    private String cityName;
    private String districtName;
    private String imagePath;
    private String joinedDate;
    private String classesCount;
    private String addressID;
    private String paymentMonth;
    private String paymentYear;

    public Student() {

    }

    /**
     * @return the initials
     */
    public String getFullName() {
        return initials+" "+firstName+" "+lastName;
    }

    public String getInitials() {
        return initials;
    }

    /**
     * @param initials the initials to set
     */
    public void setInitials(String initials) {
        this.initials = initials;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the line1
     */
    public String getLine1() {
        return line1;
    }

    /**
     * @param line1 the line1 to set
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /**
     * @return the line2
     */
    public String getLine2() {
        return line2;
    }

    /**
     * @param line2 the line2 to set
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * @return the cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName the cityName to set
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * @return the districtName
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * @param districtName the districtName to set
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    /**
     * @return the imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * @param imagePath the imagePath to set
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * @return the joinedDate
     */
    public String getJoinedDate() {
        return joinedDate;
    }

    /**
     * @param joinedDate the joinedDate to set
     */
    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }

    /**
     * @return the classesCount
     */
    public String getClassesCount() {
        return classesCount;
    }

    /**
     * @param classesCount the classesCount to set
     */
    public void setClassesCount(String classesCount) {
        this.classesCount = classesCount;
    }

    /**
     * @return the addressID
     */
    public String getAddressID() {
        return addressID;
    }

    /**
     * @param addressID the addressID to set
     */
    public void setAddressID(String addressID) {
        this.addressID = addressID;
    }

    /**
     * @return the paymentMonth
     */
    public String getPaymentMonth() {
        return paymentMonth;
    }

    /**
     * @param paymentMonth the paymentMonth to set
     */
    public void setPaymentMonth(String paymentMonth) {
        this.paymentMonth = paymentMonth;
    }

    /**
     * @return the paymentYear
     */
    public String getPaymentYear() {
        return paymentYear;
    }

    /**
     * @param paymentYear the paymentYear to set
     */
    public void setPaymentYear(String paymentYear) {
        this.paymentYear = paymentYear;
    }
}
