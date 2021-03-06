package com.xycode.janebook.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMessageExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMesContentIsNull() {
            addCriterion("mes_content is null");
            return (Criteria) this;
        }

        public Criteria andMesContentIsNotNull() {
            addCriterion("mes_content is not null");
            return (Criteria) this;
        }

        public Criteria andMesContentEqualTo(String value) {
            addCriterion("mes_content =", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentNotEqualTo(String value) {
            addCriterion("mes_content <>", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentGreaterThan(String value) {
            addCriterion("mes_content >", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentGreaterThanOrEqualTo(String value) {
            addCriterion("mes_content >=", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentLessThan(String value) {
            addCriterion("mes_content <", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentLessThanOrEqualTo(String value) {
            addCriterion("mes_content <=", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentLike(String value) {
            addCriterion("mes_content like", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentNotLike(String value) {
            addCriterion("mes_content not like", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentIn(List<String> values) {
            addCriterion("mes_content in", values, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentNotIn(List<String> values) {
            addCriterion("mes_content not in", values, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentBetween(String value1, String value2) {
            addCriterion("mes_content between", value1, value2, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentNotBetween(String value1, String value2) {
            addCriterion("mes_content not between", value1, value2, "mesContent");
            return (Criteria) this;
        }

        public Criteria andSendIdIsNull() {
            addCriterion("send_id is null");
            return (Criteria) this;
        }

        public Criteria andSendIdIsNotNull() {
            addCriterion("send_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendIdEqualTo(String value) {
            addCriterion("send_id =", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotEqualTo(String value) {
            addCriterion("send_id <>", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdGreaterThan(String value) {
            addCriterion("send_id >", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdGreaterThanOrEqualTo(String value) {
            addCriterion("send_id >=", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdLessThan(String value) {
            addCriterion("send_id <", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdLessThanOrEqualTo(String value) {
            addCriterion("send_id <=", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdLike(String value) {
            addCriterion("send_id like", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotLike(String value) {
            addCriterion("send_id not like", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdIn(List<String> values) {
            addCriterion("send_id in", values, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotIn(List<String> values) {
            addCriterion("send_id not in", values, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdBetween(String value1, String value2) {
            addCriterion("send_id between", value1, value2, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotBetween(String value1, String value2) {
            addCriterion("send_id not between", value1, value2, "sendId");
            return (Criteria) this;
        }

        public Criteria andReciveIdIsNull() {
            addCriterion("recive_id is null");
            return (Criteria) this;
        }

        public Criteria andReciveIdIsNotNull() {
            addCriterion("recive_id is not null");
            return (Criteria) this;
        }

        public Criteria andReciveIdEqualTo(String value) {
            addCriterion("recive_id =", value, "reciveId");
            return (Criteria) this;
        }

        public Criteria andReciveIdNotEqualTo(String value) {
            addCriterion("recive_id <>", value, "reciveId");
            return (Criteria) this;
        }

        public Criteria andReciveIdGreaterThan(String value) {
            addCriterion("recive_id >", value, "reciveId");
            return (Criteria) this;
        }

        public Criteria andReciveIdGreaterThanOrEqualTo(String value) {
            addCriterion("recive_id >=", value, "reciveId");
            return (Criteria) this;
        }

        public Criteria andReciveIdLessThan(String value) {
            addCriterion("recive_id <", value, "reciveId");
            return (Criteria) this;
        }

        public Criteria andReciveIdLessThanOrEqualTo(String value) {
            addCriterion("recive_id <=", value, "reciveId");
            return (Criteria) this;
        }

        public Criteria andReciveIdLike(String value) {
            addCriterion("recive_id like", value, "reciveId");
            return (Criteria) this;
        }

        public Criteria andReciveIdNotLike(String value) {
            addCriterion("recive_id not like", value, "reciveId");
            return (Criteria) this;
        }

        public Criteria andReciveIdIn(List<String> values) {
            addCriterion("recive_id in", values, "reciveId");
            return (Criteria) this;
        }

        public Criteria andReciveIdNotIn(List<String> values) {
            addCriterion("recive_id not in", values, "reciveId");
            return (Criteria) this;
        }

        public Criteria andReciveIdBetween(String value1, String value2) {
            addCriterion("recive_id between", value1, value2, "reciveId");
            return (Criteria) this;
        }

        public Criteria andReciveIdNotBetween(String value1, String value2) {
            addCriterion("recive_id not between", value1, value2, "reciveId");
            return (Criteria) this;
        }

        public Criteria andReadedIsNull() {
            addCriterion("readed is null");
            return (Criteria) this;
        }

        public Criteria andReadedIsNotNull() {
            addCriterion("readed is not null");
            return (Criteria) this;
        }

        public Criteria andReadedEqualTo(String value) {
            addCriterion("readed =", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotEqualTo(String value) {
            addCriterion("readed <>", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedGreaterThan(String value) {
            addCriterion("readed >", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedGreaterThanOrEqualTo(String value) {
            addCriterion("readed >=", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedLessThan(String value) {
            addCriterion("readed <", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedLessThanOrEqualTo(String value) {
            addCriterion("readed <=", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedLike(String value) {
            addCriterion("readed like", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotLike(String value) {
            addCriterion("readed not like", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedIn(List<String> values) {
            addCriterion("readed in", values, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotIn(List<String> values) {
            addCriterion("readed not in", values, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedBetween(String value1, String value2) {
            addCriterion("readed between", value1, value2, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotBetween(String value1, String value2) {
            addCriterion("readed not between", value1, value2, "readed");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andArticleIsNull() {
            addCriterion("article is null");
            return (Criteria) this;
        }

        public Criteria andArticleIsNotNull() {
            addCriterion("article is not null");
            return (Criteria) this;
        }

        public Criteria andArticleEqualTo(String value) {
            addCriterion("article =", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleNotEqualTo(String value) {
            addCriterion("article <>", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleGreaterThan(String value) {
            addCriterion("article >", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleGreaterThanOrEqualTo(String value) {
            addCriterion("article >=", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleLessThan(String value) {
            addCriterion("article <", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleLessThanOrEqualTo(String value) {
            addCriterion("article <=", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleLike(String value) {
            addCriterion("article like", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleNotLike(String value) {
            addCriterion("article not like", value, "article");
            return (Criteria) this;
        }

        public Criteria andArticleIn(List<String> values) {
            addCriterion("article in", values, "article");
            return (Criteria) this;
        }

        public Criteria andArticleNotIn(List<String> values) {
            addCriterion("article not in", values, "article");
            return (Criteria) this;
        }

        public Criteria andArticleBetween(String value1, String value2) {
            addCriterion("article between", value1, value2, "article");
            return (Criteria) this;
        }

        public Criteria andArticleNotBetween(String value1, String value2) {
            addCriterion("article not between", value1, value2, "article");
            return (Criteria) this;
        }

        public Criteria andCalssifyIsNull() {
            addCriterion("calssify is null");
            return (Criteria) this;
        }

        public Criteria andCalssifyIsNotNull() {
            addCriterion("calssify is not null");
            return (Criteria) this;
        }

        public Criteria andCalssifyEqualTo(String value) {
            addCriterion("calssify =", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyNotEqualTo(String value) {
            addCriterion("calssify <>", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyGreaterThan(String value) {
            addCriterion("calssify >", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyGreaterThanOrEqualTo(String value) {
            addCriterion("calssify >=", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyLessThan(String value) {
            addCriterion("calssify <", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyLessThanOrEqualTo(String value) {
            addCriterion("calssify <=", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyLike(String value) {
            addCriterion("calssify like", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyNotLike(String value) {
            addCriterion("calssify not like", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyIn(List<String> values) {
            addCriterion("calssify in", values, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyNotIn(List<String> values) {
            addCriterion("calssify not in", values, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyBetween(String value1, String value2) {
            addCriterion("calssify between", value1, value2, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyNotBetween(String value1, String value2) {
            addCriterion("calssify not between", value1, value2, "calssify");
            return (Criteria) this;
        }

        public Criteria andAcidIsNull() {
            addCriterion("acid is null");
            return (Criteria) this;
        }

        public Criteria andAcidIsNotNull() {
            addCriterion("acid is not null");
            return (Criteria) this;
        }

        public Criteria andAcidEqualTo(Integer value) {
            addCriterion("acid =", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidNotEqualTo(Integer value) {
            addCriterion("acid <>", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidGreaterThan(Integer value) {
            addCriterion("acid >", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("acid >=", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidLessThan(Integer value) {
            addCriterion("acid <", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidLessThanOrEqualTo(Integer value) {
            addCriterion("acid <=", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidIn(List<Integer> values) {
            addCriterion("acid in", values, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidNotIn(List<Integer> values) {
            addCriterion("acid not in", values, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidBetween(Integer value1, Integer value2) {
            addCriterion("acid between", value1, value2, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidNotBetween(Integer value1, Integer value2) {
            addCriterion("acid not between", value1, value2, "acid");
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