/*
Copyright 2020 The Kubernetes Authors.
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
package io.kubernetes.client.proto;

public final class V1beta1Authorization {
  private V1beta1Authorization() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface ExtraValueOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.ExtraValue)
      com.google.protobuf.MessageOrBuilder {

    /** <code>repeated string items = 1;</code> */
    java.util.List<java.lang.String> getItemsList();
    /** <code>repeated string items = 1;</code> */
    int getItemsCount();
    /** <code>repeated string items = 1;</code> */
    java.lang.String getItems(int index);
    /** <code>repeated string items = 1;</code> */
    com.google.protobuf.ByteString getItemsBytes(int index);
  }
  /**
   *
   *
   * <pre>
   * ExtraValue masks the value so protobuf can generate
   * +protobuf.nullable=true
   * +protobuf.options.(gogoproto.goproto_stringer)=false
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authorization.v1beta1.ExtraValue}
   */
  public static final class ExtraValue extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.ExtraValue)
      ExtraValueOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ExtraValue.newBuilder() to construct.
    private ExtraValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ExtraValue() {
      items_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ExtraValue(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  items_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000001;
                }
                items_.add(bs);
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          items_ = items_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_ExtraValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_ExtraValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.ExtraValue.class,
              io.kubernetes.client.proto.V1beta1Authorization.ExtraValue.Builder.class);
    }

    public static final int ITEMS_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList items_;
    /** <code>repeated string items = 1;</code> */
    public com.google.protobuf.ProtocolStringList getItemsList() {
      return items_;
    }
    /** <code>repeated string items = 1;</code> */
    public int getItemsCount() {
      return items_.size();
    }
    /** <code>repeated string items = 1;</code> */
    public java.lang.String getItems(int index) {
      return items_.get(index);
    }
    /** <code>repeated string items = 1;</code> */
    public com.google.protobuf.ByteString getItemsBytes(int index) {
      return items_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      for (int i = 0; i < items_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, items_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < items_.size(); i++) {
          dataSize += computeStringSizeNoTag(items_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getItemsList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Authorization.ExtraValue)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.ExtraValue other =
          (io.kubernetes.client.proto.V1beta1Authorization.ExtraValue) obj;

      boolean result = true;
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ExtraValue parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ExtraValue parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ExtraValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ExtraValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ExtraValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ExtraValue parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ExtraValue parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ExtraValue parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ExtraValue parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ExtraValue parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ExtraValue parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ExtraValue parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.ExtraValue prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ExtraValue masks the value so protobuf can generate
     * +protobuf.nullable=true
     * +protobuf.options.(gogoproto.goproto_stringer)=false
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authorization.v1beta1.ExtraValue}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.ExtraValue)
        io.kubernetes.client.proto.V1beta1Authorization.ExtraValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_ExtraValue_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_ExtraValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.ExtraValue.class,
                io.kubernetes.client.proto.V1beta1Authorization.ExtraValue.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.ExtraValue.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        items_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_ExtraValue_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.ExtraValue
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.ExtraValue.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.ExtraValue build() {
        io.kubernetes.client.proto.V1beta1Authorization.ExtraValue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.ExtraValue buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.ExtraValue result =
            new io.kubernetes.client.proto.V1beta1Authorization.ExtraValue(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          items_ = items_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1beta1Authorization.ExtraValue) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Authorization.ExtraValue) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Authorization.ExtraValue other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.ExtraValue.getDefaultInstance())
          return this;
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.ExtraValue parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.ExtraValue) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private com.google.protobuf.LazyStringList items_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          items_ = new com.google.protobuf.LazyStringArrayList(items_);
          bitField0_ |= 0x00000001;
        }
      }
      /** <code>repeated string items = 1;</code> */
      public com.google.protobuf.ProtocolStringList getItemsList() {
        return items_.getUnmodifiableView();
      }
      /** <code>repeated string items = 1;</code> */
      public int getItemsCount() {
        return items_.size();
      }
      /** <code>repeated string items = 1;</code> */
      public java.lang.String getItems(int index) {
        return items_.get(index);
      }
      /** <code>repeated string items = 1;</code> */
      public com.google.protobuf.ByteString getItemsBytes(int index) {
        return items_.getByteString(index);
      }
      /** <code>repeated string items = 1;</code> */
      public Builder setItems(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
        return this;
      }
      /** <code>repeated string items = 1;</code> */
      public Builder addItems(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
        return this;
      }
      /** <code>repeated string items = 1;</code> */
      public Builder addAllItems(java.lang.Iterable<java.lang.String> values) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
        onChanged();
        return this;
      }
      /** <code>repeated string items = 1;</code> */
      public Builder clearItems() {
        items_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /** <code>repeated string items = 1;</code> */
      public Builder addItemsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.ExtraValue)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.ExtraValue)
    private static final io.kubernetes.client.proto.V1beta1Authorization.ExtraValue
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Authorization.ExtraValue();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ExtraValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ExtraValue> PARSER =
        new com.google.protobuf.AbstractParser<ExtraValue>() {
          @java.lang.Override
          public ExtraValue parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ExtraValue(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ExtraValue> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExtraValue> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.ExtraValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface LocalSubjectAccessReviewOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.LocalSubjectAccessReview)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
     * you made the request against.  If empty, it is defaulted.
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
     * you made the request against.  If empty, it is defaulted.
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec getSpec();
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
     * you made the request against.  If empty, it is defaulted.
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpecOrBuilder
        getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus getStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder
        getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * LocalSubjectAccessReview checks whether or not a user or group can perform an action in a given namespace.
   * Having a namespace scoped resource makes it much easier to grant namespace scoped policy that includes permissions
   * checking.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authorization.v1beta1.LocalSubjectAccessReview}
   */
  public static final class LocalSubjectAccessReview extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.LocalSubjectAccessReview)
      LocalSubjectAccessReviewOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use LocalSubjectAccessReview.newBuilder() to construct.
    private LocalSubjectAccessReview(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private LocalSubjectAccessReview() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private LocalSubjectAccessReview(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_LocalSubjectAccessReview_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_LocalSubjectAccessReview_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview.class,
              io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview.Builder
                  .class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec spec_;
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
     * you made the request against.  If empty, it is defaulted.
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
     * you made the request against.  If empty, it is defaulted.
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
              .getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
     * you made the request against.  If empty, it is defaulted.
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpecOrBuilder
        getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
              .getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus status_;
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
              .getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
              .getDefaultInstance()
          : status_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getStatus());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStatus());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj
          instanceof io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview other =
          (io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * LocalSubjectAccessReview checks whether or not a user or group can perform an action in a given namespace.
     * Having a namespace scoped resource makes it much easier to grant namespace scoped policy that includes permissions
     * checking.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authorization.v1beta1.LocalSubjectAccessReview}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.LocalSubjectAccessReview)
        io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReviewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_LocalSubjectAccessReview_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_LocalSubjectAccessReview_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview.class,
                io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
          getStatusFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_LocalSubjectAccessReview_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview build() {
        io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview result =
            new io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
                .getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
       * you made the request against.  If empty, it is defaulted.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
       * you made the request against.  If empty, it is defaulted.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
                  .getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
       * you made the request against.  If empty, it is defaulted.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
       * you made the request against.  If empty, it is defaulted.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder
              builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
       * you made the request against.  If empty, it is defaulted.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public Builder mergeSpec(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.newBuilder(
                        spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
       * you made the request against.  If empty, it is defaulted.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
       * you made the request against.  If empty, it is defaulted.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder
          getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
       * you made the request against.  If empty, it is defaulted.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpecOrBuilder
          getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
                  .getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace
       * you made the request against.  If empty, it is defaulted.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec,
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder,
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus status_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                  .getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder
              builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                    .newBuilder(status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                  .getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus,
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder,
                  io.kubernetes.client.proto.V1beta1Authorization
                      .SubjectAccessReviewStatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.LocalSubjectAccessReview)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.LocalSubjectAccessReview)
    private static final io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<LocalSubjectAccessReview> PARSER =
        new com.google.protobuf.AbstractParser<LocalSubjectAccessReview>() {
          @java.lang.Override
          public LocalSubjectAccessReview parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new LocalSubjectAccessReview(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<LocalSubjectAccessReview> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LocalSubjectAccessReview> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.LocalSubjectAccessReview
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface NonResourceAttributesOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.NonResourceAttributes)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Path is the URL path of the request
     * +optional
     * </pre>
     *
     * <code>optional string path = 1;</code>
     */
    boolean hasPath();
    /**
     *
     *
     * <pre>
     * Path is the URL path of the request
     * +optional
     * </pre>
     *
     * <code>optional string path = 1;</code>
     */
    java.lang.String getPath();
    /**
     *
     *
     * <pre>
     * Path is the URL path of the request
     * +optional
     * </pre>
     *
     * <code>optional string path = 1;</code>
     */
    com.google.protobuf.ByteString getPathBytes();

    /**
     *
     *
     * <pre>
     * Verb is the standard HTTP verb
     * +optional
     * </pre>
     *
     * <code>optional string verb = 2;</code>
     */
    boolean hasVerb();
    /**
     *
     *
     * <pre>
     * Verb is the standard HTTP verb
     * +optional
     * </pre>
     *
     * <code>optional string verb = 2;</code>
     */
    java.lang.String getVerb();
    /**
     *
     *
     * <pre>
     * Verb is the standard HTTP verb
     * +optional
     * </pre>
     *
     * <code>optional string verb = 2;</code>
     */
    com.google.protobuf.ByteString getVerbBytes();
  }
  /**
   *
   *
   * <pre>
   * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authorization.v1beta1.NonResourceAttributes}
   */
  public static final class NonResourceAttributes extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.NonResourceAttributes)
      NonResourceAttributesOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use NonResourceAttributes.newBuilder() to construct.
    private NonResourceAttributes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private NonResourceAttributes() {
      path_ = "";
      verb_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private NonResourceAttributes(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                path_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                verb_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_NonResourceAttributes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_NonResourceAttributes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.class,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder.class);
    }

    private int bitField0_;
    public static final int PATH_FIELD_NUMBER = 1;
    private volatile java.lang.Object path_;
    /**
     *
     *
     * <pre>
     * Path is the URL path of the request
     * +optional
     * </pre>
     *
     * <code>optional string path = 1;</code>
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Path is the URL path of the request
     * +optional
     * </pre>
     *
     * <code>optional string path = 1;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          path_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Path is the URL path of the request
     * +optional
     * </pre>
     *
     * <code>optional string path = 1;</code>
     */
    public com.google.protobuf.ByteString getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERB_FIELD_NUMBER = 2;
    private volatile java.lang.Object verb_;
    /**
     *
     *
     * <pre>
     * Verb is the standard HTTP verb
     * +optional
     * </pre>
     *
     * <code>optional string verb = 2;</code>
     */
    public boolean hasVerb() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Verb is the standard HTTP verb
     * +optional
     * </pre>
     *
     * <code>optional string verb = 2;</code>
     */
    public java.lang.String getVerb() {
      java.lang.Object ref = verb_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          verb_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Verb is the standard HTTP verb
     * +optional
     * </pre>
     *
     * <code>optional string verb = 2;</code>
     */
    public com.google.protobuf.ByteString getVerbBytes() {
      java.lang.Object ref = verb_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        verb_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, verb_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, verb_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes other =
          (io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes) obj;

      boolean result = true;
      result = result && (hasPath() == other.hasPath());
      if (hasPath()) {
        result = result && getPath().equals(other.getPath());
      }
      result = result && (hasVerb() == other.hasVerb());
      if (hasVerb()) {
        result = result && getVerb().equals(other.getVerb());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasPath()) {
        hash = (37 * hash) + PATH_FIELD_NUMBER;
        hash = (53 * hash) + getPath().hashCode();
      }
      if (hasVerb()) {
        hash = (37 * hash) + VERB_FIELD_NUMBER;
        hash = (53 * hash) + getVerb().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authorization.v1beta1.NonResourceAttributes}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.NonResourceAttributes)
        io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_NonResourceAttributes_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_NonResourceAttributes_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.class,
                io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        path_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        verb_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_NonResourceAttributes_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes build() {
        io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes result =
            new io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.path_ = path_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.verb_ = verb_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
                .getDefaultInstance()) return this;
        if (other.hasPath()) {
          bitField0_ |= 0x00000001;
          path_ = other.path_;
          onChanged();
        }
        if (other.hasVerb()) {
          bitField0_ |= 0x00000002;
          verb_ = other.verb_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object path_ = "";
      /**
       *
       *
       * <pre>
       * Path is the URL path of the request
       * +optional
       * </pre>
       *
       * <code>optional string path = 1;</code>
       */
      public boolean hasPath() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Path is the URL path of the request
       * +optional
       * </pre>
       *
       * <code>optional string path = 1;</code>
       */
      public java.lang.String getPath() {
        java.lang.Object ref = path_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            path_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Path is the URL path of the request
       * +optional
       * </pre>
       *
       * <code>optional string path = 1;</code>
       */
      public com.google.protobuf.ByteString getPathBytes() {
        java.lang.Object ref = path_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          path_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Path is the URL path of the request
       * +optional
       * </pre>
       *
       * <code>optional string path = 1;</code>
       */
      public Builder setPath(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        path_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Path is the URL path of the request
       * +optional
       * </pre>
       *
       * <code>optional string path = 1;</code>
       */
      public Builder clearPath() {
        bitField0_ = (bitField0_ & ~0x00000001);
        path_ = getDefaultInstance().getPath();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Path is the URL path of the request
       * +optional
       * </pre>
       *
       * <code>optional string path = 1;</code>
       */
      public Builder setPathBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        path_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object verb_ = "";
      /**
       *
       *
       * <pre>
       * Verb is the standard HTTP verb
       * +optional
       * </pre>
       *
       * <code>optional string verb = 2;</code>
       */
      public boolean hasVerb() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Verb is the standard HTTP verb
       * +optional
       * </pre>
       *
       * <code>optional string verb = 2;</code>
       */
      public java.lang.String getVerb() {
        java.lang.Object ref = verb_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            verb_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Verb is the standard HTTP verb
       * +optional
       * </pre>
       *
       * <code>optional string verb = 2;</code>
       */
      public com.google.protobuf.ByteString getVerbBytes() {
        java.lang.Object ref = verb_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          verb_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Verb is the standard HTTP verb
       * +optional
       * </pre>
       *
       * <code>optional string verb = 2;</code>
       */
      public Builder setVerb(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        verb_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verb is the standard HTTP verb
       * +optional
       * </pre>
       *
       * <code>optional string verb = 2;</code>
       */
      public Builder clearVerb() {
        bitField0_ = (bitField0_ & ~0x00000002);
        verb_ = getDefaultInstance().getVerb();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verb is the standard HTTP verb
       * +optional
       * </pre>
       *
       * <code>optional string verb = 2;</code>
       */
      public Builder setVerbBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        verb_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.NonResourceAttributes)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.NonResourceAttributes)
    private static final io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<NonResourceAttributes> PARSER =
        new com.google.protobuf.AbstractParser<NonResourceAttributes>() {
          @java.lang.Override
          public NonResourceAttributes parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new NonResourceAttributes(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<NonResourceAttributes> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NonResourceAttributes> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface NonResourceRuleOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.NonResourceRule)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    java.util.List<java.lang.String> getVerbsList();
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    int getVerbsCount();
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    java.lang.String getVerbs(int index);
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    com.google.protobuf.ByteString getVerbsBytes(int index);

    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
     * final step in the path.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 2;</code>
     */
    java.util.List<java.lang.String> getNonResourceURLsList();
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
     * final step in the path.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 2;</code>
     */
    int getNonResourceURLsCount();
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
     * final step in the path.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 2;</code>
     */
    java.lang.String getNonResourceURLs(int index);
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
     * final step in the path.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 2;</code>
     */
    com.google.protobuf.ByteString getNonResourceURLsBytes(int index);
  }
  /**
   *
   *
   * <pre>
   * NonResourceRule holds information that describes a rule for the non-resource
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authorization.v1beta1.NonResourceRule}
   */
  public static final class NonResourceRule extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.NonResourceRule)
      NonResourceRuleOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use NonResourceRule.newBuilder() to construct.
    private NonResourceRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private NonResourceRule() {
      verbs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      nonResourceURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private NonResourceRule(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  verbs_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000001;
                }
                verbs_.add(bs);
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  nonResourceURLs_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000002;
                }
                nonResourceURLs_.add(bs);
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          verbs_ = verbs_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          nonResourceURLs_ = nonResourceURLs_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_NonResourceRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_NonResourceRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.class,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.Builder.class);
    }

    public static final int VERBS_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList verbs_;
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList getVerbsList() {
      return verbs_;
    }
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    public int getVerbsCount() {
      return verbs_.size();
    }
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    public java.lang.String getVerbs(int index) {
      return verbs_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    public com.google.protobuf.ByteString getVerbsBytes(int index) {
      return verbs_.getByteString(index);
    }

    public static final int NONRESOURCEURLS_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList nonResourceURLs_;
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
     * final step in the path.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList getNonResourceURLsList() {
      return nonResourceURLs_;
    }
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
     * final step in the path.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 2;</code>
     */
    public int getNonResourceURLsCount() {
      return nonResourceURLs_.size();
    }
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
     * final step in the path.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 2;</code>
     */
    public java.lang.String getNonResourceURLs(int index) {
      return nonResourceURLs_.get(index);
    }
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
     * final step in the path.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 2;</code>
     */
    public com.google.protobuf.ByteString getNonResourceURLsBytes(int index) {
      return nonResourceURLs_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      for (int i = 0; i < verbs_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, verbs_.getRaw(i));
      }
      for (int i = 0; i < nonResourceURLs_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nonResourceURLs_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < verbs_.size(); i++) {
          dataSize += computeStringSizeNoTag(verbs_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getVerbsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < nonResourceURLs_.size(); i++) {
          dataSize += computeStringSizeNoTag(nonResourceURLs_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getNonResourceURLsList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule other =
          (io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule) obj;

      boolean result = true;
      result = result && getVerbsList().equals(other.getVerbsList());
      result = result && getNonResourceURLsList().equals(other.getNonResourceURLsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getVerbsCount() > 0) {
        hash = (37 * hash) + VERBS_FIELD_NUMBER;
        hash = (53 * hash) + getVerbsList().hashCode();
      }
      if (getNonResourceURLsCount() > 0) {
        hash = (37 * hash) + NONRESOURCEURLS_FIELD_NUMBER;
        hash = (53 * hash) + getNonResourceURLsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * NonResourceRule holds information that describes a rule for the non-resource
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authorization.v1beta1.NonResourceRule}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.NonResourceRule)
        io.kubernetes.client.proto.V1beta1Authorization.NonResourceRuleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_NonResourceRule_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_NonResourceRule_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.class,
                io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        verbs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        nonResourceURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_NonResourceRule_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule build() {
        io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule result =
            new io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          verbs_ = verbs_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.verbs_ = verbs_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          nonResourceURLs_ = nonResourceURLs_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.nonResourceURLs_ = nonResourceURLs_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.getDefaultInstance())
          return this;
        if (!other.verbs_.isEmpty()) {
          if (verbs_.isEmpty()) {
            verbs_ = other.verbs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVerbsIsMutable();
            verbs_.addAll(other.verbs_);
          }
          onChanged();
        }
        if (!other.nonResourceURLs_.isEmpty()) {
          if (nonResourceURLs_.isEmpty()) {
            nonResourceURLs_ = other.nonResourceURLs_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureNonResourceURLsIsMutable();
            nonResourceURLs_.addAll(other.nonResourceURLs_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private com.google.protobuf.LazyStringList verbs_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureVerbsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          verbs_ = new com.google.protobuf.LazyStringArrayList(verbs_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public com.google.protobuf.ProtocolStringList getVerbsList() {
        return verbs_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public int getVerbsCount() {
        return verbs_.size();
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public java.lang.String getVerbs(int index) {
        return verbs_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public com.google.protobuf.ByteString getVerbsBytes(int index) {
        return verbs_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder setVerbs(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerbsIsMutable();
        verbs_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder addVerbs(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerbsIsMutable();
        verbs_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder addAllVerbs(java.lang.Iterable<java.lang.String> values) {
        ensureVerbsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, verbs_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder clearVerbs() {
        verbs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder addVerbsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerbsIsMutable();
        verbs_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList nonResourceURLs_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureNonResourceURLsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          nonResourceURLs_ = new com.google.protobuf.LazyStringArrayList(nonResourceURLs_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
       * final step in the path.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 2;</code>
       */
      public com.google.protobuf.ProtocolStringList getNonResourceURLsList() {
        return nonResourceURLs_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
       * final step in the path.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 2;</code>
       */
      public int getNonResourceURLsCount() {
        return nonResourceURLs_.size();
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
       * final step in the path.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 2;</code>
       */
      public java.lang.String getNonResourceURLs(int index) {
        return nonResourceURLs_.get(index);
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
       * final step in the path.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 2;</code>
       */
      public com.google.protobuf.ByteString getNonResourceURLsBytes(int index) {
        return nonResourceURLs_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
       * final step in the path.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 2;</code>
       */
      public Builder setNonResourceURLs(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNonResourceURLsIsMutable();
        nonResourceURLs_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
       * final step in the path.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 2;</code>
       */
      public Builder addNonResourceURLs(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNonResourceURLsIsMutable();
        nonResourceURLs_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
       * final step in the path.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 2;</code>
       */
      public Builder addAllNonResourceURLs(java.lang.Iterable<java.lang.String> values) {
        ensureNonResourceURLsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, nonResourceURLs_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
       * final step in the path.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 2;</code>
       */
      public Builder clearNonResourceURLs() {
        nonResourceURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full,
       * final step in the path.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 2;</code>
       */
      public Builder addNonResourceURLsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNonResourceURLsIsMutable();
        nonResourceURLs_.add(value);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.NonResourceRule)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.NonResourceRule)
    private static final io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<NonResourceRule> PARSER =
        new com.google.protobuf.AbstractParser<NonResourceRule>() {
          @java.lang.Override
          public NonResourceRule parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new NonResourceRule(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<NonResourceRule> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NonResourceRule> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ResourceAttributesOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.ResourceAttributes)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces
     * "" (empty) is defaulted for LocalSubjectAccessReviews
     * "" (empty) is empty for cluster-scoped resources
     * "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    boolean hasNamespace();
    /**
     *
     *
     * <pre>
     * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces
     * "" (empty) is defaulted for LocalSubjectAccessReviews
     * "" (empty) is empty for cluster-scoped resources
     * "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    java.lang.String getNamespace();
    /**
     *
     *
     * <pre>
     * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces
     * "" (empty) is defaulted for LocalSubjectAccessReviews
     * "" (empty) is empty for cluster-scoped resources
     * "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    com.google.protobuf.ByteString getNamespaceBytes();

    /**
     *
     *
     * <pre>
     * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string verb = 2;</code>
     */
    boolean hasVerb();
    /**
     *
     *
     * <pre>
     * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string verb = 2;</code>
     */
    java.lang.String getVerb();
    /**
     *
     *
     * <pre>
     * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string verb = 2;</code>
     */
    com.google.protobuf.ByteString getVerbBytes();

    /**
     *
     *
     * <pre>
     * Group is the API Group of the Resource.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string group = 3;</code>
     */
    boolean hasGroup();
    /**
     *
     *
     * <pre>
     * Group is the API Group of the Resource.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string group = 3;</code>
     */
    java.lang.String getGroup();
    /**
     *
     *
     * <pre>
     * Group is the API Group of the Resource.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string group = 3;</code>
     */
    com.google.protobuf.ByteString getGroupBytes();

    /**
     *
     *
     * <pre>
     * Version is the API Version of the Resource.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string version = 4;</code>
     */
    boolean hasVersion();
    /**
     *
     *
     * <pre>
     * Version is the API Version of the Resource.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string version = 4;</code>
     */
    java.lang.String getVersion();
    /**
     *
     *
     * <pre>
     * Version is the API Version of the Resource.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string version = 4;</code>
     */
    com.google.protobuf.ByteString getVersionBytes();

    /**
     *
     *
     * <pre>
     * Resource is one of the existing resource types.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string resource = 5;</code>
     */
    boolean hasResource();
    /**
     *
     *
     * <pre>
     * Resource is one of the existing resource types.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string resource = 5;</code>
     */
    java.lang.String getResource();
    /**
     *
     *
     * <pre>
     * Resource is one of the existing resource types.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string resource = 5;</code>
     */
    com.google.protobuf.ByteString getResourceBytes();

    /**
     *
     *
     * <pre>
     * Subresource is one of the existing resource types.  "" means none.
     * +optional
     * </pre>
     *
     * <code>optional string subresource = 6;</code>
     */
    boolean hasSubresource();
    /**
     *
     *
     * <pre>
     * Subresource is one of the existing resource types.  "" means none.
     * +optional
     * </pre>
     *
     * <code>optional string subresource = 6;</code>
     */
    java.lang.String getSubresource();
    /**
     *
     *
     * <pre>
     * Subresource is one of the existing resource types.  "" means none.
     * +optional
     * </pre>
     *
     * <code>optional string subresource = 6;</code>
     */
    com.google.protobuf.ByteString getSubresourceBytes();

    /**
     *
     *
     * <pre>
     * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
     * +optional
     * </pre>
     *
     * <code>optional string name = 7;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
     * +optional
     * </pre>
     *
     * <code>optional string name = 7;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
     * +optional
     * </pre>
     *
     * <code>optional string name = 7;</code>
     */
    com.google.protobuf.ByteString getNameBytes();
  }
  /**
   *
   *
   * <pre>
   * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authorization.v1beta1.ResourceAttributes}
   */
  public static final class ResourceAttributes extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.ResourceAttributes)
      ResourceAttributesOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ResourceAttributes.newBuilder() to construct.
    private ResourceAttributes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ResourceAttributes() {
      namespace_ = "";
      verb_ = "";
      group_ = "";
      version_ = "";
      resource_ = "";
      subresource_ = "";
      name_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ResourceAttributes(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                namespace_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                verb_ = bs;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                group_ = bs;
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000008;
                version_ = bs;
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000010;
                resource_ = bs;
                break;
              }
            case 50:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000020;
                subresource_ = bs;
                break;
              }
            case 58:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000040;
                name_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_ResourceAttributes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_ResourceAttributes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.class,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder.class);
    }

    private int bitField0_;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    private volatile java.lang.Object namespace_;
    /**
     *
     *
     * <pre>
     * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces
     * "" (empty) is defaulted for LocalSubjectAccessReviews
     * "" (empty) is empty for cluster-scoped resources
     * "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    public boolean hasNamespace() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces
     * "" (empty) is defaulted for LocalSubjectAccessReviews
     * "" (empty) is empty for cluster-scoped resources
     * "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          namespace_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces
     * "" (empty) is defaulted for LocalSubjectAccessReviews
     * "" (empty) is empty for cluster-scoped resources
     * "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    public com.google.protobuf.ByteString getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERB_FIELD_NUMBER = 2;
    private volatile java.lang.Object verb_;
    /**
     *
     *
     * <pre>
     * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string verb = 2;</code>
     */
    public boolean hasVerb() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string verb = 2;</code>
     */
    public java.lang.String getVerb() {
      java.lang.Object ref = verb_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          verb_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string verb = 2;</code>
     */
    public com.google.protobuf.ByteString getVerbBytes() {
      java.lang.Object ref = verb_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        verb_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GROUP_FIELD_NUMBER = 3;
    private volatile java.lang.Object group_;
    /**
     *
     *
     * <pre>
     * Group is the API Group of the Resource.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string group = 3;</code>
     */
    public boolean hasGroup() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Group is the API Group of the Resource.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string group = 3;</code>
     */
    public java.lang.String getGroup() {
      java.lang.Object ref = group_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          group_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Group is the API Group of the Resource.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string group = 3;</code>
     */
    public com.google.protobuf.ByteString getGroupBytes() {
      java.lang.Object ref = group_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        group_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERSION_FIELD_NUMBER = 4;
    private volatile java.lang.Object version_;
    /**
     *
     *
     * <pre>
     * Version is the API Version of the Resource.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string version = 4;</code>
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * Version is the API Version of the Resource.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string version = 4;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          version_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Version is the API Version of the Resource.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string version = 4;</code>
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RESOURCE_FIELD_NUMBER = 5;
    private volatile java.lang.Object resource_;
    /**
     *
     *
     * <pre>
     * Resource is one of the existing resource types.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string resource = 5;</code>
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * Resource is one of the existing resource types.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string resource = 5;</code>
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          resource_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource is one of the existing resource types.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>optional string resource = 5;</code>
     */
    public com.google.protobuf.ByteString getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SUBRESOURCE_FIELD_NUMBER = 6;
    private volatile java.lang.Object subresource_;
    /**
     *
     *
     * <pre>
     * Subresource is one of the existing resource types.  "" means none.
     * +optional
     * </pre>
     *
     * <code>optional string subresource = 6;</code>
     */
    public boolean hasSubresource() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     *
     *
     * <pre>
     * Subresource is one of the existing resource types.  "" means none.
     * +optional
     * </pre>
     *
     * <code>optional string subresource = 6;</code>
     */
    public java.lang.String getSubresource() {
      java.lang.Object ref = subresource_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          subresource_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Subresource is one of the existing resource types.  "" means none.
     * +optional
     * </pre>
     *
     * <code>optional string subresource = 6;</code>
     */
    public com.google.protobuf.ByteString getSubresourceBytes() {
      java.lang.Object ref = subresource_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subresource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 7;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
     * +optional
     * </pre>
     *
     * <code>optional string name = 7;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     *
     *
     * <pre>
     * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
     * +optional
     * </pre>
     *
     * <code>optional string name = 7;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
     * +optional
     * </pre>
     *
     * <code>optional string name = 7;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namespace_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, verb_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, group_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, version_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, resource_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, subresource_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, name_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, namespace_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, verb_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, group_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, version_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, resource_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, subresource_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, name_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes other =
          (io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes) obj;

      boolean result = true;
      result = result && (hasNamespace() == other.hasNamespace());
      if (hasNamespace()) {
        result = result && getNamespace().equals(other.getNamespace());
      }
      result = result && (hasVerb() == other.hasVerb());
      if (hasVerb()) {
        result = result && getVerb().equals(other.getVerb());
      }
      result = result && (hasGroup() == other.hasGroup());
      if (hasGroup()) {
        result = result && getGroup().equals(other.getGroup());
      }
      result = result && (hasVersion() == other.hasVersion());
      if (hasVersion()) {
        result = result && getVersion().equals(other.getVersion());
      }
      result = result && (hasResource() == other.hasResource());
      if (hasResource()) {
        result = result && getResource().equals(other.getResource());
      }
      result = result && (hasSubresource() == other.hasSubresource());
      if (hasSubresource()) {
        result = result && getSubresource().equals(other.getSubresource());
      }
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasNamespace()) {
        hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
        hash = (53 * hash) + getNamespace().hashCode();
      }
      if (hasVerb()) {
        hash = (37 * hash) + VERB_FIELD_NUMBER;
        hash = (53 * hash) + getVerb().hashCode();
      }
      if (hasGroup()) {
        hash = (37 * hash) + GROUP_FIELD_NUMBER;
        hash = (53 * hash) + getGroup().hashCode();
      }
      if (hasVersion()) {
        hash = (37 * hash) + VERSION_FIELD_NUMBER;
        hash = (53 * hash) + getVersion().hashCode();
      }
      if (hasResource()) {
        hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getResource().hashCode();
      }
      if (hasSubresource()) {
        hash = (37 * hash) + SUBRESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getSubresource().hashCode();
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authorization.v1beta1.ResourceAttributes}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.ResourceAttributes)
        io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_ResourceAttributes_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_ResourceAttributes_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.class,
                io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        namespace_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        verb_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        group_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        version_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        resource_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        subresource_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_ResourceAttributes_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes build() {
        io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes result =
            new io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.namespace_ = namespace_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.verb_ = verb_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.group_ = group_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.version_ = version_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.resource_ = resource_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.subresource_ = subresource_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.name_ = name_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
                .getDefaultInstance()) return this;
        if (other.hasNamespace()) {
          bitField0_ |= 0x00000001;
          namespace_ = other.namespace_;
          onChanged();
        }
        if (other.hasVerb()) {
          bitField0_ |= 0x00000002;
          verb_ = other.verb_;
          onChanged();
        }
        if (other.hasGroup()) {
          bitField0_ |= 0x00000004;
          group_ = other.group_;
          onChanged();
        }
        if (other.hasVersion()) {
          bitField0_ |= 0x00000008;
          version_ = other.version_;
          onChanged();
        }
        if (other.hasResource()) {
          bitField0_ |= 0x00000010;
          resource_ = other.resource_;
          onChanged();
        }
        if (other.hasSubresource()) {
          bitField0_ |= 0x00000020;
          subresource_ = other.subresource_;
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000040;
          name_ = other.name_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object namespace_ = "";
      /**
       *
       *
       * <pre>
       * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces
       * "" (empty) is defaulted for LocalSubjectAccessReviews
       * "" (empty) is empty for cluster-scoped resources
       * "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public boolean hasNamespace() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces
       * "" (empty) is defaulted for LocalSubjectAccessReviews
       * "" (empty) is empty for cluster-scoped resources
       * "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public java.lang.String getNamespace() {
        java.lang.Object ref = namespace_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            namespace_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces
       * "" (empty) is defaulted for LocalSubjectAccessReviews
       * "" (empty) is empty for cluster-scoped resources
       * "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public com.google.protobuf.ByteString getNamespaceBytes() {
        java.lang.Object ref = namespace_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          namespace_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces
       * "" (empty) is defaulted for LocalSubjectAccessReviews
       * "" (empty) is empty for cluster-scoped resources
       * "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public Builder setNamespace(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        namespace_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces
       * "" (empty) is defaulted for LocalSubjectAccessReviews
       * "" (empty) is empty for cluster-scoped resources
       * "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public Builder clearNamespace() {
        bitField0_ = (bitField0_ & ~0x00000001);
        namespace_ = getDefaultInstance().getNamespace();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces
       * "" (empty) is defaulted for LocalSubjectAccessReviews
       * "" (empty) is empty for cluster-scoped resources
       * "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public Builder setNamespaceBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        namespace_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object verb_ = "";
      /**
       *
       *
       * <pre>
       * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string verb = 2;</code>
       */
      public boolean hasVerb() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string verb = 2;</code>
       */
      public java.lang.String getVerb() {
        java.lang.Object ref = verb_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            verb_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string verb = 2;</code>
       */
      public com.google.protobuf.ByteString getVerbBytes() {
        java.lang.Object ref = verb_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          verb_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string verb = 2;</code>
       */
      public Builder setVerb(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        verb_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string verb = 2;</code>
       */
      public Builder clearVerb() {
        bitField0_ = (bitField0_ & ~0x00000002);
        verb_ = getDefaultInstance().getVerb();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string verb = 2;</code>
       */
      public Builder setVerbBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        verb_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object group_ = "";
      /**
       *
       *
       * <pre>
       * Group is the API Group of the Resource.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string group = 3;</code>
       */
      public boolean hasGroup() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Group is the API Group of the Resource.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string group = 3;</code>
       */
      public java.lang.String getGroup() {
        java.lang.Object ref = group_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            group_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Group is the API Group of the Resource.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string group = 3;</code>
       */
      public com.google.protobuf.ByteString getGroupBytes() {
        java.lang.Object ref = group_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          group_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Group is the API Group of the Resource.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string group = 3;</code>
       */
      public Builder setGroup(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        group_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Group is the API Group of the Resource.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string group = 3;</code>
       */
      public Builder clearGroup() {
        bitField0_ = (bitField0_ & ~0x00000004);
        group_ = getDefaultInstance().getGroup();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Group is the API Group of the Resource.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string group = 3;</code>
       */
      public Builder setGroupBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        group_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object version_ = "";
      /**
       *
       *
       * <pre>
       * Version is the API Version of the Resource.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string version = 4;</code>
       */
      public boolean hasVersion() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * Version is the API Version of the Resource.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string version = 4;</code>
       */
      public java.lang.String getVersion() {
        java.lang.Object ref = version_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            version_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Version is the API Version of the Resource.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string version = 4;</code>
       */
      public com.google.protobuf.ByteString getVersionBytes() {
        java.lang.Object ref = version_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          version_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Version is the API Version of the Resource.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string version = 4;</code>
       */
      public Builder setVersion(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        version_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Version is the API Version of the Resource.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string version = 4;</code>
       */
      public Builder clearVersion() {
        bitField0_ = (bitField0_ & ~0x00000008);
        version_ = getDefaultInstance().getVersion();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Version is the API Version of the Resource.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string version = 4;</code>
       */
      public Builder setVersionBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        version_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object resource_ = "";
      /**
       *
       *
       * <pre>
       * Resource is one of the existing resource types.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string resource = 5;</code>
       */
      public boolean hasResource() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * Resource is one of the existing resource types.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string resource = 5;</code>
       */
      public java.lang.String getResource() {
        java.lang.Object ref = resource_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            resource_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Resource is one of the existing resource types.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string resource = 5;</code>
       */
      public com.google.protobuf.ByteString getResourceBytes() {
        java.lang.Object ref = resource_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          resource_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Resource is one of the existing resource types.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string resource = 5;</code>
       */
      public Builder setResource(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        resource_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resource is one of the existing resource types.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string resource = 5;</code>
       */
      public Builder clearResource() {
        bitField0_ = (bitField0_ & ~0x00000010);
        resource_ = getDefaultInstance().getResource();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resource is one of the existing resource types.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>optional string resource = 5;</code>
       */
      public Builder setResourceBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        resource_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object subresource_ = "";
      /**
       *
       *
       * <pre>
       * Subresource is one of the existing resource types.  "" means none.
       * +optional
       * </pre>
       *
       * <code>optional string subresource = 6;</code>
       */
      public boolean hasSubresource() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * Subresource is one of the existing resource types.  "" means none.
       * +optional
       * </pre>
       *
       * <code>optional string subresource = 6;</code>
       */
      public java.lang.String getSubresource() {
        java.lang.Object ref = subresource_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            subresource_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Subresource is one of the existing resource types.  "" means none.
       * +optional
       * </pre>
       *
       * <code>optional string subresource = 6;</code>
       */
      public com.google.protobuf.ByteString getSubresourceBytes() {
        java.lang.Object ref = subresource_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          subresource_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Subresource is one of the existing resource types.  "" means none.
       * +optional
       * </pre>
       *
       * <code>optional string subresource = 6;</code>
       */
      public Builder setSubresource(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        subresource_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subresource is one of the existing resource types.  "" means none.
       * +optional
       * </pre>
       *
       * <code>optional string subresource = 6;</code>
       */
      public Builder clearSubresource() {
        bitField0_ = (bitField0_ & ~0x00000020);
        subresource_ = getDefaultInstance().getSubresource();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subresource is one of the existing resource types.  "" means none.
       * +optional
       * </pre>
       *
       * <code>optional string subresource = 6;</code>
       */
      public Builder setSubresourceBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        subresource_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
       * +optional
       * </pre>
       *
       * <code>optional string name = 7;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
       * +optional
       * </pre>
       *
       * <code>optional string name = 7;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
       * +optional
       * </pre>
       *
       * <code>optional string name = 7;</code>
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
       * +optional
       * </pre>
       *
       * <code>optional string name = 7;</code>
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000040;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
       * +optional
       * </pre>
       *
       * <code>optional string name = 7;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000040);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
       * +optional
       * </pre>
       *
       * <code>optional string name = 7;</code>
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000040;
        name_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.ResourceAttributes)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.ResourceAttributes)
    private static final io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ResourceAttributes> PARSER =
        new com.google.protobuf.AbstractParser<ResourceAttributes>() {
          @java.lang.Override
          public ResourceAttributes parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ResourceAttributes(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ResourceAttributes> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResourceAttributes> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ResourceRuleOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.ResourceRule)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    java.util.List<java.lang.String> getVerbsList();
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    int getVerbsCount();
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    java.lang.String getVerbs(int index);
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    com.google.protobuf.ByteString getVerbsBytes(int index);

    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    java.util.List<java.lang.String> getApiGroupsList();
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    int getApiGroupsCount();
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    java.lang.String getApiGroups(int index);
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    com.google.protobuf.ByteString getApiGroupsBytes(int index);

    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
     *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    java.util.List<java.lang.String> getResourcesList();
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
     *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    int getResourcesCount();
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
     *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    java.lang.String getResources(int index);
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
     *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    com.google.protobuf.ByteString getResourcesBytes(int index);

    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    java.util.List<java.lang.String> getResourceNamesList();
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    int getResourceNamesCount();
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    java.lang.String getResourceNames(int index);
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    com.google.protobuf.ByteString getResourceNamesBytes(int index);
  }
  /**
   *
   *
   * <pre>
   * ResourceRule is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant,
   * may contain duplicates, and possibly be incomplete.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authorization.v1beta1.ResourceRule}
   */
  public static final class ResourceRule extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.ResourceRule)
      ResourceRuleOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ResourceRule.newBuilder() to construct.
    private ResourceRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ResourceRule() {
      verbs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      apiGroups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      resources_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      resourceNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ResourceRule(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  verbs_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000001;
                }
                verbs_.add(bs);
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  apiGroups_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000002;
                }
                apiGroups_.add(bs);
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  resources_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000004;
                }
                resources_.add(bs);
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                  resourceNames_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000008;
                }
                resourceNames_.add(bs);
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          verbs_ = verbs_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          apiGroups_ = apiGroups_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          resources_ = resources_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          resourceNames_ = resourceNames_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_ResourceRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_ResourceRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.class,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.Builder.class);
    }

    public static final int VERBS_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList verbs_;
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList getVerbsList() {
      return verbs_;
    }
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    public int getVerbsCount() {
      return verbs_.size();
    }
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    public java.lang.String getVerbs(int index) {
      return verbs_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    public com.google.protobuf.ByteString getVerbsBytes(int index) {
      return verbs_.getByteString(index);
    }

    public static final int APIGROUPS_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList apiGroups_;
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList getApiGroupsList() {
      return apiGroups_;
    }
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    public int getApiGroupsCount() {
      return apiGroups_.size();
    }
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    public java.lang.String getApiGroups(int index) {
      return apiGroups_.get(index);
    }
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    public com.google.protobuf.ByteString getApiGroupsBytes(int index) {
      return apiGroups_.getByteString(index);
    }

    public static final int RESOURCES_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList resources_;
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
     *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList getResourcesList() {
      return resources_;
    }
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
     *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    public int getResourcesCount() {
      return resources_.size();
    }
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
     *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    public java.lang.String getResources(int index) {
      return resources_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
     *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    public com.google.protobuf.ByteString getResourcesBytes(int index) {
      return resources_.getByteString(index);
    }

    public static final int RESOURCENAMES_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList resourceNames_;
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList getResourceNamesList() {
      return resourceNames_;
    }
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    public int getResourceNamesCount() {
      return resourceNames_.size();
    }
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    public java.lang.String getResourceNames(int index) {
      return resourceNames_.get(index);
    }
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    public com.google.protobuf.ByteString getResourceNamesBytes(int index) {
      return resourceNames_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      for (int i = 0; i < verbs_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, verbs_.getRaw(i));
      }
      for (int i = 0; i < apiGroups_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, apiGroups_.getRaw(i));
      }
      for (int i = 0; i < resources_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resources_.getRaw(i));
      }
      for (int i = 0; i < resourceNames_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, resourceNames_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < verbs_.size(); i++) {
          dataSize += computeStringSizeNoTag(verbs_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getVerbsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < apiGroups_.size(); i++) {
          dataSize += computeStringSizeNoTag(apiGroups_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getApiGroupsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < resources_.size(); i++) {
          dataSize += computeStringSizeNoTag(resources_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getResourcesList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < resourceNames_.size(); i++) {
          dataSize += computeStringSizeNoTag(resourceNames_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getResourceNamesList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Authorization.ResourceRule)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.ResourceRule other =
          (io.kubernetes.client.proto.V1beta1Authorization.ResourceRule) obj;

      boolean result = true;
      result = result && getVerbsList().equals(other.getVerbsList());
      result = result && getApiGroupsList().equals(other.getApiGroupsList());
      result = result && getResourcesList().equals(other.getResourcesList());
      result = result && getResourceNamesList().equals(other.getResourceNamesList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getVerbsCount() > 0) {
        hash = (37 * hash) + VERBS_FIELD_NUMBER;
        hash = (53 * hash) + getVerbsList().hashCode();
      }
      if (getApiGroupsCount() > 0) {
        hash = (37 * hash) + APIGROUPS_FIELD_NUMBER;
        hash = (53 * hash) + getApiGroupsList().hashCode();
      }
      if (getResourcesCount() > 0) {
        hash = (37 * hash) + RESOURCES_FIELD_NUMBER;
        hash = (53 * hash) + getResourcesList().hashCode();
      }
      if (getResourceNamesCount() > 0) {
        hash = (37 * hash) + RESOURCENAMES_FIELD_NUMBER;
        hash = (53 * hash) + getResourceNamesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceRule parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceRule parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceRule parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceRule parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceRule parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceRule parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceRule parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceRule parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceRule parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceRule parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceRule parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceRule parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.ResourceRule prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ResourceRule is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant,
     * may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authorization.v1beta1.ResourceRule}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.ResourceRule)
        io.kubernetes.client.proto.V1beta1Authorization.ResourceRuleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_ResourceRule_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_ResourceRule_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.class,
                io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        verbs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        apiGroups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        resources_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        resourceNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_ResourceRule_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceRule
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceRule build() {
        io.kubernetes.client.proto.V1beta1Authorization.ResourceRule result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceRule buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.ResourceRule result =
            new io.kubernetes.client.proto.V1beta1Authorization.ResourceRule(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          verbs_ = verbs_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.verbs_ = verbs_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          apiGroups_ = apiGroups_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.apiGroups_ = apiGroups_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          resources_ = resources_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.resources_ = resources_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          resourceNames_ = resourceNames_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.resourceNames_ = resourceNames_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1beta1Authorization.ResourceRule) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Authorization.ResourceRule) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Authorization.ResourceRule other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.getDefaultInstance())
          return this;
        if (!other.verbs_.isEmpty()) {
          if (verbs_.isEmpty()) {
            verbs_ = other.verbs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVerbsIsMutable();
            verbs_.addAll(other.verbs_);
          }
          onChanged();
        }
        if (!other.apiGroups_.isEmpty()) {
          if (apiGroups_.isEmpty()) {
            apiGroups_ = other.apiGroups_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureApiGroupsIsMutable();
            apiGroups_.addAll(other.apiGroups_);
          }
          onChanged();
        }
        if (!other.resources_.isEmpty()) {
          if (resources_.isEmpty()) {
            resources_ = other.resources_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureResourcesIsMutable();
            resources_.addAll(other.resources_);
          }
          onChanged();
        }
        if (!other.resourceNames_.isEmpty()) {
          if (resourceNames_.isEmpty()) {
            resourceNames_ = other.resourceNames_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureResourceNamesIsMutable();
            resourceNames_.addAll(other.resourceNames_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.ResourceRule parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.ResourceRule)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private com.google.protobuf.LazyStringList verbs_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureVerbsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          verbs_ = new com.google.protobuf.LazyStringArrayList(verbs_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public com.google.protobuf.ProtocolStringList getVerbsList() {
        return verbs_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public int getVerbsCount() {
        return verbs_.size();
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public java.lang.String getVerbs(int index) {
        return verbs_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public com.google.protobuf.ByteString getVerbsBytes(int index) {
        return verbs_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder setVerbs(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerbsIsMutable();
        verbs_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder addVerbs(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerbsIsMutable();
        verbs_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder addAllVerbs(java.lang.Iterable<java.lang.String> values) {
        ensureVerbsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, verbs_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder clearVerbs() {
        verbs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder addVerbsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerbsIsMutable();
        verbs_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList apiGroups_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureApiGroupsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          apiGroups_ = new com.google.protobuf.LazyStringArrayList(apiGroups_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public com.google.protobuf.ProtocolStringList getApiGroupsList() {
        return apiGroups_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public int getApiGroupsCount() {
        return apiGroups_.size();
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public java.lang.String getApiGroups(int index) {
        return apiGroups_.get(index);
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public com.google.protobuf.ByteString getApiGroupsBytes(int index) {
        return apiGroups_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public Builder setApiGroups(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiGroupsIsMutable();
        apiGroups_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public Builder addApiGroups(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiGroupsIsMutable();
        apiGroups_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public Builder addAllApiGroups(java.lang.Iterable<java.lang.String> values) {
        ensureApiGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, apiGroups_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public Builder clearApiGroups() {
        apiGroups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public Builder addApiGroupsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiGroupsIsMutable();
        apiGroups_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList resources_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureResourcesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          resources_ = new com.google.protobuf.LazyStringArrayList(resources_);
          bitField0_ |= 0x00000004;
        }
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
       *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public com.google.protobuf.ProtocolStringList getResourcesList() {
        return resources_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
       *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public int getResourcesCount() {
        return resources_.size();
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
       *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public java.lang.String getResources(int index) {
        return resources_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
       *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public com.google.protobuf.ByteString getResourcesBytes(int index) {
        return resources_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
       *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder setResources(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourcesIsMutable();
        resources_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
       *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder addResources(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourcesIsMutable();
        resources_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
       *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder addAllResources(java.lang.Iterable<java.lang.String> values) {
        ensureResourcesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, resources_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
       *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder clearResources() {
        resources_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
       *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder addResourcesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourcesIsMutable();
        resources_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList resourceNames_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureResourceNamesIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          resourceNames_ = new com.google.protobuf.LazyStringArrayList(resourceNames_);
          bitField0_ |= 0x00000008;
        }
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public com.google.protobuf.ProtocolStringList getResourceNamesList() {
        return resourceNames_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public int getResourceNamesCount() {
        return resourceNames_.size();
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public java.lang.String getResourceNames(int index) {
        return resourceNames_.get(index);
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public com.google.protobuf.ByteString getResourceNamesBytes(int index) {
        return resourceNames_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public Builder setResourceNames(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceNamesIsMutable();
        resourceNames_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public Builder addResourceNames(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceNamesIsMutable();
        resourceNames_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public Builder addAllResourceNames(java.lang.Iterable<java.lang.String> values) {
        ensureResourceNamesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, resourceNames_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public Builder clearResourceNames() {
        resourceNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public Builder addResourceNamesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceNamesIsMutable();
        resourceNames_.add(value);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.ResourceRule)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.ResourceRule)
    private static final io.kubernetes.client.proto.V1beta1Authorization.ResourceRule
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Authorization.ResourceRule();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.ResourceRule
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ResourceRule> PARSER =
        new com.google.protobuf.AbstractParser<ResourceRule>() {
          @java.lang.Override
          public ResourceRule parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ResourceRule(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ResourceRule> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResourceRule> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.ResourceRule
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface SelfSubjectAccessReviewOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.SelfSubjectAccessReview)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.  user and groups must be empty
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
     * </code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.  user and groups must be empty
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec getSpec();
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.  user and groups must be empty
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpecOrBuilder
        getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus getStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder
        getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not filling in a
   * spec.namespace means "in all namespaces".  Self is a special case, because users should always be able
   * to check whether they can perform an action
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authorization.v1beta1.SelfSubjectAccessReview}
   */
  public static final class SelfSubjectAccessReview extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.SelfSubjectAccessReview)
      SelfSubjectAccessReviewOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use SelfSubjectAccessReview.newBuilder() to construct.
    private SelfSubjectAccessReview(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private SelfSubjectAccessReview() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private SelfSubjectAccessReview(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReview_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReview_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview.class,
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview.Builder
                  .class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec spec_;
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.  user and groups must be empty
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
     * </code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.  user and groups must be empty
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
              .getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.  user and groups must be empty
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpecOrBuilder
        getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
              .getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus status_;
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
              .getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
              .getDefaultInstance()
          : status_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getStatus());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStatus());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj
          instanceof io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview other =
          (io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not filling in a
     * spec.namespace means "in all namespaces".  Self is a special case, because users should always be able
     * to check whether they can perform an action
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authorization.v1beta1.SelfSubjectAccessReview}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.SelfSubjectAccessReview)
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReview_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReview_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview.class,
                io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
          getStatusFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReview_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview build() {
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview result =
            new io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview
                .getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec spec_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec,
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  user and groups must be empty
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  user and groups must be empty
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
                  .getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  user and groups must be empty
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  user and groups must be empty
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec.Builder
              builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  user and groups must be empty
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public Builder mergeSpec(
          io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
                    .newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  user and groups must be empty
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  user and groups must be empty
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec.Builder
          getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  user and groups must be empty
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpecOrBuilder
          getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
                  .getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.  user and groups must be empty
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec spec = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec,
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec,
                  io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
                      .Builder,
                  io.kubernetes.client.proto.V1beta1Authorization
                      .SelfSubjectAccessReviewSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus status_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                  .getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder
              builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                    .newBuilder(status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                  .getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus,
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder,
                  io.kubernetes.client.proto.V1beta1Authorization
                      .SubjectAccessReviewStatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.SelfSubjectAccessReview)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.SelfSubjectAccessReview)
    private static final io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<SelfSubjectAccessReview> PARSER =
        new com.google.protobuf.AbstractParser<SelfSubjectAccessReview>() {
          @java.lang.Override
          public SelfSubjectAccessReview parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new SelfSubjectAccessReview(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<SelfSubjectAccessReview> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SelfSubjectAccessReview> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReview
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface SelfSubjectAccessReviewSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * ResourceAuthorizationAttributes describes information for a resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
     * </code>
     */
    boolean hasResourceAttributes();
    /**
     *
     *
     * <pre>
     * ResourceAuthorizationAttributes describes information for a resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes getResourceAttributes();
    /**
     *
     *
     * <pre>
     * ResourceAuthorizationAttributes describes information for a resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributesOrBuilder
        getResourceAttributesOrBuilder();

    /**
     *
     *
     * <pre>
     * NonResourceAttributes describes information for a non-resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
     * </code>
     */
    boolean hasNonResourceAttributes();
    /**
     *
     *
     * <pre>
     * NonResourceAttributes describes information for a non-resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
        getNonResourceAttributes();
    /**
     *
     *
     * <pre>
     * NonResourceAttributes describes information for a non-resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributesOrBuilder
        getNonResourceAttributesOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes
   * and NonResourceAuthorizationAttributes must be set
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec}
   */
  public static final class SelfSubjectAccessReviewSpec
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec)
      SelfSubjectAccessReviewSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use SelfSubjectAccessReviewSpec.newBuilder() to construct.
    private SelfSubjectAccessReviewSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private SelfSubjectAccessReviewSpec() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private SelfSubjectAccessReviewSpec(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = resourceAttributes_.toBuilder();
                }
                resourceAttributes_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(resourceAttributes_);
                  resourceAttributes_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = nonResourceAttributes_.toBuilder();
                }
                nonResourceAttributes_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(nonResourceAttributes_);
                  nonResourceAttributes_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReviewSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReviewSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec.class,
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec.Builder
                  .class);
    }

    private int bitField0_;
    public static final int RESOURCEATTRIBUTES_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes resourceAttributes_;
    /**
     *
     *
     * <pre>
     * ResourceAuthorizationAttributes describes information for a resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
     * </code>
     */
    public boolean hasResourceAttributes() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * ResourceAuthorizationAttributes describes information for a resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
        getResourceAttributes() {
      return resourceAttributes_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.getDefaultInstance()
          : resourceAttributes_;
    }
    /**
     *
     *
     * <pre>
     * ResourceAuthorizationAttributes describes information for a resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributesOrBuilder
        getResourceAttributesOrBuilder() {
      return resourceAttributes_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.getDefaultInstance()
          : resourceAttributes_;
    }

    public static final int NONRESOURCEATTRIBUTES_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
        nonResourceAttributes_;
    /**
     *
     *
     * <pre>
     * NonResourceAttributes describes information for a non-resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
     * </code>
     */
    public boolean hasNonResourceAttributes() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * NonResourceAttributes describes information for a non-resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
        getNonResourceAttributes() {
      return nonResourceAttributes_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
              .getDefaultInstance()
          : nonResourceAttributes_;
    }
    /**
     *
     *
     * <pre>
     * NonResourceAttributes describes information for a non-resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributesOrBuilder
        getNonResourceAttributesOrBuilder() {
      return nonResourceAttributes_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
              .getDefaultInstance()
          : nonResourceAttributes_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getResourceAttributes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getNonResourceAttributes());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(1, getResourceAttributes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(2, getNonResourceAttributes());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj
          instanceof io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec other =
          (io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec) obj;

      boolean result = true;
      result = result && (hasResourceAttributes() == other.hasResourceAttributes());
      if (hasResourceAttributes()) {
        result = result && getResourceAttributes().equals(other.getResourceAttributes());
      }
      result = result && (hasNonResourceAttributes() == other.hasNonResourceAttributes());
      if (hasNonResourceAttributes()) {
        result = result && getNonResourceAttributes().equals(other.getNonResourceAttributes());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasResourceAttributes()) {
        hash = (37 * hash) + RESOURCEATTRIBUTES_FIELD_NUMBER;
        hash = (53 * hash) + getResourceAttributes().hashCode();
      }
      if (hasNonResourceAttributes()) {
        hash = (37 * hash) + NONRESOURCEATTRIBUTES_FIELD_NUMBER;
        hash = (53 * hash) + getNonResourceAttributes().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes
     * and NonResourceAuthorizationAttributes must be set
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec)
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReviewSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReviewSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec.class,
                io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getResourceAttributesFieldBuilder();
          getNonResourceAttributesFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (resourceAttributesBuilder_ == null) {
          resourceAttributes_ = null;
        } else {
          resourceAttributesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (nonResourceAttributesBuilder_ == null) {
          nonResourceAttributes_ = null;
        } else {
          nonResourceAttributesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReviewSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec build() {
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec result =
            new io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (resourceAttributesBuilder_ == null) {
          result.resourceAttributes_ = resourceAttributes_;
        } else {
          result.resourceAttributes_ = resourceAttributesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (nonResourceAttributesBuilder_ == null) {
          result.nonResourceAttributes_ = nonResourceAttributes_;
        } else {
          result.nonResourceAttributes_ = nonResourceAttributesBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
                .getDefaultInstance()) return this;
        if (other.hasResourceAttributes()) {
          mergeResourceAttributes(other.getResourceAttributes());
        }
        if (other.hasNonResourceAttributes()) {
          mergeNonResourceAttributes(other.getNonResourceAttributes());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
          resourceAttributes_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributesOrBuilder>
          resourceAttributesBuilder_;
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public boolean hasResourceAttributes() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
          getResourceAttributes() {
        if (resourceAttributesBuilder_ == null) {
          return resourceAttributes_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
                  .getDefaultInstance()
              : resourceAttributes_;
        } else {
          return resourceAttributesBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public Builder setResourceAttributes(
          io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes value) {
        if (resourceAttributesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resourceAttributes_ = value;
          onChanged();
        } else {
          resourceAttributesBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public Builder setResourceAttributes(
          io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder
              builderForValue) {
        if (resourceAttributesBuilder_ == null) {
          resourceAttributes_ = builderForValue.build();
          onChanged();
        } else {
          resourceAttributesBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public Builder mergeResourceAttributes(
          io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes value) {
        if (resourceAttributesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && resourceAttributes_ != null
              && resourceAttributes_
                  != io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
                      .getDefaultInstance()) {
            resourceAttributes_ =
                io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.newBuilder(
                        resourceAttributes_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            resourceAttributes_ = value;
          }
          onChanged();
        } else {
          resourceAttributesBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public Builder clearResourceAttributes() {
        if (resourceAttributesBuilder_ == null) {
          resourceAttributes_ = null;
          onChanged();
        } else {
          resourceAttributesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder
          getResourceAttributesBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getResourceAttributesFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributesOrBuilder
          getResourceAttributesOrBuilder() {
        if (resourceAttributesBuilder_ != null) {
          return resourceAttributesBuilder_.getMessageOrBuilder();
        } else {
          return resourceAttributes_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
                  .getDefaultInstance()
              : resourceAttributes_;
        }
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributesOrBuilder>
          getResourceAttributesFieldBuilder() {
        if (resourceAttributesBuilder_ == null) {
          resourceAttributesBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes,
                  io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder,
                  io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributesOrBuilder>(
                  getResourceAttributes(), getParentForChildren(), isClean());
          resourceAttributes_ = null;
        }
        return resourceAttributesBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
          nonResourceAttributes_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributesOrBuilder>
          nonResourceAttributesBuilder_;
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public boolean hasNonResourceAttributes() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
          getNonResourceAttributes() {
        if (nonResourceAttributesBuilder_ == null) {
          return nonResourceAttributes_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
                  .getDefaultInstance()
              : nonResourceAttributes_;
        } else {
          return nonResourceAttributesBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public Builder setNonResourceAttributes(
          io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes value) {
        if (nonResourceAttributesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          nonResourceAttributes_ = value;
          onChanged();
        } else {
          nonResourceAttributesBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public Builder setNonResourceAttributes(
          io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder
              builderForValue) {
        if (nonResourceAttributesBuilder_ == null) {
          nonResourceAttributes_ = builderForValue.build();
          onChanged();
        } else {
          nonResourceAttributesBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public Builder mergeNonResourceAttributes(
          io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes value) {
        if (nonResourceAttributesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && nonResourceAttributes_ != null
              && nonResourceAttributes_
                  != io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
                      .getDefaultInstance()) {
            nonResourceAttributes_ =
                io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.newBuilder(
                        nonResourceAttributes_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            nonResourceAttributes_ = value;
          }
          onChanged();
        } else {
          nonResourceAttributesBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public Builder clearNonResourceAttributes() {
        if (nonResourceAttributesBuilder_ == null) {
          nonResourceAttributes_ = null;
          onChanged();
        } else {
          nonResourceAttributesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder
          getNonResourceAttributesBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getNonResourceAttributesFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributesOrBuilder
          getNonResourceAttributesOrBuilder() {
        if (nonResourceAttributesBuilder_ != null) {
          return nonResourceAttributesBuilder_.getMessageOrBuilder();
        } else {
          return nonResourceAttributes_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
                  .getDefaultInstance()
              : nonResourceAttributes_;
        }
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributesOrBuilder>
          getNonResourceAttributesFieldBuilder() {
        if (nonResourceAttributesBuilder_ == null) {
          nonResourceAttributesBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes,
                  io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder,
                  io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributesOrBuilder>(
                  getNonResourceAttributes(), getParentForChildren(), isClean());
          nonResourceAttributes_ = null;
        }
        return nonResourceAttributesBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.SelfSubjectAccessReviewSpec)
    private static final io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<SelfSubjectAccessReviewSpec> PARSER =
        new com.google.protobuf.AbstractParser<SelfSubjectAccessReviewSpec>() {
          @java.lang.Override
          public SelfSubjectAccessReviewSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new SelfSubjectAccessReviewSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<SelfSubjectAccessReviewSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SelfSubjectAccessReviewSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectAccessReviewSpec
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface SelfSubjectRulesReviewOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.SelfSubjectRulesReview)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
     * </code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec getSpec();
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpecOrBuilder
        getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates the set of actions a user can perform.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
     * </code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates the set of actions a user can perform.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus getStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates the set of actions a user can perform.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatusOrBuilder
        getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * SelfSubjectRulesReview enumerates the set of actions the current user can perform within a namespace.
   * The returned list of actions may be incomplete depending on the server's authorization mode,
   * and any errors experienced during the evaluation. SelfSubjectRulesReview should be used by UIs to show/hide actions,
   * or to quickly let an end user reason about their permissions. It should NOT Be used by external systems to
   * drive authorization decisions as this raises confused deputy, cache lifetime/revocation, and correctness concerns.
   * SubjectAccessReview, and LocalAccessReview are the correct way to defer authorization decisions to the API server.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authorization.v1beta1.SelfSubjectRulesReview}
   */
  public static final class SelfSubjectRulesReview extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.SelfSubjectRulesReview)
      SelfSubjectRulesReviewOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use SelfSubjectRulesReview.newBuilder() to construct.
    private SelfSubjectRulesReview(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private SelfSubjectRulesReview() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private SelfSubjectRulesReview(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReview_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReview_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview.class,
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec spec_;
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
     * </code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
              .getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated.
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpecOrBuilder
        getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
              .getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus status_;
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates the set of actions a user can perform.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
     * </code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates the set of actions a user can perform.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
              .getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates the set of actions a user can perform.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
              .getDefaultInstance()
          : status_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getStatus());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStatus());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj
          instanceof io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview other =
          (io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * SelfSubjectRulesReview enumerates the set of actions the current user can perform within a namespace.
     * The returned list of actions may be incomplete depending on the server's authorization mode,
     * and any errors experienced during the evaluation. SelfSubjectRulesReview should be used by UIs to show/hide actions,
     * or to quickly let an end user reason about their permissions. It should NOT Be used by external systems to
     * drive authorization decisions as this raises confused deputy, cache lifetime/revocation, and correctness concerns.
     * SubjectAccessReview, and LocalAccessReview are the correct way to defer authorization decisions to the API server.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authorization.v1beta1.SelfSubjectRulesReview}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.SelfSubjectRulesReview)
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReview_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReview_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview.class,
                io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
          getStatusFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReview_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview build() {
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview result =
            new io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview
                .getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec spec_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec,
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
       * </code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
                  .getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec.Builder
              builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
       * </code>
       */
      public Builder mergeSpec(
          io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
                    .newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
       * </code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec.Builder
          getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpecOrBuilder
          getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
                  .getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated.
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec spec = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec,
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec,
                  io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
                      .Builder,
                  io.kubernetes.client.proto.V1beta1Authorization
                      .SelfSubjectRulesReviewSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus status_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates the set of actions a user can perform.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
       * </code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates the set of actions a user can perform.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
                  .getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates the set of actions a user can perform.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates the set of actions a user can perform.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus.Builder
              builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates the set of actions a user can perform.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
       * </code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus.newBuilder(
                        status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates the set of actions a user can perform.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
       * </code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates the set of actions a user can perform.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates the set of actions a user can perform.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
                  .getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates the set of actions a user can perform.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus status = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus,
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus.Builder,
                  io.kubernetes.client.proto.V1beta1Authorization
                      .SubjectRulesReviewStatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.SelfSubjectRulesReview)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.SelfSubjectRulesReview)
    private static final io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<SelfSubjectRulesReview> PARSER =
        new com.google.protobuf.AbstractParser<SelfSubjectRulesReview>() {
          @java.lang.Override
          public SelfSubjectRulesReview parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new SelfSubjectRulesReview(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<SelfSubjectRulesReview> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SelfSubjectRulesReview> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReview
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface SelfSubjectRulesReviewSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Namespace to evaluate rules for. Required.
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    boolean hasNamespace();
    /**
     *
     *
     * <pre>
     * Namespace to evaluate rules for. Required.
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    java.lang.String getNamespace();
    /**
     *
     *
     * <pre>
     * Namespace to evaluate rules for. Required.
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    com.google.protobuf.ByteString getNamespaceBytes();
  }
  /** Protobuf type {@code k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec} */
  public static final class SelfSubjectRulesReviewSpec
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec)
      SelfSubjectRulesReviewSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use SelfSubjectRulesReviewSpec.newBuilder() to construct.
    private SelfSubjectRulesReviewSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private SelfSubjectRulesReviewSpec() {
      namespace_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private SelfSubjectRulesReviewSpec(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                namespace_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReviewSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReviewSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec.class,
              io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec.Builder
                  .class);
    }

    private int bitField0_;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    private volatile java.lang.Object namespace_;
    /**
     *
     *
     * <pre>
     * Namespace to evaluate rules for. Required.
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    public boolean hasNamespace() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Namespace to evaluate rules for. Required.
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          namespace_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Namespace to evaluate rules for. Required.
     * </pre>
     *
     * <code>optional string namespace = 1;</code>
     */
    public com.google.protobuf.ByteString getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namespace_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, namespace_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj
          instanceof io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec other =
          (io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec) obj;

      boolean result = true;
      result = result && (hasNamespace() == other.hasNamespace());
      if (hasNamespace()) {
        result = result && getNamespace().equals(other.getNamespace());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasNamespace()) {
        hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
        hash = (53 * hash) + getNamespace().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /** Protobuf type {@code k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec} */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec)
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReviewSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReviewSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec.class,
                io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        namespace_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReviewSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec build() {
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec result =
            new io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.namespace_ = namespace_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
                .getDefaultInstance()) return this;
        if (other.hasNamespace()) {
          bitField0_ |= 0x00000001;
          namespace_ = other.namespace_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object namespace_ = "";
      /**
       *
       *
       * <pre>
       * Namespace to evaluate rules for. Required.
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public boolean hasNamespace() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Namespace to evaluate rules for. Required.
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public java.lang.String getNamespace() {
        java.lang.Object ref = namespace_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            namespace_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Namespace to evaluate rules for. Required.
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public com.google.protobuf.ByteString getNamespaceBytes() {
        java.lang.Object ref = namespace_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          namespace_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Namespace to evaluate rules for. Required.
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public Builder setNamespace(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        namespace_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace to evaluate rules for. Required.
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public Builder clearNamespace() {
        bitField0_ = (bitField0_ & ~0x00000001);
        namespace_ = getDefaultInstance().getNamespace();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace to evaluate rules for. Required.
       * </pre>
       *
       * <code>optional string namespace = 1;</code>
       */
      public Builder setNamespaceBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        namespace_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.SelfSubjectRulesReviewSpec)
    private static final io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<SelfSubjectRulesReviewSpec> PARSER =
        new com.google.protobuf.AbstractParser<SelfSubjectRulesReviewSpec>() {
          @java.lang.Override
          public SelfSubjectRulesReviewSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new SelfSubjectRulesReviewSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<SelfSubjectRulesReviewSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SelfSubjectRulesReviewSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.SelfSubjectRulesReviewSpec
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface SubjectAccessReviewOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.SubjectAccessReview)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec getSpec();
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpecOrBuilder
        getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus getStatus();
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder
        getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * SubjectAccessReview checks whether or not a user or group can perform an action.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authorization.v1beta1.SubjectAccessReview}
   */
  public static final class SubjectAccessReview extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.SubjectAccessReview)
      SubjectAccessReviewOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use SubjectAccessReview.newBuilder() to construct.
    private SubjectAccessReview(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private SubjectAccessReview() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private SubjectAccessReview(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReview_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReview_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview.class,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec spec_;
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
              .getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Spec holds information about the request being evaluated
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpecOrBuilder
        getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
              .getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus status_;
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
              .getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Status is filled in by the server and indicates whether the request is allowed or not
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
              .getDefaultInstance()
          : status_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getStatus());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStatus());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview other =
          (io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * SubjectAccessReview checks whether or not a user or group can perform an action.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authorization.v1beta1.SubjectAccessReview}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.SubjectAccessReview)
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReview_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReview_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview.class,
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
          getStatusFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReview_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview build() {
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview result =
            new io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview
                .getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
                  .getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder
              builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public Builder mergeSpec(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.newBuilder(
                        spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder
          getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpecOrBuilder
          getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
                  .getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Spec holds information about the request being evaluated
       * </pre>
       *
       * <code>optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec spec = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec,
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder,
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus status_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                  .getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder
              builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                    .newBuilder(status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                  .getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Status is filled in by the server and indicates whether the request is allowed or not
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus status = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus,
                  io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder,
                  io.kubernetes.client.proto.V1beta1Authorization
                      .SubjectAccessReviewStatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.SubjectAccessReview)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.SubjectAccessReview)
    private static final io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<SubjectAccessReview> PARSER =
        new com.google.protobuf.AbstractParser<SubjectAccessReview>() {
          @java.lang.Override
          public SubjectAccessReview parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new SubjectAccessReview(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<SubjectAccessReview> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubjectAccessReview> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReview
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface SubjectAccessReviewSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * ResourceAuthorizationAttributes describes information for a resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
     * </code>
     */
    boolean hasResourceAttributes();
    /**
     *
     *
     * <pre>
     * ResourceAuthorizationAttributes describes information for a resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes getResourceAttributes();
    /**
     *
     *
     * <pre>
     * ResourceAuthorizationAttributes describes information for a resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributesOrBuilder
        getResourceAttributesOrBuilder();

    /**
     *
     *
     * <pre>
     * NonResourceAttributes describes information for a non-resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
     * </code>
     */
    boolean hasNonResourceAttributes();
    /**
     *
     *
     * <pre>
     * NonResourceAttributes describes information for a non-resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
        getNonResourceAttributes();
    /**
     *
     *
     * <pre>
     * NonResourceAttributes describes information for a non-resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributesOrBuilder
        getNonResourceAttributesOrBuilder();

    /**
     *
     *
     * <pre>
     * User is the user you're testing for.
     * If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
     * +optional
     * </pre>
     *
     * <code>optional string user = 3;</code>
     */
    boolean hasUser();
    /**
     *
     *
     * <pre>
     * User is the user you're testing for.
     * If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
     * +optional
     * </pre>
     *
     * <code>optional string user = 3;</code>
     */
    java.lang.String getUser();
    /**
     *
     *
     * <pre>
     * User is the user you're testing for.
     * If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
     * +optional
     * </pre>
     *
     * <code>optional string user = 3;</code>
     */
    com.google.protobuf.ByteString getUserBytes();

    /**
     *
     *
     * <pre>
     * Groups is the groups you're testing for.
     * +optional
     * </pre>
     *
     * <code>repeated string group = 4;</code>
     */
    java.util.List<java.lang.String> getGroupList();
    /**
     *
     *
     * <pre>
     * Groups is the groups you're testing for.
     * +optional
     * </pre>
     *
     * <code>repeated string group = 4;</code>
     */
    int getGroupCount();
    /**
     *
     *
     * <pre>
     * Groups is the groups you're testing for.
     * +optional
     * </pre>
     *
     * <code>repeated string group = 4;</code>
     */
    java.lang.String getGroup(int index);
    /**
     *
     *
     * <pre>
     * Groups is the groups you're testing for.
     * +optional
     * </pre>
     *
     * <code>repeated string group = 4;</code>
     */
    com.google.protobuf.ByteString getGroupBytes(int index);

    /**
     *
     *
     * <pre>
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
     * it needs a reflection here.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;</code>
     */
    int getExtraCount();
    /**
     *
     *
     * <pre>
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
     * it needs a reflection here.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;</code>
     */
    boolean containsExtra(java.lang.String key);
    /** Use {@link #getExtraMap()} instead. */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
        getExtra();
    /**
     *
     *
     * <pre>
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
     * it needs a reflection here.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;</code>
     */
    java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
        getExtraMap();
    /**
     *
     *
     * <pre>
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
     * it needs a reflection here.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;</code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.ExtraValue getExtraOrDefault(
        java.lang.String key,
        io.kubernetes.client.proto.V1beta1Authorization.ExtraValue defaultValue);
    /**
     *
     *
     * <pre>
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
     * it needs a reflection here.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;</code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.ExtraValue getExtraOrThrow(
        java.lang.String key);

    /**
     *
     *
     * <pre>
     * UID information about the requesting user.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 6;</code>
     */
    boolean hasUid();
    /**
     *
     *
     * <pre>
     * UID information about the requesting user.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 6;</code>
     */
    java.lang.String getUid();
    /**
     *
     *
     * <pre>
     * UID information about the requesting user.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 6;</code>
     */
    com.google.protobuf.ByteString getUidBytes();
  }
  /**
   *
   *
   * <pre>
   * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes
   * and NonResourceAuthorizationAttributes must be set
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec}
   */
  public static final class SubjectAccessReviewSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec)
      SubjectAccessReviewSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use SubjectAccessReviewSpec.newBuilder() to construct.
    private SubjectAccessReviewSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private SubjectAccessReviewSpec() {
      user_ = "";
      group_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      uid_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private SubjectAccessReviewSpec(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = resourceAttributes_.toBuilder();
                }
                resourceAttributes_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(resourceAttributes_);
                  resourceAttributes_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = nonResourceAttributes_.toBuilder();
                }
                nonResourceAttributes_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(nonResourceAttributes_);
                  nonResourceAttributes_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                user_ = bs;
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                  group_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000008;
                }
                group_.add(bs);
                break;
              }
            case 42:
              {
                if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                  extra_ =
                      com.google.protobuf.MapField.newMapField(
                          ExtraDefaultEntryHolder.defaultEntry);
                  mutable_bitField0_ |= 0x00000010;
                }
                com.google.protobuf.MapEntry<
                        java.lang.String,
                        io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
                    extra__ =
                        input.readMessage(
                            ExtraDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                extra_.getMutableMap().put(extra__.getKey(), extra__.getValue());
                break;
              }
            case 50:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000008;
                uid_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          group_ = group_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 5:
          return internalGetExtra();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.class,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder
                  .class);
    }

    private int bitField0_;
    public static final int RESOURCEATTRIBUTES_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes resourceAttributes_;
    /**
     *
     *
     * <pre>
     * ResourceAuthorizationAttributes describes information for a resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
     * </code>
     */
    public boolean hasResourceAttributes() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * ResourceAuthorizationAttributes describes information for a resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
        getResourceAttributes() {
      return resourceAttributes_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.getDefaultInstance()
          : resourceAttributes_;
    }
    /**
     *
     *
     * <pre>
     * ResourceAuthorizationAttributes describes information for a resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributesOrBuilder
        getResourceAttributesOrBuilder() {
      return resourceAttributes_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.getDefaultInstance()
          : resourceAttributes_;
    }

    public static final int NONRESOURCEATTRIBUTES_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
        nonResourceAttributes_;
    /**
     *
     *
     * <pre>
     * NonResourceAttributes describes information for a non-resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
     * </code>
     */
    public boolean hasNonResourceAttributes() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * NonResourceAttributes describes information for a non-resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
        getNonResourceAttributes() {
      return nonResourceAttributes_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
              .getDefaultInstance()
          : nonResourceAttributes_;
    }
    /**
     *
     *
     * <pre>
     * NonResourceAttributes describes information for a non-resource access request
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributesOrBuilder
        getNonResourceAttributesOrBuilder() {
      return nonResourceAttributes_ == null
          ? io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
              .getDefaultInstance()
          : nonResourceAttributes_;
    }

    public static final int USER_FIELD_NUMBER = 3;
    private volatile java.lang.Object user_;
    /**
     *
     *
     * <pre>
     * User is the user you're testing for.
     * If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
     * +optional
     * </pre>
     *
     * <code>optional string user = 3;</code>
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * User is the user you're testing for.
     * If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
     * +optional
     * </pre>
     *
     * <code>optional string user = 3;</code>
     */
    public java.lang.String getUser() {
      java.lang.Object ref = user_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          user_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * User is the user you're testing for.
     * If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
     * +optional
     * </pre>
     *
     * <code>optional string user = 3;</code>
     */
    public com.google.protobuf.ByteString getUserBytes() {
      java.lang.Object ref = user_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        user_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GROUP_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList group_;
    /**
     *
     *
     * <pre>
     * Groups is the groups you're testing for.
     * +optional
     * </pre>
     *
     * <code>repeated string group = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList getGroupList() {
      return group_;
    }
    /**
     *
     *
     * <pre>
     * Groups is the groups you're testing for.
     * +optional
     * </pre>
     *
     * <code>repeated string group = 4;</code>
     */
    public int getGroupCount() {
      return group_.size();
    }
    /**
     *
     *
     * <pre>
     * Groups is the groups you're testing for.
     * +optional
     * </pre>
     *
     * <code>repeated string group = 4;</code>
     */
    public java.lang.String getGroup(int index) {
      return group_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Groups is the groups you're testing for.
     * +optional
     * </pre>
     *
     * <code>repeated string group = 4;</code>
     */
    public com.google.protobuf.ByteString getGroupBytes(int index) {
      return group_.getByteString(index);
    }

    public static final int EXTRA_FIELD_NUMBER = 5;

    private static final class ExtraDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
          defaultEntry =
              com.google.protobuf.MapEntry
                  .<java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
                      newDefaultInstance(
                          io.kubernetes.client.proto.V1beta1Authorization
                              .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_ExtraEntry_descriptor,
                          com.google.protobuf.WireFormat.FieldType.STRING,
                          "",
                          com.google.protobuf.WireFormat.FieldType.MESSAGE,
                          io.kubernetes.client.proto.V1beta1Authorization.ExtraValue
                              .getDefaultInstance());
    }

    private com.google.protobuf.MapField<
            java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
        extra_;

    private com.google.protobuf.MapField<
            java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
        internalGetExtra() {
      if (extra_ == null) {
        return com.google.protobuf.MapField.emptyMapField(ExtraDefaultEntryHolder.defaultEntry);
      }
      return extra_;
    }

    public int getExtraCount() {
      return internalGetExtra().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
     * it needs a reflection here.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;</code>
     */
    public boolean containsExtra(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetExtra().getMap().containsKey(key);
    }
    /** Use {@link #getExtraMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<
            java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
        getExtra() {
      return getExtraMap();
    }
    /**
     *
     *
     * <pre>
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
     * it needs a reflection here.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;</code>
     */
    public java.util.Map<
            java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
        getExtraMap() {
      return internalGetExtra().getMap();
    }
    /**
     *
     *
     * <pre>
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
     * it needs a reflection here.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.ExtraValue getExtraOrDefault(
        java.lang.String key,
        io.kubernetes.client.proto.V1beta1Authorization.ExtraValue defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
          map = internalGetExtra().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
     * it needs a reflection here.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.ExtraValue getExtraOrThrow(
        java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
          map = internalGetExtra().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int UID_FIELD_NUMBER = 6;
    private volatile java.lang.Object uid_;
    /**
     *
     *
     * <pre>
     * UID information about the requesting user.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 6;</code>
     */
    public boolean hasUid() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * UID information about the requesting user.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 6;</code>
     */
    public java.lang.String getUid() {
      java.lang.Object ref = uid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uid_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * UID information about the requesting user.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 6;</code>
     */
    public com.google.protobuf.ByteString getUidBytes() {
      java.lang.Object ref = uid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getResourceAttributes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getNonResourceAttributes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, user_);
      }
      for (int i = 0; i < group_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, group_.getRaw(i));
      }
      com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
          output, internalGetExtra(), ExtraDefaultEntryHolder.defaultEntry, 5);
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(1, getResourceAttributes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(2, getNonResourceAttributes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, user_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < group_.size(); i++) {
          dataSize += computeStringSizeNoTag(group_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getGroupList().size();
      }
      for (java.util.Map.Entry<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
          entry : internalGetExtra().getMap().entrySet()) {
        com.google.protobuf.MapEntry<
                java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
            extra__ =
                ExtraDefaultEntryHolder.defaultEntry
                    .newBuilderForType()
                    .setKey(entry.getKey())
                    .setValue(entry.getValue())
                    .build();
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, extra__);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, uid_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj
          instanceof io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec other =
          (io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec) obj;

      boolean result = true;
      result = result && (hasResourceAttributes() == other.hasResourceAttributes());
      if (hasResourceAttributes()) {
        result = result && getResourceAttributes().equals(other.getResourceAttributes());
      }
      result = result && (hasNonResourceAttributes() == other.hasNonResourceAttributes());
      if (hasNonResourceAttributes()) {
        result = result && getNonResourceAttributes().equals(other.getNonResourceAttributes());
      }
      result = result && (hasUser() == other.hasUser());
      if (hasUser()) {
        result = result && getUser().equals(other.getUser());
      }
      result = result && getGroupList().equals(other.getGroupList());
      result = result && internalGetExtra().equals(other.internalGetExtra());
      result = result && (hasUid() == other.hasUid());
      if (hasUid()) {
        result = result && getUid().equals(other.getUid());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasResourceAttributes()) {
        hash = (37 * hash) + RESOURCEATTRIBUTES_FIELD_NUMBER;
        hash = (53 * hash) + getResourceAttributes().hashCode();
      }
      if (hasNonResourceAttributes()) {
        hash = (37 * hash) + NONRESOURCEATTRIBUTES_FIELD_NUMBER;
        hash = (53 * hash) + getNonResourceAttributes().hashCode();
      }
      if (hasUser()) {
        hash = (37 * hash) + USER_FIELD_NUMBER;
        hash = (53 * hash) + getUser().hashCode();
      }
      if (getGroupCount() > 0) {
        hash = (37 * hash) + GROUP_FIELD_NUMBER;
        hash = (53 * hash) + getGroupList().hashCode();
      }
      if (!internalGetExtra().getMap().isEmpty()) {
        hash = (37 * hash) + EXTRA_FIELD_NUMBER;
        hash = (53 * hash) + internalGetExtra().hashCode();
      }
      if (hasUid()) {
        hash = (37 * hash) + UID_FIELD_NUMBER;
        hash = (53 * hash) + getUid().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes
     * and NonResourceAuthorizationAttributes must be set
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec)
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(int number) {
        switch (number) {
          case 5:
            return internalGetExtra();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
        switch (number) {
          case 5:
            return internalGetMutableExtra();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.class,
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getResourceAttributesFieldBuilder();
          getNonResourceAttributesFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (resourceAttributesBuilder_ == null) {
          resourceAttributes_ = null;
        } else {
          resourceAttributesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (nonResourceAttributesBuilder_ == null) {
          nonResourceAttributes_ = null;
        } else {
          nonResourceAttributesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        user_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        group_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        internalGetMutableExtra().clear();
        uid_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec build() {
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec result =
            new io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (resourceAttributesBuilder_ == null) {
          result.resourceAttributes_ = resourceAttributes_;
        } else {
          result.resourceAttributes_ = resourceAttributesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (nonResourceAttributesBuilder_ == null) {
          result.nonResourceAttributes_ = nonResourceAttributes_;
        } else {
          result.nonResourceAttributes_ = nonResourceAttributesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.user_ = user_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          group_ = group_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.group_ = group_;
        result.extra_ = internalGetExtra();
        result.extra_.makeImmutable();
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000008;
        }
        result.uid_ = uid_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
                .getDefaultInstance()) return this;
        if (other.hasResourceAttributes()) {
          mergeResourceAttributes(other.getResourceAttributes());
        }
        if (other.hasNonResourceAttributes()) {
          mergeNonResourceAttributes(other.getNonResourceAttributes());
        }
        if (other.hasUser()) {
          bitField0_ |= 0x00000004;
          user_ = other.user_;
          onChanged();
        }
        if (!other.group_.isEmpty()) {
          if (group_.isEmpty()) {
            group_ = other.group_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureGroupIsMutable();
            group_.addAll(other.group_);
          }
          onChanged();
        }
        internalGetMutableExtra().mergeFrom(other.internalGetExtra());
        if (other.hasUid()) {
          bitField0_ |= 0x00000020;
          uid_ = other.uid_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
          resourceAttributes_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributesOrBuilder>
          resourceAttributesBuilder_;
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public boolean hasResourceAttributes() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
          getResourceAttributes() {
        if (resourceAttributesBuilder_ == null) {
          return resourceAttributes_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
                  .getDefaultInstance()
              : resourceAttributes_;
        } else {
          return resourceAttributesBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public Builder setResourceAttributes(
          io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes value) {
        if (resourceAttributesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resourceAttributes_ = value;
          onChanged();
        } else {
          resourceAttributesBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public Builder setResourceAttributes(
          io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder
              builderForValue) {
        if (resourceAttributesBuilder_ == null) {
          resourceAttributes_ = builderForValue.build();
          onChanged();
        } else {
          resourceAttributesBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public Builder mergeResourceAttributes(
          io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes value) {
        if (resourceAttributesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && resourceAttributes_ != null
              && resourceAttributes_
                  != io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
                      .getDefaultInstance()) {
            resourceAttributes_ =
                io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.newBuilder(
                        resourceAttributes_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            resourceAttributes_ = value;
          }
          onChanged();
        } else {
          resourceAttributesBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public Builder clearResourceAttributes() {
        if (resourceAttributesBuilder_ == null) {
          resourceAttributes_ = null;
          onChanged();
        } else {
          resourceAttributesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder
          getResourceAttributesBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getResourceAttributesFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributesOrBuilder
          getResourceAttributesOrBuilder() {
        if (resourceAttributesBuilder_ != null) {
          return resourceAttributesBuilder_.getMessageOrBuilder();
        } else {
          return resourceAttributes_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes
                  .getDefaultInstance()
              : resourceAttributes_;
        }
      }
      /**
       *
       *
       * <pre>
       * ResourceAuthorizationAttributes describes information for a resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.ResourceAttributes resourceAttributes = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributesOrBuilder>
          getResourceAttributesFieldBuilder() {
        if (resourceAttributesBuilder_ == null) {
          resourceAttributesBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes,
                  io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributes.Builder,
                  io.kubernetes.client.proto.V1beta1Authorization.ResourceAttributesOrBuilder>(
                  getResourceAttributes(), getParentForChildren(), isClean());
          resourceAttributes_ = null;
        }
        return resourceAttributesBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
          nonResourceAttributes_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributesOrBuilder>
          nonResourceAttributesBuilder_;
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public boolean hasNonResourceAttributes() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
          getNonResourceAttributes() {
        if (nonResourceAttributesBuilder_ == null) {
          return nonResourceAttributes_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
                  .getDefaultInstance()
              : nonResourceAttributes_;
        } else {
          return nonResourceAttributesBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public Builder setNonResourceAttributes(
          io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes value) {
        if (nonResourceAttributesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          nonResourceAttributes_ = value;
          onChanged();
        } else {
          nonResourceAttributesBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public Builder setNonResourceAttributes(
          io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder
              builderForValue) {
        if (nonResourceAttributesBuilder_ == null) {
          nonResourceAttributes_ = builderForValue.build();
          onChanged();
        } else {
          nonResourceAttributesBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public Builder mergeNonResourceAttributes(
          io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes value) {
        if (nonResourceAttributesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && nonResourceAttributes_ != null
              && nonResourceAttributes_
                  != io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
                      .getDefaultInstance()) {
            nonResourceAttributes_ =
                io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.newBuilder(
                        nonResourceAttributes_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            nonResourceAttributes_ = value;
          }
          onChanged();
        } else {
          nonResourceAttributesBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public Builder clearNonResourceAttributes() {
        if (nonResourceAttributesBuilder_ == null) {
          nonResourceAttributes_ = null;
          onChanged();
        } else {
          nonResourceAttributesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder
          getNonResourceAttributesBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getNonResourceAttributesFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributesOrBuilder
          getNonResourceAttributesOrBuilder() {
        if (nonResourceAttributesBuilder_ != null) {
          return nonResourceAttributesBuilder_.getMessageOrBuilder();
        } else {
          return nonResourceAttributes_ == null
              ? io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes
                  .getDefaultInstance()
              : nonResourceAttributes_;
        }
      }
      /**
       *
       *
       * <pre>
       * NonResourceAttributes describes information for a non-resource access request
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.authorization.v1beta1.NonResourceAttributes nonResourceAttributes = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributesOrBuilder>
          getNonResourceAttributesFieldBuilder() {
        if (nonResourceAttributesBuilder_ == null) {
          nonResourceAttributesBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes,
                  io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributes.Builder,
                  io.kubernetes.client.proto.V1beta1Authorization.NonResourceAttributesOrBuilder>(
                  getNonResourceAttributes(), getParentForChildren(), isClean());
          nonResourceAttributes_ = null;
        }
        return nonResourceAttributesBuilder_;
      }

      private java.lang.Object user_ = "";
      /**
       *
       *
       * <pre>
       * User is the user you're testing for.
       * If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
       * +optional
       * </pre>
       *
       * <code>optional string user = 3;</code>
       */
      public boolean hasUser() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * User is the user you're testing for.
       * If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
       * +optional
       * </pre>
       *
       * <code>optional string user = 3;</code>
       */
      public java.lang.String getUser() {
        java.lang.Object ref = user_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            user_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * User is the user you're testing for.
       * If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
       * +optional
       * </pre>
       *
       * <code>optional string user = 3;</code>
       */
      public com.google.protobuf.ByteString getUserBytes() {
        java.lang.Object ref = user_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          user_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * User is the user you're testing for.
       * If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
       * +optional
       * </pre>
       *
       * <code>optional string user = 3;</code>
       */
      public Builder setUser(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        user_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * User is the user you're testing for.
       * If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
       * +optional
       * </pre>
       *
       * <code>optional string user = 3;</code>
       */
      public Builder clearUser() {
        bitField0_ = (bitField0_ & ~0x00000004);
        user_ = getDefaultInstance().getUser();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * User is the user you're testing for.
       * If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
       * +optional
       * </pre>
       *
       * <code>optional string user = 3;</code>
       */
      public Builder setUserBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        user_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList group_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureGroupIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          group_ = new com.google.protobuf.LazyStringArrayList(group_);
          bitField0_ |= 0x00000008;
        }
      }
      /**
       *
       *
       * <pre>
       * Groups is the groups you're testing for.
       * +optional
       * </pre>
       *
       * <code>repeated string group = 4;</code>
       */
      public com.google.protobuf.ProtocolStringList getGroupList() {
        return group_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Groups is the groups you're testing for.
       * +optional
       * </pre>
       *
       * <code>repeated string group = 4;</code>
       */
      public int getGroupCount() {
        return group_.size();
      }
      /**
       *
       *
       * <pre>
       * Groups is the groups you're testing for.
       * +optional
       * </pre>
       *
       * <code>repeated string group = 4;</code>
       */
      public java.lang.String getGroup(int index) {
        return group_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Groups is the groups you're testing for.
       * +optional
       * </pre>
       *
       * <code>repeated string group = 4;</code>
       */
      public com.google.protobuf.ByteString getGroupBytes(int index) {
        return group_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Groups is the groups you're testing for.
       * +optional
       * </pre>
       *
       * <code>repeated string group = 4;</code>
       */
      public Builder setGroup(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Groups is the groups you're testing for.
       * +optional
       * </pre>
       *
       * <code>repeated string group = 4;</code>
       */
      public Builder addGroup(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Groups is the groups you're testing for.
       * +optional
       * </pre>
       *
       * <code>repeated string group = 4;</code>
       */
      public Builder addAllGroup(java.lang.Iterable<java.lang.String> values) {
        ensureGroupIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, group_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Groups is the groups you're testing for.
       * +optional
       * </pre>
       *
       * <code>repeated string group = 4;</code>
       */
      public Builder clearGroup() {
        group_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Groups is the groups you're testing for.
       * +optional
       * </pre>
       *
       * <code>repeated string group = 4;</code>
       */
      public Builder addGroupBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
          extra_;

      private com.google.protobuf.MapField<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
          internalGetExtra() {
        if (extra_ == null) {
          return com.google.protobuf.MapField.emptyMapField(ExtraDefaultEntryHolder.defaultEntry);
        }
        return extra_;
      }

      private com.google.protobuf.MapField<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
          internalGetMutableExtra() {
        onChanged();
        ;
        if (extra_ == null) {
          extra_ = com.google.protobuf.MapField.newMapField(ExtraDefaultEntryHolder.defaultEntry);
        }
        if (!extra_.isMutable()) {
          extra_ = extra_.copy();
        }
        return extra_;
      }

      public int getExtraCount() {
        return internalGetExtra().getMap().size();
      }
      /**
       *
       *
       * <pre>
       * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
       * it needs a reflection here.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;
       * </code>
       */
      public boolean containsExtra(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        return internalGetExtra().getMap().containsKey(key);
      }
      /** Use {@link #getExtraMap()} instead. */
      @java.lang.Deprecated
      public java.util.Map<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
          getExtra() {
        return getExtraMap();
      }
      /**
       *
       *
       * <pre>
       * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
       * it needs a reflection here.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;
       * </code>
       */
      public java.util.Map<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
          getExtraMap() {
        return internalGetExtra().getMap();
      }
      /**
       *
       *
       * <pre>
       * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
       * it needs a reflection here.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.ExtraValue getExtraOrDefault(
          java.lang.String key,
          io.kubernetes.client.proto.V1beta1Authorization.ExtraValue defaultValue) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
            map = internalGetExtra().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       *
       *
       * <pre>
       * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
       * it needs a reflection here.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.ExtraValue getExtraOrThrow(
          java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
            map = internalGetExtra().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearExtra() {
        internalGetMutableExtra().getMutableMap().clear();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
       * it needs a reflection here.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;
       * </code>
       */
      public Builder removeExtra(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableExtra().getMutableMap().remove(key);
        return this;
      }
      /** Use alternate mutation accessors instead. */
      @java.lang.Deprecated
      public java.util.Map<
              java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
          getMutableExtra() {
        return internalGetMutableExtra().getMutableMap();
      }
      /**
       *
       *
       * <pre>
       * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
       * it needs a reflection here.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;
       * </code>
       */
      public Builder putExtra(
          java.lang.String key, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue value) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        if (value == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableExtra().getMutableMap().put(key, value);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer
       * it needs a reflection here.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.authorization.v1beta1.ExtraValue&gt; extra = 5;
       * </code>
       */
      public Builder putAllExtra(
          java.util.Map<
                  java.lang.String, io.kubernetes.client.proto.V1beta1Authorization.ExtraValue>
              values) {
        internalGetMutableExtra().getMutableMap().putAll(values);
        return this;
      }

      private java.lang.Object uid_ = "";
      /**
       *
       *
       * <pre>
       * UID information about the requesting user.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 6;</code>
       */
      public boolean hasUid() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * UID information about the requesting user.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 6;</code>
       */
      public java.lang.String getUid() {
        java.lang.Object ref = uid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            uid_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * UID information about the requesting user.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 6;</code>
       */
      public com.google.protobuf.ByteString getUidBytes() {
        java.lang.Object ref = uid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          uid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * UID information about the requesting user.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 6;</code>
       */
      public Builder setUid(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * UID information about the requesting user.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 6;</code>
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000020);
        uid_ = getDefaultInstance().getUid();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * UID information about the requesting user.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 6;</code>
       */
      public Builder setUidBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        uid_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.SubjectAccessReviewSpec)
    private static final io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<SubjectAccessReviewSpec> PARSER =
        new com.google.protobuf.AbstractParser<SubjectAccessReviewSpec>() {
          @java.lang.Override
          public SubjectAccessReviewSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new SubjectAccessReviewSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<SubjectAccessReviewSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubjectAccessReviewSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewSpec
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface SubjectAccessReviewStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Allowed is required. True if the action would be allowed, false otherwise.
     * </pre>
     *
     * <code>optional bool allowed = 1;</code>
     */
    boolean hasAllowed();
    /**
     *
     *
     * <pre>
     * Allowed is required. True if the action would be allowed, false otherwise.
     * </pre>
     *
     * <code>optional bool allowed = 1;</code>
     */
    boolean getAllowed();

    /**
     *
     *
     * <pre>
     * Denied is optional. True if the action would be denied, otherwise
     * false. If both allowed is false and denied is false, then the
     * authorizer has no opinion on whether to authorize the action. Denied
     * may not be true if Allowed is true.
     * +optional
     * </pre>
     *
     * <code>optional bool denied = 4;</code>
     */
    boolean hasDenied();
    /**
     *
     *
     * <pre>
     * Denied is optional. True if the action would be denied, otherwise
     * false. If both allowed is false and denied is false, then the
     * authorizer has no opinion on whether to authorize the action. Denied
     * may not be true if Allowed is true.
     * +optional
     * </pre>
     *
     * <code>optional bool denied = 4;</code>
     */
    boolean getDenied();

    /**
     *
     *
     * <pre>
     * Reason is optional.  It indicates why a request was allowed or denied.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    boolean hasReason();
    /**
     *
     *
     * <pre>
     * Reason is optional.  It indicates why a request was allowed or denied.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    java.lang.String getReason();
    /**
     *
     *
     * <pre>
     * Reason is optional.  It indicates why a request was allowed or denied.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    com.google.protobuf.ByteString getReasonBytes();

    /**
     *
     *
     * <pre>
     * EvaluationError is an indication that some error occurred during the authorization check.
     * It is entirely possible to get an error and be able to continue determine authorization status in spite of it.
     * For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
     * +optional
     * </pre>
     *
     * <code>optional string evaluationError = 3;</code>
     */
    boolean hasEvaluationError();
    /**
     *
     *
     * <pre>
     * EvaluationError is an indication that some error occurred during the authorization check.
     * It is entirely possible to get an error and be able to continue determine authorization status in spite of it.
     * For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
     * +optional
     * </pre>
     *
     * <code>optional string evaluationError = 3;</code>
     */
    java.lang.String getEvaluationError();
    /**
     *
     *
     * <pre>
     * EvaluationError is an indication that some error occurred during the authorization check.
     * It is entirely possible to get an error and be able to continue determine authorization status in spite of it.
     * For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
     * +optional
     * </pre>
     *
     * <code>optional string evaluationError = 3;</code>
     */
    com.google.protobuf.ByteString getEvaluationErrorBytes();
  }
  /**
   *
   *
   * <pre>
   * SubjectAccessReviewStatus
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus}
   */
  public static final class SubjectAccessReviewStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus)
      SubjectAccessReviewStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use SubjectAccessReviewStatus.newBuilder() to construct.
    private SubjectAccessReviewStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private SubjectAccessReviewStatus() {
      allowed_ = false;
      denied_ = false;
      reason_ = "";
      evaluationError_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private SubjectAccessReviewStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                bitField0_ |= 0x00000001;
                allowed_ = input.readBool();
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                reason_ = bs;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000008;
                evaluationError_ = bs;
                break;
              }
            case 32:
              {
                bitField0_ |= 0x00000002;
                denied_ = input.readBool();
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.class,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder
                  .class);
    }

    private int bitField0_;
    public static final int ALLOWED_FIELD_NUMBER = 1;
    private boolean allowed_;
    /**
     *
     *
     * <pre>
     * Allowed is required. True if the action would be allowed, false otherwise.
     * </pre>
     *
     * <code>optional bool allowed = 1;</code>
     */
    public boolean hasAllowed() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Allowed is required. True if the action would be allowed, false otherwise.
     * </pre>
     *
     * <code>optional bool allowed = 1;</code>
     */
    public boolean getAllowed() {
      return allowed_;
    }

    public static final int DENIED_FIELD_NUMBER = 4;
    private boolean denied_;
    /**
     *
     *
     * <pre>
     * Denied is optional. True if the action would be denied, otherwise
     * false. If both allowed is false and denied is false, then the
     * authorizer has no opinion on whether to authorize the action. Denied
     * may not be true if Allowed is true.
     * +optional
     * </pre>
     *
     * <code>optional bool denied = 4;</code>
     */
    public boolean hasDenied() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Denied is optional. True if the action would be denied, otherwise
     * false. If both allowed is false and denied is false, then the
     * authorizer has no opinion on whether to authorize the action. Denied
     * may not be true if Allowed is true.
     * +optional
     * </pre>
     *
     * <code>optional bool denied = 4;</code>
     */
    public boolean getDenied() {
      return denied_;
    }

    public static final int REASON_FIELD_NUMBER = 2;
    private volatile java.lang.Object reason_;
    /**
     *
     *
     * <pre>
     * Reason is optional.  It indicates why a request was allowed or denied.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    public boolean hasReason() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Reason is optional.  It indicates why a request was allowed or denied.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reason_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Reason is optional.  It indicates why a request was allowed or denied.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    public com.google.protobuf.ByteString getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EVALUATIONERROR_FIELD_NUMBER = 3;
    private volatile java.lang.Object evaluationError_;
    /**
     *
     *
     * <pre>
     * EvaluationError is an indication that some error occurred during the authorization check.
     * It is entirely possible to get an error and be able to continue determine authorization status in spite of it.
     * For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
     * +optional
     * </pre>
     *
     * <code>optional string evaluationError = 3;</code>
     */
    public boolean hasEvaluationError() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * EvaluationError is an indication that some error occurred during the authorization check.
     * It is entirely possible to get an error and be able to continue determine authorization status in spite of it.
     * For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
     * +optional
     * </pre>
     *
     * <code>optional string evaluationError = 3;</code>
     */
    public java.lang.String getEvaluationError() {
      java.lang.Object ref = evaluationError_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          evaluationError_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * EvaluationError is an indication that some error occurred during the authorization check.
     * It is entirely possible to get an error and be able to continue determine authorization status in spite of it.
     * For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
     * +optional
     * </pre>
     *
     * <code>optional string evaluationError = 3;</code>
     */
    public com.google.protobuf.ByteString getEvaluationErrorBytes() {
      java.lang.Object ref = evaluationError_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        evaluationError_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, allowed_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reason_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, evaluationError_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(4, denied_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, allowed_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reason_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, evaluationError_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, denied_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj
          instanceof io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus other =
          (io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus) obj;

      boolean result = true;
      result = result && (hasAllowed() == other.hasAllowed());
      if (hasAllowed()) {
        result = result && (getAllowed() == other.getAllowed());
      }
      result = result && (hasDenied() == other.hasDenied());
      if (hasDenied()) {
        result = result && (getDenied() == other.getDenied());
      }
      result = result && (hasReason() == other.hasReason());
      if (hasReason()) {
        result = result && getReason().equals(other.getReason());
      }
      result = result && (hasEvaluationError() == other.hasEvaluationError());
      if (hasEvaluationError()) {
        result = result && getEvaluationError().equals(other.getEvaluationError());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAllowed()) {
        hash = (37 * hash) + ALLOWED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowed());
      }
      if (hasDenied()) {
        hash = (37 * hash) + DENIED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDenied());
      }
      if (hasReason()) {
        hash = (37 * hash) + REASON_FIELD_NUMBER;
        hash = (53 * hash) + getReason().hashCode();
      }
      if (hasEvaluationError()) {
        hash = (37 * hash) + EVALUATIONERROR_FIELD_NUMBER;
        hash = (53 * hash) + getEvaluationError().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * SubjectAccessReviewStatus
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus)
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.class,
                io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        allowed_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        denied_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        reason_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        evaluationError_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus build() {
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus result =
            new io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.allowed_ = allowed_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.denied_ = denied_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.reason_ = reason_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.evaluationError_ = evaluationError_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
                .getDefaultInstance()) return this;
        if (other.hasAllowed()) {
          setAllowed(other.getAllowed());
        }
        if (other.hasDenied()) {
          setDenied(other.getDenied());
        }
        if (other.hasReason()) {
          bitField0_ |= 0x00000004;
          reason_ = other.reason_;
          onChanged();
        }
        if (other.hasEvaluationError()) {
          bitField0_ |= 0x00000008;
          evaluationError_ = other.evaluationError_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private boolean allowed_;
      /**
       *
       *
       * <pre>
       * Allowed is required. True if the action would be allowed, false otherwise.
       * </pre>
       *
       * <code>optional bool allowed = 1;</code>
       */
      public boolean hasAllowed() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Allowed is required. True if the action would be allowed, false otherwise.
       * </pre>
       *
       * <code>optional bool allowed = 1;</code>
       */
      public boolean getAllowed() {
        return allowed_;
      }
      /**
       *
       *
       * <pre>
       * Allowed is required. True if the action would be allowed, false otherwise.
       * </pre>
       *
       * <code>optional bool allowed = 1;</code>
       */
      public Builder setAllowed(boolean value) {
        bitField0_ |= 0x00000001;
        allowed_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Allowed is required. True if the action would be allowed, false otherwise.
       * </pre>
       *
       * <code>optional bool allowed = 1;</code>
       */
      public Builder clearAllowed() {
        bitField0_ = (bitField0_ & ~0x00000001);
        allowed_ = false;
        onChanged();
        return this;
      }

      private boolean denied_;
      /**
       *
       *
       * <pre>
       * Denied is optional. True if the action would be denied, otherwise
       * false. If both allowed is false and denied is false, then the
       * authorizer has no opinion on whether to authorize the action. Denied
       * may not be true if Allowed is true.
       * +optional
       * </pre>
       *
       * <code>optional bool denied = 4;</code>
       */
      public boolean hasDenied() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Denied is optional. True if the action would be denied, otherwise
       * false. If both allowed is false and denied is false, then the
       * authorizer has no opinion on whether to authorize the action. Denied
       * may not be true if Allowed is true.
       * +optional
       * </pre>
       *
       * <code>optional bool denied = 4;</code>
       */
      public boolean getDenied() {
        return denied_;
      }
      /**
       *
       *
       * <pre>
       * Denied is optional. True if the action would be denied, otherwise
       * false. If both allowed is false and denied is false, then the
       * authorizer has no opinion on whether to authorize the action. Denied
       * may not be true if Allowed is true.
       * +optional
       * </pre>
       *
       * <code>optional bool denied = 4;</code>
       */
      public Builder setDenied(boolean value) {
        bitField0_ |= 0x00000002;
        denied_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Denied is optional. True if the action would be denied, otherwise
       * false. If both allowed is false and denied is false, then the
       * authorizer has no opinion on whether to authorize the action. Denied
       * may not be true if Allowed is true.
       * +optional
       * </pre>
       *
       * <code>optional bool denied = 4;</code>
       */
      public Builder clearDenied() {
        bitField0_ = (bitField0_ & ~0x00000002);
        denied_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object reason_ = "";
      /**
       *
       *
       * <pre>
       * Reason is optional.  It indicates why a request was allowed or denied.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public boolean hasReason() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Reason is optional.  It indicates why a request was allowed or denied.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public java.lang.String getReason() {
        java.lang.Object ref = reason_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reason_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Reason is optional.  It indicates why a request was allowed or denied.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public com.google.protobuf.ByteString getReasonBytes() {
        java.lang.Object ref = reason_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          reason_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Reason is optional.  It indicates why a request was allowed or denied.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public Builder setReason(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Reason is optional.  It indicates why a request was allowed or denied.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public Builder clearReason() {
        bitField0_ = (bitField0_ & ~0x00000004);
        reason_ = getDefaultInstance().getReason();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Reason is optional.  It indicates why a request was allowed or denied.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public Builder setReasonBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        reason_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object evaluationError_ = "";
      /**
       *
       *
       * <pre>
       * EvaluationError is an indication that some error occurred during the authorization check.
       * It is entirely possible to get an error and be able to continue determine authorization status in spite of it.
       * For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
       * +optional
       * </pre>
       *
       * <code>optional string evaluationError = 3;</code>
       */
      public boolean hasEvaluationError() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * EvaluationError is an indication that some error occurred during the authorization check.
       * It is entirely possible to get an error and be able to continue determine authorization status in spite of it.
       * For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
       * +optional
       * </pre>
       *
       * <code>optional string evaluationError = 3;</code>
       */
      public java.lang.String getEvaluationError() {
        java.lang.Object ref = evaluationError_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            evaluationError_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * EvaluationError is an indication that some error occurred during the authorization check.
       * It is entirely possible to get an error and be able to continue determine authorization status in spite of it.
       * For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
       * +optional
       * </pre>
       *
       * <code>optional string evaluationError = 3;</code>
       */
      public com.google.protobuf.ByteString getEvaluationErrorBytes() {
        java.lang.Object ref = evaluationError_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          evaluationError_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * EvaluationError is an indication that some error occurred during the authorization check.
       * It is entirely possible to get an error and be able to continue determine authorization status in spite of it.
       * For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
       * +optional
       * </pre>
       *
       * <code>optional string evaluationError = 3;</code>
       */
      public Builder setEvaluationError(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        evaluationError_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * EvaluationError is an indication that some error occurred during the authorization check.
       * It is entirely possible to get an error and be able to continue determine authorization status in spite of it.
       * For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
       * +optional
       * </pre>
       *
       * <code>optional string evaluationError = 3;</code>
       */
      public Builder clearEvaluationError() {
        bitField0_ = (bitField0_ & ~0x00000008);
        evaluationError_ = getDefaultInstance().getEvaluationError();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * EvaluationError is an indication that some error occurred during the authorization check.
       * It is entirely possible to get an error and be able to continue determine authorization status in spite of it.
       * For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
       * +optional
       * </pre>
       *
       * <code>optional string evaluationError = 3;</code>
       */
      public Builder setEvaluationErrorBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        evaluationError_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.SubjectAccessReviewStatus)
    private static final io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<SubjectAccessReviewStatus> PARSER =
        new com.google.protobuf.AbstractParser<SubjectAccessReviewStatus>() {
          @java.lang.Override
          public SubjectAccessReviewStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new SubjectAccessReviewStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<SubjectAccessReviewStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubjectAccessReviewStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectAccessReviewStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface SubjectRulesReviewStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * ResourceRules is the list of actions the subject is allowed to perform on resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Authorization.ResourceRule>
        getResourceRulesList();
    /**
     *
     *
     * <pre>
     * ResourceRules is the list of actions the subject is allowed to perform on resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;</code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.ResourceRule getResourceRules(int index);
    /**
     *
     *
     * <pre>
     * ResourceRules is the list of actions the subject is allowed to perform on resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;</code>
     */
    int getResourceRulesCount();
    /**
     *
     *
     * <pre>
     * ResourceRules is the list of actions the subject is allowed to perform on resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1beta1Authorization.ResourceRuleOrBuilder>
        getResourceRulesOrBuilderList();
    /**
     *
     *
     * <pre>
     * ResourceRules is the list of actions the subject is allowed to perform on resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;</code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.ResourceRuleOrBuilder getResourceRulesOrBuilder(
        int index);

    /**
     *
     *
     * <pre>
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
     * </code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule>
        getNonResourceRulesList();
    /**
     *
     *
     * <pre>
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule getNonResourceRules(int index);
    /**
     *
     *
     * <pre>
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
     * </code>
     */
    int getNonResourceRulesCount();
    /**
     *
     *
     * <pre>
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
     * </code>
     */
    java.util.List<
            ? extends io.kubernetes.client.proto.V1beta1Authorization.NonResourceRuleOrBuilder>
        getNonResourceRulesOrBuilderList();
    /**
     *
     *
     * <pre>
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Authorization.NonResourceRuleOrBuilder
        getNonResourceRulesOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * Incomplete is true when the rules returned by this call are incomplete. This is most commonly
     * encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
     * </pre>
     *
     * <code>optional bool incomplete = 3;</code>
     */
    boolean hasIncomplete();
    /**
     *
     *
     * <pre>
     * Incomplete is true when the rules returned by this call are incomplete. This is most commonly
     * encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
     * </pre>
     *
     * <code>optional bool incomplete = 3;</code>
     */
    boolean getIncomplete();

    /**
     *
     *
     * <pre>
     * EvaluationError can appear in combination with Rules. It indicates an error occurred during
     * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
     * ResourceRules and/or NonResourceRules may be incomplete.
     * +optional
     * </pre>
     *
     * <code>optional string evaluationError = 4;</code>
     */
    boolean hasEvaluationError();
    /**
     *
     *
     * <pre>
     * EvaluationError can appear in combination with Rules. It indicates an error occurred during
     * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
     * ResourceRules and/or NonResourceRules may be incomplete.
     * +optional
     * </pre>
     *
     * <code>optional string evaluationError = 4;</code>
     */
    java.lang.String getEvaluationError();
    /**
     *
     *
     * <pre>
     * EvaluationError can appear in combination with Rules. It indicates an error occurred during
     * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
     * ResourceRules and/or NonResourceRules may be incomplete.
     * +optional
     * </pre>
     *
     * <code>optional string evaluationError = 4;</code>
     */
    com.google.protobuf.ByteString getEvaluationErrorBytes();
  }
  /**
   *
   *
   * <pre>
   * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on
   * the set of authorizers the server is configured with and any errors experienced during evaluation.
   * Because authorization rules are additive, if a rule appears in a list it's safe to assume the subject has that permission,
   * even if that list is incomplete.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus}
   */
  public static final class SubjectRulesReviewStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus)
      SubjectRulesReviewStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use SubjectRulesReviewStatus.newBuilder() to construct.
    private SubjectRulesReviewStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private SubjectRulesReviewStatus() {
      resourceRules_ = java.util.Collections.emptyList();
      nonResourceRules_ = java.util.Collections.emptyList();
      incomplete_ = false;
      evaluationError_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private SubjectRulesReviewStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  resourceRules_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1beta1Authorization.ResourceRule>();
                  mutable_bitField0_ |= 0x00000001;
                }
                resourceRules_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.PARSER,
                        extensionRegistry));
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  nonResourceRules_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule>();
                  mutable_bitField0_ |= 0x00000002;
                }
                nonResourceRules_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.PARSER,
                        extensionRegistry));
                break;
              }
            case 24:
              {
                bitField0_ |= 0x00000001;
                incomplete_ = input.readBool();
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                evaluationError_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          resourceRules_ = java.util.Collections.unmodifiableList(resourceRules_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          nonResourceRules_ = java.util.Collections.unmodifiableList(nonResourceRules_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SubjectRulesReviewStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Authorization
          .internal_static_k8s_io_api_authorization_v1beta1_SubjectRulesReviewStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus.class,
              io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus.Builder
                  .class);
    }

    private int bitField0_;
    public static final int RESOURCERULES_FIELD_NUMBER = 1;
    private java.util.List<io.kubernetes.client.proto.V1beta1Authorization.ResourceRule>
        resourceRules_;
    /**
     *
     *
     * <pre>
     * ResourceRules is the list of actions the subject is allowed to perform on resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Authorization.ResourceRule>
        getResourceRulesList() {
      return resourceRules_;
    }
    /**
     *
     *
     * <pre>
     * ResourceRules is the list of actions the subject is allowed to perform on resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1beta1Authorization.ResourceRuleOrBuilder>
        getResourceRulesOrBuilderList() {
      return resourceRules_;
    }
    /**
     *
     *
     * <pre>
     * ResourceRules is the list of actions the subject is allowed to perform on resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;</code>
     */
    public int getResourceRulesCount() {
      return resourceRules_.size();
    }
    /**
     *
     *
     * <pre>
     * ResourceRules is the list of actions the subject is allowed to perform on resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.ResourceRule getResourceRules(
        int index) {
      return resourceRules_.get(index);
    }
    /**
     *
     *
     * <pre>
     * ResourceRules is the list of actions the subject is allowed to perform on resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;</code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.ResourceRuleOrBuilder
        getResourceRulesOrBuilder(int index) {
      return resourceRules_.get(index);
    }

    public static final int NONRESOURCERULES_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule>
        nonResourceRules_;
    /**
     *
     *
     * <pre>
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
     * </code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule>
        getNonResourceRulesList() {
      return nonResourceRules_;
    }
    /**
     *
     *
     * <pre>
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
     * </code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1beta1Authorization.NonResourceRuleOrBuilder>
        getNonResourceRulesOrBuilderList() {
      return nonResourceRules_;
    }
    /**
     *
     *
     * <pre>
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
     * </code>
     */
    public int getNonResourceRulesCount() {
      return nonResourceRules_.size();
    }
    /**
     *
     *
     * <pre>
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule getNonResourceRules(
        int index) {
      return nonResourceRules_.get(index);
    }
    /**
     *
     *
     * <pre>
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
     * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * </pre>
     *
     * <code>repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Authorization.NonResourceRuleOrBuilder
        getNonResourceRulesOrBuilder(int index) {
      return nonResourceRules_.get(index);
    }

    public static final int INCOMPLETE_FIELD_NUMBER = 3;
    private boolean incomplete_;
    /**
     *
     *
     * <pre>
     * Incomplete is true when the rules returned by this call are incomplete. This is most commonly
     * encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
     * </pre>
     *
     * <code>optional bool incomplete = 3;</code>
     */
    public boolean hasIncomplete() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Incomplete is true when the rules returned by this call are incomplete. This is most commonly
     * encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
     * </pre>
     *
     * <code>optional bool incomplete = 3;</code>
     */
    public boolean getIncomplete() {
      return incomplete_;
    }

    public static final int EVALUATIONERROR_FIELD_NUMBER = 4;
    private volatile java.lang.Object evaluationError_;
    /**
     *
     *
     * <pre>
     * EvaluationError can appear in combination with Rules. It indicates an error occurred during
     * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
     * ResourceRules and/or NonResourceRules may be incomplete.
     * +optional
     * </pre>
     *
     * <code>optional string evaluationError = 4;</code>
     */
    public boolean hasEvaluationError() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * EvaluationError can appear in combination with Rules. It indicates an error occurred during
     * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
     * ResourceRules and/or NonResourceRules may be incomplete.
     * +optional
     * </pre>
     *
     * <code>optional string evaluationError = 4;</code>
     */
    public java.lang.String getEvaluationError() {
      java.lang.Object ref = evaluationError_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          evaluationError_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * EvaluationError can appear in combination with Rules. It indicates an error occurred during
     * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
     * ResourceRules and/or NonResourceRules may be incomplete.
     * +optional
     * </pre>
     *
     * <code>optional string evaluationError = 4;</code>
     */
    public com.google.protobuf.ByteString getEvaluationErrorBytes() {
      java.lang.Object ref = evaluationError_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        evaluationError_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      for (int i = 0; i < resourceRules_.size(); i++) {
        output.writeMessage(1, resourceRules_.get(i));
      }
      for (int i = 0; i < nonResourceRules_.size(); i++) {
        output.writeMessage(2, nonResourceRules_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(3, incomplete_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, evaluationError_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < resourceRules_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, resourceRules_.get(i));
      }
      for (int i = 0; i < nonResourceRules_.size(); i++) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(2, nonResourceRules_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, incomplete_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, evaluationError_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj
          instanceof io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus other =
          (io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus) obj;

      boolean result = true;
      result = result && getResourceRulesList().equals(other.getResourceRulesList());
      result = result && getNonResourceRulesList().equals(other.getNonResourceRulesList());
      result = result && (hasIncomplete() == other.hasIncomplete());
      if (hasIncomplete()) {
        result = result && (getIncomplete() == other.getIncomplete());
      }
      result = result && (hasEvaluationError() == other.hasEvaluationError());
      if (hasEvaluationError()) {
        result = result && getEvaluationError().equals(other.getEvaluationError());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getResourceRulesCount() > 0) {
        hash = (37 * hash) + RESOURCERULES_FIELD_NUMBER;
        hash = (53 * hash) + getResourceRulesList().hashCode();
      }
      if (getNonResourceRulesCount() > 0) {
        hash = (37 * hash) + NONRESOURCERULES_FIELD_NUMBER;
        hash = (53 * hash) + getNonResourceRulesList().hashCode();
      }
      if (hasIncomplete()) {
        hash = (37 * hash) + INCOMPLETE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIncomplete());
      }
      if (hasEvaluationError()) {
        hash = (37 * hash) + EVALUATIONERROR_FIELD_NUMBER;
        hash = (53 * hash) + getEvaluationError().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on
     * the set of authorizers the server is configured with and any errors experienced during evaluation.
     * Because authorization rules are additive, if a rule appears in a list it's safe to assume the subject has that permission,
     * even if that list is incomplete.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus)
        io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SubjectRulesReviewStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SubjectRulesReviewStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus.class,
                io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getResourceRulesFieldBuilder();
          getNonResourceRulesFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (resourceRulesBuilder_ == null) {
          resourceRules_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          resourceRulesBuilder_.clear();
        }
        if (nonResourceRulesBuilder_ == null) {
          nonResourceRules_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          nonResourceRulesBuilder_.clear();
        }
        incomplete_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        evaluationError_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Authorization
            .internal_static_k8s_io_api_authorization_v1beta1_SubjectRulesReviewStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus build() {
        io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus result =
            new io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (resourceRulesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            resourceRules_ = java.util.Collections.unmodifiableList(resourceRules_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.resourceRules_ = resourceRules_;
        } else {
          result.resourceRules_ = resourceRulesBuilder_.build();
        }
        if (nonResourceRulesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            nonResourceRules_ = java.util.Collections.unmodifiableList(nonResourceRules_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.nonResourceRules_ = nonResourceRules_;
        } else {
          result.nonResourceRules_ = nonResourceRulesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000001;
        }
        result.incomplete_ = incomplete_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000002;
        }
        result.evaluationError_ = evaluationError_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
                .getDefaultInstance()) return this;
        if (resourceRulesBuilder_ == null) {
          if (!other.resourceRules_.isEmpty()) {
            if (resourceRules_.isEmpty()) {
              resourceRules_ = other.resourceRules_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureResourceRulesIsMutable();
              resourceRules_.addAll(other.resourceRules_);
            }
            onChanged();
          }
        } else {
          if (!other.resourceRules_.isEmpty()) {
            if (resourceRulesBuilder_.isEmpty()) {
              resourceRulesBuilder_.dispose();
              resourceRulesBuilder_ = null;
              resourceRules_ = other.resourceRules_;
              bitField0_ = (bitField0_ & ~0x00000001);
              resourceRulesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getResourceRulesFieldBuilder()
                      : null;
            } else {
              resourceRulesBuilder_.addAllMessages(other.resourceRules_);
            }
          }
        }
        if (nonResourceRulesBuilder_ == null) {
          if (!other.nonResourceRules_.isEmpty()) {
            if (nonResourceRules_.isEmpty()) {
              nonResourceRules_ = other.nonResourceRules_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureNonResourceRulesIsMutable();
              nonResourceRules_.addAll(other.nonResourceRules_);
            }
            onChanged();
          }
        } else {
          if (!other.nonResourceRules_.isEmpty()) {
            if (nonResourceRulesBuilder_.isEmpty()) {
              nonResourceRulesBuilder_.dispose();
              nonResourceRulesBuilder_ = null;
              nonResourceRules_ = other.nonResourceRules_;
              bitField0_ = (bitField0_ & ~0x00000002);
              nonResourceRulesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getNonResourceRulesFieldBuilder()
                      : null;
            } else {
              nonResourceRulesBuilder_.addAllMessages(other.nonResourceRules_);
            }
          }
        }
        if (other.hasIncomplete()) {
          setIncomplete(other.getIncomplete());
        }
        if (other.hasEvaluationError()) {
          bitField0_ |= 0x00000008;
          evaluationError_ = other.evaluationError_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.util.List<io.kubernetes.client.proto.V1beta1Authorization.ResourceRule>
          resourceRules_ = java.util.Collections.emptyList();

      private void ensureResourceRulesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          resourceRules_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Authorization.ResourceRule>(
                  resourceRules_);
          bitField0_ |= 0x00000001;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.ResourceRule,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceRuleOrBuilder>
          resourceRulesBuilder_;

      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Authorization.ResourceRule>
          getResourceRulesList() {
        if (resourceRulesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(resourceRules_);
        } else {
          return resourceRulesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public int getResourceRulesCount() {
        if (resourceRulesBuilder_ == null) {
          return resourceRules_.size();
        } else {
          return resourceRulesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceRule getResourceRules(
          int index) {
        if (resourceRulesBuilder_ == null) {
          return resourceRules_.get(index);
        } else {
          return resourceRulesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public Builder setResourceRules(
          int index, io.kubernetes.client.proto.V1beta1Authorization.ResourceRule value) {
        if (resourceRulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResourceRulesIsMutable();
          resourceRules_.set(index, value);
          onChanged();
        } else {
          resourceRulesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public Builder setResourceRules(
          int index,
          io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.Builder builderForValue) {
        if (resourceRulesBuilder_ == null) {
          ensureResourceRulesIsMutable();
          resourceRules_.set(index, builderForValue.build());
          onChanged();
        } else {
          resourceRulesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public Builder addResourceRules(
          io.kubernetes.client.proto.V1beta1Authorization.ResourceRule value) {
        if (resourceRulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResourceRulesIsMutable();
          resourceRules_.add(value);
          onChanged();
        } else {
          resourceRulesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public Builder addResourceRules(
          int index, io.kubernetes.client.proto.V1beta1Authorization.ResourceRule value) {
        if (resourceRulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResourceRulesIsMutable();
          resourceRules_.add(index, value);
          onChanged();
        } else {
          resourceRulesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public Builder addResourceRules(
          io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.Builder builderForValue) {
        if (resourceRulesBuilder_ == null) {
          ensureResourceRulesIsMutable();
          resourceRules_.add(builderForValue.build());
          onChanged();
        } else {
          resourceRulesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public Builder addResourceRules(
          int index,
          io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.Builder builderForValue) {
        if (resourceRulesBuilder_ == null) {
          ensureResourceRulesIsMutable();
          resourceRules_.add(index, builderForValue.build());
          onChanged();
        } else {
          resourceRulesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public Builder addAllResourceRules(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1beta1Authorization.ResourceRule>
              values) {
        if (resourceRulesBuilder_ == null) {
          ensureResourceRulesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, resourceRules_);
          onChanged();
        } else {
          resourceRulesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public Builder clearResourceRules() {
        if (resourceRulesBuilder_ == null) {
          resourceRules_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          resourceRulesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public Builder removeResourceRules(int index) {
        if (resourceRulesBuilder_ == null) {
          ensureResourceRulesIsMutable();
          resourceRules_.remove(index);
          onChanged();
        } else {
          resourceRulesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.Builder
          getResourceRulesBuilder(int index) {
        return getResourceRulesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceRuleOrBuilder
          getResourceRulesOrBuilder(int index) {
        if (resourceRulesBuilder_ == null) {
          return resourceRules_.get(index);
        } else {
          return resourceRulesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1beta1Authorization.ResourceRuleOrBuilder>
          getResourceRulesOrBuilderList() {
        if (resourceRulesBuilder_ != null) {
          return resourceRulesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(resourceRules_);
        }
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.Builder
          addResourceRulesBuilder() {
        return getResourceRulesFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.Builder
          addResourceRulesBuilder(int index) {
        return getResourceRulesFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ResourceRules is the list of actions the subject is allowed to perform on resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>repeated .k8s.io.api.authorization.v1beta1.ResourceRule resourceRules = 1;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.Builder>
          getResourceRulesBuilderList() {
        return getResourceRulesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.ResourceRule,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.ResourceRuleOrBuilder>
          getResourceRulesFieldBuilder() {
        if (resourceRulesBuilder_ == null) {
          resourceRulesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.ResourceRule,
                  io.kubernetes.client.proto.V1beta1Authorization.ResourceRule.Builder,
                  io.kubernetes.client.proto.V1beta1Authorization.ResourceRuleOrBuilder>(
                  resourceRules_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          resourceRules_ = null;
        }
        return resourceRulesBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule>
          nonResourceRules_ = java.util.Collections.emptyList();

      private void ensureNonResourceRulesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          nonResourceRules_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule>(
                  nonResourceRules_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceRuleOrBuilder>
          nonResourceRulesBuilder_;

      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule>
          getNonResourceRulesList() {
        if (nonResourceRulesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(nonResourceRules_);
        } else {
          return nonResourceRulesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public int getNonResourceRulesCount() {
        if (nonResourceRulesBuilder_ == null) {
          return nonResourceRules_.size();
        } else {
          return nonResourceRulesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule getNonResourceRules(
          int index) {
        if (nonResourceRulesBuilder_ == null) {
          return nonResourceRules_.get(index);
        } else {
          return nonResourceRulesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public Builder setNonResourceRules(
          int index, io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule value) {
        if (nonResourceRulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNonResourceRulesIsMutable();
          nonResourceRules_.set(index, value);
          onChanged();
        } else {
          nonResourceRulesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public Builder setNonResourceRules(
          int index,
          io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.Builder builderForValue) {
        if (nonResourceRulesBuilder_ == null) {
          ensureNonResourceRulesIsMutable();
          nonResourceRules_.set(index, builderForValue.build());
          onChanged();
        } else {
          nonResourceRulesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public Builder addNonResourceRules(
          io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule value) {
        if (nonResourceRulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNonResourceRulesIsMutable();
          nonResourceRules_.add(value);
          onChanged();
        } else {
          nonResourceRulesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public Builder addNonResourceRules(
          int index, io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule value) {
        if (nonResourceRulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNonResourceRulesIsMutable();
          nonResourceRules_.add(index, value);
          onChanged();
        } else {
          nonResourceRulesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public Builder addNonResourceRules(
          io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.Builder builderForValue) {
        if (nonResourceRulesBuilder_ == null) {
          ensureNonResourceRulesIsMutable();
          nonResourceRules_.add(builderForValue.build());
          onChanged();
        } else {
          nonResourceRulesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public Builder addNonResourceRules(
          int index,
          io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.Builder builderForValue) {
        if (nonResourceRulesBuilder_ == null) {
          ensureNonResourceRulesIsMutable();
          nonResourceRules_.add(index, builderForValue.build());
          onChanged();
        } else {
          nonResourceRulesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public Builder addAllNonResourceRules(
          java.lang.Iterable<
                  ? extends io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule>
              values) {
        if (nonResourceRulesBuilder_ == null) {
          ensureNonResourceRulesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, nonResourceRules_);
          onChanged();
        } else {
          nonResourceRulesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public Builder clearNonResourceRules() {
        if (nonResourceRulesBuilder_ == null) {
          nonResourceRules_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          nonResourceRulesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public Builder removeNonResourceRules(int index) {
        if (nonResourceRulesBuilder_ == null) {
          ensureNonResourceRulesIsMutable();
          nonResourceRules_.remove(index);
          onChanged();
        } else {
          nonResourceRulesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.Builder
          getNonResourceRulesBuilder(int index) {
        return getNonResourceRulesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceRuleOrBuilder
          getNonResourceRulesOrBuilder(int index) {
        if (nonResourceRulesBuilder_ == null) {
          return nonResourceRules_.get(index);
        } else {
          return nonResourceRulesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1beta1Authorization.NonResourceRuleOrBuilder>
          getNonResourceRulesOrBuilderList() {
        if (nonResourceRulesBuilder_ != null) {
          return nonResourceRulesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(nonResourceRules_);
        }
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.Builder
          addNonResourceRulesBuilder() {
        return getNonResourceRulesFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.Builder
          addNonResourceRulesBuilder(int index) {
        return getNonResourceRulesFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
       * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.authorization.v1beta1.NonResourceRule nonResourceRules = 2;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.Builder>
          getNonResourceRulesBuilderList() {
        return getNonResourceRulesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.Builder,
              io.kubernetes.client.proto.V1beta1Authorization.NonResourceRuleOrBuilder>
          getNonResourceRulesFieldBuilder() {
        if (nonResourceRulesBuilder_ == null) {
          nonResourceRulesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule,
                  io.kubernetes.client.proto.V1beta1Authorization.NonResourceRule.Builder,
                  io.kubernetes.client.proto.V1beta1Authorization.NonResourceRuleOrBuilder>(
                  nonResourceRules_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          nonResourceRules_ = null;
        }
        return nonResourceRulesBuilder_;
      }

      private boolean incomplete_;
      /**
       *
       *
       * <pre>
       * Incomplete is true when the rules returned by this call are incomplete. This is most commonly
       * encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
       * </pre>
       *
       * <code>optional bool incomplete = 3;</code>
       */
      public boolean hasIncomplete() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Incomplete is true when the rules returned by this call are incomplete. This is most commonly
       * encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
       * </pre>
       *
       * <code>optional bool incomplete = 3;</code>
       */
      public boolean getIncomplete() {
        return incomplete_;
      }
      /**
       *
       *
       * <pre>
       * Incomplete is true when the rules returned by this call are incomplete. This is most commonly
       * encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
       * </pre>
       *
       * <code>optional bool incomplete = 3;</code>
       */
      public Builder setIncomplete(boolean value) {
        bitField0_ |= 0x00000004;
        incomplete_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Incomplete is true when the rules returned by this call are incomplete. This is most commonly
       * encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
       * </pre>
       *
       * <code>optional bool incomplete = 3;</code>
       */
      public Builder clearIncomplete() {
        bitField0_ = (bitField0_ & ~0x00000004);
        incomplete_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object evaluationError_ = "";
      /**
       *
       *
       * <pre>
       * EvaluationError can appear in combination with Rules. It indicates an error occurred during
       * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
       * ResourceRules and/or NonResourceRules may be incomplete.
       * +optional
       * </pre>
       *
       * <code>optional string evaluationError = 4;</code>
       */
      public boolean hasEvaluationError() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * EvaluationError can appear in combination with Rules. It indicates an error occurred during
       * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
       * ResourceRules and/or NonResourceRules may be incomplete.
       * +optional
       * </pre>
       *
       * <code>optional string evaluationError = 4;</code>
       */
      public java.lang.String getEvaluationError() {
        java.lang.Object ref = evaluationError_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            evaluationError_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * EvaluationError can appear in combination with Rules. It indicates an error occurred during
       * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
       * ResourceRules and/or NonResourceRules may be incomplete.
       * +optional
       * </pre>
       *
       * <code>optional string evaluationError = 4;</code>
       */
      public com.google.protobuf.ByteString getEvaluationErrorBytes() {
        java.lang.Object ref = evaluationError_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          evaluationError_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * EvaluationError can appear in combination with Rules. It indicates an error occurred during
       * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
       * ResourceRules and/or NonResourceRules may be incomplete.
       * +optional
       * </pre>
       *
       * <code>optional string evaluationError = 4;</code>
       */
      public Builder setEvaluationError(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        evaluationError_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * EvaluationError can appear in combination with Rules. It indicates an error occurred during
       * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
       * ResourceRules and/or NonResourceRules may be incomplete.
       * +optional
       * </pre>
       *
       * <code>optional string evaluationError = 4;</code>
       */
      public Builder clearEvaluationError() {
        bitField0_ = (bitField0_ & ~0x00000008);
        evaluationError_ = getDefaultInstance().getEvaluationError();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * EvaluationError can appear in combination with Rules. It indicates an error occurred during
       * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
       * ResourceRules and/or NonResourceRules may be incomplete.
       * +optional
       * </pre>
       *
       * <code>optional string evaluationError = 4;</code>
       */
      public Builder setEvaluationErrorBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        evaluationError_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.authorization.v1beta1.SubjectRulesReviewStatus)
    private static final io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus();
    }

    public static io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<SubjectRulesReviewStatus> PARSER =
        new com.google.protobuf.AbstractParser<SubjectRulesReviewStatus>() {
          @java.lang.Override
          public SubjectRulesReviewStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new SubjectRulesReviewStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<SubjectRulesReviewStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubjectRulesReviewStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Authorization.SubjectRulesReviewStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_ExtraValue_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_ExtraValue_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_LocalSubjectAccessReview_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_LocalSubjectAccessReview_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_NonResourceAttributes_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_NonResourceAttributes_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_NonResourceRule_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_NonResourceRule_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_ResourceAttributes_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_ResourceAttributes_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_ResourceRule_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_ResourceRule_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReview_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReview_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReviewSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReviewSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReview_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReview_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReviewSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReviewSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReview_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReview_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_ExtraEntry_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_ExtraEntry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_authorization_v1beta1_SubjectRulesReviewStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_authorization_v1beta1_SubjectRulesReviewStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0k8s.io/api/authorization/v1beta1/gener"
          + "ated.proto\022 k8s.io.api.authorization.v1b"
          + "eta1\0324k8s.io/apimachinery/pkg/apis/meta/"
          + "v1/generated.proto\032/k8s.io/apimachinery/"
          + "pkg/runtime/generated.proto\0326k8s.io/apim"
          + "achinery/pkg/runtime/schema/generated.pr"
          + "oto\"\033\n\nExtraValue\022\r\n\005items\030\001 \003(\t\"\364\001\n\030Loc"
          + "alSubjectAccessReview\022B\n\010metadata\030\001 \001(\0132"
          + "0.k8s.io.apimachinery.pkg.apis.meta.v1.O"
          + "bjectMeta\022G\n\004spec\030\002 \001(\01329.k8s.io.api.aut"
          + "horization.v1beta1.SubjectAccessReviewSp"
          + "ec\022K\n\006status\030\003 \001(\0132;.k8s.io.api.authoriz"
          + "ation.v1beta1.SubjectAccessReviewStatus\""
          + "3\n\025NonResourceAttributes\022\014\n\004path\030\001 \001(\t\022\014"
          + "\n\004verb\030\002 \001(\t\"9\n\017NonResourceRule\022\r\n\005verbs"
          + "\030\001 \003(\t\022\027\n\017nonResourceURLs\030\002 \003(\t\"\212\001\n\022Reso"
          + "urceAttributes\022\021\n\tnamespace\030\001 \001(\t\022\014\n\004ver"
          + "b\030\002 \001(\t\022\r\n\005group\030\003 \001(\t\022\017\n\007version\030\004 \001(\t\022"
          + "\020\n\010resource\030\005 \001(\t\022\023\n\013subresource\030\006 \001(\t\022\014"
          + "\n\004name\030\007 \001(\t\"Z\n\014ResourceRule\022\r\n\005verbs\030\001 "
          + "\003(\t\022\021\n\tapiGroups\030\002 \003(\t\022\021\n\tresources\030\003 \003("
          + "\t\022\025\n\rresourceNames\030\004 \003(\t\"\367\001\n\027SelfSubject"
          + "AccessReview\022B\n\010metadata\030\001 \001(\01320.k8s.io."
          + "apimachinery.pkg.apis.meta.v1.ObjectMeta"
          + "\022K\n\004spec\030\002 \001(\0132=.k8s.io.api.authorizatio"
          + "n.v1beta1.SelfSubjectAccessReviewSpec\022K\n"
          + "\006status\030\003 \001(\0132;.k8s.io.api.authorization"
          + ".v1beta1.SubjectAccessReviewStatus\"\307\001\n\033S"
          + "elfSubjectAccessReviewSpec\022P\n\022resourceAt"
          + "tributes\030\001 \001(\01324.k8s.io.api.authorizatio"
          + "n.v1beta1.ResourceAttributes\022V\n\025nonResou"
          + "rceAttributes\030\002 \001(\01327.k8s.io.api.authori"
          + "zation.v1beta1.NonResourceAttributes\"\364\001\n"
          + "\026SelfSubjectRulesReview\022B\n\010metadata\030\001 \001("
          + "\01320.k8s.io.apimachinery.pkg.apis.meta.v1"
          + ".ObjectMeta\022J\n\004spec\030\002 \001(\0132<.k8s.io.api.a"
          + "uthorization.v1beta1.SelfSubjectRulesRev"
          + "iewSpec\022J\n\006status\030\003 \001(\0132:.k8s.io.api.aut"
          + "horization.v1beta1.SubjectRulesReviewSta"
          + "tus\"/\n\032SelfSubjectRulesReviewSpec\022\021\n\tnam"
          + "espace\030\001 \001(\t\"\357\001\n\023SubjectAccessReview\022B\n\010"
          + "metadata\030\001 \001(\01320.k8s.io.apimachinery.pkg"
          + ".apis.meta.v1.ObjectMeta\022G\n\004spec\030\002 \001(\01329"
          + ".k8s.io.api.authorization.v1beta1.Subjec"
          + "tAccessReviewSpec\022K\n\006status\030\003 \001(\0132;.k8s."
          + "io.api.authorization.v1beta1.SubjectAcce"
          + "ssReviewStatus\"\236\003\n\027SubjectAccessReviewSp"
          + "ec\022P\n\022resourceAttributes\030\001 \001(\01324.k8s.io."
          + "api.authorization.v1beta1.ResourceAttrib"
          + "utes\022V\n\025nonResourceAttributes\030\002 \001(\01327.k8"
          + "s.io.api.authorization.v1beta1.NonResour"
          + "ceAttributes\022\014\n\004user\030\003 \001(\t\022\r\n\005group\030\004 \003("
          + "\t\022S\n\005extra\030\005 \003(\0132D.k8s.io.api.authorizat"
          + "ion.v1beta1.SubjectAccessReviewSpec.Extr"
          + "aEntry\022\013\n\003uid\030\006 \001(\t\032Z\n\nExtraEntry\022\013\n\003key"
          + "\030\001 \001(\t\022;\n\005value\030\002 \001(\0132,.k8s.io.api.autho"
          + "rization.v1beta1.ExtraValue:\0028\001\"e\n\031Subje"
          + "ctAccessReviewStatus\022\017\n\007allowed\030\001 \001(\010\022\016\n"
          + "\006denied\030\004 \001(\010\022\016\n\006reason\030\002 \001(\t\022\027\n\017evaluat"
          + "ionError\030\003 \001(\t\"\333\001\n\030SubjectRulesReviewSta"
          + "tus\022E\n\rresourceRules\030\001 \003(\0132..k8s.io.api."
          + "authorization.v1beta1.ResourceRule\022K\n\020no"
          + "nResourceRules\030\002 \003(\01321.k8s.io.api.author"
          + "ization.v1beta1.NonResourceRule\022\022\n\nincom"
          + "plete\030\003 \001(\010\022\027\n\017evaluationError\030\004 \001(\tB;\n\032"
          + "io.kubernetes.client.protoB\024V1beta1Autho"
          + "rizationZ\007v1beta1"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_authorization_v1beta1_ExtraValue_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_authorization_v1beta1_ExtraValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_ExtraValue_descriptor,
            new java.lang.String[] {
              "Items",
            });
    internal_static_k8s_io_api_authorization_v1beta1_LocalSubjectAccessReview_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_authorization_v1beta1_LocalSubjectAccessReview_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_LocalSubjectAccessReview_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_authorization_v1beta1_NonResourceAttributes_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_authorization_v1beta1_NonResourceAttributes_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_NonResourceAttributes_descriptor,
            new java.lang.String[] {
              "Path", "Verb",
            });
    internal_static_k8s_io_api_authorization_v1beta1_NonResourceRule_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_authorization_v1beta1_NonResourceRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_NonResourceRule_descriptor,
            new java.lang.String[] {
              "Verbs", "NonResourceURLs",
            });
    internal_static_k8s_io_api_authorization_v1beta1_ResourceAttributes_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_authorization_v1beta1_ResourceAttributes_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_ResourceAttributes_descriptor,
            new java.lang.String[] {
              "Namespace", "Verb", "Group", "Version", "Resource", "Subresource", "Name",
            });
    internal_static_k8s_io_api_authorization_v1beta1_ResourceRule_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_k8s_io_api_authorization_v1beta1_ResourceRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_ResourceRule_descriptor,
            new java.lang.String[] {
              "Verbs", "ApiGroups", "Resources", "ResourceNames",
            });
    internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReview_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReview_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReview_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReviewSpec_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReviewSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectAccessReviewSpec_descriptor,
            new java.lang.String[] {
              "ResourceAttributes", "NonResourceAttributes",
            });
    internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReview_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReview_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReview_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReviewSpec_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReviewSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_SelfSubjectRulesReviewSpec_descriptor,
            new java.lang.String[] {
              "Namespace",
            });
    internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReview_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReview_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReview_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_descriptor,
            new java.lang.String[] {
              "ResourceAttributes", "NonResourceAttributes", "User", "Group", "Extra", "Uid",
            });
    internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_ExtraEntry_descriptor =
        internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_ExtraEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewSpec_ExtraEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewStatus_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_SubjectAccessReviewStatus_descriptor,
            new java.lang.String[] {
              "Allowed", "Denied", "Reason", "EvaluationError",
            });
    internal_static_k8s_io_api_authorization_v1beta1_SubjectRulesReviewStatus_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_k8s_io_api_authorization_v1beta1_SubjectRulesReviewStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_authorization_v1beta1_SubjectRulesReviewStatus_descriptor,
            new java.lang.String[] {
              "ResourceRules", "NonResourceRules", "Incomplete", "EvaluationError",
            });
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
