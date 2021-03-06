package com.adyen.model.nexo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Definition: Magnetic track or magnetic ink characters line. -- Reference: ISO 7813 - ISO 4909 -- Usage: Generic data structure for a card track, used when the magstripe card reader is located on the Sale Terminal, or for magstripe Card Reader device request. The data structure is also used to store the line at the bottom of a bank check
 *
 * <p>Java class for TrackData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TrackData"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="TextString"&gt;
 *       &lt;attribute name="TrackNumb" type="{}TrackNumb" default="2" /&gt;
 *       &lt;attribute name="TrackFormat" type="{}TrackFormatType" default="ISO" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackData", propOrder = {
        "value"
})
public class TrackData {

    /**
     * The Value.
     */
    @XmlValue
    protected String value;
    /**
     * The Track numb.
     */
    @XmlAttribute(name = "TrackNumb")
    protected Integer trackNumb;
    /**
     * The Track format.
     */
    @XmlAttribute(name = "TrackFormat")
    protected TrackFormatType trackFormat;

    /**
     * Gets the value of the value property.
     *
     * @return possible      object is     {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is     {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the trackNumb property.
     *
     * @return possible      object is     {@link Integer }
     */
    public int getTrackNumb() {
        if (trackNumb == null) {
            return 2;
        } else {
            return trackNumb;
        }
    }

    /**
     * Sets the value of the trackNumb property.
     *
     * @param value allowed object is     {@link Integer }
     */
    public void setTrackNumb(Integer value) {
        this.trackNumb = value;
    }

    /**
     * Gets the value of the trackFormat property.
     *
     * @return possible      object is     {@link TrackFormatType }
     */
    public TrackFormatType getTrackFormat() {
        if (trackFormat == null) {
            return TrackFormatType.ISO;
        } else {
            return trackFormat;
        }
    }

    /**
     * Sets the value of the trackFormat property.
     *
     * @param value allowed object is     {@link TrackFormatType }
     */
    public void setTrackFormat(TrackFormatType value) {
        this.trackFormat = value;
    }

}
