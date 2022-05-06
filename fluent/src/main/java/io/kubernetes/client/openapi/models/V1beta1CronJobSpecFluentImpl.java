/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1beta1CronJobSpecFluentImpl<A extends V1beta1CronJobSpecFluent<A>>
    extends BaseFluent<A> implements V1beta1CronJobSpecFluent<A> {
  public V1beta1CronJobSpecFluentImpl() {}

  public V1beta1CronJobSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1CronJobSpec instance) {
    this.withConcurrencyPolicy(instance.getConcurrencyPolicy());

    this.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit());

    this.withJobTemplate(instance.getJobTemplate());

    this.withSchedule(instance.getSchedule());

    this.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds());

    this.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit());

    this.withSuspend(instance.getSuspend());

    this.withTimeZone(instance.getTimeZone());
  }

  private String concurrencyPolicy;
  private Integer failedJobsHistoryLimit;
  private V1beta1JobTemplateSpecBuilder jobTemplate;
  private java.lang.String schedule;
  private Long startingDeadlineSeconds;
  private java.lang.Integer successfulJobsHistoryLimit;
  private Boolean suspend;
  private java.lang.String timeZone;

  public java.lang.String getConcurrencyPolicy() {
    return this.concurrencyPolicy;
  }

  public A withConcurrencyPolicy(java.lang.String concurrencyPolicy) {
    this.concurrencyPolicy = concurrencyPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasConcurrencyPolicy() {
    return this.concurrencyPolicy != null;
  }

  public java.lang.Integer getFailedJobsHistoryLimit() {
    return this.failedJobsHistoryLimit;
  }

  public A withFailedJobsHistoryLimit(java.lang.Integer failedJobsHistoryLimit) {
    this.failedJobsHistoryLimit = failedJobsHistoryLimit;
    return (A) this;
  }

  public java.lang.Boolean hasFailedJobsHistoryLimit() {
    return this.failedJobsHistoryLimit != null;
  }

  /**
   * This method has been deprecated, please use method buildJobTemplate instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1JobTemplateSpec getJobTemplate() {
    return this.jobTemplate != null ? this.jobTemplate.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec buildJobTemplate() {
    return this.jobTemplate != null ? this.jobTemplate.build() : null;
  }

  public A withJobTemplate(io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec jobTemplate) {
    _visitables.get("jobTemplate").remove(this.jobTemplate);
    if (jobTemplate != null) {
      this.jobTemplate =
          new io.kubernetes.client.openapi.models.V1beta1JobTemplateSpecBuilder(jobTemplate);
      _visitables.get("jobTemplate").add(this.jobTemplate);
    }
    return (A) this;
  }

  public java.lang.Boolean hasJobTemplate() {
    return this.jobTemplate != null;
  }

  public V1beta1CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplate() {
    return new V1beta1CronJobSpecFluentImpl.JobTemplateNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobSpecFluent.JobTemplateNested<A>
      withNewJobTemplateLike(io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec item) {
    return new V1beta1CronJobSpecFluentImpl.JobTemplateNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobSpecFluent.JobTemplateNested<A>
      editJobTemplate() {
    return withNewJobTemplateLike(getJobTemplate());
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobSpecFluent.JobTemplateNested<A>
      editOrNewJobTemplate() {
    return withNewJobTemplateLike(
        getJobTemplate() != null
            ? getJobTemplate()
            : new io.kubernetes.client.openapi.models.V1beta1JobTemplateSpecBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobSpecFluent.JobTemplateNested<A>
      editOrNewJobTemplateLike(io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec item) {
    return withNewJobTemplateLike(getJobTemplate() != null ? getJobTemplate() : item);
  }

  public java.lang.String getSchedule() {
    return this.schedule;
  }

  public A withSchedule(java.lang.String schedule) {
    this.schedule = schedule;
    return (A) this;
  }

  public java.lang.Boolean hasSchedule() {
    return this.schedule != null;
  }

  public java.lang.Long getStartingDeadlineSeconds() {
    return this.startingDeadlineSeconds;
  }

  public A withStartingDeadlineSeconds(java.lang.Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds = startingDeadlineSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasStartingDeadlineSeconds() {
    return this.startingDeadlineSeconds != null;
  }

  public java.lang.Integer getSuccessfulJobsHistoryLimit() {
    return this.successfulJobsHistoryLimit;
  }

  public A withSuccessfulJobsHistoryLimit(java.lang.Integer successfulJobsHistoryLimit) {
    this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
    return (A) this;
  }

  public java.lang.Boolean hasSuccessfulJobsHistoryLimit() {
    return this.successfulJobsHistoryLimit != null;
  }

  public java.lang.Boolean getSuspend() {
    return this.suspend;
  }

  public A withSuspend(java.lang.Boolean suspend) {
    this.suspend = suspend;
    return (A) this;
  }

  public java.lang.Boolean hasSuspend() {
    return this.suspend != null;
  }

  public java.lang.String getTimeZone() {
    return this.timeZone;
  }

  public A withTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return (A) this;
  }

  public java.lang.Boolean hasTimeZone() {
    return this.timeZone != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1CronJobSpecFluentImpl that = (V1beta1CronJobSpecFluentImpl) o;
    if (concurrencyPolicy != null
        ? !concurrencyPolicy.equals(that.concurrencyPolicy)
        : that.concurrencyPolicy != null) return false;
    if (failedJobsHistoryLimit != null
        ? !failedJobsHistoryLimit.equals(that.failedJobsHistoryLimit)
        : that.failedJobsHistoryLimit != null) return false;
    if (jobTemplate != null ? !jobTemplate.equals(that.jobTemplate) : that.jobTemplate != null)
      return false;
    if (schedule != null ? !schedule.equals(that.schedule) : that.schedule != null) return false;
    if (startingDeadlineSeconds != null
        ? !startingDeadlineSeconds.equals(that.startingDeadlineSeconds)
        : that.startingDeadlineSeconds != null) return false;
    if (successfulJobsHistoryLimit != null
        ? !successfulJobsHistoryLimit.equals(that.successfulJobsHistoryLimit)
        : that.successfulJobsHistoryLimit != null) return false;
    if (suspend != null ? !suspend.equals(that.suspend) : that.suspend != null) return false;
    if (timeZone != null ? !timeZone.equals(that.timeZone) : that.timeZone != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        concurrencyPolicy,
        failedJobsHistoryLimit,
        jobTemplate,
        schedule,
        startingDeadlineSeconds,
        successfulJobsHistoryLimit,
        suspend,
        timeZone,
        super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (concurrencyPolicy != null) {
      sb.append("concurrencyPolicy:");
      sb.append(concurrencyPolicy + ",");
    }
    if (failedJobsHistoryLimit != null) {
      sb.append("failedJobsHistoryLimit:");
      sb.append(failedJobsHistoryLimit + ",");
    }
    if (jobTemplate != null) {
      sb.append("jobTemplate:");
      sb.append(jobTemplate + ",");
    }
    if (schedule != null) {
      sb.append("schedule:");
      sb.append(schedule + ",");
    }
    if (startingDeadlineSeconds != null) {
      sb.append("startingDeadlineSeconds:");
      sb.append(startingDeadlineSeconds + ",");
    }
    if (successfulJobsHistoryLimit != null) {
      sb.append("successfulJobsHistoryLimit:");
      sb.append(successfulJobsHistoryLimit + ",");
    }
    if (suspend != null) {
      sb.append("suspend:");
      sb.append(suspend + ",");
    }
    if (timeZone != null) {
      sb.append("timeZone:");
      sb.append(timeZone);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withSuspend() {
    return withSuspend(true);
  }

  class JobTemplateNestedImpl<N>
      extends V1beta1JobTemplateSpecFluentImpl<V1beta1CronJobSpecFluent.JobTemplateNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1CronJobSpecFluent.JobTemplateNested<N>,
          Nested<N> {
    JobTemplateNestedImpl(V1beta1JobTemplateSpec item) {
      this.builder = new V1beta1JobTemplateSpecBuilder(this, item);
    }

    JobTemplateNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1beta1JobTemplateSpecBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1JobTemplateSpecBuilder builder;

    public N and() {
      return (N) V1beta1CronJobSpecFluentImpl.this.withJobTemplate(builder.build());
    }

    public N endJobTemplate() {
      return and();
    }
  }
}
