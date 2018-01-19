/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables;


import com.youbc.generated.schema.Keys;
import com.youbc.generated.schema.PokeYouBc;
import com.youbc.generated.schema.tables.records.UserAnswerRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class UserAnswer extends TableImpl<UserAnswerRecord> {

    private static final long serialVersionUID = 2121537732;

    /**
     * The reference instance of <code>poke_you_bc.user_answer</code>
     */
    public static final UserAnswer USER_ANSWER = new UserAnswer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserAnswerRecord> getRecordType() {
        return UserAnswerRecord.class;
    }

    /**
     * The column <code>poke_you_bc.user_answer.survey_id</code>.
     */
    public final TableField<UserAnswerRecord, Integer> SURVEY_ID = createField("survey_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>poke_you_bc.user_answer.question_id</code>.
     */
    public final TableField<UserAnswerRecord, Integer> QUESTION_ID = createField("question_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>poke_you_bc.user_answer.user_id</code>.
     */
    public final TableField<UserAnswerRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>poke_you_bc.user_answer.offered_answer_id</code>.
     */
    public final TableField<UserAnswerRecord, Integer> OFFERED_ANSWER_ID = createField("offered_answer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>poke_you_bc.user_answer</code> table reference
     */
    public UserAnswer() {
        this("user_answer", null);
    }

    /**
     * Create an aliased <code>poke_you_bc.user_answer</code> table reference
     */
    public UserAnswer(String alias) {
        this(alias, USER_ANSWER);
    }

    private UserAnswer(String alias, Table<UserAnswerRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserAnswer(String alias, Table<UserAnswerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PokeYouBc.POKE_YOU_BC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserAnswerRecord> getPrimaryKey() {
        return Keys.KEY_USER_ANSWER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserAnswerRecord>> getKeys() {
        return Arrays.<UniqueKey<UserAnswerRecord>>asList(Keys.KEY_USER_ANSWER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UserAnswerRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserAnswerRecord, ?>>asList(Keys.USER_ANSWER_IBFK_2, Keys.USER_ANSWER_IBFK_3, Keys.USER_ANSWER_IBFK_1, Keys.USER_ANSWER_IBFK_4);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAnswer as(String alias) {
        return new UserAnswer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserAnswer rename(String name) {
        return new UserAnswer(name, null);
    }
}
