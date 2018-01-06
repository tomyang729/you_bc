/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.records;


import com.youbc.generated.schema.tables.ClassmatesProfile;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClassmatesProfileRecord extends UpdatableRecordImpl<ClassmatesProfileRecord> implements Record4<String, Integer, String, Timestamp> {

    private static final long serialVersionUID = 1370859248;

    /**
     * Setter for <code>poke_you_bc.classmates_profile.user_id</code>.
     */
    public ClassmatesProfileRecord setUserId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.classmates_profile.user_id</code>.
     */
    public String getUserId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>poke_you_bc.classmates_profile.marjor_id</code>.
     */
    public ClassmatesProfileRecord setMarjorId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.classmates_profile.marjor_id</code>.
     */
    public Integer getMarjorId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>poke_you_bc.classmates_profile.motto</code>.
     */
    public ClassmatesProfileRecord setMotto(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.classmates_profile.motto</code>.
     */
    public String getMotto() {
        return (String) get(2);
    }

    /**
     * Setter for <code>poke_you_bc.classmates_profile.time_created</code>.
     */
    public ClassmatesProfileRecord setTimeCreated(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.classmates_profile.time_created</code>.
     */
    public Timestamp getTimeCreated() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Integer, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Integer, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ClassmatesProfile.CLASSMATES_PROFILE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ClassmatesProfile.CLASSMATES_PROFILE.MARJOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ClassmatesProfile.CLASSMATES_PROFILE.MOTTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ClassmatesProfile.CLASSMATES_PROFILE.TIME_CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getMarjorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMotto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getTimeCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesProfileRecord value1(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesProfileRecord value2(Integer value) {
        setMarjorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesProfileRecord value3(String value) {
        setMotto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesProfileRecord value4(Timestamp value) {
        setTimeCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesProfileRecord values(String value1, Integer value2, String value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClassmatesProfileRecord
     */
    public ClassmatesProfileRecord() {
        super(ClassmatesProfile.CLASSMATES_PROFILE);
    }

    /**
     * Create a detached, initialised ClassmatesProfileRecord
     */
    public ClassmatesProfileRecord(String userId, Integer marjorId, String motto, Timestamp timeCreated) {
        super(ClassmatesProfile.CLASSMATES_PROFILE);

        set(0, userId);
        set(1, marjorId);
        set(2, motto);
        set(3, timeCreated);
    }
}
