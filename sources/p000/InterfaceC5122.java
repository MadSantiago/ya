package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: renamed from: ۦْۙؖۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5122 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(InterfaceC3838 interfaceC3838);

    void getAppInstanceId(InterfaceC3838 interfaceC3838);

    void getCachedAppInstanceId(InterfaceC3838 interfaceC3838);

    void getConditionalUserProperties(String str, String str2, InterfaceC3838 interfaceC3838);

    void getCurrentScreenClass(InterfaceC3838 interfaceC3838);

    void getCurrentScreenName(InterfaceC3838 interfaceC3838);

    void getGmpAppId(InterfaceC3838 interfaceC3838);

    void getMaxUserProperties(String str, InterfaceC3838 interfaceC3838);

    void getSessionId(InterfaceC3838 interfaceC3838);

    void getTestFlag(InterfaceC3838 interfaceC3838, int i);

    void getUserProperties(String str, String str2, boolean z, InterfaceC3838 interfaceC3838);

    void initForTests(Map map);

    void initialize(InterfaceC2410 interfaceC2410, C1302 c1302, long j);

    void initializeWithElapsedTime(InterfaceC2410 interfaceC2410, C1302 c1302, long j, long j2);

    void isDataCollectionEnabled(InterfaceC3838 interfaceC3838);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC3838 interfaceC3838, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, InterfaceC2410 interfaceC2410, InterfaceC2410 interfaceC2411, InterfaceC2410 interfaceC2412);

    void onActivityCreated(InterfaceC2410 interfaceC2410, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(C3156 c3156, Bundle bundle, long j);

    void onActivityDestroyed(InterfaceC2410 interfaceC2410, long j);

    void onActivityDestroyedByScionActivityInfo(C3156 c3156, long j);

    void onActivityPaused(InterfaceC2410 interfaceC2410, long j);

    void onActivityPausedByScionActivityInfo(C3156 c3156, long j);

    void onActivityResumed(InterfaceC2410 interfaceC2410, long j);

    void onActivityResumedByScionActivityInfo(C3156 c3156, long j);

    void onActivitySaveInstanceState(InterfaceC2410 interfaceC2410, InterfaceC3838 interfaceC3838, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(C3156 c3156, InterfaceC3838 interfaceC3838, long j);

    void onActivityStarted(InterfaceC2410 interfaceC2410, long j);

    void onActivityStartedByScionActivityInfo(C3156 c3156, long j);

    void onActivityStopped(InterfaceC2410 interfaceC2410, long j);

    void onActivityStoppedByScionActivityInfo(C3156 c3156, long j);

    void performAction(Bundle bundle, InterfaceC3838 interfaceC3838, long j);

    void registerOnMeasurementEventListener(InterfaceC0257 interfaceC0257);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(InterfaceC3941 interfaceC3941);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(InterfaceC2410 interfaceC2410, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(C3156 c3156, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC0257 interfaceC0257);

    void setInstanceIdProvider(InterfaceC2353 interfaceC2353);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, InterfaceC2410 interfaceC2410, boolean z, long j);

    void unregisterOnMeasurementEventListener(InterfaceC0257 interfaceC0257);
}
