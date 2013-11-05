/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs;

/**
 * DrugOrder
 * 
 * @version 1.0
 */
public class DrugOrder extends Order implements java.io.Serializable {
	
	public static final long serialVersionUID = 72232L;
	
	// Fields
	
	private Double dose;
	
	private Double equivalentDailyDose;
	
	private String units;
	
	private String frequency;
	
	private Boolean asNeeded = false;
	
	private Boolean complex = false;
	
	private Integer quantity;
	
	private Drug drug;
	
	private String asNeededCondition;
	
	// Constructors
	
	/** default constructor */
	public DrugOrder() {
	}
	
	/** constructor with id */
	public DrugOrder(Integer orderId) {
		this.setOrderId(orderId);
	}
	
	/**
	 * @see org.openmrs.Order#copy()
	 */
	public DrugOrder copy() {
		return copyHelper(new DrugOrder());
	}
	
	/**
	 * @see org.openmrs.Order#copyHelper(Order)
	 */
	protected DrugOrder copyHelper(DrugOrder target) {
		super.copyHelper(target);
		target.dose = getDose();
		target.equivalentDailyDose = getEquivalentDailyDose();
		target.units = getUnits();
		target.frequency = getFrequency();
		target.asNeeded = getAsNeeded();
		target.asNeededCondition = getAsNeededCondition();
		target.complex = getComplex();
		target.quantity = getQuantity();
		target.drug = getDrug();
		return target;
	}
	
	public boolean isDrugOrder() {
		return true;
	}
	
	// Property accessors
	
	/**
	 * Gets the units of this drug order
	 * 
	 * @return units
	 */
	public String getUnits() {
		return this.units;
	}
	
	/**
	 * Sets the units of this drug order
	 * 
	 * @param units
	 */
	public void setUnits(String units) {
		this.units = units;
	}
	
	/**
	 * Gets the frequency
	 * 
	 * @return frequency
	 */
	public String getFrequency() {
		return this.frequency;
	}
	
	/**
	 * Sets the frequency
	 * 
	 * @param frequency
	 */
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	/**
	 * @deprecated see {@link #getAsNeeded()}
	 * @return Boolean
	 */
	@Deprecated
	public Boolean getPrn() {
		return getAsNeeded();
	}
	
	/**
	 * @deprecated see {@link #setAsNeeded(Boolean)}
	 * @param prn
	 */
	@Deprecated
	public void setPrn(Boolean prn) {
		setAsNeeded(prn);
	}
	
	/**
	 * Returns true/false whether the drug is a "pro re nata" drug
	 * 
	 * @return Boolean
	 * @since 1.10
	 */
	public Boolean getAsNeeded() {
		return asNeeded;
	}
	
	/**
	 * @param asNeeded the value to set
	 * @since 1.10
	 */
	public void setAsNeeded(Boolean asNeeded) {
		this.asNeeded = asNeeded;
	}
	
	/**
	 * Gets whether this drug is complex
	 * 
	 * @return Boolean
	 */
	public Boolean getComplex() {
		return this.complex;
	}
	
	/**
	 * Sets whether this drug is complex
	 * 
	 * @param complex
	 */
	public void setComplex(Boolean complex) {
		this.complex = complex;
	}
	
	/**
	 * Gets the quantity
	 * 
	 * @return quantity
	 */
	public Integer getQuantity() {
		return this.quantity;
	}
	
	/**
	 * Sets the quantity
	 * 
	 * @param quantity
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Gets the drug
	 * 
	 * @return drug
	 */
	public Drug getDrug() {
		return this.drug;
	}
	
	/**
	 * Sets the drug
	 * 
	 * @param drug
	 */
	public void setDrug(Drug drug) {
		this.drug = drug;
	}
	
	/**
	 * @return the asNeededCondition
	 * @since 1.10
	 */
	public String getAsNeededCondition() {
		return asNeededCondition;
	}
	
	/**
	 * @param asNeededCondition the asNeededCondition to set
	 * @since 1.10
	 */
	public void setAsNeededCondition(String asNeededCondition) {
		this.asNeededCondition = asNeededCondition;
	}
	
	public Double getEquivalentDailyDose() {
		return equivalentDailyDose;
	}
	
	public void setEquivalentDailyDose(Double equivalentDailyDose) {
		this.equivalentDailyDose = equivalentDailyDose;
	}
	
	public void setDose(Double dose) {
		this.dose = dose;
	}
	
	public Double getDose() {
		return dose;
	}
	
	public String toString() {
		return "DrugOrder(" + getDose() + getUnits() + " of " + (getDrug() != null ? getDrug().getName() : "[no drug]")
		        + " from " + getStartDate() + " to " + (getDiscontinued() ? getDiscontinuedDate() : getAutoExpireDate())
		        + ")";
	}
	
}
