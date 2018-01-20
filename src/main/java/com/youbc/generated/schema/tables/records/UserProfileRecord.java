/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.records;


import com.youbc.generated.schema.tables.UserProfile;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class UserProfileRecord extends UpdatableRecordImpl<UserProfileRecord> implements Record7<String, Integer, Integer, String, String, String, Timestamp> {

    private static final long serialVersionUID = -871112152;

    /**
     * Setter for <code>poke_you_bc.user_profile.user_id</code>.
     */
    public UserProfileRecord setUserId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.user_profile.user_id</code>.
     */
    public String getUserId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>poke_you_bc.user_profile.age</code>.
     */
    public UserProfileRecord setAge(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.user_profile.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>poke_you_bc.user_profile.sex</code>.
     */
    public UserProfileRecord setSex(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.user_profile.sex</code>.
     */
    public Integer getSex() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>poke_you_bc.user_profile.wechatId</code>.
     */
    public UserProfileRecord setWechatid(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.user_profile.wechatId</code>.
     */
    public String getWechatid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>poke_you_bc.user_profile.username</code>.
     */
    public UserProfileRecord setUsername(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.user_profile.username</code>.
     */
    public String getUsername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>poke_you_bc.user_profile.horoscope</code>.
     */
    public UserProfileRecord setHoroscope(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.user_profile.horoscope</code>.
     */
    public String getHoroscope() {
        return (String) get(5);
    }

    /**
     * Setter for <code>poke_you_bc.user_profile.time_created</code>.
     */
    public UserProfileRecord setTimeCreated(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.user_profile.time_created</code>.
     */
    public Timestamp getTimeCreated() {
        return (Timestamp) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Integer, Integer, String, String, String, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Integer, Integer, String, String, String, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return UserProfile.USER_PROFILE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserProfile.USER_PROFILE.AGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserProfile.USER_PROFILE.SEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UserProfile.USER_PROFILE.WECHATID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UserProfile.USER_PROFILE.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UserProfile.USER_PROFILE.HOROSCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return UserProfile.USER_PROFILE.TIME_CREATED;
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
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getWechatid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getHoroscope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getTimeCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserProfileRecord value1(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserProfileRecord value2(Integer value) {
        setAge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserProfileRecord value3(Integer value) {
        setSex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserProfileRecord value4(String value) {
        setWechatid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserProfileRecord value5(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserProfileRecord value6(String value) {
        setHoroscope(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserProfileRecord value7(Timestamp value) {
        setTimeCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserProfileRecord values(String value1, Integer value2, Integer value3, String value4, String value5, String value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserProfileRecord
     */
    public UserProfileRecord() {
        super(UserProfile.USER_PROFILE);
    }

    /**
     * Create a detached, initialised UserProfileRecord
     */
    public UserProfileRecord(String userId, Integer age, Integer sex, String wechatid, String username, String horoscope, Timestamp timeCreated) {
        super(UserProfile.USER_PROFILE);

        set(0, userId);
        set(1, age);
        set(2, sex);
        set(3, wechatid);
        set(4, username);
        set(5, horoscope);
        set(6, timeCreated);
    }
}