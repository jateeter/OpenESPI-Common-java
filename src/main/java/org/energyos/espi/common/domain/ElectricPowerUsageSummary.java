/*
 * Copyright 2013 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.27 at 01:43:57 PM EDT 
//

package org.energyos.espi.common.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.energyos.espi.common.models.atom.adapters.ElectricPowerUsageSummaryAdapter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * Summary of usage for a billing period
 * <p/>
 * <p>
 * Java class for ElectricPowerUsageSummary complex type.
 * <p/>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * 
 * <pre>
 * &lt;complexType name="ElectricPowerUsageSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject">
 *       &lt;sequence>
 *         &lt;element name="billingPeriod" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/>
 *         &lt;element name="billLastPeriod" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="billToDate" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="costAdditionalLastPeriod" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="costAdditionalDetailLastPeriod" type="{http://naesb.org/espi}LineItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://naesb.org/espi}Currency" minOccurs="0"/>
 *         &lt;element name="overallConsumptionLastPeriod" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="currentBillingPeriodOverAllConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="currentDayLastYearNetConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="currentDayNetConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="currentDayOverallConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="peakDemand" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="previousDayLastYearOverallConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="previousDayNetConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="previousDayOverallConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="qualityOfReading" type="{http://naesb.org/espi}QualityOfReading" minOccurs="0"/>
 *         &lt;element name="ratchetDemand" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="ratchetDemandPeriod" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/>
 *         &lt;element name="statusTimeStamp" type="{http://naesb.org/espi}TimeType"/>
 *         &lt;element name="commodity" type="{http://naesb.org/espi}Commodity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement(name = "ElectricPowerUsageSummary")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricPowerUsageSummary", propOrder = { "billingPeriod",
		"billLastPeriod", "billToDate", "costAdditionalLastPeriod",
		"costAdditionalDetailLastPeriod", "currency",
		"overallConsumptionLastPeriod",
		"currentBillingPeriodOverAllConsumption",
		"currentDayLastYearNetConsumption", "currentDayNetConsumption",
		"currentDayOverallConsumption", "peakDemand",
		"previousDayLastYearOverallConsumption", "previousDayNetConsumption",
		"previousDayOverallConsumption", "ratchetDemand", "qualityOfReading",
		"ratchetDemandPeriod", "statusTimeStamp", "commodity" })
@Entity
@Table(name = "electric_power_usage_summaries", uniqueConstraints = { @UniqueConstraint(columnNames = { "uuid" }) })
@XmlJavaTypeAdapter(ElectricPowerUsageSummaryAdapter.class)
@NamedQueries(value = {
		@NamedQuery(name = ElectricPowerUsageSummary.QUERY_FIND_BY_ID, query = "SELECT summary FROM ElectricPowerUsageSummary summary WHERE summary.id = :id"),
		@NamedQuery(name = ElectricPowerUsageSummary.QUERY_FIND_BY_UUID, query = "SELECT summary FROM ElectricPowerUsageSummary summary WHERE summary.uuid = :uuid"),
		@NamedQuery(name = ElectricPowerUsageSummary.QUERY_FIND_ALL_IDS_BY_USAGE_POINT_ID, query = "SELECT summary.id FROM ElectricPowerUsageSummary summary WHERE summary.usagePoint.id = :usagePointId"),
		@NamedQuery(name = ElectricPowerUsageSummary.QUERY_FIND_ALL_IDS, query = "SELECT electricPowerUsageSummary.id FROM ElectricPowerUsageSummary electricPowerUsageSummary"),
		@NamedQuery(name = ElectricPowerUsageSummary.QUERY_FIND_ALL_IDS_BY_XPATH_2, query = "SELECT e.id FROM UsagePoint u, ElectricPowerUsageSummary e WHERE u.retailCustomer.id = :o1Id AND  e.usagePoint.id = :o2Id"),
		@NamedQuery(name = ElectricPowerUsageSummary.QUERY_FIND_ID_BY_XPATH, query = "SELECT e.id FROM UsagePoint u, ElectricPowerUsageSummary e WHERE u.retailCustomer.id = :o1Id AND e.usagePoint.id = :o2Id AND e.id = :o3Id")

})
public class ElectricPowerUsageSummary extends IdentifiedObject {

	public static final String QUERY_FIND_BY_ID = "ElectricPowerUsageSummary.findById";
	public static final String QUERY_FIND_BY_UUID = "ElectricPowerUsageSummary.findByUUID";
	public static final String QUERY_FIND_ALL_IDS_BY_USAGE_POINT_ID = "ElectricPowerUsageSummary.findAllIdsByUsagePointId";
	public static final String QUERY_FIND_ALL_IDS = "ElectricPowerUsageSummary.findAllIds";
	public static final String QUERY_FIND_ALL_IDS_BY_XPATH_2 = "ElectricPowerUsageSummary.findAllIdsByXpath2";
	public static final String QUERY_FIND_ID_BY_XPATH = "ElectricPowerUsageSummary.findIdByXpath";

	protected Long billLastPeriod;
	protected Long billToDate;
	protected Long costAdditionalLastPeriod;

	@OneToMany(mappedBy = "electricPowerUsageSummary", cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	@XmlElementRefs({ @XmlElementRef(name = "costAdditionalDetailLastPeriod", namespace = "http://naesb.org/espi", type = JAXBElement.class, required = false), })
	@XmlAnyElement(lax = true)
	protected List<LineItem> costAdditionalDetailLastPeriod = new ArrayList<>();

	protected String currency;

	@AttributeOverrides({
			@AttributeOverride(name = "powerOfTenMultiplier", column = @Column(name = "overallConsumptionLastPeriod_powerOfTenMultiplier")),
			@AttributeOverride(name = "timeStamp", column = @Column(name = "overallConsumptionLastPeriod_timeStamp")),
			@AttributeOverride(name = "uom", column = @Column(name = "overallConsumptionLastPeriod_uom")),
			@AttributeOverride(name = "value", column = @Column(name = "overallConsumptionLastPeriod_value")), })
	@Embedded
	protected SummaryMeasurement overallConsumptionLastPeriod;

	protected String qualityOfReading;
	protected long statusTimeStamp;

	@AttributeOverrides({
			@AttributeOverride(name = "duration", column = @Column(name = "ratchetDemandPeriod_duration")),
			@AttributeOverride(name = "start", column = @Column(name = "ratchetDemandPeriod_start")), })
	@Embedded
	protected DateTimeInterval ratchetDemandPeriod;

	@AttributeOverrides({
			@AttributeOverride(name = "duration", column = @Column(name = "billingPeriod_duration")),
			@AttributeOverride(name = "start", column = @Column(name = "billingPeriod_start")), })
	@Embedded
	protected DateTimeInterval billingPeriod;

	@AttributeOverrides({
			@AttributeOverride(name = "powerOfTenMultiplier", column = @Column(name = "currentBillingPeriodOverAllConsumption_powerOfTenMultiplier")),
			@AttributeOverride(name = "timeStamp", column = @Column(name = "currentBillingPeriodOverAllConsumption_timeStamp")),
			@AttributeOverride(name = "uom", column = @Column(name = "currentBillingPeriodOverAllConsumption_uom")),
			@AttributeOverride(name = "value", column = @Column(name = "currentBillingPeriodOverAllConsumption_value")), })
	@Embedded
	protected SummaryMeasurement currentBillingPeriodOverAllConsumption;

	@AttributeOverrides({
			@AttributeOverride(name = "powerOfTenMultiplier", column = @Column(name = "currentDayLastYearNetConsumption_powerOfTenMultiplier")),
			@AttributeOverride(name = "timeStamp", column = @Column(name = "currentDayLastYearNetConsumption_timeStamp")),
			@AttributeOverride(name = "uom", column = @Column(name = "currentDayLastYearNetConsumption_uom")),
			@AttributeOverride(name = "value", column = @Column(name = "currentDayLastYearNetConsumption_value")), })
	@Embedded
	protected SummaryMeasurement currentDayLastYearNetConsumption;

	@AttributeOverrides({
			@AttributeOverride(name = "powerOfTenMultiplier", column = @Column(name = "currentDayNetConsumption_powerOfTenMultiplier")),
			@AttributeOverride(name = "timeStamp", column = @Column(name = "currentDayNetConsumption_timeStamp")),
			@AttributeOverride(name = "uom", column = @Column(name = "currentDayNetConsumption_uom")),
			@AttributeOverride(name = "value", column = @Column(name = "currentDayNetConsumption_value")), })
	@Embedded
	protected SummaryMeasurement currentDayNetConsumption;

	@AttributeOverrides({
			@AttributeOverride(name = "powerOfTenMultiplier", column = @Column(name = "currentDayOverallConsumption_powerOfTenMultiplier")),
			@AttributeOverride(name = "timeStamp", column = @Column(name = "currentDayOverallConsumption_timeStamp")),
			@AttributeOverride(name = "uom", column = @Column(name = "currentDayOverallConsumption_uom")),
			@AttributeOverride(name = "value", column = @Column(name = "currentDayOverallConsumption_value")), })
	@Embedded
	protected SummaryMeasurement currentDayOverallConsumption;

	@AttributeOverrides({
			@AttributeOverride(name = "powerOfTenMultiplier", column = @Column(name = "peakDemand_powerOfTenMultiplier")),
			@AttributeOverride(name = "timeStamp", column = @Column(name = "peakDemand_timeStamp")),
			@AttributeOverride(name = "uom", column = @Column(name = "peakDemand_uom")),
			@AttributeOverride(name = "value", column = @Column(name = "peakDemand_value")), })
	@Embedded
	protected SummaryMeasurement peakDemand;

	@AttributeOverrides({
			@AttributeOverride(name = "powerOfTenMultiplier", column = @Column(name = "previousDayLastYearOverallConsumption_powerOfTenMultiplier")),
			@AttributeOverride(name = "timeStamp", column = @Column(name = "previousDayLastYearOverallConsumption_timeStamp")),
			@AttributeOverride(name = "uom", column = @Column(name = "previousDayLastYearOverallConsumption_uom")),
			@AttributeOverride(name = "value", column = @Column(name = "previousDayLastYearOverallConsumption_value")), })
	@Embedded
	protected SummaryMeasurement previousDayLastYearOverallConsumption;

	@AttributeOverrides({
			@AttributeOverride(name = "powerOfTenMultiplier", column = @Column(name = "previousDayNetConsumption_powerOfTenMultiplier")),
			@AttributeOverride(name = "timeStamp", column = @Column(name = "previousDayNetConsumption_timeStamp")),
			@AttributeOverride(name = "uom", column = @Column(name = "previousDayNetConsumption_uom")),
			@AttributeOverride(name = "value", column = @Column(name = "previousDayNetConsumption_value")), })
	@Embedded
	protected SummaryMeasurement previousDayNetConsumption;

	@AttributeOverrides({
			@AttributeOverride(name = "powerOfTenMultiplier", column = @Column(name = "previousDayOverallConsumption_powerOfTenMultiplier")),
			@AttributeOverride(name = "timeStamp", column = @Column(name = "previousDayOverallConsumption_timeStamp")),
			@AttributeOverride(name = "uom", column = @Column(name = "previousDayOverallConsumption_uom")),
			@AttributeOverride(name = "value", column = @Column(name = "previousDayOverallConsumption_value")), })
	@Embedded
	protected SummaryMeasurement previousDayOverallConsumption;

	@AttributeOverrides({
			@AttributeOverride(name = "powerOfTenMultiplier", column = @Column(name = "ratchetDemand_powerOfTenMultiplier")),
			@AttributeOverride(name = "timeStamp", column = @Column(name = "ratchetDemand_timeStamp")),
			@AttributeOverride(name = "uom", column = @Column(name = "ratchetDemand_uom")),
			@AttributeOverride(name = "value", column = @Column(name = "ratchetDemand_value")), })
	@Embedded
	protected SummaryMeasurement ratchetDemand;

	@Embedded
	protected String commodity;

	@XmlTransient
	@ManyToOne
	@JoinColumn(name = "usage_point_id")
	private UsagePoint usagePoint;

	public UsagePoint getUsagePoint() {
		return usagePoint;
	}

	public void setUsagePoint(UsagePoint usagePoint) {
		this.usagePoint = usagePoint;
	}

	/**
	 * Gets the value of the billingPeriod property.
	 *
	 * @return possible object is {@link DateTimeInterval }
	 *
	 */
	public DateTimeInterval getBillingPeriod() {
		return billingPeriod;
	}

	/**
	 * Sets the value of the billingPeriod property.
	 *
	 * @param value
	 *            allowed object is {@link DateTimeInterval }
	 *
	 */
	public void setBillingPeriod(DateTimeInterval value) {
		this.billingPeriod = value;
	}

	/**
	 * Gets the value of the billLastPeriod property.
	 *
	 * @return possible object is {@link Long }
	 *
	 */
	public Long getBillLastPeriod() {
		return billLastPeriod;
	}

	/**
	 * Sets the value of the billLastPeriod property.
	 *
	 * @param value
	 *            allowed object is {@link Long }
	 *
	 */
	public void setBillLastPeriod(Long value) {
		this.billLastPeriod = value;
	}

	/**
	 * Gets the value of the billToDate property.
	 *
	 * @return possible object is {@link Long }
	 *
	 */
	public Long getBillToDate() {
		return billToDate;
	}

	/**
	 * Sets the value of the billToDate property.
	 *
	 * @param value
	 *            allowed object is {@link Long }
	 *
	 */
	public void setBillToDate(Long value) {
		this.billToDate = value;
	}

	/**
	 * Gets the value of the costAdditionalLastPeriod property.
	 *
	 * @return possible object is {@link Long }
	 *
	 */
	public Long getCostAdditionalLastPeriod() {
		return costAdditionalLastPeriod;
	}

	/**
	 * Sets the value of the costAdditionalLastPeriod property.
	 *
	 * @param value
	 *            allowed object is {@link Long }
	 *
	 */
	public void setCostAdditionalLastPeriod(Long value) {
		this.costAdditionalLastPeriod = value;
	}

	/**
	 * Gets the value of the costAdditionalDetailLastPeriod property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the costAdditionalDetailLastPeriod property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCostAdditionalDetailLastPeriod().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link LineItem }
	 * 
	 * 
	 */
	public List<LineItem> getCostAdditionalDetailLastPeriod() {
		if (costAdditionalDetailLastPeriod == null) {
			costAdditionalDetailLastPeriod = new ArrayList<LineItem>();
		}
		return this.costAdditionalDetailLastPeriod;
	}

	/**
	 * Gets the value of the currency property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Sets the value of the currency property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setCurrency(String value) {
		this.currency = value;
	}

	/**
	 * Gets the value of the overallConsumptionLastPeriod property.
	 * 
	 * @return possible object is {@link SummaryMeasurement }
	 * 
	 */
	public SummaryMeasurement getOverallConsumptionLastPeriod() {
		return overallConsumptionLastPeriod;
	}

	/**
	 * Sets the value of the overallConsumptionLastPeriod property.
	 * 
	 * @param value
	 *            allowed object is {@link SummaryMeasurement }
	 * 
	 */
	public void setOverallConsumptionLastPeriod(SummaryMeasurement value) {
		this.overallConsumptionLastPeriod = value;
	}

	/**
	 * Gets the value of the currentBillingPeriodOverAllConsumption property.
	 *
	 * @return possible object is {@link SummaryMeasurement }
	 *
	 */
	public SummaryMeasurement getCurrentBillingPeriodOverAllConsumption() {
		return currentBillingPeriodOverAllConsumption;
	}

	/**
	 * Sets the value of the currentBillingPeriodOverAllConsumption property.
	 *
	 * @param value
	 *            allowed object is {@link SummaryMeasurement }
	 *
	 */
	public void setCurrentBillingPeriodOverAllConsumption(
			SummaryMeasurement value) {
		this.currentBillingPeriodOverAllConsumption = value;
	}

	/**
	 * Gets the value of the qualityOfReading property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getQualityOfReading() {
		return qualityOfReading;
	}

	/**
	 * Sets the value of the qualityOfReading property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setQualityOfReading(String value) {
		this.qualityOfReading = value;
	}

	/**
	 * Gets the value of the currentDayLastYearNetConsumption property.
	 *
	 * @return possible object is {@link SummaryMeasurement }
	 *
	 */
	public SummaryMeasurement getCurrentDayLastYearNetConsumption() {
		return currentDayLastYearNetConsumption;
	}

	/**
	 * Sets the value of the currentDayLastYearNetConsumption property.
	 *
	 * @param value
	 *            allowed object is {@link SummaryMeasurement }
	 *
	 */
	public void setCurrentDayLastYearNetConsumption(SummaryMeasurement value) {
		this.currentDayLastYearNetConsumption = value;
	}

	/**
	 * Gets the value of the currentDayNetConsumption property.
	 *
	 * @return possible object is {@link SummaryMeasurement }
	 *
	 */
	public SummaryMeasurement getCurrentDayNetConsumption() {
		return currentDayNetConsumption;
	}

	/**
	 * Sets the value of the currentDayNetConsumption property.
	 *
	 * @param value
	 *            allowed object is {@link SummaryMeasurement }
	 *
	 */
	public void setCurrentDayNetConsumption(SummaryMeasurement value) {
		this.currentDayNetConsumption = value;
	}

	/**
	 * Gets the value of the currentDayOverallConsumption property.
	 *
	 * @return possible object is {@link SummaryMeasurement }
	 *
	 */
	public SummaryMeasurement getCurrentDayOverallConsumption() {
		return currentDayOverallConsumption;
	}

	/**
	 * Sets the value of the currentDayOverallConsumption property.
	 *
	 * @param value
	 *            allowed object is {@link SummaryMeasurement }
	 *
	 */
	public void setCurrentDayOverallConsumption(SummaryMeasurement value) {
		this.currentDayOverallConsumption = value;
	}

	/**
	 * Gets the value of the peakDemand property.
	 *
	 * @return possible object is {@link SummaryMeasurement }
	 *
	 */
	public SummaryMeasurement getPeakDemand() {
		return peakDemand;
	}

	/**
	 * Sets the value of the peakDemand property.
	 *
	 * @param value
	 *            allowed object is {@link SummaryMeasurement }
	 *
	 */
	public void setPeakDemand(SummaryMeasurement value) {
		this.peakDemand = value;
	}

	/**
	 * Gets the value of the previousDayLastYearOverallConsumption property.
	 *
	 * @return possible object is {@link SummaryMeasurement }
	 *
	 */
	public SummaryMeasurement getPreviousDayLastYearOverallConsumption() {
		return previousDayLastYearOverallConsumption;
	}

	/**
	 * Sets the value of the previousDayLastYearOverallConsumption property.
	 *
	 * @param value
	 *            allowed object is {@link SummaryMeasurement }
	 *
	 */
	public void setPreviousDayLastYearOverallConsumption(
			SummaryMeasurement value) {
		this.previousDayLastYearOverallConsumption = value;
	}

	/**
	 * Gets the value of the previousDayNetConsumption property.
	 *
	 * @return possible object is {@link SummaryMeasurement }
	 *
	 */
	public SummaryMeasurement getPreviousDayNetConsumption() {
		return previousDayNetConsumption;
	}

	/**
	 * Sets the value of the previousDayNetConsumption property.
	 *
	 * @param value
	 *            allowed object is {@link SummaryMeasurement }
	 *
	 */
	public void setPreviousDayNetConsumption(SummaryMeasurement value) {
		this.previousDayNetConsumption = value;
	}

	/**
	 * Gets the value of the previousDayOverallConsumption property.
	 *
	 * @return possible object is {@link SummaryMeasurement }
	 *
	 */
	public SummaryMeasurement getPreviousDayOverallConsumption() {
		return previousDayOverallConsumption;
	}

	/**
	 * Sets the value of the previousDayOverallConsumption property.
	 *
	 * @param value
	 *            allowed object is {@link SummaryMeasurement }
	 *
	 */
	public void setPreviousDayOverallConsumption(SummaryMeasurement value) {
		this.previousDayOverallConsumption = value;
	}

	/**
	 * Gets the value of the ratchetDemand property.
	 *
	 * @return possible object is {@link SummaryMeasurement }
	 *
	 */
	public SummaryMeasurement getRatchetDemand() {
		return ratchetDemand;
	}

	/**
	 * Sets the value of the ratchetDemand property.
	 *
	 * @param value
	 *            allowed object is {@link SummaryMeasurement }
	 *
	 */
	public void setRatchetDemand(SummaryMeasurement value) {
		this.ratchetDemand = value;
	}

	/**
	 * Gets the value of the ratchetDemandPeriod property.
	 *
	 * @return possible object is {@link DateTimeInterval }
	 *
	 */
	public DateTimeInterval getRatchetDemandPeriod() {
		return ratchetDemandPeriod;
	}

	/**
	 * Sets the value of the ratchetDemandPeriod property.
	 *
	 * @param value
	 *            allowed object is {@link DateTimeInterval }
	 *
	 */
	public void setRatchetDemandPeriod(DateTimeInterval value) {
		this.ratchetDemandPeriod = value;
	}

	/**
	 * Gets the value of the statusTimeStamp property.
	 *
	 */
	public long getStatusTimeStamp() {
		return statusTimeStamp;
	}

	/**
	 * Sets the value of the statusTimeStamp property.
	 *
	 */
	public void setStatusTimeStamp(long value) {
		this.statusTimeStamp = value;
	}

	/**
	 * Gets the value of the commodity property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getCommodity() {
		return commodity;
	}

	/**
	 * Sets the value of the commodity property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setCommodity(String value) {
		this.commodity = value;
	}

	@Override
	public String getParentQuery() {
		return UsagePoint.QUERY_FIND_BY_RELATED_HREF;
	}

	@Override
	public void setUpResource(IdentifiedObject resource) {
		UsagePoint usagePoint = (UsagePoint) resource;
		usagePoint.addElectricPowerUsageSummary(this);
		setUsagePoint((UsagePoint) resource);
	}

	@Override
	public void merge(IdentifiedObject resource) {
		super.merge(resource);
		this.billingPeriod = ((ElectricPowerUsageSummary) resource).billingPeriod;
		this.billLastPeriod = ((ElectricPowerUsageSummary) resource).billLastPeriod;
		this.billToDate = ((ElectricPowerUsageSummary) resource).billToDate;
		this.costAdditionalDetailLastPeriod = ((ElectricPowerUsageSummary) resource).costAdditionalDetailLastPeriod;
		this.costAdditionalLastPeriod = ((ElectricPowerUsageSummary) resource).costAdditionalLastPeriod;
		this.currency = ((ElectricPowerUsageSummary) resource).currency;
		this.currentBillingPeriodOverAllConsumption = ((ElectricPowerUsageSummary) resource).currentBillingPeriodOverAllConsumption;
		this.currentDayLastYearNetConsumption = ((ElectricPowerUsageSummary) resource).currentDayLastYearNetConsumption;
		this.currentDayNetConsumption = ((ElectricPowerUsageSummary) resource).currentDayNetConsumption;
		this.currentDayOverallConsumption = ((ElectricPowerUsageSummary) resource).currentDayOverallConsumption;
		this.overallConsumptionLastPeriod = ((ElectricPowerUsageSummary) resource).overallConsumptionLastPeriod;
		this.peakDemand = ((ElectricPowerUsageSummary) resource).peakDemand;
		this.previousDayLastYearOverallConsumption = ((ElectricPowerUsageSummary) resource).previousDayLastYearOverallConsumption;
		this.previousDayNetConsumption = ((ElectricPowerUsageSummary) resource).currentDayNetConsumption;
		this.previousDayOverallConsumption = ((ElectricPowerUsageSummary) resource).previousDayOverallConsumption;
		this.qualityOfReading = ((ElectricPowerUsageSummary) resource).qualityOfReading;
		this.ratchetDemand = ((ElectricPowerUsageSummary) resource).ratchetDemand;
		this.ratchetDemandPeriod = ((ElectricPowerUsageSummary) resource).ratchetDemandPeriod;
		this.statusTimeStamp = ((ElectricPowerUsageSummary) resource).statusTimeStamp;
		if (((ElectricPowerUsageSummary) resource).usagePoint != null) {
			this.usagePoint = ((ElectricPowerUsageSummary) resource).usagePoint;
		}
	}

	@Override
	public void unlink() {
		super.unlink();
		usagePoint.removeElectricPowerUsageSummary(this);
		this.usagePoint = null;
	}
}
