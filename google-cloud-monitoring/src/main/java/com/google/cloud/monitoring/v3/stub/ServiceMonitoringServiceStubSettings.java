/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.monitoring.v3.stub;

import static com.google.cloud.monitoring.v3.ServiceMonitoringServiceClient.ListServiceLevelObjectivesPagedResponse;
import static com.google.cloud.monitoring.v3.ServiceMonitoringServiceClient.ListServicesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.monitoring.v3.CreateServiceLevelObjectiveRequest;
import com.google.monitoring.v3.CreateServiceRequest;
import com.google.monitoring.v3.DeleteServiceLevelObjectiveRequest;
import com.google.monitoring.v3.DeleteServiceRequest;
import com.google.monitoring.v3.GetServiceLevelObjectiveRequest;
import com.google.monitoring.v3.GetServiceRequest;
import com.google.monitoring.v3.ListServiceLevelObjectivesRequest;
import com.google.monitoring.v3.ListServiceLevelObjectivesResponse;
import com.google.monitoring.v3.ListServicesRequest;
import com.google.monitoring.v3.ListServicesResponse;
import com.google.monitoring.v3.Service;
import com.google.monitoring.v3.ServiceLevelObjective;
import com.google.monitoring.v3.UpdateServiceLevelObjectiveRequest;
import com.google.monitoring.v3.UpdateServiceRequest;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link ServiceMonitoringServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (monitoring.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of deleteService to 30 seconds:
 *
 * <pre>
 * <code>
 * ServiceMonitoringServiceStubSettings.Builder serviceMonitoringServiceSettingsBuilder =
 *     ServiceMonitoringServiceStubSettings.newBuilder();
 * serviceMonitoringServiceSettingsBuilder
 *     .deleteServiceSettings()
 *     .setRetrySettings(
 *         serviceMonitoringServiceSettingsBuilder.deleteServiceSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ServiceMonitoringServiceStubSettings serviceMonitoringServiceSettings = serviceMonitoringServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
public class ServiceMonitoringServiceStubSettings
    extends StubSettings<ServiceMonitoringServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/monitoring")
          .add("https://www.googleapis.com/auth/monitoring.read")
          .add("https://www.googleapis.com/auth/monitoring.write")
          .build();

  private final UnaryCallSettings<DeleteServiceRequest, Empty> deleteServiceSettings;
  private final UnaryCallSettings<DeleteServiceLevelObjectiveRequest, Empty>
      deleteServiceLevelObjectiveSettings;
  private final UnaryCallSettings<CreateServiceRequest, Service> createServiceSettings;
  private final UnaryCallSettings<GetServiceRequest, Service> getServiceSettings;
  private final PagedCallSettings<
          ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
      listServicesSettings;
  private final UnaryCallSettings<UpdateServiceRequest, Service> updateServiceSettings;
  private final UnaryCallSettings<CreateServiceLevelObjectiveRequest, ServiceLevelObjective>
      createServiceLevelObjectiveSettings;
  private final UnaryCallSettings<GetServiceLevelObjectiveRequest, ServiceLevelObjective>
      getServiceLevelObjectiveSettings;
  private final PagedCallSettings<
          ListServiceLevelObjectivesRequest,
          ListServiceLevelObjectivesResponse,
          ListServiceLevelObjectivesPagedResponse>
      listServiceLevelObjectivesSettings;
  private final UnaryCallSettings<UpdateServiceLevelObjectiveRequest, ServiceLevelObjective>
      updateServiceLevelObjectiveSettings;

  /** Returns the object with the settings used for calls to deleteService. */
  public UnaryCallSettings<DeleteServiceRequest, Empty> deleteServiceSettings() {
    return deleteServiceSettings;
  }

  /** Returns the object with the settings used for calls to deleteServiceLevelObjective. */
  public UnaryCallSettings<DeleteServiceLevelObjectiveRequest, Empty>
      deleteServiceLevelObjectiveSettings() {
    return deleteServiceLevelObjectiveSettings;
  }

  /** Returns the object with the settings used for calls to createService. */
  public UnaryCallSettings<CreateServiceRequest, Service> createServiceSettings() {
    return createServiceSettings;
  }

  /** Returns the object with the settings used for calls to getService. */
  public UnaryCallSettings<GetServiceRequest, Service> getServiceSettings() {
    return getServiceSettings;
  }

  /** Returns the object with the settings used for calls to listServices. */
  public PagedCallSettings<ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
      listServicesSettings() {
    return listServicesSettings;
  }

  /** Returns the object with the settings used for calls to updateService. */
  public UnaryCallSettings<UpdateServiceRequest, Service> updateServiceSettings() {
    return updateServiceSettings;
  }

  /** Returns the object with the settings used for calls to createServiceLevelObjective. */
  public UnaryCallSettings<CreateServiceLevelObjectiveRequest, ServiceLevelObjective>
      createServiceLevelObjectiveSettings() {
    return createServiceLevelObjectiveSettings;
  }

  /** Returns the object with the settings used for calls to getServiceLevelObjective. */
  public UnaryCallSettings<GetServiceLevelObjectiveRequest, ServiceLevelObjective>
      getServiceLevelObjectiveSettings() {
    return getServiceLevelObjectiveSettings;
  }

  /** Returns the object with the settings used for calls to listServiceLevelObjectives. */
  public PagedCallSettings<
          ListServiceLevelObjectivesRequest,
          ListServiceLevelObjectivesResponse,
          ListServiceLevelObjectivesPagedResponse>
      listServiceLevelObjectivesSettings() {
    return listServiceLevelObjectivesSettings;
  }

  /** Returns the object with the settings used for calls to updateServiceLevelObjective. */
  public UnaryCallSettings<UpdateServiceLevelObjectiveRequest, ServiceLevelObjective>
      updateServiceLevelObjectiveSettings() {
    return updateServiceLevelObjectiveSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ServiceMonitoringServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcServiceMonitoringServiceStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "monitoring.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ServiceMonitoringServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected ServiceMonitoringServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteServiceSettings = settingsBuilder.deleteServiceSettings().build();
    deleteServiceLevelObjectiveSettings =
        settingsBuilder.deleteServiceLevelObjectiveSettings().build();
    createServiceSettings = settingsBuilder.createServiceSettings().build();
    getServiceSettings = settingsBuilder.getServiceSettings().build();
    listServicesSettings = settingsBuilder.listServicesSettings().build();
    updateServiceSettings = settingsBuilder.updateServiceSettings().build();
    createServiceLevelObjectiveSettings =
        settingsBuilder.createServiceLevelObjectiveSettings().build();
    getServiceLevelObjectiveSettings = settingsBuilder.getServiceLevelObjectiveSettings().build();
    listServiceLevelObjectivesSettings =
        settingsBuilder.listServiceLevelObjectivesSettings().build();
    updateServiceLevelObjectiveSettings =
        settingsBuilder.updateServiceLevelObjectiveSettings().build();
  }

  private static final PagedListDescriptor<ListServicesRequest, ListServicesResponse, Service>
      LIST_SERVICES_PAGE_STR_DESC =
          new PagedListDescriptor<ListServicesRequest, ListServicesResponse, Service>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListServicesRequest injectToken(ListServicesRequest payload, String token) {
              return ListServicesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListServicesRequest injectPageSize(ListServicesRequest payload, int pageSize) {
              return ListServicesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListServicesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListServicesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Service> extractResources(ListServicesResponse payload) {
              return payload.getServicesList() != null
                  ? payload.getServicesList()
                  : ImmutableList.<Service>of();
            }
          };

  private static final PagedListDescriptor<
          ListServiceLevelObjectivesRequest,
          ListServiceLevelObjectivesResponse,
          ServiceLevelObjective>
      LIST_SERVICE_LEVEL_OBJECTIVES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListServiceLevelObjectivesRequest,
              ListServiceLevelObjectivesResponse,
              ServiceLevelObjective>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListServiceLevelObjectivesRequest injectToken(
                ListServiceLevelObjectivesRequest payload, String token) {
              return ListServiceLevelObjectivesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListServiceLevelObjectivesRequest injectPageSize(
                ListServiceLevelObjectivesRequest payload, int pageSize) {
              return ListServiceLevelObjectivesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListServiceLevelObjectivesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListServiceLevelObjectivesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ServiceLevelObjective> extractResources(
                ListServiceLevelObjectivesResponse payload) {
              return payload.getServiceLevelObjectivesList() != null
                  ? payload.getServiceLevelObjectivesList()
                  : ImmutableList.<ServiceLevelObjective>of();
            }
          };

  private static final PagedListResponseFactory<
          ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
      LIST_SERVICES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>() {
            @Override
            public ApiFuture<ListServicesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListServicesRequest, ListServicesResponse> callable,
                ListServicesRequest request,
                ApiCallContext context,
                ApiFuture<ListServicesResponse> futureResponse) {
              PageContext<ListServicesRequest, ListServicesResponse, Service> pageContext =
                  PageContext.create(callable, LIST_SERVICES_PAGE_STR_DESC, request, context);
              return ListServicesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListServiceLevelObjectivesRequest,
          ListServiceLevelObjectivesResponse,
          ListServiceLevelObjectivesPagedResponse>
      LIST_SERVICE_LEVEL_OBJECTIVES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListServiceLevelObjectivesRequest,
              ListServiceLevelObjectivesResponse,
              ListServiceLevelObjectivesPagedResponse>() {
            @Override
            public ApiFuture<ListServiceLevelObjectivesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListServiceLevelObjectivesRequest, ListServiceLevelObjectivesResponse>
                    callable,
                ListServiceLevelObjectivesRequest request,
                ApiCallContext context,
                ApiFuture<ListServiceLevelObjectivesResponse> futureResponse) {
              PageContext<
                      ListServiceLevelObjectivesRequest,
                      ListServiceLevelObjectivesResponse,
                      ServiceLevelObjective>
                  pageContext =
                      PageContext.create(
                          callable, LIST_SERVICE_LEVEL_OBJECTIVES_PAGE_STR_DESC, request, context);
              return ListServiceLevelObjectivesPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  /** Builder for ServiceMonitoringServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<ServiceMonitoringServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteServiceRequest, Empty> deleteServiceSettings;
    private final UnaryCallSettings.Builder<DeleteServiceLevelObjectiveRequest, Empty>
        deleteServiceLevelObjectiveSettings;
    private final UnaryCallSettings.Builder<CreateServiceRequest, Service> createServiceSettings;
    private final UnaryCallSettings.Builder<GetServiceRequest, Service> getServiceSettings;
    private final PagedCallSettings.Builder<
            ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
        listServicesSettings;
    private final UnaryCallSettings.Builder<UpdateServiceRequest, Service> updateServiceSettings;
    private final UnaryCallSettings.Builder<
            CreateServiceLevelObjectiveRequest, ServiceLevelObjective>
        createServiceLevelObjectiveSettings;
    private final UnaryCallSettings.Builder<GetServiceLevelObjectiveRequest, ServiceLevelObjective>
        getServiceLevelObjectiveSettings;
    private final PagedCallSettings.Builder<
            ListServiceLevelObjectivesRequest,
            ListServiceLevelObjectivesResponse,
            ListServiceLevelObjectivesPagedResponse>
        listServiceLevelObjectivesSettings;
    private final UnaryCallSettings.Builder<
            UpdateServiceLevelObjectiveRequest, ServiceLevelObjective>
        updateServiceLevelObjectiveSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      deleteServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteServiceLevelObjectiveSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      createServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listServicesSettings = PagedCallSettings.newBuilder(LIST_SERVICES_PAGE_STR_FACT);

      updateServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      createServiceLevelObjectiveSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getServiceLevelObjectiveSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listServiceLevelObjectivesSettings =
          PagedCallSettings.newBuilder(LIST_SERVICE_LEVEL_OBJECTIVES_PAGE_STR_FACT);

      updateServiceLevelObjectiveSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteServiceSettings,
              deleteServiceLevelObjectiveSettings,
              createServiceSettings,
              getServiceSettings,
              listServicesSettings,
              updateServiceSettings,
              createServiceLevelObjectiveSettings,
              getServiceLevelObjectiveSettings,
              listServiceLevelObjectivesSettings,
              updateServiceLevelObjectiveSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .deleteServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteServiceLevelObjectiveSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listServicesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updateServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createServiceLevelObjectiveSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getServiceLevelObjectiveSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listServiceLevelObjectivesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updateServiceLevelObjectiveSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(ServiceMonitoringServiceStubSettings settings) {
      super(settings);

      deleteServiceSettings = settings.deleteServiceSettings.toBuilder();
      deleteServiceLevelObjectiveSettings =
          settings.deleteServiceLevelObjectiveSettings.toBuilder();
      createServiceSettings = settings.createServiceSettings.toBuilder();
      getServiceSettings = settings.getServiceSettings.toBuilder();
      listServicesSettings = settings.listServicesSettings.toBuilder();
      updateServiceSettings = settings.updateServiceSettings.toBuilder();
      createServiceLevelObjectiveSettings =
          settings.createServiceLevelObjectiveSettings.toBuilder();
      getServiceLevelObjectiveSettings = settings.getServiceLevelObjectiveSettings.toBuilder();
      listServiceLevelObjectivesSettings = settings.listServiceLevelObjectivesSettings.toBuilder();
      updateServiceLevelObjectiveSettings =
          settings.updateServiceLevelObjectiveSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteServiceSettings,
              deleteServiceLevelObjectiveSettings,
              createServiceSettings,
              getServiceSettings,
              listServicesSettings,
              updateServiceSettings,
              createServiceLevelObjectiveSettings,
              getServiceLevelObjectiveSettings,
              listServiceLevelObjectivesSettings,
              updateServiceLevelObjectiveSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to deleteService. */
    public UnaryCallSettings.Builder<DeleteServiceRequest, Empty> deleteServiceSettings() {
      return deleteServiceSettings;
    }

    /** Returns the builder for the settings used for calls to deleteServiceLevelObjective. */
    public UnaryCallSettings.Builder<DeleteServiceLevelObjectiveRequest, Empty>
        deleteServiceLevelObjectiveSettings() {
      return deleteServiceLevelObjectiveSettings;
    }

    /** Returns the builder for the settings used for calls to createService. */
    public UnaryCallSettings.Builder<CreateServiceRequest, Service> createServiceSettings() {
      return createServiceSettings;
    }

    /** Returns the builder for the settings used for calls to getService. */
    public UnaryCallSettings.Builder<GetServiceRequest, Service> getServiceSettings() {
      return getServiceSettings;
    }

    /** Returns the builder for the settings used for calls to listServices. */
    public PagedCallSettings.Builder<
            ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
        listServicesSettings() {
      return listServicesSettings;
    }

    /** Returns the builder for the settings used for calls to updateService. */
    public UnaryCallSettings.Builder<UpdateServiceRequest, Service> updateServiceSettings() {
      return updateServiceSettings;
    }

    /** Returns the builder for the settings used for calls to createServiceLevelObjective. */
    public UnaryCallSettings.Builder<CreateServiceLevelObjectiveRequest, ServiceLevelObjective>
        createServiceLevelObjectiveSettings() {
      return createServiceLevelObjectiveSettings;
    }

    /** Returns the builder for the settings used for calls to getServiceLevelObjective. */
    public UnaryCallSettings.Builder<GetServiceLevelObjectiveRequest, ServiceLevelObjective>
        getServiceLevelObjectiveSettings() {
      return getServiceLevelObjectiveSettings;
    }

    /** Returns the builder for the settings used for calls to listServiceLevelObjectives. */
    public PagedCallSettings.Builder<
            ListServiceLevelObjectivesRequest,
            ListServiceLevelObjectivesResponse,
            ListServiceLevelObjectivesPagedResponse>
        listServiceLevelObjectivesSettings() {
      return listServiceLevelObjectivesSettings;
    }

    /** Returns the builder for the settings used for calls to updateServiceLevelObjective. */
    public UnaryCallSettings.Builder<UpdateServiceLevelObjectiveRequest, ServiceLevelObjective>
        updateServiceLevelObjectiveSettings() {
      return updateServiceLevelObjectiveSettings;
    }

    @Override
    public ServiceMonitoringServiceStubSettings build() throws IOException {
      return new ServiceMonitoringServiceStubSettings(this);
    }
  }
}
