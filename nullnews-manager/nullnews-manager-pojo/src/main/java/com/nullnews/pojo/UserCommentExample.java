package com.nullnews.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(String value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(String value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(String value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(String value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(String value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(String value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLike(String value) {
            addCriterion("comment_id like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotLike(String value) {
            addCriterion("comment_id not like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<String> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<String> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(String value1, String value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(String value1, String value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
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

        public Criteria andCommentTimeIsNull() {
            addCriterion("comment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(Date value) {
            addCriterion("comment_time =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(Date value) {
            addCriterion("comment_time <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(Date value) {
            addCriterion("comment_time >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_time >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(Date value) {
            addCriterion("comment_time <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("comment_time <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<Date> values) {
            addCriterion("comment_time in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<Date> values) {
            addCriterion("comment_time not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(Date value1, Date value2) {
            addCriterion("comment_time between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("comment_time not between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdIsNull() {
            addCriterion("comment_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdIsNotNull() {
            addCriterion("comment_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdEqualTo(String value) {
            addCriterion("comment_parent_id =", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdNotEqualTo(String value) {
            addCriterion("comment_parent_id <>", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdGreaterThan(String value) {
            addCriterion("comment_parent_id >", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("comment_parent_id >=", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdLessThan(String value) {
            addCriterion("comment_parent_id <", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdLessThanOrEqualTo(String value) {
            addCriterion("comment_parent_id <=", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdLike(String value) {
            addCriterion("comment_parent_id like", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdNotLike(String value) {
            addCriterion("comment_parent_id not like", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdIn(List<String> values) {
            addCriterion("comment_parent_id in", values, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdNotIn(List<String> values) {
            addCriterion("comment_parent_id not in", values, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdBetween(String value1, String value2) {
            addCriterion("comment_parent_id between", value1, value2, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdNotBetween(String value1, String value2) {
            addCriterion("comment_parent_id not between", value1, value2, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentLikeIsNull() {
            addCriterion("comment_like is null");
            return (Criteria) this;
        }

        public Criteria andCommentLikeIsNotNull() {
            addCriterion("comment_like is not null");
            return (Criteria) this;
        }

        public Criteria andCommentLikeEqualTo(Integer value) {
            addCriterion("comment_like =", value, "commentLike");
            return (Criteria) this;
        }

        public Criteria andCommentLikeNotEqualTo(Integer value) {
            addCriterion("comment_like <>", value, "commentLike");
            return (Criteria) this;
        }

        public Criteria andCommentLikeGreaterThan(Integer value) {
            addCriterion("comment_like >", value, "commentLike");
            return (Criteria) this;
        }

        public Criteria andCommentLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_like >=", value, "commentLike");
            return (Criteria) this;
        }

        public Criteria andCommentLikeLessThan(Integer value) {
            addCriterion("comment_like <", value, "commentLike");
            return (Criteria) this;
        }

        public Criteria andCommentLikeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_like <=", value, "commentLike");
            return (Criteria) this;
        }

        public Criteria andCommentLikeIn(List<Integer> values) {
            addCriterion("comment_like in", values, "commentLike");
            return (Criteria) this;
        }

        public Criteria andCommentLikeNotIn(List<Integer> values) {
            addCriterion("comment_like not in", values, "commentLike");
            return (Criteria) this;
        }

        public Criteria andCommentLikeBetween(Integer value1, Integer value2) {
            addCriterion("comment_like between", value1, value2, "commentLike");
            return (Criteria) this;
        }

        public Criteria andCommentLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_like not between", value1, value2, "commentLike");
            return (Criteria) this;
        }

        public Criteria andCommentDislikeIsNull() {
            addCriterion("comment_dislike is null");
            return (Criteria) this;
        }

        public Criteria andCommentDislikeIsNotNull() {
            addCriterion("comment_dislike is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDislikeEqualTo(Integer value) {
            addCriterion("comment_dislike =", value, "commentDislike");
            return (Criteria) this;
        }

        public Criteria andCommentDislikeNotEqualTo(Integer value) {
            addCriterion("comment_dislike <>", value, "commentDislike");
            return (Criteria) this;
        }

        public Criteria andCommentDislikeGreaterThan(Integer value) {
            addCriterion("comment_dislike >", value, "commentDislike");
            return (Criteria) this;
        }

        public Criteria andCommentDislikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_dislike >=", value, "commentDislike");
            return (Criteria) this;
        }

        public Criteria andCommentDislikeLessThan(Integer value) {
            addCriterion("comment_dislike <", value, "commentDislike");
            return (Criteria) this;
        }

        public Criteria andCommentDislikeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_dislike <=", value, "commentDislike");
            return (Criteria) this;
        }

        public Criteria andCommentDislikeIn(List<Integer> values) {
            addCriterion("comment_dislike in", values, "commentDislike");
            return (Criteria) this;
        }

        public Criteria andCommentDislikeNotIn(List<Integer> values) {
            addCriterion("comment_dislike not in", values, "commentDislike");
            return (Criteria) this;
        }

        public Criteria andCommentDislikeBetween(Integer value1, Integer value2) {
            addCriterion("comment_dislike between", value1, value2, "commentDislike");
            return (Criteria) this;
        }

        public Criteria andCommentDislikeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_dislike not between", value1, value2, "commentDislike");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentStateIsNull() {
            addCriterion("comment_state is null");
            return (Criteria) this;
        }

        public Criteria andCommentStateIsNotNull() {
            addCriterion("comment_state is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStateEqualTo(Integer value) {
            addCriterion("comment_state =", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotEqualTo(Integer value) {
            addCriterion("comment_state <>", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateGreaterThan(Integer value) {
            addCriterion("comment_state >", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_state >=", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateLessThan(Integer value) {
            addCriterion("comment_state <", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateLessThanOrEqualTo(Integer value) {
            addCriterion("comment_state <=", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateIn(List<Integer> values) {
            addCriterion("comment_state in", values, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotIn(List<Integer> values) {
            addCriterion("comment_state not in", values, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateBetween(Integer value1, Integer value2) {
            addCriterion("comment_state between", value1, value2, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_state not between", value1, value2, "commentState");
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