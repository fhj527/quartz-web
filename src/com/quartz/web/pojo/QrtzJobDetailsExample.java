package com.quartz.web.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QrtzJobDetailsExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table qrtz_job_details
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table qrtz_job_details
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_job_details
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public QrtzJobDetailsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_job_details
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    protected QrtzJobDetailsExample(QrtzJobDetailsExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_job_details
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_job_details
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_job_details
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_job_details
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_job_details
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
     * This method corresponds to the database table qrtz_job_details
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table qrtz_job_details
     *
     * @abatorgenerated Thu Aug 02 17:44:42 CST 2012
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table qrtz_job_details
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

        public Criteria andJobGroupIsNull() {
            addCriterion("JOB_GROUP is null");
            return this;
        }

        public Criteria andJobGroupIsNotNull() {
            addCriterion("JOB_GROUP is not null");
            return this;
        }

        public Criteria andJobGroupEqualTo(String value) {
            addCriterion("JOB_GROUP =", value, "jobGroup");
            return this;
        }

        public Criteria andJobGroupNotEqualTo(String value) {
            addCriterion("JOB_GROUP <>", value, "jobGroup");
            return this;
        }

        public Criteria andJobGroupGreaterThan(String value) {
            addCriterion("JOB_GROUP >", value, "jobGroup");
            return this;
        }

        public Criteria andJobGroupGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_GROUP >=", value, "jobGroup");
            return this;
        }

        public Criteria andJobGroupLessThan(String value) {
            addCriterion("JOB_GROUP <", value, "jobGroup");
            return this;
        }

        public Criteria andJobGroupLessThanOrEqualTo(String value) {
            addCriterion("JOB_GROUP <=", value, "jobGroup");
            return this;
        }

        public Criteria andJobGroupLike(String value) {
            addCriterion("JOB_GROUP like", value, "jobGroup");
            return this;
        }

        public Criteria andJobGroupNotLike(String value) {
            addCriterion("JOB_GROUP not like", value, "jobGroup");
            return this;
        }

        public Criteria andJobGroupIn(List<String> values) {
            addCriterion("JOB_GROUP in", values, "jobGroup");
            return this;
        }

        public Criteria andJobGroupNotIn(List<String> values) {
            addCriterion("JOB_GROUP not in", values, "jobGroup");
            return this;
        }

        public Criteria andJobGroupBetween(String value1, String value2) {
            addCriterion("JOB_GROUP between", value1, value2, "jobGroup");
            return this;
        }

        public Criteria andJobGroupNotBetween(String value1, String value2) {
            addCriterion("JOB_GROUP not between", value1, value2, "jobGroup");
            return this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("JOB_NAME is null");
            return this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("JOB_NAME is not null");
            return this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("JOB_NAME =", value, "jobName");
            return this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("JOB_NAME <>", value, "jobName");
            return this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("JOB_NAME >", value, "jobName");
            return this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_NAME >=", value, "jobName");
            return this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("JOB_NAME <", value, "jobName");
            return this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("JOB_NAME <=", value, "jobName");
            return this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("JOB_NAME like", value, "jobName");
            return this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("JOB_NAME not like", value, "jobName");
            return this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("JOB_NAME in", values, "jobName");
            return this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("JOB_NAME not in", values, "jobName");
            return this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("JOB_NAME between", value1, value2, "jobName");
            return this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("JOB_NAME not between", value1, value2, "jobName");
            return this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return this;
        }

        public Criteria andJobClassNameIsNull() {
            addCriterion("JOB_CLASS_NAME is null");
            return this;
        }

        public Criteria andJobClassNameIsNotNull() {
            addCriterion("JOB_CLASS_NAME is not null");
            return this;
        }

        public Criteria andJobClassNameEqualTo(String value) {
            addCriterion("JOB_CLASS_NAME =", value, "jobClassName");
            return this;
        }

        public Criteria andJobClassNameNotEqualTo(String value) {
            addCriterion("JOB_CLASS_NAME <>", value, "jobClassName");
            return this;
        }

        public Criteria andJobClassNameGreaterThan(String value) {
            addCriterion("JOB_CLASS_NAME >", value, "jobClassName");
            return this;
        }

        public Criteria andJobClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_CLASS_NAME >=", value, "jobClassName");
            return this;
        }

        public Criteria andJobClassNameLessThan(String value) {
            addCriterion("JOB_CLASS_NAME <", value, "jobClassName");
            return this;
        }

        public Criteria andJobClassNameLessThanOrEqualTo(String value) {
            addCriterion("JOB_CLASS_NAME <=", value, "jobClassName");
            return this;
        }

        public Criteria andJobClassNameLike(String value) {
            addCriterion("JOB_CLASS_NAME like", value, "jobClassName");
            return this;
        }

        public Criteria andJobClassNameNotLike(String value) {
            addCriterion("JOB_CLASS_NAME not like", value, "jobClassName");
            return this;
        }

        public Criteria andJobClassNameIn(List<String> values) {
            addCriterion("JOB_CLASS_NAME in", values, "jobClassName");
            return this;
        }

        public Criteria andJobClassNameNotIn(List<String> values) {
            addCriterion("JOB_CLASS_NAME not in", values, "jobClassName");
            return this;
        }

        public Criteria andJobClassNameBetween(String value1, String value2) {
            addCriterion("JOB_CLASS_NAME between", value1, value2, "jobClassName");
            return this;
        }

        public Criteria andJobClassNameNotBetween(String value1, String value2) {
            addCriterion("JOB_CLASS_NAME not between", value1, value2, "jobClassName");
            return this;
        }

        public Criteria andIsDurableIsNull() {
            addCriterion("IS_DURABLE is null");
            return this;
        }

        public Criteria andIsDurableIsNotNull() {
            addCriterion("IS_DURABLE is not null");
            return this;
        }

        public Criteria andIsDurableEqualTo(String value) {
            addCriterion("IS_DURABLE =", value, "isDurable");
            return this;
        }

        public Criteria andIsDurableNotEqualTo(String value) {
            addCriterion("IS_DURABLE <>", value, "isDurable");
            return this;
        }

        public Criteria andIsDurableGreaterThan(String value) {
            addCriterion("IS_DURABLE >", value, "isDurable");
            return this;
        }

        public Criteria andIsDurableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DURABLE >=", value, "isDurable");
            return this;
        }

        public Criteria andIsDurableLessThan(String value) {
            addCriterion("IS_DURABLE <", value, "isDurable");
            return this;
        }

        public Criteria andIsDurableLessThanOrEqualTo(String value) {
            addCriterion("IS_DURABLE <=", value, "isDurable");
            return this;
        }

        public Criteria andIsDurableLike(String value) {
            addCriterion("IS_DURABLE like", value, "isDurable");
            return this;
        }

        public Criteria andIsDurableNotLike(String value) {
            addCriterion("IS_DURABLE not like", value, "isDurable");
            return this;
        }

        public Criteria andIsDurableIn(List<String> values) {
            addCriterion("IS_DURABLE in", values, "isDurable");
            return this;
        }

        public Criteria andIsDurableNotIn(List<String> values) {
            addCriterion("IS_DURABLE not in", values, "isDurable");
            return this;
        }

        public Criteria andIsDurableBetween(String value1, String value2) {
            addCriterion("IS_DURABLE between", value1, value2, "isDurable");
            return this;
        }

        public Criteria andIsDurableNotBetween(String value1, String value2) {
            addCriterion("IS_DURABLE not between", value1, value2, "isDurable");
            return this;
        }

        public Criteria andIsVolatileIsNull() {
            addCriterion("IS_VOLATILE is null");
            return this;
        }

        public Criteria andIsVolatileIsNotNull() {
            addCriterion("IS_VOLATILE is not null");
            return this;
        }

        public Criteria andIsVolatileEqualTo(String value) {
            addCriterion("IS_VOLATILE =", value, "isVolatile");
            return this;
        }

        public Criteria andIsVolatileNotEqualTo(String value) {
            addCriterion("IS_VOLATILE <>", value, "isVolatile");
            return this;
        }

        public Criteria andIsVolatileGreaterThan(String value) {
            addCriterion("IS_VOLATILE >", value, "isVolatile");
            return this;
        }

        public Criteria andIsVolatileGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VOLATILE >=", value, "isVolatile");
            return this;
        }

        public Criteria andIsVolatileLessThan(String value) {
            addCriterion("IS_VOLATILE <", value, "isVolatile");
            return this;
        }

        public Criteria andIsVolatileLessThanOrEqualTo(String value) {
            addCriterion("IS_VOLATILE <=", value, "isVolatile");
            return this;
        }

        public Criteria andIsVolatileLike(String value) {
            addCriterion("IS_VOLATILE like", value, "isVolatile");
            return this;
        }

        public Criteria andIsVolatileNotLike(String value) {
            addCriterion("IS_VOLATILE not like", value, "isVolatile");
            return this;
        }

        public Criteria andIsVolatileIn(List<String> values) {
            addCriterion("IS_VOLATILE in", values, "isVolatile");
            return this;
        }

        public Criteria andIsVolatileNotIn(List<String> values) {
            addCriterion("IS_VOLATILE not in", values, "isVolatile");
            return this;
        }

        public Criteria andIsVolatileBetween(String value1, String value2) {
            addCriterion("IS_VOLATILE between", value1, value2, "isVolatile");
            return this;
        }

        public Criteria andIsVolatileNotBetween(String value1, String value2) {
            addCriterion("IS_VOLATILE not between", value1, value2, "isVolatile");
            return this;
        }

        public Criteria andIsStatefulIsNull() {
            addCriterion("IS_STATEFUL is null");
            return this;
        }

        public Criteria andIsStatefulIsNotNull() {
            addCriterion("IS_STATEFUL is not null");
            return this;
        }

        public Criteria andIsStatefulEqualTo(String value) {
            addCriterion("IS_STATEFUL =", value, "isStateful");
            return this;
        }

        public Criteria andIsStatefulNotEqualTo(String value) {
            addCriterion("IS_STATEFUL <>", value, "isStateful");
            return this;
        }

        public Criteria andIsStatefulGreaterThan(String value) {
            addCriterion("IS_STATEFUL >", value, "isStateful");
            return this;
        }

        public Criteria andIsStatefulGreaterThanOrEqualTo(String value) {
            addCriterion("IS_STATEFUL >=", value, "isStateful");
            return this;
        }

        public Criteria andIsStatefulLessThan(String value) {
            addCriterion("IS_STATEFUL <", value, "isStateful");
            return this;
        }

        public Criteria andIsStatefulLessThanOrEqualTo(String value) {
            addCriterion("IS_STATEFUL <=", value, "isStateful");
            return this;
        }

        public Criteria andIsStatefulLike(String value) {
            addCriterion("IS_STATEFUL like", value, "isStateful");
            return this;
        }

        public Criteria andIsStatefulNotLike(String value) {
            addCriterion("IS_STATEFUL not like", value, "isStateful");
            return this;
        }

        public Criteria andIsStatefulIn(List<String> values) {
            addCriterion("IS_STATEFUL in", values, "isStateful");
            return this;
        }

        public Criteria andIsStatefulNotIn(List<String> values) {
            addCriterion("IS_STATEFUL not in", values, "isStateful");
            return this;
        }

        public Criteria andIsStatefulBetween(String value1, String value2) {
            addCriterion("IS_STATEFUL between", value1, value2, "isStateful");
            return this;
        }

        public Criteria andIsStatefulNotBetween(String value1, String value2) {
            addCriterion("IS_STATEFUL not between", value1, value2, "isStateful");
            return this;
        }

        public Criteria andRequestsRecoveryIsNull() {
            addCriterion("REQUESTS_RECOVERY is null");
            return this;
        }

        public Criteria andRequestsRecoveryIsNotNull() {
            addCriterion("REQUESTS_RECOVERY is not null");
            return this;
        }

        public Criteria andRequestsRecoveryEqualTo(String value) {
            addCriterion("REQUESTS_RECOVERY =", value, "requestsRecovery");
            return this;
        }

        public Criteria andRequestsRecoveryNotEqualTo(String value) {
            addCriterion("REQUESTS_RECOVERY <>", value, "requestsRecovery");
            return this;
        }

        public Criteria andRequestsRecoveryGreaterThan(String value) {
            addCriterion("REQUESTS_RECOVERY >", value, "requestsRecovery");
            return this;
        }

        public Criteria andRequestsRecoveryGreaterThanOrEqualTo(String value) {
            addCriterion("REQUESTS_RECOVERY >=", value, "requestsRecovery");
            return this;
        }

        public Criteria andRequestsRecoveryLessThan(String value) {
            addCriterion("REQUESTS_RECOVERY <", value, "requestsRecovery");
            return this;
        }

        public Criteria andRequestsRecoveryLessThanOrEqualTo(String value) {
            addCriterion("REQUESTS_RECOVERY <=", value, "requestsRecovery");
            return this;
        }

        public Criteria andRequestsRecoveryLike(String value) {
            addCriterion("REQUESTS_RECOVERY like", value, "requestsRecovery");
            return this;
        }

        public Criteria andRequestsRecoveryNotLike(String value) {
            addCriterion("REQUESTS_RECOVERY not like", value, "requestsRecovery");
            return this;
        }

        public Criteria andRequestsRecoveryIn(List<String> values) {
            addCriterion("REQUESTS_RECOVERY in", values, "requestsRecovery");
            return this;
        }

        public Criteria andRequestsRecoveryNotIn(List<String> values) {
            addCriterion("REQUESTS_RECOVERY not in", values, "requestsRecovery");
            return this;
        }

        public Criteria andRequestsRecoveryBetween(String value1, String value2) {
            addCriterion("REQUESTS_RECOVERY between", value1, value2, "requestsRecovery");
            return this;
        }

        public Criteria andRequestsRecoveryNotBetween(String value1, String value2) {
            addCriterion("REQUESTS_RECOVERY not between", value1, value2, "requestsRecovery");
            return this;
        }
    }
}