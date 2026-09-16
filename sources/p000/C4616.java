package p000;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: ۦٍٛؓ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4616 extends AbstractC4249 implements InterfaceC5122 {
    @Override // p000.InterfaceC5122
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeString(str);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 23);
    }

    @Override // p000.InterfaceC5122
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeString(str);
        parcelM7504.writeString(str2);
        AbstractC5564.m9345(parcelM7504, bundle);
        m7505(parcelM7504, 9);
    }

    @Override // p000.InterfaceC5122
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeString(str);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 24);
    }

    @Override // p000.InterfaceC5122
    public final void generateEventId(InterfaceC3838 interfaceC3838) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9344(parcelM7504, interfaceC3838);
        m7505(parcelM7504, 22);
    }

    @Override // p000.InterfaceC5122
    public final void getCachedAppInstanceId(InterfaceC3838 interfaceC3838) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9344(parcelM7504, interfaceC3838);
        m7505(parcelM7504, 19);
    }

    @Override // p000.InterfaceC5122
    public final void getConditionalUserProperties(String str, String str2, InterfaceC3838 interfaceC3838) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeString(str);
        parcelM7504.writeString(str2);
        AbstractC5564.m9344(parcelM7504, interfaceC3838);
        m7505(parcelM7504, 10);
    }

    @Override // p000.InterfaceC5122
    public final void getCurrentScreenClass(InterfaceC3838 interfaceC3838) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9344(parcelM7504, interfaceC3838);
        m7505(parcelM7504, 17);
    }

    @Override // p000.InterfaceC5122
    public final void getCurrentScreenName(InterfaceC3838 interfaceC3838) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9344(parcelM7504, interfaceC3838);
        m7505(parcelM7504, 16);
    }

    @Override // p000.InterfaceC5122
    public final void getGmpAppId(InterfaceC3838 interfaceC3838) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9344(parcelM7504, interfaceC3838);
        m7505(parcelM7504, 21);
    }

    @Override // p000.InterfaceC5122
    public final void getMaxUserProperties(String str, InterfaceC3838 interfaceC3838) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeString(str);
        AbstractC5564.m9344(parcelM7504, interfaceC3838);
        m7505(parcelM7504, 6);
    }

    @Override // p000.InterfaceC5122
    public final void getUserProperties(String str, String str2, boolean z, InterfaceC3838 interfaceC3838) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeString(str);
        parcelM7504.writeString(str2);
        ClassLoader classLoader = AbstractC5564.f18370;
        parcelM7504.writeInt(z ? 1 : 0);
        AbstractC5564.m9344(parcelM7504, interfaceC3838);
        m7505(parcelM7504, 5);
    }

    @Override // p000.InterfaceC5122
    public final void initialize(InterfaceC2410 interfaceC2410, C1302 c1302, long j) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9344(parcelM7504, interfaceC2410);
        AbstractC5564.m9345(parcelM7504, c1302);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 1);
    }

    @Override // p000.InterfaceC5122
    public final void initializeWithElapsedTime(InterfaceC2410 interfaceC2410, C1302 c1302, long j, long j2) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9344(parcelM7504, interfaceC2410);
        AbstractC5564.m9345(parcelM7504, c1302);
        parcelM7504.writeLong(j);
        parcelM7504.writeLong(j2);
        m7505(parcelM7504, 60);
    }

    @Override // p000.InterfaceC5122
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeString(str);
        parcelM7504.writeString(str2);
        AbstractC5564.m9345(parcelM7504, bundle);
        parcelM7504.writeInt(1);
        parcelM7504.writeInt(1);
        parcelM7504.writeLong(j);
        parcelM7504.writeLong(j2);
        m7505(parcelM7504, 59);
    }

    @Override // p000.InterfaceC5122
    public final void logHealthData(int i, String str, InterfaceC2410 interfaceC2410, InterfaceC2410 interfaceC2411, InterfaceC2410 interfaceC2412) {
        Parcel parcelM7504 = m7504();
        parcelM7504.writeInt(5);
        parcelM7504.writeString("Error with data collection. Data lost.");
        AbstractC5564.m9344(parcelM7504, interfaceC2410);
        AbstractC5564.m9344(parcelM7504, interfaceC2411);
        AbstractC5564.m9344(parcelM7504, interfaceC2412);
        m7505(parcelM7504, 33);
    }

    @Override // p000.InterfaceC5122
    public final void onActivityCreatedByScionActivityInfo(C3156 c3156, Bundle bundle, long j) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c3156);
        AbstractC5564.m9345(parcelM7504, bundle);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 53);
    }

    @Override // p000.InterfaceC5122
    public final void onActivityDestroyedByScionActivityInfo(C3156 c3156, long j) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c3156);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 54);
    }

    @Override // p000.InterfaceC5122
    public final void onActivityPausedByScionActivityInfo(C3156 c3156, long j) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c3156);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 55);
    }

    @Override // p000.InterfaceC5122
    public final void onActivityResumedByScionActivityInfo(C3156 c3156, long j) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c3156);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 56);
    }

    @Override // p000.InterfaceC5122
    public final void onActivitySaveInstanceStateByScionActivityInfo(C3156 c3156, InterfaceC3838 interfaceC3838, long j) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c3156);
        AbstractC5564.m9344(parcelM7504, interfaceC3838);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 57);
    }

    @Override // p000.InterfaceC5122
    public final void onActivityStartedByScionActivityInfo(C3156 c3156, long j) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c3156);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 51);
    }

    @Override // p000.InterfaceC5122
    public final void onActivityStoppedByScionActivityInfo(C3156 c3156, long j) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c3156);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 52);
    }

    @Override // p000.InterfaceC5122
    public final void registerOnMeasurementEventListener(InterfaceC0257 interfaceC0257) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9344(parcelM7504, interfaceC0257);
        m7505(parcelM7504, 35);
    }

    @Override // p000.InterfaceC5122
    public final void retrieveAndUploadBatches(InterfaceC3941 interfaceC3941) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9344(parcelM7504, interfaceC3941);
        m7505(parcelM7504, 58);
    }

    @Override // p000.InterfaceC5122
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, bundle);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 8);
    }

    @Override // p000.InterfaceC5122
    public final void setCurrentScreenByScionActivityInfo(C3156 c3156, String str, String str2, long j) {
        Parcel parcelM7504 = m7504();
        AbstractC5564.m9345(parcelM7504, c3156);
        parcelM7504.writeString(str);
        parcelM7504.writeString(str2);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 50);
    }

    @Override // p000.InterfaceC5122
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // p000.InterfaceC5122
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelM7504 = m7504();
        ClassLoader classLoader = AbstractC5564.f18370;
        parcelM7504.writeInt(z ? 1 : 0);
        parcelM7504.writeLong(j);
        m7505(parcelM7504, 11);
    }
}
