package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* JADX INFO: renamed from: ۦ٘ؓۦۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC4421 extends AbstractBinderC1892 implements InterfaceC5122 {
    public static InterfaceC5122 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5122 ? (InterfaceC5122) iInterfaceQueryLocalInterface : new C4616(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 2);
    }

    @Override // p000.AbstractBinderC1892
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo479(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        InterfaceC3838 c4729 = null;
        InterfaceC3941 c3158 = null;
        InterfaceC3838 c47210 = null;
        InterfaceC3838 c47211 = null;
        InterfaceC3838 c47212 = null;
        InterfaceC3838 c47213 = null;
        InterfaceC0257 c1813 = null;
        InterfaceC0257 c1814 = null;
        InterfaceC0257 c1815 = null;
        InterfaceC3838 c47214 = null;
        InterfaceC3838 c47215 = null;
        InterfaceC3838 c47216 = null;
        InterfaceC3838 c47217 = null;
        InterfaceC3838 c47218 = null;
        InterfaceC3838 c47219 = null;
        InterfaceC2353 c1203 = null;
        InterfaceC3838 c47220 = null;
        InterfaceC3838 c47221 = null;
        InterfaceC3838 c47222 = null;
        InterfaceC3838 c47223 = null;
        InterfaceC3838 c47224 = null;
        switch (i) {
            case 1:
                InterfaceC2410 interfaceC2410M2975 = BinderC1409.m2975(parcel.readStrongBinder());
                C1302 c1302 = (C1302) AbstractC5564.m9346(parcel, C1302.CREATOR);
                long j = parcel.readLong();
                AbstractC5564.m9347(parcel);
                initialize(interfaceC2410M2975, c1302, j);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c4729 = iInterfaceQueryLocalInterface instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface : new C4729(strongBinder);
                }
                InterfaceC3838 interfaceC3838 = c4729;
                long j3 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                logEventAndBundle(string3, string4, bundle2, interfaceC3838, j3);
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                InterfaceC2410 interfaceC2410M2976 = BinderC1409.m2975(parcel.readStrongBinder());
                ClassLoader classLoader = AbstractC5564.f18370;
                boolean z4 = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                setUserProperty(string5, string6, interfaceC2410M2976, z4, j4);
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = AbstractC5564.f18370;
                boolean z5 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47224 = iInterfaceQueryLocalInterface2 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface2 : new C4729(strongBinder2);
                }
                AbstractC5564.m9347(parcel);
                getUserProperties(string7, string8, z5, c47224);
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47223 = iInterfaceQueryLocalInterface3 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface3 : new C4729(strongBinder3);
                }
                AbstractC5564.m9347(parcel);
                getMaxUserProperties(string9, c47223);
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                AbstractC5564.m9347(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47222 = iInterfaceQueryLocalInterface4 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface4 : new C4729(strongBinder4);
                }
                AbstractC5564.m9347(parcel);
                getConditionalUserProperties(string13, string14, c47222);
                break;
            case 11:
                ClassLoader classLoader3 = AbstractC5564.f18370;
                boolean z6 = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                setMeasurementEnabled(z6, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                InterfaceC2410 interfaceC2410M2977 = BinderC1409.m2975(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                setCurrentScreen(interfaceC2410M2977, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47221 = iInterfaceQueryLocalInterface5 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface5 : new C4729(strongBinder5);
                }
                AbstractC5564.m9347(parcel);
                getCurrentScreenName(c47221);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47220 = iInterfaceQueryLocalInterface6 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface6 : new C4729(strongBinder6);
                }
                AbstractC5564.m9347(parcel);
                getCurrentScreenClass(c47220);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c1203 = iInterfaceQueryLocalInterface7 instanceof InterfaceC2353 ? (InterfaceC2353) iInterfaceQueryLocalInterface7 : new C1203(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 2);
                }
                AbstractC5564.m9347(parcel);
                setInstanceIdProvider(c1203);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47219 = iInterfaceQueryLocalInterface8 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface8 : new C4729(strongBinder8);
                }
                AbstractC5564.m9347(parcel);
                getCachedAppInstanceId(c47219);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47218 = iInterfaceQueryLocalInterface9 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface9 : new C4729(strongBinder9);
                }
                AbstractC5564.m9347(parcel);
                getAppInstanceId(c47218);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47217 = iInterfaceQueryLocalInterface10 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface10 : new C4729(strongBinder10);
                }
                AbstractC5564.m9347(parcel);
                getGmpAppId(c47217);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47216 = iInterfaceQueryLocalInterface11 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface11 : new C4729(strongBinder11);
                }
                AbstractC5564.m9347(parcel);
                generateEventId(c47216);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                InterfaceC2410 interfaceC2410M2978 = BinderC1409.m2975(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivityStarted(interfaceC2410M2978, j14);
                break;
            case 26:
                InterfaceC2410 interfaceC2410M2979 = BinderC1409.m2975(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivityStopped(interfaceC2410M2979, j15);
                break;
            case 27:
                InterfaceC2410 interfaceC2410M29710 = BinderC1409.m2975(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivityCreated(interfaceC2410M29710, bundle5, j16);
                break;
            case 28:
                InterfaceC2410 interfaceC2410M29711 = BinderC1409.m2975(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivityDestroyed(interfaceC2410M29711, j17);
                break;
            case 29:
                InterfaceC2410 interfaceC2410M29712 = BinderC1409.m2975(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivityPaused(interfaceC2410M29712, j18);
                break;
            case 30:
                InterfaceC2410 interfaceC2410M29713 = BinderC1409.m2975(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivityResumed(interfaceC2410M29713, j19);
                break;
            case 31:
                InterfaceC2410 interfaceC2410M29714 = BinderC1409.m2975(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47215 = iInterfaceQueryLocalInterface12 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface12 : new C4729(strongBinder12);
                }
                long j20 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivitySaveInstanceState(interfaceC2410M29714, c47215, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47214 = iInterfaceQueryLocalInterface13 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface13 : new C4729(strongBinder13);
                }
                long j21 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                performAction(bundle6, c47214, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                InterfaceC2410 interfaceC2410M29715 = BinderC1409.m2975(parcel.readStrongBinder());
                InterfaceC2410 interfaceC2410M29716 = BinderC1409.m2975(parcel.readStrongBinder());
                InterfaceC2410 interfaceC2410M29717 = BinderC1409.m2975(parcel.readStrongBinder());
                AbstractC5564.m9347(parcel);
                logHealthData(i2, string19, interfaceC2410M29715, interfaceC2410M29716, interfaceC2410M29717);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c1815 = iInterfaceQueryLocalInterface14 instanceof InterfaceC0257 ? (InterfaceC0257) iInterfaceQueryLocalInterface14 : new C1813(strongBinder14);
                }
                AbstractC5564.m9347(parcel);
                setEventInterceptor(c1815);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c1814 = iInterfaceQueryLocalInterface15 instanceof InterfaceC0257 ? (InterfaceC0257) iInterfaceQueryLocalInterface15 : new C1813(strongBinder15);
                }
                AbstractC5564.m9347(parcel);
                registerOnMeasurementEventListener(c1814);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c1813 = iInterfaceQueryLocalInterface16 instanceof InterfaceC0257 ? (InterfaceC0257) iInterfaceQueryLocalInterface16 : new C1813(strongBinder16);
                }
                AbstractC5564.m9347(parcel);
                unregisterOnMeasurementEventListener(c1813);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(AbstractC5564.f18370);
                AbstractC5564.m9347(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47213 = iInterfaceQueryLocalInterface17 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface17 : new C4729(strongBinder17);
                }
                int i3 = parcel.readInt();
                AbstractC5564.m9347(parcel);
                getTestFlag(c47213, i3);
                break;
            case 39:
                ClassLoader classLoader4 = AbstractC5564.f18370;
                boolean z7 = parcel.readInt() != 0;
                AbstractC5564.m9347(parcel);
                setDataCollectionEnabled(z7);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47212 = iInterfaceQueryLocalInterface18 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface18 : new C4729(strongBinder18);
                }
                AbstractC5564.m9347(parcel);
                isDataCollectionEnabled(c47212);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                AbstractC5564.m9347(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47211 = iInterfaceQueryLocalInterface19 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface19 : new C4729(strongBinder19);
                }
                AbstractC5564.m9347(parcel);
                getSessionId(c47211);
                break;
            case 48:
                Intent intent = (Intent) AbstractC5564.m9346(parcel, Intent.CREATOR);
                AbstractC5564.m9347(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                C3156 c3156 = (C3156) AbstractC5564.m9346(parcel, C3156.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                setCurrentScreenByScionActivityInfo(c3156, string20, string21, j25);
                break;
            case 51:
                C3156 c3157 = (C3156) AbstractC5564.m9346(parcel, C3156.CREATOR);
                long j26 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivityStartedByScionActivityInfo(c3157, j26);
                break;
            case 52:
                C3156 c3159 = (C3156) AbstractC5564.m9346(parcel, C3156.CREATOR);
                long j27 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivityStoppedByScionActivityInfo(c3159, j27);
                break;
            case 53:
                C3156 c31510 = (C3156) AbstractC5564.m9346(parcel, C3156.CREATOR);
                Bundle bundle10 = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivityCreatedByScionActivityInfo(c31510, bundle10, j28);
                break;
            case 54:
                C3156 c31511 = (C3156) AbstractC5564.m9346(parcel, C3156.CREATOR);
                long j29 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivityDestroyedByScionActivityInfo(c31511, j29);
                break;
            case 55:
                C3156 c31512 = (C3156) AbstractC5564.m9346(parcel, C3156.CREATOR);
                long j30 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivityPausedByScionActivityInfo(c31512, j30);
                break;
            case 56:
                C3156 c31513 = (C3156) AbstractC5564.m9346(parcel, C3156.CREATOR);
                long j31 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivityResumedByScionActivityInfo(c31513, j31);
                break;
            case 57:
                C3156 c31514 = (C3156) AbstractC5564.m9346(parcel, C3156.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c47210 = iInterfaceQueryLocalInterface20 instanceof InterfaceC3838 ? (InterfaceC3838) iInterfaceQueryLocalInterface20 : new C4729(strongBinder20);
                }
                long j32 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(c31514, c47210, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    c3158 = iInterfaceQueryLocalInterface21 instanceof InterfaceC3941 ? (InterfaceC3941) iInterfaceQueryLocalInterface21 : new C3158(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 2);
                }
                AbstractC5564.m9347(parcel);
                retrieveAndUploadBatches(c3158);
                break;
            case 59:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolean z8 = parcel.readInt() != 0;
                long j33 = parcel.readLong();
                long j34 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, z, z8, j33, j34);
                break;
            case 60:
                InterfaceC2410 interfaceC2410M29718 = BinderC1409.m2975(parcel.readStrongBinder());
                C1302 c1303 = (C1302) AbstractC5564.m9346(parcel, C1302.CREATOR);
                long j35 = parcel.readLong();
                long j36 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                initializeWithElapsedTime(interfaceC2410M29718, c1303, j35, j36);
                break;
            case 61:
                long j37 = parcel.readLong();
                long j38 = parcel.readLong();
                AbstractC5564.m9347(parcel);
                resetAnalyticsDataWithElapsedTime(j37, j38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
