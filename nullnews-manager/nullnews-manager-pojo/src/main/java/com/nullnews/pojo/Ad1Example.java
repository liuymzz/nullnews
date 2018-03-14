package com.nullnews.pojo;

import java.util.ArrayList;
import java.util.List;

public class Ad1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ad1Example() {
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

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(String value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(String value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(String value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(String value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(String value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(String value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLike(String value) {
            addCriterion("ad_id like", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotLike(String value) {
            addCriterion("ad_id not like", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<String> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<String> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(String value1, String value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(String value1, String value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdTitleIsNull() {
            addCriterion("ad_title is null");
            return (Criteria) this;
        }

        public Criteria andAdTitleIsNotNull() {
            addCriterion("ad_title is not null");
            return (Criteria) this;
        }

        public Criteria andAdTitleEqualTo(String value) {
            addCriterion("ad_title =", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleNotEqualTo(String value) {
            addCriterion("ad_title <>", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleGreaterThan(String value) {
            addCriterion("ad_title >", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ad_title >=", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleLessThan(String value) {
            addCriterion("ad_title <", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleLessThanOrEqualTo(String value) {
            addCriterion("ad_title <=", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleLike(String value) {
            addCriterion("ad_title like", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleNotLike(String value) {
            addCriterion("ad_title not like", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleIn(List<String> values) {
            addCriterion("ad_title in", values, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleNotIn(List<String> values) {
            addCriterion("ad_title not in", values, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleBetween(String value1, String value2) {
            addCriterion("ad_title between", value1, value2, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleNotBetween(String value1, String value2) {
            addCriterion("ad_title not between", value1, value2, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdUrlIsNull() {
            addCriterion("ad_url is null");
            return (Criteria) this;
        }

        public Criteria andAdUrlIsNotNull() {
            addCriterion("ad_url is not null");
            return (Criteria) this;
        }

        public Criteria andAdUrlEqualTo(String value) {
            addCriterion("ad_url =", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlNotEqualTo(String value) {
            addCriterion("ad_url <>", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlGreaterThan(String value) {
            addCriterion("ad_url >", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ad_url >=", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlLessThan(String value) {
            addCriterion("ad_url <", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlLessThanOrEqualTo(String value) {
            addCriterion("ad_url <=", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlLike(String value) {
            addCriterion("ad_url like", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlNotLike(String value) {
            addCriterion("ad_url not like", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlIn(List<String> values) {
            addCriterion("ad_url in", values, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlNotIn(List<String> values) {
            addCriterion("ad_url not in", values, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlBetween(String value1, String value2) {
            addCriterion("ad_url between", value1, value2, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlNotBetween(String value1, String value2) {
            addCriterion("ad_url not between", value1, value2, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdPictureIsNull() {
            addCriterion("ad_picture is null");
            return (Criteria) this;
        }

        public Criteria andAdPictureIsNotNull() {
            addCriterion("ad_picture is not null");
            return (Criteria) this;
        }

        public Criteria andAdPictureEqualTo(String value) {
            addCriterion("ad_picture =", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureNotEqualTo(String value) {
            addCriterion("ad_picture <>", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureGreaterThan(String value) {
            addCriterion("ad_picture >", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ad_picture >=", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureLessThan(String value) {
            addCriterion("ad_picture <", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureLessThanOrEqualTo(String value) {
            addCriterion("ad_picture <=", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureLike(String value) {
            addCriterion("ad_picture like", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureNotLike(String value) {
            addCriterion("ad_picture not like", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureIn(List<String> values) {
            addCriterion("ad_picture in", values, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureNotIn(List<String> values) {
            addCriterion("ad_picture not in", values, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureBetween(String value1, String value2) {
            addCriterion("ad_picture between", value1, value2, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureNotBetween(String value1, String value2) {
            addCriterion("ad_picture not between", value1, value2, "adPicture");
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