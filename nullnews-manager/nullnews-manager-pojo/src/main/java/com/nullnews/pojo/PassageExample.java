package com.nullnews.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PassageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PassageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPassageIdIsNull() {
            addCriterion("passage_id is null");
            return (Criteria) this;
        }

        public Criteria andPassageIdIsNotNull() {
            addCriterion("passage_id is not null");
            return (Criteria) this;
        }

        public Criteria andPassageIdEqualTo(String value) {
            addCriterion("passage_id =", value, "passageId");
            return (Criteria) this;
        }

        public Criteria andPassageIdNotEqualTo(String value) {
            addCriterion("passage_id <>", value, "passageId");
            return (Criteria) this;
        }

        public Criteria andPassageIdGreaterThan(String value) {
            addCriterion("passage_id >", value, "passageId");
            return (Criteria) this;
        }

        public Criteria andPassageIdGreaterThanOrEqualTo(String value) {
            addCriterion("passage_id >=", value, "passageId");
            return (Criteria) this;
        }

        public Criteria andPassageIdLessThan(String value) {
            addCriterion("passage_id <", value, "passageId");
            return (Criteria) this;
        }

        public Criteria andPassageIdLessThanOrEqualTo(String value) {
            addCriterion("passage_id <=", value, "passageId");
            return (Criteria) this;
        }

        public Criteria andPassageIdLike(String value) {
            addCriterion("passage_id like", value, "passageId");
            return (Criteria) this;
        }

        public Criteria andPassageIdNotLike(String value) {
            addCriterion("passage_id not like", value, "passageId");
            return (Criteria) this;
        }

        public Criteria andPassageIdIn(List<String> values) {
            addCriterion("passage_id in", values, "passageId");
            return (Criteria) this;
        }

        public Criteria andPassageIdNotIn(List<String> values) {
            addCriterion("passage_id not in", values, "passageId");
            return (Criteria) this;
        }

        public Criteria andPassageIdBetween(String value1, String value2) {
            addCriterion("passage_id between", value1, value2, "passageId");
            return (Criteria) this;
        }

        public Criteria andPassageIdNotBetween(String value1, String value2) {
            addCriterion("passage_id not between", value1, value2, "passageId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPassageTitleIsNull() {
            addCriterion("passage_title is null");
            return (Criteria) this;
        }

        public Criteria andPassageTitleIsNotNull() {
            addCriterion("passage_title is not null");
            return (Criteria) this;
        }

        public Criteria andPassageTitleEqualTo(String value) {
            addCriterion("passage_title =", value, "passageTitle");
            return (Criteria) this;
        }

        public Criteria andPassageTitleNotEqualTo(String value) {
            addCriterion("passage_title <>", value, "passageTitle");
            return (Criteria) this;
        }

        public Criteria andPassageTitleGreaterThan(String value) {
            addCriterion("passage_title >", value, "passageTitle");
            return (Criteria) this;
        }

        public Criteria andPassageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("passage_title >=", value, "passageTitle");
            return (Criteria) this;
        }

        public Criteria andPassageTitleLessThan(String value) {
            addCriterion("passage_title <", value, "passageTitle");
            return (Criteria) this;
        }

        public Criteria andPassageTitleLessThanOrEqualTo(String value) {
            addCriterion("passage_title <=", value, "passageTitle");
            return (Criteria) this;
        }

        public Criteria andPassageTitleLike(String value) {
            addCriterion("passage_title like", value, "passageTitle");
            return (Criteria) this;
        }

        public Criteria andPassageTitleNotLike(String value) {
            addCriterion("passage_title not like", value, "passageTitle");
            return (Criteria) this;
        }

        public Criteria andPassageTitleIn(List<String> values) {
            addCriterion("passage_title in", values, "passageTitle");
            return (Criteria) this;
        }

        public Criteria andPassageTitleNotIn(List<String> values) {
            addCriterion("passage_title not in", values, "passageTitle");
            return (Criteria) this;
        }

        public Criteria andPassageTitleBetween(String value1, String value2) {
            addCriterion("passage_title between", value1, value2, "passageTitle");
            return (Criteria) this;
        }

        public Criteria andPassageTitleNotBetween(String value1, String value2) {
            addCriterion("passage_title not between", value1, value2, "passageTitle");
            return (Criteria) this;
        }

        public Criteria andPassagePictureIsNull() {
            addCriterion("passage_picture is null");
            return (Criteria) this;
        }

        public Criteria andPassagePictureIsNotNull() {
            addCriterion("passage_picture is not null");
            return (Criteria) this;
        }

        public Criteria andPassagePictureEqualTo(String value) {
            addCriterion("passage_picture =", value, "passagePicture");
            return (Criteria) this;
        }

        public Criteria andPassagePictureNotEqualTo(String value) {
            addCriterion("passage_picture <>", value, "passagePicture");
            return (Criteria) this;
        }

        public Criteria andPassagePictureGreaterThan(String value) {
            addCriterion("passage_picture >", value, "passagePicture");
            return (Criteria) this;
        }

        public Criteria andPassagePictureGreaterThanOrEqualTo(String value) {
            addCriterion("passage_picture >=", value, "passagePicture");
            return (Criteria) this;
        }

        public Criteria andPassagePictureLessThan(String value) {
            addCriterion("passage_picture <", value, "passagePicture");
            return (Criteria) this;
        }

        public Criteria andPassagePictureLessThanOrEqualTo(String value) {
            addCriterion("passage_picture <=", value, "passagePicture");
            return (Criteria) this;
        }

        public Criteria andPassagePictureLike(String value) {
            addCriterion("passage_picture like", value, "passagePicture");
            return (Criteria) this;
        }

        public Criteria andPassagePictureNotLike(String value) {
            addCriterion("passage_picture not like", value, "passagePicture");
            return (Criteria) this;
        }

        public Criteria andPassagePictureIn(List<String> values) {
            addCriterion("passage_picture in", values, "passagePicture");
            return (Criteria) this;
        }

        public Criteria andPassagePictureNotIn(List<String> values) {
            addCriterion("passage_picture not in", values, "passagePicture");
            return (Criteria) this;
        }

        public Criteria andPassagePictureBetween(String value1, String value2) {
            addCriterion("passage_picture between", value1, value2, "passagePicture");
            return (Criteria) this;
        }

        public Criteria andPassagePictureNotBetween(String value1, String value2) {
            addCriterion("passage_picture not between", value1, value2, "passagePicture");
            return (Criteria) this;
        }

        public Criteria andPassageTimeIsNull() {
            addCriterion("passage_time is null");
            return (Criteria) this;
        }

        public Criteria andPassageTimeIsNotNull() {
            addCriterion("passage_time is not null");
            return (Criteria) this;
        }

        public Criteria andPassageTimeEqualTo(Date value) {
            addCriterion("passage_time =", value, "passageTime");
            return (Criteria) this;
        }

        public Criteria andPassageTimeNotEqualTo(Date value) {
            addCriterion("passage_time <>", value, "passageTime");
            return (Criteria) this;
        }

        public Criteria andPassageTimeGreaterThan(Date value) {
            addCriterion("passage_time >", value, "passageTime");
            return (Criteria) this;
        }

        public Criteria andPassageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("passage_time >=", value, "passageTime");
            return (Criteria) this;
        }

        public Criteria andPassageTimeLessThan(Date value) {
            addCriterion("passage_time <", value, "passageTime");
            return (Criteria) this;
        }

        public Criteria andPassageTimeLessThanOrEqualTo(Date value) {
            addCriterion("passage_time <=", value, "passageTime");
            return (Criteria) this;
        }

        public Criteria andPassageTimeIn(List<Date> values) {
            addCriterion("passage_time in", values, "passageTime");
            return (Criteria) this;
        }

        public Criteria andPassageTimeNotIn(List<Date> values) {
            addCriterion("passage_time not in", values, "passageTime");
            return (Criteria) this;
        }

        public Criteria andPassageTimeBetween(Date value1, Date value2) {
            addCriterion("passage_time between", value1, value2, "passageTime");
            return (Criteria) this;
        }

        public Criteria andPassageTimeNotBetween(Date value1, Date value2) {
            addCriterion("passage_time not between", value1, value2, "passageTime");
            return (Criteria) this;
        }

        public Criteria andPassageLikeCountIsNull() {
            addCriterion("passage_like_count is null");
            return (Criteria) this;
        }

        public Criteria andPassageLikeCountIsNotNull() {
            addCriterion("passage_like_count is not null");
            return (Criteria) this;
        }

        public Criteria andPassageLikeCountEqualTo(Integer value) {
            addCriterion("passage_like_count =", value, "passageLikeCount");
            return (Criteria) this;
        }

        public Criteria andPassageLikeCountNotEqualTo(Integer value) {
            addCriterion("passage_like_count <>", value, "passageLikeCount");
            return (Criteria) this;
        }

        public Criteria andPassageLikeCountGreaterThan(Integer value) {
            addCriterion("passage_like_count >", value, "passageLikeCount");
            return (Criteria) this;
        }

        public Criteria andPassageLikeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("passage_like_count >=", value, "passageLikeCount");
            return (Criteria) this;
        }

        public Criteria andPassageLikeCountLessThan(Integer value) {
            addCriterion("passage_like_count <", value, "passageLikeCount");
            return (Criteria) this;
        }

        public Criteria andPassageLikeCountLessThanOrEqualTo(Integer value) {
            addCriterion("passage_like_count <=", value, "passageLikeCount");
            return (Criteria) this;
        }

        public Criteria andPassageLikeCountIn(List<Integer> values) {
            addCriterion("passage_like_count in", values, "passageLikeCount");
            return (Criteria) this;
        }

        public Criteria andPassageLikeCountNotIn(List<Integer> values) {
            addCriterion("passage_like_count not in", values, "passageLikeCount");
            return (Criteria) this;
        }

        public Criteria andPassageLikeCountBetween(Integer value1, Integer value2) {
            addCriterion("passage_like_count between", value1, value2, "passageLikeCount");
            return (Criteria) this;
        }

        public Criteria andPassageLikeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("passage_like_count not between", value1, value2, "passageLikeCount");
            return (Criteria) this;
        }

        public Criteria andPassageLookCountIsNull() {
            addCriterion("passage_look_count is null");
            return (Criteria) this;
        }

        public Criteria andPassageLookCountIsNotNull() {
            addCriterion("passage_look_count is not null");
            return (Criteria) this;
        }

        public Criteria andPassageLookCountEqualTo(Integer value) {
            addCriterion("passage_look_count =", value, "passageLookCount");
            return (Criteria) this;
        }

        public Criteria andPassageLookCountNotEqualTo(Integer value) {
            addCriterion("passage_look_count <>", value, "passageLookCount");
            return (Criteria) this;
        }

        public Criteria andPassageLookCountGreaterThan(Integer value) {
            addCriterion("passage_look_count >", value, "passageLookCount");
            return (Criteria) this;
        }

        public Criteria andPassageLookCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("passage_look_count >=", value, "passageLookCount");
            return (Criteria) this;
        }

        public Criteria andPassageLookCountLessThan(Integer value) {
            addCriterion("passage_look_count <", value, "passageLookCount");
            return (Criteria) this;
        }

        public Criteria andPassageLookCountLessThanOrEqualTo(Integer value) {
            addCriterion("passage_look_count <=", value, "passageLookCount");
            return (Criteria) this;
        }

        public Criteria andPassageLookCountIn(List<Integer> values) {
            addCriterion("passage_look_count in", values, "passageLookCount");
            return (Criteria) this;
        }

        public Criteria andPassageLookCountNotIn(List<Integer> values) {
            addCriterion("passage_look_count not in", values, "passageLookCount");
            return (Criteria) this;
        }

        public Criteria andPassageLookCountBetween(Integer value1, Integer value2) {
            addCriterion("passage_look_count between", value1, value2, "passageLookCount");
            return (Criteria) this;
        }

        public Criteria andPassageLookCountNotBetween(Integer value1, Integer value2) {
            addCriterion("passage_look_count not between", value1, value2, "passageLookCount");
            return (Criteria) this;
        }

        public Criteria andPassageStateIsNull() {
            addCriterion("passage_state is null");
            return (Criteria) this;
        }

        public Criteria andPassageStateIsNotNull() {
            addCriterion("passage_state is not null");
            return (Criteria) this;
        }

        public Criteria andPassageStateEqualTo(Integer value) {
            addCriterion("passage_state =", value, "passageState");
            return (Criteria) this;
        }

        public Criteria andPassageStateNotEqualTo(Integer value) {
            addCriterion("passage_state <>", value, "passageState");
            return (Criteria) this;
        }

        public Criteria andPassageStateGreaterThan(Integer value) {
            addCriterion("passage_state >", value, "passageState");
            return (Criteria) this;
        }

        public Criteria andPassageStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("passage_state >=", value, "passageState");
            return (Criteria) this;
        }

        public Criteria andPassageStateLessThan(Integer value) {
            addCriterion("passage_state <", value, "passageState");
            return (Criteria) this;
        }

        public Criteria andPassageStateLessThanOrEqualTo(Integer value) {
            addCriterion("passage_state <=", value, "passageState");
            return (Criteria) this;
        }

        public Criteria andPassageStateIn(List<Integer> values) {
            addCriterion("passage_state in", values, "passageState");
            return (Criteria) this;
        }

        public Criteria andPassageStateNotIn(List<Integer> values) {
            addCriterion("passage_state not in", values, "passageState");
            return (Criteria) this;
        }

        public Criteria andPassageStateBetween(Integer value1, Integer value2) {
            addCriterion("passage_state between", value1, value2, "passageState");
            return (Criteria) this;
        }

        public Criteria andPassageStateNotBetween(Integer value1, Integer value2) {
            addCriterion("passage_state not between", value1, value2, "passageState");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}