package com.quartz.web.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QrtzUsersExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table qrtz_users
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table qrtz_users
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_users
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public QrtzUsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_users
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    protected QrtzUsersExample(QrtzUsersExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_users
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_users
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_users
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_users
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_users
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_users
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_users
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table qrtz_users
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("USER_PASSWORD is null");
            return this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("USER_PASSWORD is not null");
            return this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("USER_PASSWORD =", value, "userPassword");
            return this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("USER_PASSWORD <>", value, "userPassword");
            return this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("USER_PASSWORD >", value, "userPassword");
            return this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD >=", value, "userPassword");
            return this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("USER_PASSWORD <", value, "userPassword");
            return this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD <=", value, "userPassword");
            return this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("USER_PASSWORD like", value, "userPassword");
            return this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("USER_PASSWORD not like", value, "userPassword");
            return this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("USER_PASSWORD in", values, "userPassword");
            return this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("USER_PASSWORD not in", values, "userPassword");
            return this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD between", value1, value2, "userPassword");
            return this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD not between", value1, value2, "userPassword");
            return this;
        }

        public Criteria andUserGroupIsNull() {
            addCriterion("USER_GROUP is null");
            return this;
        }

        public Criteria andUserGroupIsNotNull() {
            addCriterion("USER_GROUP is not null");
            return this;
        }

        public Criteria andUserGroupEqualTo(String value) {
            addCriterion("USER_GROUP =", value, "userGroup");
            return this;
        }

        public Criteria andUserGroupNotEqualTo(String value) {
            addCriterion("USER_GROUP <>", value, "userGroup");
            return this;
        }

        public Criteria andUserGroupGreaterThan(String value) {
            addCriterion("USER_GROUP >", value, "userGroup");
            return this;
        }

        public Criteria andUserGroupGreaterThanOrEqualTo(String value) {
            addCriterion("USER_GROUP >=", value, "userGroup");
            return this;
        }

        public Criteria andUserGroupLessThan(String value) {
            addCriterion("USER_GROUP <", value, "userGroup");
            return this;
        }

        public Criteria andUserGroupLessThanOrEqualTo(String value) {
            addCriterion("USER_GROUP <=", value, "userGroup");
            return this;
        }

        public Criteria andUserGroupLike(String value) {
            addCriterion("USER_GROUP like", value, "userGroup");
            return this;
        }

        public Criteria andUserGroupNotLike(String value) {
            addCriterion("USER_GROUP not like", value, "userGroup");
            return this;
        }

        public Criteria andUserGroupIn(List<String> values) {
            addCriterion("USER_GROUP in", values, "userGroup");
            return this;
        }

        public Criteria andUserGroupNotIn(List<String> values) {
            addCriterion("USER_GROUP not in", values, "userGroup");
            return this;
        }

        public Criteria andUserGroupBetween(String value1, String value2) {
            addCriterion("USER_GROUP between", value1, value2, "userGroup");
            return this;
        }

        public Criteria andUserGroupNotBetween(String value1, String value2) {
            addCriterion("USER_GROUP not between", value1, value2, "userGroup");
            return this;
        }

        public Criteria andUserJobNameIsNull() {
            addCriterion("USER_JOB_NAME is null");
            return this;
        }

        public Criteria andUserJobNameIsNotNull() {
            addCriterion("USER_JOB_NAME is not null");
            return this;
        }

        public Criteria andUserJobNameEqualTo(String value) {
            addCriterion("USER_JOB_NAME =", value, "userJobName");
            return this;
        }

        public Criteria andUserJobNameNotEqualTo(String value) {
            addCriterion("USER_JOB_NAME <>", value, "userJobName");
            return this;
        }

        public Criteria andUserJobNameGreaterThan(String value) {
            addCriterion("USER_JOB_NAME >", value, "userJobName");
            return this;
        }

        public Criteria andUserJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_JOB_NAME >=", value, "userJobName");
            return this;
        }

        public Criteria andUserJobNameLessThan(String value) {
            addCriterion("USER_JOB_NAME <", value, "userJobName");
            return this;
        }

        public Criteria andUserJobNameLessThanOrEqualTo(String value) {
            addCriterion("USER_JOB_NAME <=", value, "userJobName");
            return this;
        }

        public Criteria andUserJobNameLike(String value) {
            addCriterion("USER_JOB_NAME like", value, "userJobName");
            return this;
        }

        public Criteria andUserJobNameNotLike(String value) {
            addCriterion("USER_JOB_NAME not like", value, "userJobName");
            return this;
        }

        public Criteria andUserJobNameIn(List<String> values) {
            addCriterion("USER_JOB_NAME in", values, "userJobName");
            return this;
        }

        public Criteria andUserJobNameNotIn(List<String> values) {
            addCriterion("USER_JOB_NAME not in", values, "userJobName");
            return this;
        }

        public Criteria andUserJobNameBetween(String value1, String value2) {
            addCriterion("USER_JOB_NAME between", value1, value2, "userJobName");
            return this;
        }

        public Criteria andUserJobNameNotBetween(String value1, String value2) {
            addCriterion("USER_JOB_NAME not between", value1, value2, "userJobName");
            return this;
        }

        public Criteria andUserTriggerNameIsNull() {
            addCriterion("USER_TRIGGER_NAME is null");
            return this;
        }

        public Criteria andUserTriggerNameIsNotNull() {
            addCriterion("USER_TRIGGER_NAME is not null");
            return this;
        }

        public Criteria andUserTriggerNameEqualTo(String value) {
            addCriterion("USER_TRIGGER_NAME =", value, "userTriggerName");
            return this;
        }

        public Criteria andUserTriggerNameNotEqualTo(String value) {
            addCriterion("USER_TRIGGER_NAME <>", value, "userTriggerName");
            return this;
        }

        public Criteria andUserTriggerNameGreaterThan(String value) {
            addCriterion("USER_TRIGGER_NAME >", value, "userTriggerName");
            return this;
        }

        public Criteria andUserTriggerNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TRIGGER_NAME >=", value, "userTriggerName");
            return this;
        }

        public Criteria andUserTriggerNameLessThan(String value) {
            addCriterion("USER_TRIGGER_NAME <", value, "userTriggerName");
            return this;
        }

        public Criteria andUserTriggerNameLessThanOrEqualTo(String value) {
            addCriterion("USER_TRIGGER_NAME <=", value, "userTriggerName");
            return this;
        }

        public Criteria andUserTriggerNameLike(String value) {
            addCriterion("USER_TRIGGER_NAME like", value, "userTriggerName");
            return this;
        }

        public Criteria andUserTriggerNameNotLike(String value) {
            addCriterion("USER_TRIGGER_NAME not like", value, "userTriggerName");
            return this;
        }

        public Criteria andUserTriggerNameIn(List<String> values) {
            addCriterion("USER_TRIGGER_NAME in", values, "userTriggerName");
            return this;
        }

        public Criteria andUserTriggerNameNotIn(List<String> values) {
            addCriterion("USER_TRIGGER_NAME not in", values, "userTriggerName");
            return this;
        }

        public Criteria andUserTriggerNameBetween(String value1, String value2) {
            addCriterion("USER_TRIGGER_NAME between", value1, value2, "userTriggerName");
            return this;
        }

        public Criteria andUserTriggerNameNotBetween(String value1, String value2) {
            addCriterion("USER_TRIGGER_NAME not between", value1, value2, "userTriggerName");
            return this;
        }
    }
}