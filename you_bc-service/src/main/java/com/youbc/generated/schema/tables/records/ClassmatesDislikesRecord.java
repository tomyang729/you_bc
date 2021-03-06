/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.records;


import com.youbc.generated.schema.tables.ClassmatesDislikes;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClassmatesDislikesRecord extends UpdatableRecordImpl<ClassmatesDislikesRecord> implements Record3<String, String, Timestamp> {

    private static final long serialVersionUID = -109036339;

    /**
     * Setter for <code>poke_you_bc.classmates_dislikes.disliker</code>.
     */
    public ClassmatesDislikesRecord setDisliker(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.classmates_dislikes.disliker</code>.
     */
    public String getDisliker() {
        return (String) get(0);
    }

    /**
     * Setter for <code>poke_you_bc.classmates_dislikes.dislikee</code>.
     */
    public ClassmatesDislikesRecord setDislikee(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.classmates_dislikes.dislikee</code>.
     */
    public String getDislikee() {
        return (String) get(1);
    }

    /**
     * Setter for <code>poke_you_bc.classmates_dislikes.time_created</code>.
     */
    public ClassmatesDislikesRecord setTimeCreated(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.classmates_dislikes.time_created</code>.
     */
    public Timestamp getTimeCreated() {
        return (Timestamp) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Timestamp> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ClassmatesDislikes.CLASSMATES_DISLIKES.DISLIKER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ClassmatesDislikes.CLASSMATES_DISLIKES.DISLIKEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return ClassmatesDislikes.CLASSMATES_DISLIKES.TIME_CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getDisliker();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDislikee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getTimeCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesDislikesRecord value1(String value) {
        setDisliker(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesDislikesRecord value2(String value) {
        setDislikee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesDislikesRecord value3(Timestamp value) {
        setTimeCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesDislikesRecord values(String value1, String value2, Timestamp value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClassmatesDislikesRecord
     */
    public ClassmatesDislikesRecord() {
        super(ClassmatesDislikes.CLASSMATES_DISLIKES);
    }

    /**
     * Create a detached, initialised ClassmatesDislikesRecord
     */
    public ClassmatesDislikesRecord(String disliker, String dislikee, Timestamp timeCreated) {
        super(ClassmatesDislikes.CLASSMATES_DISLIKES);

        set(0, disliker);
        set(1, dislikee);
        set(2, timeCreated);
    }
}
